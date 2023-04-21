package PPT7;

public class PracticeP10 {	//클래스 선언

	public static void main(String[] args) {	//메인함수 선언
		System.out.printf("HanBlankForeword[%s]\n", HanBlankForeword_k36("한글abcd", 15));		//HanBlankForeword함수를 실행하여 반환된 문자열을 출력한다
		System.out.printf("HanBlankForeword[%s]\n", HanBlankForeword_k36("한글한글aa", 15));	//HanBlankForeword함수를 실행하여 반환된 문자열을 출력한다
		System.out.printf("HanBlankForeword[%s]\n", HanBlankBackword_k36("한글aa", 15));		//HanBlankBackword함수를 실행하여 반환된 문자열을 출력한다
		System.out.printf("HanBlankForeword[%s]\n", HanBlankBackword_k36("한글한글aa", 15));	//HanBlankBackword함수를 실행하여 반환된 문자열을 출력한다
		System.out.printf("한글은 [%d]개\n", HanCount_k36("한글한글aa"));	//HanCount함수를 실행하여 반환된 문자열을 출력한다
	}

	private static int HanCount_k36(String string_k36) {	//문자열을 받아 정수값을 반환하는 함수
		int count_k36 = 0;	//한글수를 세기위한 정수형 변수 선언 후 0으로 초기화
		for(int i_k36 = 0; i_k36 < string_k36.length(); i_k36++) {	//문자열의 0번부터 마지막문자까지 한개씩 살펴본다
			byte[] s_k36 = String.valueOf(string_k36.charAt(i_k36)).getBytes();
			//문자열의 i번째 문자를 문자열로 변환하여 byte단위로 배열에 담는다
		    if (s_k36.length == 2) {	//byte배열의 길이, 즉 문자의 바이트수가 2일 때 = 한글일 때
		    	count_k36++;			//횟수를 세준다
		    }
		}
		return count_k36; //한글수를 반환한다
	}

	private static String HanBlankForeword_k36(String string_k36, int i_k36) {		//문자열과 정수를 받아 정수값을 반환하는 함수
		String ret_k36 = string_k36;	//입력받은 문자열을 ret로 받는다
		byte[] s_k36 = string_k36.getBytes();	//해당 문자열을 byte로 쪼개어 byte배열에 담는다
		for(int j_k36 = 0; j_k36 < i_k36 - s_k36.length; j_k36++) {	//입력받은 수에서 문자열의 바이트수를 뺀 횟수만큼
			ret_k36 = " " + ret_k36;	//문자열의 앞에 띄어쓰기를 추가해준다
		}
		return ret_k36;	//띄어쓰기가 포함된 문자열을 반환한다
	}
	
	private static String HanBlankBackword_k36(String string_k36, int i_k36) {		//문자열과 정수를 받아 정수값을 반환하는 함수
		String ret_k36 =  string_k36;	//입력받은 문자열을 ret로 받는다
		byte[] s_k36 = string_k36.getBytes();	//해당 문자열을 byte로 쪼개어 byte배열에 담는다
		for(int j_k36 = 0; j_k36 < i_k36 - s_k36.length; j_k36++) {	//입력받은 수에서 문자열의 바이트수를 뺀 횟수만큼
			ret_k36 = ret_k36 + " ";	//문자열의 뒤에 띄어쓰기를 추가해준다
		}
		return ret_k36;	//띄어쓰기가 포함된 문자열을 반환한다
	}
}
