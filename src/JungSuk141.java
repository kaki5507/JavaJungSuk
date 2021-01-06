//                 0     1     2     3
enum Direction { EAST, SOUTH, WEST, NORTH }

public class JungSuk141 {

	public static void main(String[] args) {
		// 열거형(enum) - 관련된 상수들을 같이 묶어 놓은 것. Java는 타입에 안전한 열거형을 제공
		// 열거형을 정의하는 방법
		Direction d1 = Direction.EAST;
		Direction d2 = Direction.valueOf("WEST");
		Direction d3 = Enum.valueOf(Direction.class, "EAST");
		
		System.out.println("d1="+d1);
		System.out.println("d2="+d2);
		System.out.println("d3="+d3);
		
		System.out.println("d1==d2 ? "+(d1==d2));
		System.out.println("d1==d3 ? "+(d1==d3));
		System.out.println("d1.equals(d3) ? "+d1.equals(d3));
//		System.out.println("d2 > d3 ? "+(d1 > d3)); // 에러 객체기때문에 비교 연산 X
		System.out.println("d1.compareTo(d3) ? "+(d1.compareTo(d3)));
		System.out.println("d1.compareTo(d2) ? "+(d1.compareTo(d2)));
		
		switch(d1) {
		case EAST: // Direction.EAST라고 쓸 수 없다.
			System.out.println("THE direction is EAST."); break;
		case SOUTH:
			System.out.println("THE direction is SOUTH."); break;
		case WEST:
			System.out.println("THE direction is WEST."); break;
		case NORTH:
			System.out.println("THE direction is NORTH."); break;
		default:
			System.out.println("Invalid direction"); break;
		}
		
		Direction[] dArr = Direction.values(); // 열거형의 모든 상수를 배열로 반환
		
		for(Direction d : dArr) // for(Direction d : Direction.values())
			System.out.printf("%s=%d%n",d.name(),d.ordinal()+1); // 순서
	}

}
