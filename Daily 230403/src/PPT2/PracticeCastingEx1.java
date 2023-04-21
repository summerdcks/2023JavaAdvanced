package PPT2;

public class PracticeCastingEx1 {	//클래스 선언

	public static void main(String[] args) {	//메인함수 선언
		double k36_d = 85.4;	//실수형 변수를 선언하며 85.4로 초기화
		int k36_score = (int)k36_d;	//정수형 변수를 선언하며 실수형 변수인 d를 정수형 형변환한 값으로 초기화
		
		System.out.println("score="+k36_score);	//정수값 출력
		System.out.println("d="+k36_d);	//실수값 출력

	}

}
