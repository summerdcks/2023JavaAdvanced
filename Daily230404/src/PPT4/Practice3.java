package PPT4;

public class Practice3 {	//클래스 선언

	public static void main(String[] args) {	//메인함수 선언
		int k36_iVal;	//정수형 변수 iVal 선언
		for(int k36_i = 0; k36_i < 300; k36_i++) { 	//정수형 변수 i는 0부터 300이 되기 직전까지 루프마다 1씩 증가한다
			
			k36_iVal = 5 * k36_i;	//iVal은 i의 5배수
			
			if(k36_iVal >= 0 && k36_iVal < 10) System.out.printf("일 %d\n", k36_iVal);
			//5배수 숫자가 일의 자리일 때(0보다 같거나 크고 10보다 작을 때) 일 출력
			else if(k36_iVal >= 10 && k36_iVal < 100) System.out.printf("십 %d\n", k36_iVal);
			//5배수 숫자가 십의 자리일 때(10보다 같거나 크고 100보다 작을 때) 십 출력
			else if(k36_iVal >= 100 && k36_iVal < 1000) System.out.printf("백 %d\n", k36_iVal);
			//5배수 숫자가 백의 자리일 때(100보다 같거나 크고 1000보다 작을 때) 백 출력
			else System.out.printf("천 %d\n", k36_iVal);
			//나머지의 경우 (iVal가 1000보다 크거나 같고 1500보다 작은 경우) 천 출력
		}
	}
}
