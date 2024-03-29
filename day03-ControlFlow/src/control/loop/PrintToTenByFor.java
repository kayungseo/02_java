package control.loop;

/*
 * 0~10까지 출력하는 클래스 
 * 
 * for 구문을 사용해서 출력 
 */

public class PrintToTenByFor {
	public static void main(String[] args) {
		
		// for (선언식;조건식;증감식) {
		//     문장들;
		//}
		// 1. 선언식 : 선언의 형태 => 타입 변수이름;
		// 2. 조건식 : 조건의 형태 => 비교연산자(관계, 동일) 사용한 식
		//											연산의 결과가 true or false로 얻어짐
		// 3. 증감식 : 증감연산자(++, --)를 활용하여 
		//					선언식에서 선언된 루프제어 변수 값을 변경
		
		for (int idx = 1;idx <= 10;idx++) {
			System.out.printf("idx=%2d%n", idx);
		}

		for (int idx = 0;idx < 10;idx++) {
			System.out.printf("idx=%2d%n", idx + 1);
		}
		
		for (int idx = 1;idx < 11;idx++) {
			System.out.printf("idx=%2d%n", idx);
		}
		
		for(int i = 1; i <=10; i++) {
			System.out.println("i=" + i);
		}
		System.out.println("---------------------------------------------------");
		System.out.println("---10에서 1까지 역순 출력 ");
		
		for(int idx = 10; idx > 0; idx--	) {
			System.out.printf("idx=%2d%n", idx);
		}
		
		// final 변수 = 상수 == 상수를 활용한 for loop
		final int FROM = 1; //반드시 대문자로 , 선언과 동시에 초기화 
		final int TO = 10;
		
		for(int idx = FROM;idx <= TO; idx++) {
			System.out.printf("idx=%2d%n", idx);
		}
		System.out.println("----FROM, TO 상수 사용한 역순 출력----");	
		for(int idx = TO; idx >= FROM; idx--) { 
			System.out.printf("idx=%2d%n", idx);
		}
		System.out.println("---FROM, TO를 사용해서 0~9까지 출력---");
		for(int idx = FROM - 1;idx < TO;idx++) {
			System.out.printf("idx=%2d%n", idx);
		}
	}
}
