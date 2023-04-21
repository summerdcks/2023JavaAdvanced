package PPT4;

public class Practice1 {	//클래스 선언

	public static void main(String[] args) {	//메인함수 선언
		int kopo36_iA, kopo36_iB;	//카운트의 정수형 변수 선언
		
		kopo36_iA = 0;	//루프1의 카운트를 0으로 초기화(0줄부터 시작)
		while(true) { 	//루프1시작
			
			kopo36_iB = 0;	//루프2의 카운트를 0으로 초기화(매 줄마다 별 0개부터 시작)
			while(true) {	//루프2시작
				System.out.printf("*");	//줄바꿈 없이 별찍음
				
				if(kopo36_iA == kopo36_iB) break;	//iA와 iB가 같을 때까지 별을 찍고 같아지면 루프2를 빠져나간다
				kopo36_iB++;	//루프2의 카운트가 1씩 증가한다
			}
			
			System.out.printf("\n");	//줄바꿈
			kopo36_iA++;	//루프1의 카운트가 1씩 증가한다
			if(kopo36_iA == 30) break;	//30줄을 찍으면 루프1을 빠져나간다
		}
	}
}
