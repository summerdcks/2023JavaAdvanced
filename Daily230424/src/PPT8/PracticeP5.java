package PPT8;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class PracticeP5 {	//클래스 선언

	public static void main(String[] args) {	//메인함수 선언
		try {
			File f_k36 = new File("c:\\Users\\DataSWB\\Mytest.txt");	//해당 경로의 파일을 객체로 선언한다
			FileWriter fw_k36 = new FileWriter(f_k36);	//객체 fw를 생성하며 f를 FileWriter에 연결하여 선언
			
			fw_k36.write("안녕 파일\n");	//파일에 내용 입력
			fw_k36.write("hello 헬로\n");	//파일에 내용 입력
			
			fw_k36.close();	//파일 닫기
			
			FileReader fr_k36 = new FileReader(f_k36);	//객체 fr을 생성하며 f를 FileReader에 연결하여 선언
			
			int n_k36 = -1;		//파일읽기에 사용할 정수형 변수 선언하며 -1로 초기화
			char [] ch_k36;		//파일읽기에 사용할 문자형 배열 선언
			
			while(true) {	//반복문 실행
				ch_k36 = new char[100];			//character 100개씩 읽어낼 크기 100의 배열 선언
				n_k36 = fr_k36.read(ch_k36);	//파일의 내용을 char단위로 배열에 넣고 배열의 크기를 n으로 반환
				
				if(n_k36 == -1) break;			//마지막엔 아무것도 없으니 -1이 나오고 종료
				
				for(int i_k36 = 0; i_k36 < n_k36; i_k36++) {	//i가 배열의 끝까지 차례대로 읽어냄
					//for(char c: ch){
					System.out.printf("%c", ch_k36[i_k36]);		//i번째 문자를 출력하여 파일내용을 차례대로 출력해냄
				}
			}			
			fr_k36.close();	//파일 닫기
			
			System.out.printf("\n FILE READ END");	//해당메시지 출력
		}catch(Exception e_k36) {	//Exception이 발생했을 때 catch문으로 온다
			System.out.printf("나 에러[%s]\n", e_k36);	//에러메시지 출력
		}
	}
}
