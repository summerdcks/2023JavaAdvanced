package PPT2;

public class PracticePrintEx2 {	//클래스 선언

	public static void main(String[] args) {	//메인함수 선언
		String k36_url = "www.codechobo.com";	//문자열 변수를 선언하며 값을 부여
		
		float k36_f1 = .10f;	//0.10, 1.0e-1
		float k36_f2 = 1e1f;	//10.0, 1.0e1, 1.0e+1
		float k36_f3 = 3.14e3f;
		double k36_d = 1.23456789;
		
		System.out.printf("f1=%f, %e, %g%n", k36_f1, k36_f1, k36_f1);	//%f는 실수출력, %e는 지수형태출력, %g는 값을 최대한 간략히 표현
		System.out.printf("f2=%f, %e, %g%n", k36_f2, k36_f2, k36_f2);
		System.out.printf("f3=%f, %e, %g%n", k36_f3, k36_f3, k36_f3);
		
		System.out.printf("d=%f%n", k36_d);		//실수형 변수 d출력
		System.out.printf("d=%14.10f%n", k36_d);	//변수에 14자리 부여 후 소수점 10자리까지 출력
		
		System.out.printf("[12345678901234567890]%n");	//문자열 출력
		System.out.printf("[%s]%n", k36_url);	//문자열 출력
		System.out.printf("[%20s]%n", k36_url);		//문자열이 차지할 20칸을 배정하고 출력
		System.out.printf("[%-20s]%n", k36_url);	//왼쪽 정렬
		System.out.printf("[%.8s]%n", k36_url);		//왼쪽에서 8글자만 출력
	}
}
