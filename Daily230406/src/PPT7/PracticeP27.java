package PPT7;

import java.util.ArrayList;

public class PracticeP27 {	//클래스 선언

	public static void main(String[] args) {	//메인함수 선언
		ArrayList iAL_k36 = new ArrayList();	
		//ArrayList형식의 iAL을 생성하고 인스턴스에 연결한다
		iAL_k36.add("abc");		//0번째 변수 add
		iAL_k36.add("abcd");	//1번째 변수 add
		iAL_k36.add("efga");	//2번째 변수 add
		iAL_k36.add("가나다0");	//3번째 변수 add
		iAL_k36.add("1234");	//4번째 변수 add
		iAL_k36.add("12rk34");	//5번째 변수 add
		
		System.out.printf("******************************\n");	//구분선 출력
		System.out.printf(" 시작 ArraySize %d \n", iAL_k36.size()); //제목과 리스트사이즈 출력
		for(int i_k36 = 0; i_k36 < iAL_k36.size(); i_k36++) {	//0번째부터 마지막 변수까지 차례대로
			System.out.printf(" ArrayList %d = %s\n", i_k36, iAL_k36.get(i_k36));	//출력한다
		}
		
		iAL_k36.set(3, "가라라라");//3번 어레이리스트 내용변경
		System.out.printf("******************************\n");	//구분선 출력
		System.out.printf(" 내용변경 ArraySize %d \n", iAL_k36.size());//제목과 리스트사이즈 출력
		for(int i_k36 = 0; i_k36 < iAL_k36.size(); i_k36++) {	//0번째부터 마지막 변수까지 차례대로
			System.out.printf(" ArrayList %d = %s\n", i_k36, iAL_k36.get(i_k36));	//출력한다
		}
		
		iAL_k36.remove(4);//4번 어레이리스트 삭제
		System.out.printf("******************************\n");	//구분선 출력
		System.out.printf(" 내용변경 ArraySize %d \n", iAL_k36.size());//제목과 리스트사이즈 출력
		for(int i_k36 = 0; i_k36 < iAL_k36.size(); i_k36++) {	//0번째부터 마지막 변수까지 차례대로
			System.out.printf(" ArrayList %d = %s\n", i_k36, iAL_k36.get(i_k36));	//출력한다
		}
		
		iAL_k36.sort(null);//어레이리스트 정렬
		System.out.printf("******************************\n");	//구분선 출력
		System.out.printf(" 리스트Sort ArraySize %d \n", iAL_k36.size());//제목과 리스트사이즈 출력
		for(int i_k36 = 0; i_k36 < iAL_k36.size(); i_k36++) {	//0번째부터 마지막 변수까지 차례대로
			System.out.printf(" ArrayList %d = %s\n", i_k36, iAL_k36.get(i_k36));	//출력한다
		}
		
		iAL_k36.clear();//어레이리스트 삭제
		System.out.printf("******************************\n");	//구분선 출력
		System.out.printf(" 전부 삭제 ArraySize %d \n", iAL_k36.size());//제목과 리스트사이즈 출력
		for(int i_k36 = 0; i_k36 < iAL_k36.size(); i_k36++) {	//0번째부터 마지막 변수까지 차례대로
			System.out.printf(" ArrayList %d = %s\n", i_k36, iAL_k36.get(i_k36));	//출력한다
		}

	}

}
