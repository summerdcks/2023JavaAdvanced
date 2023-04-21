package PPT7;

public class PracticeP24 {	// 클래스 선언

	public static void main(String[] args) {	//메인함수 선언
		int [] iArray_k36 = {1,7,5,3,2,1,3,4,9,12,1,212,33,11,21,11,2121,121,11,5,6,33};
		//정수형 배열을 선언하고 변수를 할당해준다
		
		for(int i_k36 = 0; i_k36 < iArray_k36.length; i_k36++) {	//0부터 배열의길이 직전까지 차례대로 출력해준다
			System.out.printf("iArray[%d]=%d\n", i_k36, iArray_k36[i_k36]); //배열의 i번째 변수를 출력해준다
		}

		//MAX찾기
		int iMax_k36 = iArray_k36[0];	//정수형 변수를 선언하며 iArray배열의 0번째 변수값을 할당해준다
		int iMaxPt_k36 = 0;			//정수형 변수를 선언하며 0으로 초기화한다, 최대값이 몇번째인지 표시해주기 위한 변수
		for(int i_k36 = 0; i_k36 < iArray_k36.length; i_k36++) {	//0부터 배열의길이 직전까지 루프를 돌며 값을 비교해준다
			if(iMax_k36 < iArray_k36[i_k36]) {	//배열의 i번째 변수값이 이미 할당된 값보다 크면
				iMax_k36 = iArray_k36[i_k36];	//i번째 변수값을 할당해준다
				iMaxPt_k36 = i_k36;			//몇번째 변수인지 i값을 iMaxPt에 할당해준다
			}
		}
		System.out.printf("MAX : iArray[%d] = %d\n", iMaxPt_k36, iMax_k36);
		//iArray배열의 최대값인 iMaxPt번째 변수 iMax를 출력해준다
		
		//MIN찾기
		int iMin_k36 = iArray_k36[0];	//정수형 변수를 선언하며 iArray배열의 0번째 변수값을 할당해준다
		int iMinPt_k36 = 0;			//정수형 변수를 선언하며 0으로 초기화한다, 최대값이 몇번째인지 표시해주기 위한 변수
		for(int i_k36 = 0; i_k36 < iArray_k36.length; i_k36++) {	//0부터 배열의길이 직전까지 루프를 돌며 값을 비교해준다
			if(iMin_k36 > iArray_k36[i_k36]) {	//배열의 i번째 변수값이 이미 할당된 값보다 작으면
				iMin_k36 = iArray_k36[i_k36];	//i번째 변수값을 할당해준다
				iMinPt_k36 = i_k36;			//몇번째 변수인지 i값을 iMinPt에 할당해준다
			}
		}
		System.out.printf("MIN : iArray[%d] = %d\n", iMinPt_k36, iMin_k36);
		//iArray배열의 최소값인 iMinPt번째 변수 iMin를 출력해준다
	}
}
