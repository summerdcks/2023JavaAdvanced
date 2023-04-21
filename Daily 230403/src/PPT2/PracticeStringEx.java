package PPT2;

public class PracticeStringEx {	//클래스 선언

	public static void main(String[] args) {	//메인함수 선언
		String k36_name = "Ja" + "va";	//문자열 name선언, Java
		String k36_str = k36_name + 8.0;	//문자열 str선언, 문자열에 숫자를 붙이면 숫자가 문자열로 입력된다 "8.0"으로 쓰는 것이 정확
		
		System.out.println(k36_name);	//Java출력
		System.out.println(k36_str);	//문자열Java와 8.0출력
		System.out.println(7 + " ");	//7과 띄어쓰기
		System.out.println(" " + 7);	//띄어쓰기 후 7
		System.out.println(7 + "");		//7
		System.out.println("" + 7);		//7
		System.out.println("" + "");	//
		System.out.println(7 + 7 + "");		//7 더하기 7인 14가 출력
		System.out.println("" + 7 + 7);		//맨앞에 문자열에 숫자가 더해져서 77이 문자열로 출력됨
	}
}
