package PPT4;

public class Practice6 {	//클래스 선언

	public static void main(String[] args) {	//메인함수 선언
		for(int k36_i = 1; k36_i < 13; k36_i++ ) {	//1월부터 12월까지 루프마다 1씩 증가한다
			System.out.printf("%d월 =>", k36_i);	//1월부터 12월까지 루프가 시작할 때마다 차례대로 출력된다
			LOOP: for(int k36_j = 1; k36_j < 32; k36_j++) {		//1일부터 31일까지 루프마다 1씩 증가한다
				
				System.out.printf("%d, ", k36_j);	//1일부터 31일까지 루프를 돌며 차례대로 출력된다
				
				switch(k36_i) {
				case 4 : case 6 : case 9 : case 7 : case 11 :
					if(k36_j == 30) break LOOP;
					break;
					//4,6,9,7,11월에는 30일까지 출력되고 루프가 끝난다
				case 2 :
					if(k36_j == 28) break LOOP;
					break;
					//2월에는 28일까지 출력되고 루프가 끝난다
				}
			}
			System.out.printf("\n");	//달이 끝날때마다 줄바꿈
		}
	}
}
//사용하지 않는 방식