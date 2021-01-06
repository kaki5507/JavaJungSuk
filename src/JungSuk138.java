import java.util.ArrayList;

class Fruit implements Eatable{
	public String toString() {return "Fruit";}
}
class Apple extends Fruit{ public String toString() {return "Apple";}};
class Grape extends Fruit{ public String toString() {return "Grape";}};
class Toy { public String toString() {return "Toy";}}

interface Eatable{}

public class JungSuk138 {

	public static void main(String[] args) { // ? 와일드 카드
		FruitBox<? extends Fruit> fbox = (FruitBox<? extends Fruit>)new FruitBox<Fruit>();
		// FruitBox<Apple> -> FruitBox<? extends Fruit>
		FruitBox<? extends Fruit> abox = new FruitBox<Apple>();
		
		// FruitBox<? extends Fruit> -> FruitBox<Apple> 가능? 가능!
		FruitBox<Apple> appleBox = (FruitBox<Apple>)abox; // OK. 경고발생

	}

}

class FruitBox<T extends Fruit & Eatable> extends Box<T>{}

class Box<T>{
	ArrayList<T> list = new ArrayList<T>(); // item을 저장할 list
	void add(T item) { list.add(item);	} // 박스에 item을 추가
	T get(int i) { return list.get(i); } // 박스에서 item을 꺼낼때
	int size() { return list.size(); } 
	public String toString() { return list.toString();}
}