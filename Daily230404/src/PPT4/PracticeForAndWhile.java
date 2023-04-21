package PPT4;

public class PracticeForAndWhile {	//클래스 선언

		public static void main(String[] args) { //메인함수 선언
		for(int kopo36_i = 1; kopo36_i <= 5; kopo36_i++) {	//정수형 변수 1부터 5까지 1씩 증가하는 for문
			System.out.println(kopo36_i);	//1부터 5까지 차례대로 출력
		}
		
		System.out.println();
		
		int kopo36_j = 0;	//정수형변수를 선언하며 0으로 초기화한다
		do {				//do~while문은 처음에 무조건 1번 실행된다
			kopo36_j++;		//루프마다 1씩 증가
			System.out.println(kopo36_j);	//1부터 5까지 차례대로 출력
		} while(kopo36_j <= 5);	//j가 5가 되면 루프가 종료된다
		
		System.out.println();
				
		int kopo36_h = 1;	//정수형변수를 선언하며 1로 초기화한다
		while(kopo36_h <= 5) {	//h가 5가 되는 순간까지 루프가 돌아간다
			System.out.println(kopo36_h);	//1부터 5까지 차례대로 출력된다
			kopo36_h++;	//h가 1부터 시작하여 5가 되는 순간까지 루프마다 1씩 증가한다
		}
	}
}
