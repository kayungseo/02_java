package control.switchstmt;

import java.util.Scanner;

/*
 * 입력된 정수가 3의 배수인지 판별하는 클래스 
 * ----------------------------------------------------
 * 배수 판단에 switch 구문을 사용 
 * 
 */
public class DecideMultiple {

	public static void main(String[] args) {
		// 1. 선언
		int input;
		Scanner scan;

		// 2. 초기화
		scan = new Scanner(System.in);
		// 입력 안내 prompt
		System.out.println("정수를 입력하세요. ");
		input = scan.nextInt();

		// 3. 사용 : input 변수의 값이 3의 배수인지 판단.
		switch (input % 3) {
		case 0 : //여기서 동일비교연산이 일어남 
			System.out.printf("입력 값 %d는 3의 배수입니다.%n", input);
			break;
			
		case 1 :  case 2 : 
			System.out.printf("입력 값 %d는 3의 배수가 아닙니다.%n", input);
			break;
			
//		case 2 : 
//			System.out.printf("입력 값 %d는 3의 배수가 아닙니다.%n", input);
//			break;	
			
			default : 
				System.out.println("입력이 잘 못 되었습니다. ");
		}//end switch

	}

}
