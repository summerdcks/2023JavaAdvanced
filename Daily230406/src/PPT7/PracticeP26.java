package PPT7;

import PPT6.InputData;

public class PracticeP26 {

	public static void main(String[] args) {
		int iPerson_k36 = 5;	//정수형 변수를 선언하고 총인원 5명으로 초기화
		
		OneRec [] inData_k36 = new OneRec[iPerson_k36];	//클래스 형태의 크기가 iPerson인 배열이 생성
		
		inData_k36[0] = new OneRec("홍길01", 100, 100, 90);	//각 배열마다 클래스 인스턴스 생성
		inData_k36[1] = new OneRec("홍길02", 90, 90, 90);	//각 배열마다 클래스 인스턴스 생성
		inData_k36[2] = new OneRec("홍길03", 80, 70, 90);	//각 배열마다 클래스 인스턴스 생성
		inData_k36[3] = new OneRec("홍길04", 70, 60, 90);	//각 배열마다 클래스 인스턴스 생성
		inData_k36[4] = new OneRec("홍길05", 60, 100, 90);	//각 배열마다 클래스 인스턴스 생성

		for(int i_k36 = 0; i_k36 < iPerson_k36; i_k36++) {	//0부터 iPerson-1번째까지 해당 정보를 출력한다
			System.out.printf("번호:%d, 이름:%s, 국어:%d, 영어:%d, 수학:%d, 총점:%d, 평균:%f\n",
					i_k36, inData_k36[i_k36].name_k36(), inData_k36[i_k36].kor_k36(), inData_k36[i_k36].eng_k36(),
					inData_k36[i_k36].mat_k36(), inData_k36[i_k36].sum_k36(), inData_k36[i_k36].ave_k36());
					//i번째 inData클래스의 배열의 변수값을 받아와 차례대로 출력한다
		}		
	}
}

