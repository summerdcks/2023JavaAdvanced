package PPT8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class PracticeP8 {

	public static void main(String[] args) throws IOException {
		File f_k36 = new File("C:\\Users\\DataSWB\\Desktop\\성남무료와이파이정보.txt");
		//해당 경로의 파일을 객체로 선언
		BufferedReader br_k36 = new BufferedReader(new FileReader(f_k36));
		//객체 br를 생성하며 f를 FileReader와 BufferedReader에 연결하며 선언
		
		String readtxt_k36;	//문자열 변수 선언
		
		if((readtxt_k36 = br_k36.readLine()) == null) {	//파일에 읽어낼 내용이 없으면
			System.out.printf("빈 파일입니다\n");	//해당문구 출력
			return;		//메인함수 종료
		}
		String[] field_name_k36 = readtxt_k36.split("\t");
		//읽어들인 내용(제목)을 \t기준으로 나눠서 문자열배열에 담아줌
		
		//융기원의 위도,경도를 실수형 변수로 선언
		double lat_k36 = 37.3860521;
		double lng_k36 = 127.1214038; 
		
		//최소거리, 최대거리를 구하기 위해 실수형 변수 선언
		double min_k36 = Double.MAX_VALUE;
		double max_k36 = Double.MIN_VALUE;
			
		//최소, 최대거리일 때의 데이터값 저장을 위해 문자열형 배열 선언
		String[] min__k36 = {};
		String[] max__k36 = {};
		
		int LineCnt_k36 = 1;	//항목갯수 표시 위해 정수형 변수 선언
		while((readtxt_k36 = br_k36.readLine()) != null) {	//더이상 읽을 내용이 없을 때까지 반복
			String[] field_k36 = readtxt_k36.split("\t");
			//읽어들인 내용(내용)을 \t기준으로 나눠서 차례대로 문자열배열 field에 담아줌
			System.out.printf("**[%d번째 항목]**********************\n", LineCnt_k36);	//출력
			System.out.printf("%s : %s\n", field_name_k36[9], field_k36[9]);	//도로명주소
			System.out.printf("%s : %s\n", field_name_k36[10], field_k36[10]);	//지번주소
			System.out.printf("%s : %s\n", field_name_k36[13], field_k36[13]);	//위도주소
			System.out.printf("%s : %s\n", field_name_k36[14], field_k36[14]);	//경도주소
			double dist_k36 = Math.sqrt(Math.pow(Double.parseDouble(field_k36[13]) - lat_k36, 2)
					+ Math.pow(Double.parseDouble(field_k36[14]) - lng_k36, 2));	
			//피타고라스 정리 : 거리^2 = (위도-현재위도)^2 + (경도-현재경도)^2 
			System.out.printf("현재지점과 거리 : %f\n", dist_k36);
			if(dist_k36 <= min_k36) {	//현재 데이터가 최소거리일 때			
				min__k36 = field_k36;	//해당 데이터를 min배열에 저장해줌
			}
			if(dist_k36 >= max_k36) {	//현재 데이터가 최대거리일 때			
				max__k36 = field_k36;	//해당 데이터를 max배열에 저장해줌
			}
			min_k36 = Math.min(min_k36, dist_k36);	//최소거리 업데이트
			max_k36 = Math.max(max_k36, dist_k36);	//최대거리 업데이트
			System.out.printf("************************************\n");	//출력
			
			LineCnt_k36++;	//몇줄까지 읽었는지 +1로 표시
		}	
		System.out.printf("**[최소거리]**************************\n");	//출력
		System.out.printf("%s : %s\n", field_name_k36[2], min__k36[2]);		//장소명
		System.out.printf("%s : %s\n", field_name_k36[9], min__k36[9]);		//도로명주소
		System.out.printf("%s : %s\n", field_name_k36[10], min__k36[10]);	//지번주소
		System.out.printf("%s : %s\n", field_name_k36[13], min__k36[13]);	//위도주소
		System.out.printf("%s : %s\n", field_name_k36[14], min__k36[14]);	//경도주소
		System.out.printf("최소거리 : %f\n", min_k36);
		System.out.printf("************************************\n");	//출력
				
		System.out.printf("**[최대거리]**************************\n");	//출력
		System.out.printf("%s : %s\n", field_name_k36[2], max__k36[2]);		//장소명
		System.out.printf("%s : %s\n", field_name_k36[9], max__k36[9]);		//도로명주소
		System.out.printf("%s : %s\n", field_name_k36[10], max__k36[10]);	//지번주소
		System.out.printf("%s : %s\n", field_name_k36[13], max__k36[13]);	//위도주소
		System.out.printf("%s : %s\n", field_name_k36[14], max__k36[14]);	//경도주소	
		System.out.printf("최대거리 : %f\n", max_k36);
		System.out.printf("************************************\n");	//출력
		
		br_k36.close();	//파일 닫기
	}
}
