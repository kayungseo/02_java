package operator.binary;
/*
 * <, >, <=, >=, ==, !=
 * 
 * 두 변수의 값을 비교하는 
 * 비교연산자를 테스트하는 클래스 
 * 
 * 관계연산의  결과는 boolean 타입으로 얻어짐.
 * 
 */
public class RelationalTest {

	public static void main(String[] args) {
		// 1. 선언, 2. 초기화 
		int a = 1;
		int b = -5;
		
		// 3. 비교연산자 사용 
		System.out.println("등가 비교 연산자");
		System.out.println("-----------------------------------------");
		
		System.out.printf("(%d == %d) : %b%n", a, b, (a == b));
		System.out.printf("(%d != %d) : %b%n", a, b, (a != b));
		
		System.out.println("대소 비교 연산자");
		System.out.println("-----------------------------------------");
		
		System.out.printf("(%d > %d) : %b%n",a, b, (a > b) );
		System.out.printf("(%d < %d) : %b%n",a, b, (a < b) );
		System.out.printf("(%d >= %d) : %b%n",a, b, (a >= b) );
		System.out.printf("(%d <= %d) : %b%n",a, b, (a <= b) );
		
		//이클립스 IDE 의 단축키 일부러 외우기 (손에 무의식적으로 쓸 수 있을 정도로)
		//ctrl + F6 : 열려있는 파일 사이에 이동 
		//ctrl + d : 커서가 있는 행 전체 삭제 
		//alt + shift +a : 세로줄 편집 기능 토글 
		//alt +up/down : 행 전체 상하 이동 
		//ctrl + shift + L : 단축키 모음 안내창 오픈 
	}

}
