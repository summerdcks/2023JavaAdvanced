package PPT2;

public class PracticeVarEx2 {	//클래스 선언

	public static void main(String[] args) {	//메인함수 선언
		int k36_x = 10;		//x라는 정수형 변수를 선언하고 10으로 초기화
		int k36_y = 20;		//y라는 정수형 변수를 선언하고 20으로 초기화
		int k36_tmp = 0;	//z라는 정수형 변수를 선언하고 0으로 초기화
		
		System.out.println("x:" + k36_x + "y:" + k36_y);	//x와 y값을 출력
		
		k36_tmp = k36_x;	//tmp값에 x값 10을 부여
		k36_x = k36_y;		//x값에 y값 20을 부여
		k36_y = k36_tmp;	//y값에 tmp값인 10을 부여
		
		System.out.println("x:" + k36_x + "y:" + k36_y);	//x값 20과 y값 10을 출력
	}
}
