package PPT4;

public class Practice12 {	//클래스 선언

	public static void main(String[] args) {	//메인함수 선언
		int k36_n, k36_m;	//정수형 변수 선언
		k36_m = 20;	//띄어쓰기는 20칸부터 시작
		k36_n = 1;	//별은 1칸부터 시작
		
		while(true) {
			
			for(int k36_i = 0; k36_i < k36_m; k36_i++) System.out.printf(" "); 
			//첫줄부터 차례대로 할당된 갯수만큼 띄어쓰기 출력
			for(int k36_i = 0; k36_i < k36_n; k36_i++) System.out.printf("*");	
			//첫줄부터 차례대로 할당된 갯수만큼 별 출력
			System.out.printf("\n");	//한줄이 출력되고 줄바꿈
			
			k36_m = k36_m - 1;	//띄어쓰기는 매 줄마다 한칸씩 줄어든다
			k36_n = k36_n + 2;	//별은 매 줄마다 2칸씩 늘어난다
			
			if(k36_m < 0) break;	//20줄째 출력하고 루프를 빠져나온다
		}
	}
}
