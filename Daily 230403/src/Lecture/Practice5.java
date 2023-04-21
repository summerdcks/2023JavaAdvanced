package Lecture;

public class Practice5 {	//클래스 선언

	public static void main(String[] args) {	//메인함수 선언
		//#5. 소수점 이하에서는 어떻게 할까
		
		int k36_MyVal = 14 / 5;	//2.8이지만 정수형 변수를 선언하였으므로 2가 된다
		
		System.out.printf("5-1 : %d\n", k36_MyVal);	//그냥 정수형 연산하면 버려짐

		double k36_MyValF;	//실수형 변수 선언
		
		k36_MyValF = 14 / 5;	//실수형 변수지만 정수형 연산을 하였으므로 2가 실수로 표시된다
		System.out.printf("5-2 : %f\n", k36_MyValF); 
		
		k36_MyValF = 14.0 / 5;	//값이 하나라도 실수면 실수형 연산이 되어 2.8이라는 값이 나온다
		System.out.printf("5-3 : %f\n", k36_MyValF);
		
		k36_MyValF = (14.0) / 5 + 0.5;	//실수형 연산이므로 3.3이 나온다
		System.out.printf("5-4 : %f\n", k36_MyValF);
		
		k36_MyVal = (int) ((14.0) / 5 + 0.5);	//실수형 연산을 하고 정수형 형변환을 하면 버림되어 3의 값이 나온다
		System.out.printf("5-5 : %d\n", k36_MyVal);
	}
}
