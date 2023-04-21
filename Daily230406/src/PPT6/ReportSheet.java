package PPT6;

public class ReportSheet {	//클래스 선언

	public static void main(String[] args) {	//메인함수 선언
	
		int iPerson_k36 = 10;	//정수형 변수를 선언하며 해당값으로 초기화
								
		InputData inData_k36 = new InputData(iPerson_k36);
		//InputData클래스에서 해당값만큼의 크기의 배열이 생성된다
		
		for(int i_k36 = 0; i_k36 < iPerson_k36; i_k36++) {	
			//아래의 변수들이 iPerson값의 갯수만큼 생성되어 각 배열의 변수로 저장된다
			String name_k36 = String.format("홍길%02d", i_k36);	//이름 만들기
			int kor_k36 = (int)(Math.random()*100);	//Math.random함수를 이용하여 국어,영어,수학 점수 만들기
			int eng_k36 = (int)(Math.random()*100);	//Math.random함수의 값은 실수형이므로 100을 곱하여 정수변환을 하면
			int mat_k36 = (int)(Math.random()*100);	//0~99사이의 정수값이 나온다
			inData_k36.SetData(i_k36, name_k36, kor_k36, eng_k36, mat_k36);
			//해당값들을 inData객체의 SetData함수에서 받아 각각의 배열에 변수로 누적시킨다
		}
		for(int i_k36 = 0; i_k36 < iPerson_k36; i_k36++) {	//0부터 iPerson-1번째까지 해당 정보를 출력한다
			System.out.printf("번호:%d, 이름:%s, 국어:%d, 영어:%d, 수학:%d, 총점:%d, 평균:%f\n",
					i_k36, inData_k36.name_k36[i_k36], inData_k36.kor_k36[i_k36], inData_k36.eng_k36[i_k36],
					inData_k36.mat_k36[i_k36], inData_k36.sum_k36[i_k36], inData_k36.ave_k36[i_k36]);
					//inData객체의 각각의 배열의 i번째 변수값을 받아와 차례대로 출력한다
		}		
	}
}
