package PPT4;

public class Practice5 {	//클래스 선언

	public static void main(String[] args) {	//메인함수 선언
		for(int k36_i = 1; k36_i < 13; k36_i++ ) {	//1월부터 12월까지 루프마다 1씩 증가한다
			System.out.printf("%d월 =>", k36_i);	//1월부터 12월까지 루프가 시작할 때마다 차례대로 출력된다
			for(int k36_j = 1; k36_j < 32; k36_j++) {	//1일부터 31일까지 루프마다 1씩 증가한다
				
				System.out.printf("%d, ", k36_j);	//1일부터 31일까지 루프를 돌며 차례대로 출력된다
				
				if(k36_i == 4 || k36_i == 6 || k36_i == 9 || k36_i == 7 || k36_i == 11) {
					if(k36_j == 30) break;	//4,6,9,7,11월에는 30일까지 출력되고 루프가 끝난다
				}
				
				if(k36_i == 2) {
					if(k36_j == 28) break;	//2월에는 28일까지 출력되고 루프가 끝난다
				}
			}
			System.out.printf("\n");	//달이 끝날때마다 줄바꿈
		}
	}
}
//추천하지 않는 방식