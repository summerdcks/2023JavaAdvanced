package PPT7;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PracticeP33P35 {	//클래스 선언
	
	public static void main(String[] args) {	//메인함수 선언
		dataSet_k36();				//데이터셋팅	
		for(j_k36 = 0; j_k36 < ArrayOneRec_k36.size(); j_k36++) {					
			HeaderPrint_k36();		//헤더인쇄								
			dataSort_k36();			//데이터정렬
			ItemPrint_k36(j_k36);	//내용인쇄				
			TailPrint_k36();		//꼬리인쇄			
		}			
	}
	
	static ArrayList<OneRec> ArrayOneRec_k36 = new ArrayList<OneRec>();
	//OneRec객체를 변수로 하는 ArrayList형식의 ArrayOneRec을 생성하고 인스턴스에 연결한다	
	
	static int j_k36 = 0;	//class내의 여러 함수에서 사용할 변수를 미리 선언
	static int count_k36 = 0;	//페이지수 출력을 위한 정수형 변수 선언
	static final int iPerson_k36 = 200;	//총인원수를 변하지 않는 정수형 변수로 선언
	static final int personPerPage_k36 = 50;	//페이지당 할당인원수를 변하지 않는 정수형 변수로 선언
	
	//현재페이지 합계 도출에 사용할 정수형 변수들을 선언하고 0으로 초기화한다
	static int ksum_k36 = 0;
	static int esum_k36 = 0;
	static int msum_k36 = 0;
	static int ssum_k36 = 0;
	static int asum_k36 = 0;
				
	//누적페이지 합계 도출에 사용할 정수형 변수들을 선언하고 0으로 초기화한다	
	static int sumkor_k36 = 0;
	static int sumeng_k36 = 0;
	static int summat_k36 = 0;
	static int sumsum_k36 = 0;
	static int sumave_k36 = 0;
	
	public static void dataSet_k36() {		//리턴값이 없는 함수 선언
		for(int i_k36 = 0; i_k36 < iPerson_k36; i_k36++) {		//총 인원수만큼
			String name_k36 = String.format("홍길%02d", i_k36+1); //이름만들기
			int kor_k36 = (int)(Math.random() * 100);	//국어점수 만들기
			int eng_k36 = (int)(Math.random() * 100);	//영어점수 만들기
			int mat_k36 = (int)(Math.random() * 100);	//수학점수 만들기
			ArrayOneRec_k36.add(new OneRec(i_k36+1, name_k36, kor_k36, eng_k36, mat_k36));
			//ArrayOneRec에 변수가 다음과 같은 새로운 OneRec 객체를 추가
		}
	}
	
	public static void dataSort_k36() {		//리턴값이 없는 함수 선언
		Comparator<OneRec> bikyeokijun_k36 = new Comparator<OneRec>() {
			//Comparator는 자바에서 두 개의 객체를 비교하기 위한 인터페이스로 비교 결과에 따라 정렬이 이루어짐
			//OneRec클래스의 객체를 비교하기 위해 Comparator<OneRec>을 사용한다
			public int compare(OneRec a1_k36, OneRec a2_k36) {
				//compare함수는 OneRec 객체인 a1_k36과 a2_k36를 비교하여 정수값을 반환한다
				return (a2_k36.sum_k36() - a1_k36.sum_k36());	
			}	
		};
		Collections.sort(ArrayOneRec_k36, bikyeokijun_k36);	//정렬
		//ArrayOneRec리스트의 변수들을 bikyeokijun Comparator 객체에 의해 정렬
		//Collections.reverse(ArrayOneRec_k36); //역정렬, 뒤집기
	}
	
	public static void HeaderPrint_k36() {		//리턴값이 없는 함수 선언
		if(j_k36 % personPerPage_k36 == 0) {	//j번째가 페이지당 할당인원수의 배수일때
			//페이지별 할당인원수의 배수번째가 되면 상단부를 출력해준다 
			count_k36++;	//페이지수 카운트
			LocalDateTime currenttime_k36 = LocalDateTime.now();
			//LocalDateTime함수를 이용해 현재시간을 불러온다
			DateTimeFormatter formatter1_k36 = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
			//DateTimeFormatter함수를 이용하여 원하는 변수값을 받아 형태를 부여한다
			String formattedDateTime1_k36 = currenttime_k36.format(formatter1_k36);
			//불러온 현재시간을 원하는 형태에 맞게 출력할 수 있도록 String변수로 받는다
			System.out.printf("%19s\n", "성적집계표");
			System.out.printf("%s%d%14s%s\n","Page: ",count_k36, "출력일자 : ", formattedDateTime1_k36);
			//페이지수와 현재시간을 형식에 맞게 출력하고 줄바꿈한다
			System.out.printf("=============================================\n");	//구분선 출력
			System.out.printf("%s%5s%7s%4s%4s%4s%4s\n", "번호", "이름", "국어", "영어", "수학", "총점", "평균");
			System.out.printf("=============================================\n");	//구분선 출력
			//현재페이지의 합계와 평균을 도출하기 위해 헤더를 출력할 때마다 sum을 초기화해준다
			ksum_k36 = 0;
			esum_k36 = 0;
			msum_k36 = 0;
			ssum_k36 = 0;
			asum_k36 = 0;				
		}	
	} 

	public static void ItemPrint_k36(int j_k36) {		//정수를 입력받고 리턴값이 없는 함수 선언
		OneRec rec_k36;	//OneRed클래스 형식의 객체 rec를 생성
		
		rec_k36 = ArrayOneRec_k36.get(j_k36);	
		//ArrayOneRec리스트에서 j번째 OneRec 객체를 가져와서 rec변수에 대입한다
		System.out.printf("%03d%8s%6d%6d%6d%6d%6d\n", rec_k36.student_id(), rec_k36.name_k36(), rec_k36.kor_k36(),
				rec_k36.eng_k36(), rec_k36.mat_k36(), rec_k36.sum_k36(), (int)rec_k36.ave_k36());
				//rec라는 이름의 OneRec객체의 각 함수의 반환값을 배정된 자리에 차례대로 출력한다 마지막 변수는 정수형변환하여 출력한다
		
		//누적페이지의 합계와 평균을 도출하기 위해 0번째부터 j번째까지 차례대로 변수들을 더해나간다
		sumkor_k36 += rec_k36.kor_k36();
		sumeng_k36 += rec_k36.eng_k36();
		summat_k36 += rec_k36.mat_k36();
		sumsum_k36 += rec_k36.sum_k36();
		sumave_k36 += rec_k36.ave_k36();	
		
		//현재페이지의 합계와 평균을 도출하기 위해 헤더가 출력되는 부분부터 j번째까지 차례대로 변수들을 더해나간다
		ksum_k36 += rec_k36.kor_k36();
		esum_k36 += rec_k36.eng_k36();
		msum_k36 += rec_k36.mat_k36();
		ssum_k36 += rec_k36.sum_k36();
		asum_k36 += rec_k36.ave_k36();	
	}
	
	public static void TailPrint_k36() {		//리턴값이 없는 함수 선언
		if ((j_k36+1-personPerPage_k36) % personPerPage_k36 == 0){
			System.out.printf("=============================================\n");	//구분선 출력
			System.out.printf("현재페이지\n");
			System.out.printf("%s%16d%6d%6d%6d%6d\n", "합계", ksum_k36, esum_k36, msum_k36, ssum_k36, asum_k36);
			System.out.printf("%s%16d%6d%6d%6d%6d\n", "평균", ksum_k36/personPerPage_k36, esum_k36/personPerPage_k36,
					msum_k36/personPerPage_k36, ssum_k36/personPerPage_k36, asum_k36/personPerPage_k36);		
					//현재페이지의 합계를 페이지당 할당인원수로 나누어주면 현재페이지의 평균값이 나온다
			System.out.printf("=============================================\n");	//구분선 출력
			System.out.printf("누적페이지\n");
			System.out.printf("%s%16d%6d%6d%6d%6d\n", "합계", sumkor_k36, sumeng_k36, summat_k36, sumsum_k36, sumave_k36);
			System.out.printf("%s%16d%6d%6d%6d%6d\n\n\n", "평균", sumkor_k36 / (j_k36+1), sumeng_k36 / (j_k36+1),
					summat_k36 / (j_k36+1), sumsum_k36 / (j_k36+1), sumave_k36 / (j_k36+1));
					//각 합계를 j+1로 나누어주면 0부터 j번째까지의(화면상에선 1부터 j+1번째) 학생들의 평균값이 나온다
		} else if (j_k36 == iPerson_k36-1) {
			System.out.printf("=============================================\n");	//구분선 출력
			System.out.printf("현재페이지\n");	//문구 출력
			System.out.printf("%s%16d%6d%6d%6d%6d\n", "합계", ksum_k36, esum_k36, msum_k36, ssum_k36, asum_k36);
			System.out.printf("%s%16d%6d%6d%6d%6d\n", "평균", ksum_k36 / (iPerson_k36 - ((count_k36-1) * personPerPage_k36)),
					esum_k36/(iPerson_k36 - ((count_k36-1) * personPerPage_k36)), msum_k36/(iPerson_k36 - ((count_k36-1) * personPerPage_k36)),
					ssum_k36/(iPerson_k36 - ((count_k36-1) * personPerPage_k36)), asum_k36/(iPerson_k36 - ((count_k36-1) * personPerPage_k36)));		
					//현재페이지의 합계를 전체인원수-((페이지수-1)*페이지당 인원수) 로 나누어주면 
					//마지막페이지의 평균값이 나온다
			System.out.printf("=============================================\n");	//구분선 출력
			System.out.printf("누적페이지\n");	//문구 출력
			System.out.printf("%s%16d%6d%6d%6d%6d\n", "합계", sumkor_k36, sumeng_k36, summat_k36, sumsum_k36, sumave_k36);
			System.out.printf("%s%16d%6d%6d%6d%6d\n\n\n", "평균", sumkor_k36 / (j_k36+1), sumeng_k36 / (j_k36+1),
					summat_k36 / (j_k36+1), sumsum_k36 / (j_k36+1), sumave_k36 / (j_k36+1));
					//각 합계를 j+1로 나누어주면 0부터 j번째까지의(화면상에선 1부터 j+1번째) 학생들의 평균값이 나온다
		} 
	}
 }
