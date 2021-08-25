package InterfaceStudy;

abstract class Unit2{
	int x,y;
	abstract void move(int x,int y);
	void stop() {
		System.out.println("멈춰~!");
	}
}

interface Fightable {
	void move(int x, int y);
	void attack(Fightable f);// public abstract 생략되어 있음 interface 이므로..
}

class Fighter extends Unit2 implements Fightable{
	public void move(int x, int y) {
		System.out.println("x, y" + x + y);
	}
	
	public void attack(Fightable f) {
		System.out.println(f + " : f는 누구 ?");
	}
}

public class FighterTest {

	public static void main(String[] args) {
		Fighter f = new Fighter();
		Unit2 a = new Fighter();
		
		a.move(100, 200);
	}

}
