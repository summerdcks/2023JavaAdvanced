package Lecture;

public class Practice3 {	//클래스 선언

	public static void main(String[] args) {	//메인함수 선언
		//#3 정수형 변수의 나눗셈은 정수범위에서 버림처리
		
		int k36_ii = 1000 / 3;	//k36_ii를 정수형 변수로 선언, 33.333이나 33의 값이 나옴
		
		k36_ii = 1000 % 3;	//나머지값, k36_ii = 1
		
		//나머지 연산자의 응용
		
		for (int k36_i = 0; k36_i < 20; k36_i++) {
			//for문 안에서 사용할 정수형 변수를 선언하며 0으로 초기화, 20이 되기 전까지 루프마다 1씩 증가함
			System.out.printf("#3-3 : %d ", k36_i);	//0부터 19까지 출력된다
		
			if (((k36_i + 1) % 5) == 0) {	//0부터 시작하여 변수 5개마다 줄바꿈을 하기 위해 1을 더해준다
				System.out.printf("\n");	//5의 배수가 출력되기 직전에 줄바꿈 실행
			}
		}
	}
}
