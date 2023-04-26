package PPT8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PracticeP6 {	//클래스 선언
	public static void FileWrite() throws IOException {	//메소드 선언
		File f_k36 = new File("c:\\Users\\DataSWB\\Mytest.txt");	
		//해당 경로의 파일을 객체로 선언
		BufferedWriter bw_k36 = new BufferedWriter(new FileWriter(f_k36));
		//객체 bw를 생성하며 f를 FileWriter와 BufferedWriter에 연결하며 선언

		bw_k36.write("안녕 파일");	//해당 내용 입력
		bw_k36.newLine();			//줄바꿈
		bw_k36.write("hello 헬로");	//해당 내용 입력
		bw_k36.newLine();			//줄바꿈
		
		bw_k36.close();	//파일 닫기
	}
	public static void FileRead() throws IOException {	//메소드 선언
		File f_k36 = new File("c:\\Users\\DataSWB\\Mytest.txt");
		//해당 경로의 파일을 객체로 선언
		BufferedReader br_k36 = new BufferedReader(new FileReader(f_k36));
		//객체 br를 생성하며 f를 FileReader와 BufferedReader에 연결하며 선언
		
		String readtxt_k36;	//문자열 변수 선언
		
		while((readtxt_k36 = br_k36.readLine()) != null) {	//파일 본문 내용을 읽어들이며 끝날 때까지 반복
			System.out.printf("%s\n", readtxt_k36);	//해당 내용을 출력해주고 줄바꿈
		}
		br_k36.close();	//파일 닫기
	}		
	public static void main(String[] args) throws IOException {	//메인함수 선언
		FileWrite();	//메소드 실행	
		FileRead();		//메소드 실행
	}
}
