package PPT8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class samsung2015 {
//삼성전자 2015년 자료만 뽑기
	public static void main(String[] args) throws IOException {
		File f_k36 = new File("C:\\Users\\DataSWB\\Desktop\\samsung.csv");
		//File클래스의 객체 f를 생성하여 파일 경로를 지정
		BufferedReader br_k36 = new BufferedReader(new FileReader(f_k36));
		//BufferedReader클래스의 객체 br을 생성하고 FileReader클래스를 사용하여 f파일을 읽어들임
		
		File f1_k36= new File("C:\\Users\\DataSWB\\Desktop\\samsung2015.csv");
		//File클래스의 객체 f1를 생성하여 파일 경로를 지정
		BufferedWriter bw1_k36 = new BufferedWriter(new FileWriter(f1_k36));
		//f1 파일에 문자를 작성하는 BufferedWriter 객체인 bw1를 생성

		String readtxt_k36;	//한 줄씩 읽어올 문자열형 변수를 선언
		
	    while ((readtxt_k36 = br_k36.readLine()) != null) {		//파일의 처음부터 끝까지 읽어들임
	        String[] field_k36 = readtxt_k36.split(",");	//읽어온 line을 ,을 기준으로 나누어 문자열형 배열에 담아줌
	        if (field_k36[1].contains("2015")) {	//해당 배열의 인덱스 3의 변수값에 2015가 포함되면
	        	bw1_k36.write(readtxt_k36);	//bw1파일에 maxLine문자열을 써주고
	     	    bw1_k36.newLine();			//줄바꿈
	        } 
	    }	   
	    br_k36.close();		//파일닫기
	    bw1_k36.close();	//파일닫기
	}
}
