package PPT8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class PracticeP7 {

	public static void main(String[] args) throws IOException {
		File f_k36 = new File("C:\\Users\\DataSWB\\Desktop\\성남무료와이파이정보.csv");
		//해당 경로의 파일을 객체로 선언
		BufferedReader br_k36 = new BufferedReader(new FileReader(f_k36));
		//객체 br를 생성하며 f를 FileReader와 BufferedReader에 연결하며 선언
		
		String readtxt_k36;	//문자열 변수 선언
		
		if((readtxt_k36 = br_k36.readLine()) == null) {	//파일에 읽어낼 내용이 없으면
			System.out.printf("빈 파일입니다\n");	//해당문구 출력
			return;
		}
		String[] field_name_k36 = readtxt_k36.split(",");
		//읽어들인 내용(제목)을 \t기준으로 나눠서 문자열배열에 담아줌
		
		int LineCnt_k36 = 0;	//항목갯수 표시 위해 정수형 변수 선언
		while((readtxt_k36 = br_k36.readLine()) != null) {	//더이상 읽을 내용이 없을 때까지 반복
			String[] field_k36 = readtxt_k36.split(",");
			//읽어들인 내용(내용)을 ,기준으로 나눠서 차례대로 문자열배열 field에 담아줌
			System.out.printf("**[%d번째 항목]**********************\n", LineCnt_k36);	//출력
			for(int j_k36 = 0; j_k36 < field_name_k36.length; j_k36++) {	
				System.out.printf("%s : %s\n", field_name_k36[j_k36], field_k36[j_k36]);
				//각 배열의 j번 인덱스의 제목과 내용을 차례대로 출력
			}
			System.out.printf("************************************\n");	//출력
			if(LineCnt_k36 == 100) break;	//파일의 100번째줄까지 count되면 반복문 종료
			LineCnt_k36++;	//몇줄까지 읽었는지 +1로 표시
		}
	br_k36.close();	//파일 닫기
	}
}