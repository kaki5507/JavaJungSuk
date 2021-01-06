import java.util.ArrayList;
// 과일
class Fruit2 { public String toString() { return "Fruit"; } }
// 사과
class Apple2 extends Fruit2{ public String toString() { return "Apple"; } }
// 포도
class Grape2 extends Fruit2 { public String toString() { return "Grape";} }

class Juice{
	String name;
	
	Juice(String name){
		this.name = name + "Juice";
	}
	
	public String toString() {
		return name;
	}
}

class Juicer{
	static Juice makeJuice(FruitBox2<? extends Fruit2> box) {
		String tmp = "";
		
		for(Fruit2 f : box.getList())
			tmp += f+ " ";
		return new Juice(tmp);
	}
}

public class JungSuk140 {

	public static void main(String[] args) {
		FruitBox2<Fruit2> fruitBox = new FruitBox2<Fruit2>();
		
		// Fruit2와 그 자손들 Apple, Grape
		FruitBox2<Apple2> appleBox = new FruitBox2<Apple2>();

		fruitBox.add(new Apple2());
		fruitBox.add(new Grape2());
		appleBox.add(new Apple2());
		appleBox.add(new Apple2());
		
		System.out.println(Juicer.makeJuice(fruitBox));
		System.out.println(Juicer.makeJuice(appleBox));
	} // main

}
class FruitBox2<T extends Fruit2> extends Box2<T>{}

class Box2<T>{
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) { list.add(item); 		}
	T get(int i) 	 { return list.get(i);	}
	ArrayList<T> getList(){ return list;	}
	int size()		 { return list.size();	}
	public String toString() { return list.toString();}
}

/*
	<? extends T> 와일드 카드의 상한 제한. T와 그 자손들만 가능
	<? super T> 와일드 카드의 하한 제한. T와 그 조상들만 가능
	<?>  제한 없음. 모든 타입이 가능. <? extends Object>와 동일
*/