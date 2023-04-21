package PPT2;

public class PracticeOverflowEx {	//클래스 선언

	public static void main(String[] args) {	//메인함수 선언
		short k36_sMin = -32768;	//정수형 변수 선언
		short k36_sMax = 32767;		//정수형 변수 선언
		char k36_cMin = 0;			//문자형 변수 선언
		char k36_cMax = 65535;		//문자형 변수 선언
		
		System.out.println("k36_sMin = " + k36_sMin);	//정수형 변수 -32768 출력
		System.out.println("k36_sMin - 1 = " + (short)(k36_sMin-1));	
		//정수형인 short는 범위가 -32,768~32,767이므로 -32768에서 1을 빼면 overflow되어 32767이 출력된다
		System.out.println("k36_sMax = " + k36_sMax);	//정수형 변수 32767 출력
		System.out.println("k36_sMax - 1 = " + (short)(k36_sMax+1));	
		//정수형인 short는 범위가 -32,768~32,767이므로 32767에서 1을 더하면 overflow되어 -32768이 출력된다
		System.out.println("k36_cMin = " + (int)k36_cMin);	//문자형 변수 0을 정수형으로 형변환하여 출력
		System.out.println("k36_cMin - 1 = " + (int)--k36_cMin);	
		//char형 변수는 범위가 0~65535이므로 0에서 1을 빼면 overflow되어 65535가 출력된다
		System.out.println("k36_cMax = " + (int)k36_cMax);	//문자형 변수 65535를 정수형으로 형변환하여 출력
		System.out.println("k36_cMax - 1 = " + (int)++k36_cMax);	
		//char형 변수는 범위가 0~65535이므로 65535에서 1을 더하면 overflow되어 0가 출력된다

	}

}
