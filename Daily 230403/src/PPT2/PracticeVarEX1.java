package PPT2;

public class PracticeVarEX1 {	//클래스 선언

	public static void main(String[] args) {	//메인으로부터 프로그램 시작
		int k36_k01_year = 0;	//k36_k01_year라는 숫자형 변수를 정의하고 0으로 초기화
		int k36_k01_age = 14;	//k36_k01_age라는 숫자형 변수를 정의하고 14로 초기화
		
		System.out.println("결과1 : " +  k36_k01_year);	//k36_k01_year변수를 화면에 출력
		System.out.println("결과2 : " + k36_k01_age);	//k36_k01_age변수를 화면에 출력
		
		k36_k01_year = k36_k01_age + 2000;	//변수 k36_k01_age의 값에 2000을 더해서 변수 k36_k01_year에 저장
		k36_k01_age = k36_k01_age + 1;	//변수 k36_k01_age에 저장된 값을 1 증가시킨다
		
		System.out.println("결과3 : " +  k36_k01_year);	//다시 k36_k01_year변수를 화면에 출력
		System.out.println("결과4 : " + k36_k01_age);	//다시 k36_k01_age변수를 화면에 출력
	}
}
