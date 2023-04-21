package PPT6;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PracticeP40 {	//클래스 선언

	public static void main(String[] args) {	//메인함수 선언
			
		int iPerson_k36 = 200;
		//정수형 변수 선언, 총인원수를 값으로 할당한다
		int personPerPage_k36 = 30;
		//정수형 변수 선언, 한페이지당 출력될 인원수를 값으로 할당한다
		
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
						
		//현재페이지 합계 도출에 사용할 정수형 변수들을 선언하고 0으로 초기화한다
		int ksum_k36 = 0;
		int esum_k36 = 0;
		int msum_k36 = 0;
		int ssum_k36 = 0;
		int asum_k36 = 0;
		
		//누적페이지 합계 도출에 사용할 정수형 변수들을 선언하고 0으로 초기화한다	
		int korsum_k36 = 0;
		int engsum_k36 = 0;
		int matsum_k36 = 0;
		int sumsum_k36 = 0;
		int avesum_k36 = 0;
		
		int count_k36 = 1;
		//페이지수 표시를 위해 정수형 변수를 선언하고 1로 초기화한다
				
		
		//출력시작
		for(int i_k36 = 0; i_k36 < iPerson_k36; i_k36++) {	//인원수만큼 루프를 돌고 빠져나온다
								
			//상단부 출력
			if(i_k36 % personPerPage_k36 == 0) {	//페이지별 할당인원수의 배수번째가 되면 상단부를 출력해준다 
				System.out.printf("%19s\n", "성적집계표");
				System.out.printf("%s%d%14s%s\n","Page: ",count_k36, "출력일자 : ", formattedDateTime1_k36);
				//페이지수와 현재시간을 형식에 맞게 출력하고 줄바꿈한다
				System.out.printf("=============================================\n");
				System.out.printf("%s%5s%7s%4s%4s%4s%4s\n", "번호", "이름", "국어", "영어", "수학", "총점", "평균");
				System.out.printf("=============================================\n");
				
				//루프를 돌 때마다 현재페이지 합계액을 0으로 초기화한다
				ksum_k36 = 0;
				esum_k36 = 0;
				msum_k36 = 0;
				ssum_k36 = 0;
				asum_k36 = 0;								
			} else {
				
			}	
			//번호, 이름, 과목별점수, 합계, 평균을 출력해준다
			System.out.printf("%03d%9s%6d%6d%6d%6d%6d\n",
				i_k36+1, inData_k36.name_k36[i_k36], inData_k36.kor_k36[i_k36], inData_k36.eng_k36[i_k36], 
				inData_k36.mat_k36[i_k36],	inData_k36.sum_k36[i_k36], (int)inData_k36.ave_k36[i_k36]);
							
			//현재페이지의 과목점수를 누적해가며 합산해준다
			ksum_k36 = ksum_k36 + inData_k36.kor_k36[i_k36];
			esum_k36 = esum_k36 + inData_k36.eng_k36[i_k36];
			msum_k36 = msum_k36 + inData_k36.mat_k36[i_k36];
			ssum_k36 = ssum_k36 + inData_k36.sum_k36[i_k36];
			asum_k36 = asum_k36 + (int)inData_k36.ave_k36[i_k36];	
			//inData객체의 ave[i]는 실수형 배열의 i번째 실수값이므로 정수형변환하여 더해나간다
				
			//지난 모든 페이지의 과목점수를 누적해가며 합산해준다
			korsum_k36 = korsum_k36 + inData_k36.kor_k36[i_k36];
			engsum_k36 = engsum_k36 + inData_k36.eng_k36[i_k36];
			matsum_k36 = matsum_k36 + inData_k36.mat_k36[i_k36];
			sumsum_k36 = sumsum_k36+ inData_k36.sum_k36[i_k36];
			avesum_k36 = avesum_k36 + (int)inData_k36.ave_k36[i_k36];		
			//inData객체의 ave[i]는 실수형 배열의 i번째 실수값이므로 정수형변환하여 더해나간다

			//하단부 출력
			if(i_k36 == iPerson_k36-1) {	//i가 iPerson-1번째일 때, 즉 총인원이 다 출력되었을 때
				//현재페이지와 누적페이지의 합계, 평균값을 출력해준다
				System.out.printf("=============================================\n");
				System.out.printf("현재페이지\n");
				System.out.printf("%s%16d%6d%6d%6d%6d\n", "합계", ksum_k36, esum_k36, msum_k36, ssum_k36, asum_k36);
				System.out.printf("%s%16d%6d%6d%6d%6d\n", "평균", ksum_k36/(iPerson_k36 - (count_k36-1) * personPerPage_k36),
						esum_k36/(iPerson_k36 - (count_k36-1) * personPerPage_k36), msum_k36/(iPerson_k36 - (count_k36-1) * personPerPage_k36),
						ssum_k36/(iPerson_k36 - (count_k36-1) * personPerPage_k36), asum_k36/(iPerson_k36 - (count_k36-1) * personPerPage_k36));	
						//현재페이지의 합계를 전체인원수-((페이지수-1)*페이지당 인원수) 로 나누어주면 
						//마지막페이지의 평균값이 나온다
				System.out.printf("=============================================\n");
				System.out.printf("누적페이지\n");
				System.out.printf("%s%16d%6d%6d%6d%6d\n", "합계", korsum_k36, engsum_k36, matsum_k36, sumsum_k36, avesum_k36);
				System.out.printf("%s%16d%6d%6d%6d%6d\n\n\n", "평균", korsum_k36/iPerson_k36, engsum_k36/iPerson_k36,
						 matsum_k36/iPerson_k36, sumsum_k36/iPerson_k36, avesum_k36/iPerson_k36);
						//각 합계를 총인원수로 나누어주면 전체 누적합계의 평균값이 나온다
			} else {
					
			}	
				
			if((i_k36+1-personPerPage_k36) % personPerPage_k36 == 0) {	
				//(i+1-personPerPage)를 personPerPage로 나눈 나머지가 0일 때, 즉 페이지별 할당인원수만큼 출력되었을 때마다
				//현재페이지와 누적페이지의 합계, 평균값을 출력해준다
				System.out.printf("=============================================\n");
				System.out.printf("현재페이지\n");
				System.out.printf("%s%16d%6d%6d%6d%6d\n", "합계", ksum_k36, esum_k36, msum_k36, ssum_k36, asum_k36);
				System.out.printf("%s%16d%6d%6d%6d%6d\n", "평균", ksum_k36/personPerPage_k36, esum_k36/personPerPage_k36,
						 msum_k36/personPerPage_k36, ssum_k36/personPerPage_k36, asum_k36/personPerPage_k36);		
				//현재페이지의 합계를 페이지당 할당인원수로 나누어주면 현재페이지의 평균값이 나온다
				System.out.printf("=============================================\n");
				System.out.printf("누적페이지\n");
				System.out.printf("%s%16d%6d%6d%6d%6d\n", "합계", korsum_k36, engsum_k36, matsum_k36, sumsum_k36, avesum_k36);
				System.out.printf("%s%16d%6d%6d%6d%6d\n\n\n", "평균", korsum_k36/(i_k36+1), engsum_k36/(i_k36+1),
						matsum_k36/(i_k36+1), sumsum_k36/(i_k36+1), avesum_k36/(i_k36+1));
						//각 합계를 i+1로 나누어주면 0부터 i번째까지의(화면상에선 1부터 i+1번째) 학생들의 평균값이 나온다 
								
				count_k36 = count_k36 + 1;
				//매 루프의 마지막에 페이지수를 1씩 증가시킨다
			} else {
				
			}							
		}
	}
}
