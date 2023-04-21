package PPT2;

public class PracticeCastingEx3 {	//클래스 선언

	public static void main(String[] args) {	//메인함수 선언
		float k36_f = 9.1234567f;	//float형 실수변수 선언하고 초기화
		double k36_d = 9.1234567;	//double형 실수변수 선언하고 초기화
		double k36_d2 = (double) k36_f;	//double형 실수변수 선언하며 float형 f를 double형변환한 값을 부여
		
		System.out.printf("f = %20.18f\n", k36_f);	//자리를 20만큼 부여하고 소수점 아래 18번째자리까지 출력, float는 소수점 이하 7자리까지만 정확
		System.out.printf("d = %20.18f\n", k36_d);	//자리를 20만큼 부여하고 소수점 아래 18번째자리까지 출력, double은 float보다 정확도가 높음
		System.out.printf("d2 = %20.18f\n", k36_d2);	//자리를 20만큼 부여하고 소수점 아래 18번째자리까지 출력

	}

}
