package PPT4;

public class PracticeSwitch {	//클래스 선언

	public static void main(String[] args) {	//메인함수 선언
		String jumin = "123456-1234567";	//String 문자열형 변수를 선언하며 값 부여
		
		switch(jumin.charAt(7)) {	//문자열 jumin에서 7번째 문자에 대한 조건문
			case'1' :	//해당 문자가 1일 경우
				System.out.printf("20세기전 태어난 남자사람\n");	//해당 문장을 출력한다
																	//break가 없으므로 switch문이 종료되지 않고 case2까지 실행된다
			case'2' :	//해당 문자가 2일 경우
				System.out.printf("20세기전 태어난 여자사람\n");	//해당 문장을 출력한다
				break;												//조건문이 종료된다
			case'3' :
				System.out.printf("20세기후 태어난 남자사람\n");
				break;
			case'4' :
				System.out.printf("20세기후 태어난 여자사람\n");
				break;
			default :	//위의 case들에 모두 해당되지 않을 경우
				System.out.printf("사람\n");	//해당문장을 출력한다
				break;							//조건문이 종료된다
		}
	}
}
