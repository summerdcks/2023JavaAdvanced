package PPT4;

public class Practice4 {	//클래스 선언

	public static void main(String[] args) {	//메인함수 선언
		for(int k36_i = 1; k36_i < 13; k36_i++) {	//1월부터 12월까지 루프마다 1씩 증가한다
			System.out.printf("%d월 =>", k36_i);
			for(int k36_j = 1; k36_j < 32; k36_j++) {	//1일부터 31일까지 루프마다 1씩 증가한다
				
				System.out.printf("%d", k36_j);
											
				if(k36_i == 1 && k36_j == 31) break;	//1월에는 31일까지 출력되고 루프를 빠져나간다
				if(k36_i == 2 && k36_j == 28) break;	//2월에는 28일까지 출력되고 루프를 빠져나간다
				if(k36_i == 3 && k36_j == 31) break;
				if(k36_i == 4 && k36_j == 30) break;
				if(k36_i == 5 && k36_j == 31) break;
				if(k36_i == 6 && k36_j == 30) break;
				if(k36_i == 7 && k36_j == 31) break;
				if(k36_i == 8 && k36_j == 31) break;
				if(k36_i == 9 && k36_j == 30) break;
				if(k36_i == 10 && k36_j == 31) break;
				if(k36_i == 11 && k36_j == 30) break;
				if(k36_i == 12 && k36_j == 31) break;
				
				System.out.printf(", ");	//루프를 빠져나오는 마지막일 직전까지만 ,출력
			}
			System.out.printf(".\n");	//마침표 찍고 줄바꿈
		}
	}
}
