package PPT2;

public class PracticeCastingEx2 {	//클래스 선언
	
	public static void main(String[] args) {	//메인함수 선언
		int k36_i = 10;		//정수형 변수를 선언하며 10으로 초기화
		byte k36_b = (byte)k36_i;	//정수형 byte변수를 선언하며 integer i를 byte형변환한 값으로 초기화
		System.out.printf("[int -> byte] i = %d -> b = %d%n", k36_i, k36_b);
		
		k36_i = 300;	//integer형 변수 i에 300을 부여
		k36_b = (byte)k36_i;	//integer형 변수를 byte 형변환한 값을 byte b에 부여
		System.out.printf("[int -> byte] i = %d -> b = %d%n", k36_i, k36_b);
		//byte의 범위는 -128부터 127이므로 300에서 256만큼 overflow하여 44값이 출력됨
		
		k36_b = 10;		//integer형 변수 b에 10을 부여
		k36_i = (int)k36_b;		//integer형 변수를 byte 형변환한 값을 byte i에 부여
		System.out.printf("[byte -> int] b = %d -> i = %d%n", k36_b, k36_i);
		
		k36_b = -2;		//integer형 변수 b에 -2를 부여
		k36_i = (int)k36_b;		//integer형 변수를 byte 형변환한 값을 byte i에 부여
		System.out.printf("[byte -> int] b = %d -> i = %d%n", k36_b, k36_i);
		
		System.out.println("i=" + Integer.toBinaryString(k36_i));	//정수 i를 이진수 변환하여 출력

	}

}
