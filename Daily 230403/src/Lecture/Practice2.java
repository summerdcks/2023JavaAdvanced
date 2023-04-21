package Lecture;

public class Practice2 {	//클래스 선언

	public static void main(String[] args) {	//메인함수 선언
		//#2. 누적하기, 합구하기
		
		int k36_sum;	//k36_sum 정수형 변수 선언
		
		k36_sum = 0;	//k36_sum의 값을 0으로 초기화
		
		for (int k36_i = 1; k36_i < 101; k36_i++) {
			//for문의 조건문 안에서 사용될 k36_i를 정수형 변수로 선언과 동시에 1로 초기화, k36_i는 101이 되기 전까지 루프마다 1씩 증가함
			k36_sum = k36_sum + k36_i;	//k36_sum은 매 루프마다 증가하여 1부터 100까지 더해진 값
			
		}
		System.out.printf("#2 : %d\n", k36_sum);	//1에서 100까지 더한 값 출력
		System.out.printf("#2-2 : %d\n", k36_sum / 100);	//100으로 나눈 평균값 출력	
		
		int [] k36_v = {1,2,3,4,5};		//크기가 5인 정수형 배열의 선언
		int k36_vSum;	//배열의 합계를 저장할 정수형 변수 선언
		
		k36_vSum = 0;	//0으로 초기화
		
		for (int k36_i = 0; k36_i < 5; k36_i++) {
		//for문의 조건문 안에서 사용할 k36_i를 정수형 변수로 선언하며 0으로 초기화, 5가 되기 직전까지 1씩 증가하여 총 5번의 루프를 하는 반복문
			k36_vSum = k36_vSum + k36_v[k36_i];	//k36_vSum은 배열의 0번째부터 4번째까지 변수의 합계
			
		}
		System.out.printf("#2-3 : %d\n", k36_vSum);	//배열의 모든 변수의 합 출력
	}
}

