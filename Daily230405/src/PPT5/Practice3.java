package PPT5;

public class Practice3 {	//클래스 선언

	public static void main(String[] args) {	//메인함수 선언
		int dayOfWeek_k36 = 5;	//1월 첫번째주의 시작은 금요일이다 일요일부터 5칸을 띄우고 시작한다
		
		int [] endOfMonth_k36 = {31,29,31,30,31,30,31,31,30,31,30,31};	//매월의 마지막일을 정수형 배열로 선언한다
		
		for(int month_k36 = 0; month_k36 < 12; month_k36++) {	//1월부터 12월까지 차례대로 출력하기 위해 for문을 이용한다
																//배열의 순서와 자리를 맞춰주기 위해 -1한 값을 이용한다
			System.out.printf("\n\n%11d월\n", month_k36+1);		//출력할 때는 +1을 해준다, 정수형 %d를 이용해 출력하면서 칸맞춤을 위해 11칸을 배정해준다
			System.out.printf("======================\n");
			System.out.printf(" 일 월 화 수 목 금 토 \n");		//요일을 써주고 줄바꿈
			
			for (int i_k36 = 0; i_k36 < dayOfWeek_k36 ; i_k36++) {			//매월의 첫번째주는 시작요일 줄맞춤을 위해 칸을 띄워주고 시작한다
			    System.out.printf("   ");
			}
				
			for(int j_k36 = 1; j_k36 <= endOfMonth_k36[month_k36]; j_k36++) {	//1일부터 매월 마지막일까지 차례대로 출력해준다	
			   System.out.printf("%3d", j_k36);									//칸맞춤을 위해 일마다 3칸씩 배정해준다
			
				  if ((dayOfWeek_k36 + j_k36) % 7 == 0) {	//매월의 시작요일과 그 주의 일수를 합한 값이 7의 배수가 되면
			       System.out.printf("\n");					//줄을 바꿔준다
			   }						 
			}
			
			dayOfWeek_k36 = (dayOfWeek_k36 + endOfMonth_k36[month_k36]) % 7;	//달이 바뀔 때 시작요일도 바뀐다
			//시작요일은 이전달의 시작요일에 매월 마지막일을 더하여 7로 나눈 나머지값이 된다
						
		}
	}
}

