package PPT4;

public class Practice8 {	//클래스 선언

	public static void main(String[] args) {	//메인함수 선언
		String [] k36_units = {"영","일","이","삼","사","오","육","칠","팔","구"}; //문자열 배열 units 선언하며 영부터 구까지 10개의 변수로 초기화
		for(int k36_i = 0; k36_i < 101; k36_i++) {	//정수형 변수 i는 0부터 100까지 루프마다 1씩 증가
			
			if(k36_i >= 0 && k36_i < 10) {	//일의 자리 숫자일 때
				System.out.printf("일의자리 : %s\n", k36_units[k36_i]);	//일의 자리 숫자에 해당하는 배열값을 출력
			} else if(k36_i >= 10 && k36_i < 100) {		//십의 자리 숫자일 때
				int k36_i10, k36_i0;	//정수형 변수 i10, i0 선언
				k36_i10 = k36_i / 10;	//i10은 해당 숫자의 십의 자리를 나타냄(10으로 나눈 정수값)
				k36_i0 = k36_i % 10;	//i0은 해당 숫자의 일의 자리를 나타냄(10으로 나눈 나머지)
				if(k36_i0 == 0) {	//만약 일의 자리가 0이라면
					System.out.printf("십의자리 : %s십\n", k36_units[k36_i10]);	//십의 자리에 해당하는 배열값만 출력함 "영" 출력 생략
				} else {
					System.out.printf("십의자리 : %s십%s\n", k36_units[k36_i10], k36_units[k36_i0] );	//일의 자리가 있으면 일의 자리에 해당하는 배열값까지 출력함
				}
			} else System.out.printf("==> %d\n", k36_i);	//백의 자리 이상은 그냥 출력
		}
	}
}
