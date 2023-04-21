package PPT7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class PracticeP30P34 {	//클래스 선언
	
	public static void main(String[] args) {	//메인함수 선언
		dataSet_k36();	//데이터셋팅
		dataSort_k36();	//데이터정렬
		HeaderPrint_k36();	//헤더인쇄		
		for(int i_k36 = 0; i_k36 < ArrayOneRec_k36.size(); i_k36++) {	
			//ArrayOneRec의 0번째부터 마지막번째 변수까지 for문을 돈다
			ItemPrint_k36(i_k36);	//내용인쇄
		}
		TailPrint_k36();	//꼬리인쇄
	}
	
	static ArrayList<OneRec> ArrayOneRec_k36 = new ArrayList<OneRec>();
	//OneRec객체를 변수로 하는 ArrayList형식의 ArrayOneRec을 생성하고 인스턴스에 연결한다
	
	//합계와 평균 도출에 사용할 정수형 변수들을 선언하고 0으로 초기화한다
	static int sumkor_k36 = 0;
	static int sumeng_k36 = 0;
	static int summat_k36 = 0;
	static int sumsum_k36 = 0;
	static int sumave_k36 = 0;
	
	static final int iPerson_k36 = 20;
	//총인원수를 변하지 않는 final 정수형 변수로 선언한다
	
	public static void dataSet_k36() {		//리턴값이 없는 함수 선언
		for(int i_k36 = 0; i_k36 < iPerson_k36; i_k36++) {		//총인원수만큼
			String name_k36 = String.format("홍길%02d", i_k36); //이름만들기
			int kor_k36 = (int)(Math.random() * 100);	//국어점수 만들기
			int eng_k36 = (int)(Math.random() * 100);	//영어점수 만들기
			int mat_k36 = (int)(Math.random() * 100);	//수학점수 만들기
			ArrayOneRec_k36.add(new OneRec(i_k36, name_k36, kor_k36, eng_k36, mat_k36));
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
		System.out.printf("***************************************\n");	//구분선 출력
		System.out.printf("%2s %4s %2s %2s %2s %2s  %3s\n", "번호", "이름", "국어", "영어", "수학", "합계", "평균");
		//문자열 6개를 각각 할당된 자리에 차례대로 출력
		System.out.printf("***************************************\n");	//구분선 출력
	} 

	public static void ItemPrint_k36(int i_k36) {		//정수를 입력받고 리턴값이 없는 함수 선언
		OneRec rec_k36;	//OneRed클래스 형식의 객체 rec를 생성
		
		rec_k36 = ArrayOneRec_k36.get(i_k36);
		//ArrayOneRec리스트에서 j번째 OneRec 객체를 가져와서 rec변수에 대입한다
		System.out.printf("%4d %4s %4d %4d %4d %4d %6.2f\n", rec_k36.student_id(), rec_k36.name_k36(), rec_k36.kor_k36(),
				rec_k36.eng_k36(), rec_k36.mat_k36(), rec_k36.sum_k36(), rec_k36.ave_k36());
		//rec라는 이름의 OneRec객체의 각 함수의 반환값을 배정된 자리에 차례대로 출력한다 마지막 변수는 정수형변환하여 출력한다
		
		//합계와 평균을 도출하기 위해 0번째부터 i번째까지 차례대로 변수들을 더해나간다
		sumkor_k36 += rec_k36.kor_k36();
		sumeng_k36 += rec_k36.eng_k36();
		summat_k36 += rec_k36.mat_k36();
		sumsum_k36 += rec_k36.sum_k36();
		sumave_k36 += rec_k36.ave_k36();	
	}
	
	public static void TailPrint_k36() {		//리턴값이 없는 함수 선언
		System.out.printf("***************************************\n");	//구분선 출력
		//각 과목의 합계를 정수로, 그 값을 ArrayOneRec의 사이즈 즉 객체의 수만큼 나눈 평균값을 실수형변환하여 출력해준다
		System.out.printf("국어합계 %d  국어평균: %6.2f\n", sumkor_k36, sumkor_k36 / (double)ArrayOneRec_k36.size());
		System.out.printf("영어합계 %d  영어평균: %6.2f\n", sumeng_k36, sumeng_k36 / (double)ArrayOneRec_k36.size());
		System.out.printf("수학합계 %d  수학평균: %6.2f\n", summat_k36, summat_k36 / (double)ArrayOneRec_k36.size());
		System.out.printf("***************************************\n");	//구분선 출력
		System.out.printf("반평균합계 %d  반평균: %6.2f\n", sumave_k36, sumave_k36 / (double)ArrayOneRec_k36.size());	
		//반평균 합계를 정수로, 그 값을 ArrayOneRec의 사이즈 즉 객체의 수만큼 나눈 평균값을 실수형변환하여 출력해준다
	}
 }
