package PPT6;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PracticeP39 {	//클래스 선언

	public static void main(String[] args) {	//메인함수 선언
		
		int iPerson_k36 = 30;		
		//정수형 변수 선언, 총인원수를 값으로 할당한다
		
		InputData inData_k36 = new InputData(iPerson_k36);		
		//InputData클래스를 받아 인스턴스를 생성하여 객체에 연결한다
			
		for(int i_k36 = 0; i_k36 < iPerson_k36; i_k36++) {	
			//아래의 변수들이 iPerson값의 갯수만큼 생성되어 각 배열의 변수로 저장된다
			String name_k36 = String.format("홍길%02d", i_k36+1);	//이름 만들기
			int kor_k36 = (int)(Math.random()*100);	//Math.random함수를 이용하여 국어,영어,수학 점수 만들기
			int eng_k36 = (int)(Math.random()*100);	//Math.random함수의 값은 실수형이므로 100을 곱하여 정수변환을 하면
			int mat_k36 = (int)(Math.random()*100);	//0~99사이의 정수값이 나온다
			inData_k36.SetData(i_k36, name_k36, kor_k36, eng_k36, mat_k36);
			//해당값들을 inData객체의 SetData함수에서 받아 각각의 배열에 변수로 누적시킨다
		}
		
		LocalDateTime currenttime_k36 = LocalDateTime.now();
		//LocalDateTime함수를 이용해 현재시간을 불러온다
		DateTimeFormatter formatter1_k36 = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
		//DateTimeFormatter함수를 이용하여 원하는 변수값을 받아 형태를 부여한다
		String formattedDateTime1_k36 = currenttime_k36.format(formatter1_k36);
		//불러온 현재시간을 원하는 형태에 맞게 출력할 수 있도록 String변수로 받는다
		
		//성적표 상단부 출력
		System.out.printf("%19s\n", "성적집계표");
		System.out.printf("%22s%s\n", "출력일자 : ", formattedDateTime1_k36);
		//문자열 변수로 저장한 현재시간을 형식에 맞게 출력하고 줄바꿈한다
		System.out.printf("=============================================\n");
		System.out.printf("%s%5s%5s%4s%4s%4s%4s\n", "번호", "이름", "국어", "영어", "수학", "총점", "평균");
		System.out.printf("=============================================\n");
			
		//합계, 평균값 도출에 사용할 정수형 변수들을 선언하고 0으로 초기화한다	
		int korsum_k36 = 0;
		int engsum_k36 = 0;
		int matsum_k36 = 0;
		int sumsum_k36 = 0;
		int avesum_k36 = 0;
		
		for(int i_k36 = 0; i_k36 < iPerson_k36; i_k36++) {	//0부터 iPerson-1번째 변수까지 차례대로 출력한다
			System.out.printf("%03d%8s%5d%6d%6d%6d%6d\n",
					i_k36+1, inData_k36.name_k36[i_k36], inData_k36.kor_k36[i_k36], inData_k36.eng_k36[i_k36],
					inData_k36.mat_k36[i_k36], inData_k36.sum_k36[i_k36], (int)inData_k36.ave_k36[i_k36]);
					//inData객체의 각 배열의 i번째 변수를 출력해준다, ave는 실수형이므로 정수형변환하여 출력한다
			//현재페이지의 과목점수를 누적해가며 합산해준다
			korsum_k36 = korsum_k36 + inData_k36.kor_k36[i_k36];
			engsum_k36 = engsum_k36 + inData_k36.eng_k36[i_k36];
			matsum_k36 = matsum_k36 + inData_k36.mat_k36[i_k36];
			sumsum_k36 = sumsum_k36 + inData_k36.sum_k36[i_k36];
			avesum_k36 = avesum_k36 + (int)inData_k36.ave_k36[i_k36];		
			//inData객체의 ave[i]는 실수형 배열의 i번째 실수값이므로 정수형변환하여 더해나간다
		
		}		
	
		System.out.printf("=============================================\n");
		System.out.printf("%s%14d%6d%6d%6d%6d\n", "합계", korsum_k36, engsum_k36, matsum_k36, sumsum_k36, avesum_k36);
		//각 과목별 점수, 총점, 평균의 합계를 출력해준다
		System.out.printf("%s%14d%6d%6d%6d%6d\n", "평균", korsum_k36/iPerson_k36, engsum_k36/iPerson_k36,
				matsum_k36/iPerson_k36, sumsum_k36/iPerson_k36, avesum_k36/iPerson_k36);
		//총합계를 총인원수를 나눈 평균값을 출력해준다
	}
}
