package PPT4;

public class Practice10 {	//클래스 선언

	public static void main(String[] args) {	//메인함수 선언
		for(int k36_i = 0; k36_i < 10; k36_i++) {	//정수형 변수 i는 0부터 9까지 루프마다 1씩 증가한다
			for(int k36_j = 0; k36_j < k36_i; k36_j++) System.out.printf(" ");	//0번째부터 i번째까지 j횟수만큼 줄바꿈없이 띄어쓰기
			System.out.printf("%d\n", k36_i);	//숫자를 출력후 줄바꿈
		}
	}
}
