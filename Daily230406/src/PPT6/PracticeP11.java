package PPT6;

public class PracticeP11 {	//클래스 생성

	public static void main(String[] args) {	//메인함수 생성
		
		PracticeP11calcSubjects calc_k36 = new PracticeP11calcSubjects();
		//PracticeP11calcSubjects클래스를 받아 calc_k36객체를 만들고 인스턴스를 생성하여 객체에 연결한다
	
		System.out.printf("3월 성적표\n");	//성적표의 상단부 출력
		System.out.printf("=======================================================\n");
		System.out.printf("이름    국어   영어   수학   총점   평균\n");
		System.out.printf("=======================================================\n");
		System.out.printf("폴리융  100    100    100    %d    %d\n", calc_k36.sum_k36(100,100,100), (int)calc_k36.ave_k36(100,100,100));
		//위에서 생성한 객체의 함수 sum과 ave를 실행하고 반환값을 정수형으로 출력한다
		System.out.print("\n");
		System.out.printf("4월 성적표\n");
		System.out.printf("=======================================================\n");
		System.out.printf("이름    국어   영어   수학   과학   총점   평균\n");
		System.out.printf("=======================================================\n");
		System.out.printf("폴리융  100    100    100    100    %d    %.1f\n", calc_k36.sum_k36(100,100,100,100), calc_k36.ave_k36(100,100,100,100));
		//위에서 생성한 객체의 함수 sum과 ave를 실행하고 반환값을 각각 정수형과 실수형으로 출력한다
		System.out.print("\n");
		System.out.printf("5월 성적표\n");
		System.out.printf("=======================================================\n");
		System.out.printf("이름    국어   영어   수학   과학   사회   총점   평균\n");
		System.out.printf("=======================================================\n");
		System.out.printf("폴리융  100    100    100    100    100    %d    %.1f", calc_k36.sum_k36(100,100,100,100,100), calc_k36.ave_k36(100,100,100,100,100));
		//위에서 생성한 객체의 함수 sum과 ave를 실행하고 각각 정수형과 실수형으로 반환값을 출력한다
		
		//세 성적표의 매개변수는 3,4,5개로 각각 매개변수의 갯수에 해당하는 함수를 호출하게 된다
	}
}
