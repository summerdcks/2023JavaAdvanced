package PPT6;

public class InputData {	//클래스 선언
	int iPerson_k36;	//정수형 변수 선언
	String [] name_k36;	//문자열형 배열 선언
	int [] kor_k36;	//정수형 배열 선언
	int [] eng_k36;	//정수형 배열 선언
	int [] mat_k36;	//정수형 배열 선언
	int [] sum_k36;	//정수형 배열 선언
	double [] ave_k36;	//실수형 배열 선언
	
	
	public InputData(int iPerson_k36) {	//InputData클래스의 생성자에서 ReportSheet에서 입력된 정수값을 받아온다
		this.iPerson_k36 = iPerson_k36;	//해당값을 InputData클래스의 iPerson변수에 할당한다
		name_k36 = new String[iPerson_k36];	//iPerson크기의 문자열형 배열이 생성된다
		kor_k36 = new int[iPerson_k36];	//iPerson크기의 정수형 배열이 생성된다
		eng_k36 = new int[iPerson_k36];	//iPerson크기의 정수형 배열이 생성된다
		mat_k36 = new int[iPerson_k36];	//iPerson크기의 정수형 배열이 생성된다
		sum_k36 = new int[iPerson_k36];	//iPerson크기의 정수형 배열이 생성된다
		ave_k36 = new double[iPerson_k36];	//iPerson크기의 실수형 배열이 생성된다
	}


	public void SetData(int i_k36, String name_k36, int kor_k36, int eng_k36, int mat_k36) {
		//반환값이 없는 void형 SetData함수에서 한개의 문자열과 5개의 정수를 받는다
		this.name_k36[i_k36] = name_k36;	//해당 문자열은 InputData클래스의 문자열형 name배열의 i번째 변수로 저장된다
		this.kor_k36[i_k36] = kor_k36;		//해당 정수값은 InputData클래스의 정수형 kor배열의 i번째 변수로 저장된다
		this.eng_k36[i_k36] = eng_k36;		//해당 정수값은 InputData클래스의 정수형 eng배열의 i번째 변수로 저장된다
		this.mat_k36[i_k36] = mat_k36;		//해당 정수값은 InputData클래스의 정수형 mat배열의 i번째 변수로 저장된다
		this.sum_k36[i_k36] = kor_k36 + eng_k36 + mat_k36;	//세 정수를 합한 값은 InputData클래스의 정수형 sum배열의 i번째 변수로 저장된다
		this.ave_k36[i_k36] = sum_k36[i_k36] / 3.;	//InputData클래스의 정수형 sum배열의 i번째 변수를 3.0으로 나눈 값을
													//InputData클래스의 실수형 ave배열에 저장한다
	}
	
}
