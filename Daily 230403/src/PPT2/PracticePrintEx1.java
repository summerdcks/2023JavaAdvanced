package PPT2;

public class PracticePrintEx1 {	//클래스 선언

	public static void main(String[] args) {	//메인함수 선언
		byte k36_b = 1;		//정수형 변수 b를 선언하며 1로 초기화
		short k36_s = 2;	//정수형 변수 s를 선언하며 2로 초기화
		char k36_c = 'A';	//문자형 변수 c를 선언하며 문자A로 초기화
		
		int k36_finger = 10;	//정수형 변수 finger를 선언하며 10으로 초기화
		long k36_big = 100000000000L;	//정수형 변수 big을 선언하며 100000000000L로 초기화
		long k36_hex = 0xFFFFFFFFFFFFFFFFL;	//정수형 변수 hex를 선언하며 0xFFFFFFFFFFFFFFFFL로 초기화
		
		int k36_octNum = 010;	//8진수 10, 10진수로는 8
		int k36_hexNum = 0x10;	//16진수 10, 10진수로는 16
		int k36_binNum = 0b10;	//2진수 10, 10진수로는 2ㄴ
		
		System.out.printf("k36_b=%d%n", k36_b);		//정수형 변수 1 출력
		System.out.printf("k36_s=%d%n", k36_s);		//정수형 변수 2 출력
		System.out.printf("k36_c=%c, %d %n", k36_c, (int)k36_c);	//문자형 변수 c값인 A를 문자형 출력, 정수형 형변환하여 출력, 정수는 아스키코드값인 65가 출력됨
		System.out.printf("k36_finger=[%5d]%n", k36_finger);	//정수형 변수 finger의 값인 10 앞에 5칸 부여하고 출력
		System.out.printf("k36_finger=[%-5d]%n", k36_finger);	//정수형 변수 finger 앞에 5칸을 부여하고 왼쪽정렬하여 출력
		System.out.printf("k36_finger=[%05d]%n", k36_finger);	//정수형 변수 finger 앞에 5칸을 부여하고 빈칸을 0으로 채움
		System.out.printf("k36_big=%d%n", k36_big);		//정수형 변수 big의 값을 출력
		System.out.printf("k36_hex=%#x%n", k36_hex);	//'#'은 접두사(16진수 0x, 8진수 0)
		System.out.printf("k36_octNum=%o, %d%n", k36_octNum, k36_octNum);	//%o로 8진수 10 출력, %d로 10진수 8 출력
		System.out.printf("k36_hexNum=%x, %d%n", k36_hexNum, k36_hexNum);	//%x로 16진수 10 출력, %d로 10진수 8 출력
		System.out.printf("k36_binNum=%s, %d%n", Integer.toBinaryString(k36_binNum), k36_binNum); //%s로 8진수 10을 문자열로 형변환하여 출력, %d로 10진수 2 출력		
	}
}
