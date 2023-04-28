package PPT8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Practicep1103 {
//삼성전자 2015년의 종가 최대최소 구하기
	public static void main(String[] args) throws IOException {
		File f_k36 = new File("C:\\Users\\DataSWB\\Desktop\\samsung2015.csv");
		//File클래스의 객체 f를 생성하여 파일 경로를 지정
		BufferedReader br_k36 = new BufferedReader(new FileReader(f_k36));
		//BufferedReader클래스의 객체 br을 생성하고 FileReader클래스를 사용하여 f파일을 읽어들임
		
		File f1_k36= new File("C:\\Users\\DataSWB\\Desktop\\samsung2015minmax.csv");
		//File클래스의 객체 f1를 생성하여 파일 경로를 지정
		BufferedWriter bw1_k36 = new BufferedWriter(new FileWriter(f1_k36));
		//f1 파일에 문자를 작성하는 BufferedWriter 객체인 bw1를 생성

		String readtxt_k36;	//한 줄씩 읽어올 문자열형 변수를 선언
		
		//최소 최대값을 구하기 위해 사용할 정수형 변수 선언
		int max_36 = Integer.MIN_VALUE;
	    int min_36 = Integer.MAX_VALUE;

	    //최소 최대값을 구하기 위해 사용할 문자열형 변수 선언
	    String maxLine_36 = "";
	    String minLine_36 = "";
	    
	    while ((readtxt_k36 = br_k36.readLine()) != null) {		//파일의 처음부터 끝까지 읽어들임
	        String[] field_k36 = readtxt_k36.split(",");	//읽어온 line을 ,을 기준으로 나누어 문자열형 배열에 담아줌
	        if (Integer.parseInt(field_k36[3]) < min_36) {	//해당 배열의 인덱스 3의 변수값이 min보다 작으면
	           minLine_36 = readtxt_k36;					//해당 배열을 minLine 변수에 저장해줌
	        } else if (Integer.parseInt(field_k36[3]) > max_36) {	//해당 배열의 인덱스 3의 변수값이 max보다 크면
	           maxLine_36 = readtxt_k36;					//해당 배열을 maxLine 변수에 저장해줌
	        }
	        min_36 = Math.min(min_36, Integer.parseInt(field_k36[3]));	//최소값 업데이트
	        max_36 = Math.max(max_36, Integer.parseInt(field_k36[3]));	//최대값 업데이트	       
	    }
	    bw1_k36.write(minLine_36);	//bw1파일에 maxLine문자열을 써주고
	    bw1_k36.newLine();			//줄바꿈
	    bw1_k36.write(maxLine_36);	//bw1파일에 minLine문자열을 써주고
	    br_k36.close();		//파일닫기
	    bw1_k36.close();	//파일닫기
	}
}
