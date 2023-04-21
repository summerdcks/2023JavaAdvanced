package PPT6;

public class PracticeP11calcSubjects {
	//실습하기p.11에서 활용될 클래스
	public static int sum_k36(int a_k36, int b_k36, int c_k36) {	
		//매개변수 3개로 호출되어 정수값을 반환하는 sum함수
		return (a_k36+b_k36+c_k36);	 //입력된 세개과목의 점수를 합산한 값을 반환한다
	}
	
	public static int sum_k36(int a_k36, int b_k36, int c_k36, int d_k36) {	
		//매개변수 4개로 호출되어 정수값을 반환하는 sum함수
		return (a_k36+b_k36+c_k36+d_k36); //입력된 네개과목의 점수를 합산한 값을 반환한다
	}
	
	public static int sum_k36(int a_k36, int b_k36, int c_k36, int d_k36, int e_k36) {	
		//매개변수 5개로 호출되어 정수값을 반환하는 sum함수
		return (a_k36+b_k36+c_k36+d_k36+e_k36);	 //입력된 다섯개과목의 점수를 합산한 값을 반환한다
	}
	
	public static double ave_k36(int a_k36, int b_k36, int c_k36) {	
		//매개변수 3개로 호출되어 정수값을 반환하는 ave함수
		return (a_k36+b_k36+c_k36)/3; //입력된 세개과목의 점수를 합산해 3으로 나눈 평균값을 반환한다
	}
	
	public static double ave_k36(int a_k36, int b_k36, int c_k36, int d_k36) {
		//매개변수 4개로 호출되어 정수값을 반환하는 ave함수
		return (a_k36+b_k36+c_k36+d_k36)/4; //입력된 네개과목의 점수를 합산해 4으로 나눈 평균값을 반환한다
	}
	
	public static double ave_k36(int a_k36, int b_k36, int c_k36, int d_k36, int e_k36) {	
		//매개변수 5개로 호출되어 정수값을 반환하는 ave함수
		return (a_k36+b_k36+c_k36+d_k36+e_k36)/5; //입력된 네개과목의 점수를 합산해 4으로 나눈 평균값을 반환한다
	}
}
