package PPT4;

public class PracticeWhile {	//클래스 선언

	public static void main(String[] args) {	//메인함수 선언
		for(int kopo36_i = 2; kopo36_i <= 9; kopo36_i++) {	//for문의 조건문에서 사용할 정수형 변수 i를 2로 초기화, 루프마다 1씩 증가하며 9까지 반복된다
			for(int kopo36_j = 1; kopo36_j <= 9; kopo36_j++) {	//for문의 조건문에서 사용할 정수형 변수 j를 1로 초기화, 루프마다 1씩 증가하며 9까지 반복된다
				System.out.println(kopo36_i + " * " + kopo36_j + " = " + kopo36_i * kopo36_j);	//2*1부터 9*9까지 구구단 출력
			}
		}
		
		System.out.println();
		
		int kopo36_i = 2;	//정수형 변수 i를 선언하며 2로 초기화
		while(kopo36_i <= 9) {	//i가 9가 될 때까지 반복되는 while문
			int kopo36_j = 1;	//조건문에서 사용될 정수형 변수 j를 선언하며 1로 초기화
			while(kopo36_j <= 9) {	//j가 9가 될 때까지 반복되는 while문
				System.out.println(kopo36_i + " * " + kopo36_j + " = " + kopo36_i * kopo36_j);	//2*1부터 9*9까지 구구단 출력
				kopo36_j++;	//j는 루프마다 1씩 증가함
			}
			kopo36_i++;	//i는 루프마다 1씩 증가함
		}
	}
}
