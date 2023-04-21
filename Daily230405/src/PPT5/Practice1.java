package PPT5;

public class Practice1 {	//클래스 선언

	public static void main(String[] args) {	//메인함수 선언
		
		for(int kopo36_i = 1; kopo36_i < 10; kopo36_i = kopo36_i + 3) {	//for문의 조건문에서 사용할 정수형 변수 i를 선언하며 1로 초기화, 루프마다 3씩 증가하며 10이 되기 전에 종료된다
			System.out.printf("*****************\t*****************\t*****************\n");
			System.out.printf("   구구단 %d 단 \t\t   구구단 %d 단 \t\t   구구단 %d 단 \n", kopo36_i, kopo36_i+1, kopo36_i+2);	//i, i+1, i+2변수를 정수형 %d로 출력
			System.out.printf("*****************\t*****************\t*****************\n");
			for(int kopo36_j = 1; kopo36_j < 10; kopo36_j++) {	//*1부터 *9까지 구구단 출력
				//for문의 조건문에서 사용할 정수형 변수 j를 선언하며 1로 초기화, 루프마다 1씩 증가하며 10이 되기 전에 종료된다
				System.out.printf("   %d * %d = %d \t\t   %d * %d = %d \t\t   %d * %d = %d \n",	
						kopo36_i, kopo36_j, kopo36_i * kopo36_j,
						kopo36_i+1, kopo36_j, (kopo36_i+1) * kopo36_j,
						kopo36_i+2, kopo36_j, (kopo36_i+2) * kopo36_j);	//1단, 2단, 3단의 순서로 출력하고 줄을 바꿔준다
			}
		}
	}
}
