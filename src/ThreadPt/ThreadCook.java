package ThreadPt;

import java.util.ArrayList;


public class ThreadCook {
	public static void main(String[] args) throws Exception{ //예외 발생하니깐 던질거임
		Table table = new Table(); // 여러 쓰레드가 공유하는 객체 테이블
		
		new Thread(new Cook(table), "COOK").start();
		new Thread(new Customer(table,"도넛"), "손님1").start();
		new Thread(new Customer(table,"햄버거"), "손님2").start();
		
		Thread.sleep(5000);
		System.exit(0);
	}
}

class Customer implements Runnable{
	private Table table;
	private String food;
	
	Customer(Table table, String food) {
		this.table = table;  
		this.food  = food;
	}
	
	@Override
	public void run() {
		while(true) {
			try { Thread.sleep(10);} catch(InterruptedException e) {}
			String name = Thread.currentThread().getName();

			if(eatFood())
				System.out.println(name + " 음식을 먹었습니다 " + food);
			else 
				System.out.println(name + " 음식먹기에 실패했습니다 ㅠㅠ ");
		}
		
	}
	boolean eatFood() { return table.remove(food); }
}

class Cook implements Runnable{
	private Table table;

	Cook(Table table) {	this.table = table; }

	public void run() {
		while(true) {
			int idx = (int)(Math.random()*table.dishNum());
			table.add(table.dishNames[idx]);
			try { Thread.sleep(100);} catch(InterruptedException e) {}
		}
	}
}

class Table{
	String[] dishNames = {"도넛","초밥","햄버거","도넛"};
	final int MAX_FOOD = 6;
	private ArrayList<String> dishes = new ArrayList();
	
	// 음식을 추가
	public synchronized void add(String dish) { // synchronzied를 추가했음 (임계 영역)
		if(dishes.size() >= MAX_FOOD) {
			String name = Thread.currentThread().getName();
			System.out.println(name + " 은 기다리는중 .");
			try {
				wait(); //★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
		dishes.add(dish);
		notify(); //★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
		System.out.println("Dishes :" + dishes.toString());
	}

	// 음식을 제거
	public boolean remove(String dishName) {
		synchronized (this) {
			String name = Thread.currentThread().getName();
			while(dishes.size()==0) {
				System.out.println(name+" 기다리는 중..");
				try {
					wait(); //★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
					Thread.sleep(500);
				} catch (InterruptedException e) {}
			}
			
			while (true) {
				for (int i = 0; i < dishes.size(); i++) {
					if (dishName.equals(dishes.get(i))) {
						dishes.remove(i);
						notify(); // ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
						return true;
					}
				}

				try {
					System.out.println(name+" 기다리는 중...");
					wait(); //★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
					Thread.sleep(500);
				} catch (InterruptedException e) {}
			}
		}
	}
	
	public int dishNum() {return dishNames.length;}
}