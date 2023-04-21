package PPT2;

public class PracticeCastingEx4 {	//클래스 선언

	public static void main(String[] args) {	//메인함수 선언
		int k36_i = 91234567;	//정수형 변수를 선언하며 8자리의 10진수로 초기화
		float k36_f = (float)k36_i;	// 실수형 변수를 선언하며 정수형 변수인 i를 실수형변환한 값으로 초기화
		int k36_i2 = (int)k36_f;	//정수형 변수를 선언하며 실수형 변수인 f를 정수형변환한 값으로 초기화
		
		double k36_d = (double)k36_i;	//int를 double로 형변환
		int k36_i3 = (int)k36_d;	//double을 다시 int로 형변환
		
		float k36_f2 = 1.666f;	//float형 f2 초기화
		int k36_i4 = (int)k36_f2;	//float형 f2를 integer로 형변환하여 초기화
		
		System.out.printf("i=%d\n", k36_i);	//정수 91234567 출력
		System.out.printf("f=%f i2=%d\n", k36_f, k36_i2);	//float형변환한 값과 다시 integer형변환한 값 출력, float는 부정확
		System.out.printf("d=%f i3=%d\n", k36_d, k36_i3);	//double형변환한 값과 다시 integer형변환한 값 출력, double은 정확
		System.out.printf("(int)%f=%d\n", k36_f2, k36_i4);	//float값 출력, float를 integer형변환한 값 출력
	}

}
