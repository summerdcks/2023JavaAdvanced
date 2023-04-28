package PPT8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PracticeP1102 {
//특정일자의 모든 종목 추출하기
	public static void main(String[] args) throws IOException {
		File f_k36 = new File("C:\\Users\\DataSWB\\Desktop\\THTSKS010H00.dat");
		//File클래스의 객체 f를 생성하여 파일 경로를 지정
		BufferedReader br_k36 = new BufferedReader(new FileReader(f_k36));
		//BufferedReader클래스의 객체 br을 생성하고 FileReader클래스를 사용하여 f파일을 읽어들임
		
		File f1_k36= new File("C:\\Users\\DataSWB\\Desktop\\20070112.csv");
		//File클래스의 객체 f1를 생성하여 파일 경로를 지정
		BufferedWriter bw1_k36 = new BufferedWriter(new FileWriter(f1_k36));
		//f1 파일에 문자를 작성하는 BufferedWriter 객체인 bw1를 생성

		String readtxt_k36;	//한 줄씩 읽어올 문자열형 변수를 선언
		
		int cnt_k36 = 0; int wcnt_k36 = 0;
		//읽은 라인 수를 세기 위한 변수와 쓴 라인 수를 세기 위한 변수를 선언
		while((readtxt_k36 = br_k36.readLine()) != null) {	//파일 끝까지 한 줄씩 읽어들임
			StringBuffer s_k36 = new StringBuffer();
			//StringBuffer클래스 형식의 객체 s를 생성한다
			String[] field_k36 = readtxt_k36.split("%_%");
			//%_%를 기준으로 분리해서 field 문자열형 배열에 담는다
		
			if(field_k36.length > 2 && field_k36[1].replace("^", "").trim().substring(0, 8).contains("20070112")) {
				//만약 필드 수가 2보다 크고 1번째 필드의 0부터 8번째까지의 문자열에 20070112이 담겨있다면
				s_k36.append(field_k36[0].replace("^", "").trim());
				//0번째 인덱스의 변수에서 ^를 뺀 값을 s에 추가한다
				for(int j_k36 = 1; j_k36 < field_k36.length; j_k36++) {
					s_k36.append("," + field_k36[j_k36].replace("^", "").trim());
					//나머지 변수들을 차례대로 쉼표와 함께 s에 담아준다
				}
				bw1_k36.write(s_k36.toString());	//s에 담긴 line을 bw1에 써준다
				bw1_k36.newLine();	//엔터
				wcnt_k36++;	//읽고 있는 라인의 수 +1
				System.out.printf("write [%d][%d][%s]\n", cnt_k36, wcnt_k36, s_k36.toString());		
				//읽어들이고 있는 line 수와 해당 line을 차례대로 출력해준다
			}
			cnt_k36++;	//읽은 라인 수 +1
		}
		br_k36.close();		//파일 닫기
		bw1_k36.close();	//파일 닫기
		
		System.out.printf("Program End[%d][%d]record\n", cnt_k36, wcnt_k36);
		//작업이 끝나면 해당문구와 카운트한 라인수를 출력해준다
	} 
}
