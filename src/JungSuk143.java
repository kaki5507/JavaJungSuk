enum Direction2 {
	EAST(1, ">"),SOUTH(2, "V"),WEST(3, "<"),NORTH(4, "^");
	
	private static final Direction2[] DIR_ARR = Direction2.values();
	private final int value;
	private final String symbol;
	
	Direction2(int value, String symbol){ // 접근 제어자 private이 생략됨.
		this.value = value;
		this.symbol = symbol;
	}

	public int getValue() {
		return value;
	}

	public String getSymbol() {
		return symbol;
	}

	public static Direction2 of(int dir) { // 중 하나를 얻어올려고
		if(dir < 1 || dir > 4)
			throw new IllegalArgumentException("Invalid value : "+ dir);
		
		return DIR_ARR[dir -1];
	}

	public Direction2 rotate(int num) {
		num = num % 4;
		
		if(num < 0) num +=4; // num이 음수일 때는 시계반대 방향으로 회전
		
		return DIR_ARR[(value-1+num) % 4];
	}
	
}

public class JungSuk143 {

	public static void main(String[] args) {
		// 열거형에 멤버 추가하기
		// 불연속적인 열거형 상수의 경우, 원하는 값을 괄호()안에 적는다.
		for(Direction2 d: Direction2.values())
			System.out.printf("%s=%d%n",d.name(),d.getValue());

		Direction2 d1 = Direction2.EAST;
		Direction2 d2 = Direction2.of(1);
		
		System.out.printf("d1=%s, %d%n", d1.name(), d1.getValue());
		System.out.printf("d2=%s, %d%n", d2.name(), d2.getValue());
		System.out.println(Direction2.EAST.rotate(1));
		System.out.println(Direction2.EAST.rotate(2));
		System.out.println(Direction2.EAST.rotate(-1));
		System.out.println(Direction2.EAST.rotate(-2));
	}

}
