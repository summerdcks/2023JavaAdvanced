package PPT4;

public class Practice7 {	//클래스 선언

	public static void main(String[] args) {	//메인함수 선언
		int [] k36_iLMD = {31,28,31,30,31,30,31,31,30,31,30,31};	//1~12월까지 매달 마지막일을 정수형 배열을 선언하며 변수값으로 할당한다
		
		for(int k36_i = 1; k36_i < 13; k36_i++) {	//1월부터 12월까지 루프마다 1씩 증가한다
			System.out.printf("%d월 =>", k36_i);	//1월부터 12월까지 루프가 시작할 때마다 차례대로 출력된다
			for(int k36_j = 1; k36_j < 32; k36_j++) {	//1일부터 31일까지 루프마다 1씩 증가한다
				System.out.printf("%d", k36_j);	//1일부터 31일까지 루프를 돌며 차례대로 출력된다
				
				if(k36_iLMD[k36_i-1] == k36_j) break;	//배열은 0부터 시작하므로 i-1부터 불러온다, 해당월의 마지막일과 같아지면 루프를 빠져나간다
				
				System.out.printf(","); //루프를 도는 동안 마지막일 전까지 ,가 출력된다
			}
			System.out.printf("\n");	//달이 끝날때마다 줄바꿈
		}
	}
}
