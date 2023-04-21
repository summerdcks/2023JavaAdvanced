package PPT7;

import java.util.ArrayList;

public class PracticeP28 {	//클래스 선언

	public static void main(String[] args) {	//메인함수 선언
		int iTestMAX_k36 = 10;	//정수형 변수 선언과 10으로 초기화
		ArrayList iAL_k36 = new ArrayList();
		//ArrayList형식의 iAL을 생성하고 인스턴스에 연결한다
                                                                                                         
		for(int i_k36 = 0; i_k36 < iTestMAX_k36; i_k36++) {	//iTestMAX갯수만큼
			iAL_k36.add((int)(Math.random() * 1000000));
			//랜덤함수를 이용해 도출한 실수값에 1000000을 곱하고 정수형변환한 값을 변수로 추가한다
		}
		
		for(int i_k36 = 0; i_k36 < iAL_k36.size(); i_k36++) {	//0번째부터 마지막번째까지
			System.out.printf(" ArrayList %d = %d\n", i_k36, iAL_k36.get(i_k36));
			//몇번째 변수인지와 변수값을 차례대로 출력한다
		}
		
		System.out.printf("***************************\n");	//구분선 출력
		iAL_k36.sort(null);	//ArrayList의 변수들을 오름차순 정렬한다
		
		for(int i_k36 = 0; i_k36 < iAL_k36.size(); i_k36++) {	//0번째부터 마지막번째까지
			System.out.printf(" ArrayList %d = %d\n", i_k36, iAL_k36.get(i_k36));
			//몇번째 변수인지와 변수값을 차례대로 출력한다
		}
	}
}
