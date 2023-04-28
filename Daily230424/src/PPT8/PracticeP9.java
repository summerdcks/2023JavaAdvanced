package PPT8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class PracticeP9 {

	public static void main(String[] args) throws IOException {
		File f_k36 = new File("C:\\Users\\DataSWB\\Desktop\\THTSKS010H00.dat");
		//File클래스의 객체 f를 생성하여 파일 경로를 지정
		BufferedReader br_k36 = new BufferedReader(new FileReader(f_k36));
		//BufferedReader클래스의 객체 b를 생성하고 FileReader클래스를 사용하여 f파일을 읽어들임

		//파일을 읽어들일 때 사용할 변수들을 초기화
		String readtxt_k36;
		int LineCnt_k36 = 0;
		int n_k36 = -1;
		StringBuffer s_k36 = new StringBuffer();
		//파일에서 읽어들인 한 줄의 문자열을 저장
		while (true) {	//파일을 처음부터 끝까지 읽기

			char[] ch_k36 = new char[1000];
			//읽어들인 문자열을 1000자씩 저장할 문자형 배열

			n_k36 = br_k36.read(ch_k36);
			//br객체의 read메소드를 호출하여 파일에서 데이터를 읽어들임
			
			if(n_k36 == -1) break;
			//더 이상 읽어들일 내용이 없다면 -1을 반환하고 종료

			for (char c_k36 : ch_k36) {	//ch배열에 저장된 문자열을 한글자씩 살펴봄
				if (c_k36 == '\n') {	//개행문자가 나오면
					System.out.printf("[%s]***\n", s_k36.toString());	//s문자열을 출력하고
					s_k36.delete(0, s_k36.length());	//s를 초기화
				} else {
					s_k36.append(c_k36);	//아니면 s에 c글자 추가
				}
			}
			LineCnt_k36++;	//읽고있는 줄 수 카운트
		}
		System.out.printf("[%s]***\n", s_k36.toString());	//s문자열을 출력
		br_k36.close();	//파일 닫기
	}
}
