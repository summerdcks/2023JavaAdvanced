package PPT2;

import java.util.Scanner;

public class PracticeScannerEx {	//클래스 선언

	public static void main(String[] args) {	//메인함수 선언
		Scanner scanner = new Scanner(System.in);	//Scanner클래스 생성
		
		System.out.print("두자리 정수를 하나 입력해주세요.>");	//해당문구 출력
		
		String k36_input = scanner.nextLine();	//입력받은 내용을 문자열 변수 input을 선언하며 받는다
		int k36_num = Integer.parseInt(k36_input);	//정수형 변수 num을 선언하며 문자열 변수 input을 정수형 형변환하여 받는다
		
		System.out.println("입력내용 : " + k36_input);	//문자열 출력
		System.out.printf("num=%d%n", k36_num);	//정수 출력
	}
}
