package PPT4;

public class PracticeFor {	//클래스 선언

	public static void main(String[] args) {	//메인함수 선언
		int kopo36_sum = 0;	//정수형 변수 sum을 선언하며 0으로 초기화
		for(int kopo36_i = 0; kopo36_i < 10; kopo36_i++) {	//for문의 조건문에서 사용할 정수형 변수 i를 선언하며 0으로 초기화, 루프마다 1씩 증가하며 10이 되기 전에 종료된다
			kopo36_sum = kopo36_sum + kopo36_i;	//sum변수에 i변수를 누적하며 더해나간다
		}
		System.out.printf("sum %d\n", kopo36_sum);	//sum값을 정수형 %d로 출력
		
		for(int kopo36_i = 1; kopo36_i < 10; kopo36_i++) {	//for문의 조건문에서 사용할 정수형 변수 i를 선언하며 1로 초기화, 루프마다 1씩 증가하며 10이 되기 전에 종료된다
			System.out.printf("**************************\n", kopo36_i);
			System.out.printf("       구구단 %d 단\n", kopo36_i);	//i변수를 정수형 %d로 출력
			System.out.printf("**************************\n", kopo36_i);
			for(int kopo36_j = 1; kopo36_j < 10; kopo36_j++) {	//for문의 조건문에서 사용할 정수형 변수 j를 선언하며 1로 초기화, 루프마다 1씩 증가하며 10이 되기 전에 종료된다
				System.out.printf(" %d * %d = %d \n", kopo36_i, kopo36_j, kopo36_i * kopo36_j);	//1*1부터 9*9까지 구구단 출력
			}
		}
	}
}
