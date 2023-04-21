package Lecture;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class PracticeCurrency {	//클래스 선언

	public static void main(String[] args) {	//메인함수 선언
		int k36_MyWon = 1000000;		//원화금액 100만원 정수형 변수 선언
		double k36_MoneyEx = 1238.21;	//달러환율 1238.21원 실수형 변수 선언
		double k36_commission = 0.003;	//환전 수수료 0.3% 실수형 변수 선언
		
		//단순 환전 계산
		int k36_usd = (int) (k36_MyWon / k36_MoneyEx);	//정수형 연산으로 버림처리됨
		int k36_remain = (int) (k36_MyWon - k36_usd * k36_MoneyEx);	//잔돈도 정수형 연산으로 버림처리됨
		
		System.out.printf("***********************************************************\n");
		System.out.printf("*                     수수료 없이 계산                    *\n");
		System.out.printf("총 한화환전금액 : %d원 => 미화 : %d달러, 잔돈 : %d원\n", k36_MyWon, k36_usd, k36_remain);
		System.out.printf("***********************************************************\n");
		
		//수수료 포함 환전 계산(1)
		double k36_ComPerOne = k36_MoneyEx * k36_commission;	//1달러당 환전수수료		
		double k36_totalcom = k36_usd * k36_ComPerOne;	//총수수료. 실수형 계산으로 금액차이는 없으나 소수점아래는 화폐로 반환 불가능
		
		System.out.printf("***********************************************************\n");
		System.out.printf("*                     수수료      계산                    *\n");
		System.out.printf("총 수수료 : %f원 => 미화 : %d달러, 달러당 수수료 : %f원\n", k36_totalcom, k36_usd, k36_ComPerOne);
		System.out.printf("***********************************************************\n");
		
		//수수료 포함 환전 계산(2)
		int k36_i_totalcom;//총수수료 올림처리
		
		if (k36_totalcom != (double)((int)k36_totalcom)) {	
			//실수연산값과 정수연산값이 다르면 소수점이하에 값이 있다는 뜻이므로 1을 더하여 올림함
			k36_i_totalcom = (int)k36_totalcom + 1;
		} else {
			k36_i_totalcom = (int)k36_totalcom;
			//실수연산값과 정수연산값이 같으면 소수점이하가 0이라는 뜻이므로 해당값을 그대로 출력
		}
		System.out.printf("***********************************************************\n");
		System.out.printf("*                     수수료 적용 환전                    *\n");
		System.out.printf("총 수수료 : %d원 => 미화 : %d달러, 달러당 수수료 : %f원\n", k36_i_totalcom, k36_usd, k36_ComPerOne);
		
		k36_remain = (int) (k36_MyWon - k36_usd * k36_MoneyEx - k36_i_totalcom);	//원화금액에서 달러로 받은 금액과 총수수료를 감한 나머지가 0이하로 나온다
		System.out.printf("총 한화환전금액 : %d원 => 미화 : %d달러, 수수료징수 : %d원, 잔돈 : %d원\n", k36_MyWon, k36_usd, k36_i_totalcom, k36_remain);
		System.out.printf("***********************************************************\n");
	
		//수수료 포함 환전 계산(3)
		k36_usd = (int) (k36_MyWon / (k36_MoneyEx + k36_ComPerOne));	//환전달러. 실수형 계산으로 먼저 전체금액에서 (1달러 + 1달러환전수수료)로 나눈 금액을 지불한다
		k36_totalcom = k36_usd * k36_ComPerOne;	//총수수료
		//총수수료 올림처리
		if (k36_totalcom != (double)((int)k36_totalcom)) {	
			k36_i_totalcom = (int)k36_totalcom + 1;
		} else {
			k36_i_totalcom = (int)k36_totalcom;
		}
		System.out.printf("***********************************************************\n");
		System.out.printf("*                 (정확한)수수료 적용 환전                *\n");
		System.out.printf("총 수수료 : %d원 => 미화 : %d달러, 달러당 수수료 : %f원\n", k36_i_totalcom, k36_usd, k36_ComPerOne);
		
		k36_remain = (int) (k36_MyWon - k36_usd * k36_MoneyEx - k36_i_totalcom);	//원화금액에서 달러로 받은 금액과 총수수료를 감한 나머지
		System.out.printf("총 한화환전금액 : %d원 => 미화 : %d달러, 수수료징수 : %d원, 잔돈 : %d원\n", k36_MyWon, k36_usd, k36_i_totalcom, k36_remain);
		System.out.printf("***********************************************************\n");
	
		//콤마찍기
		DecimalFormat k36_df = new DecimalFormat("###,###,###,###,###");
		
		System.out.printf("***********************************************************\n");
		System.out.printf("*                    콤마찍기, 날짜적용                   *\n");
		System.out.printf("총수수료 : %s원 => 미화 : %s달러, 달러당 수수료 : %f원\n",
		k36_df.format(k36_i_totalcom),
		k36_df.format(k36_usd),
		k36_ComPerOne);
		
		k36_remain = (int) (k36_MyWon - k36_usd * k36_MoneyEx - k36_i_totalcom);	//원화금액에서 달러로 받은 금액과 총수수료를 감한 나머지
		System.out.printf("총 한화환전금액 : %s원 => 미화 : %s달러, 수수료징수 : %s원, 잔돈 : %s원\n",
				k36_df.format(k36_MyWon), k36_df.format(k36_usd), k36_df.format(k36_i_totalcom), k36_df.format(k36_remain));
		
		//현재 날짜, 시간 찍기
		Calendar k36_calt = Calendar.getInstance();
		SimpleDateFormat k36_sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
		System.out.printf("최종실행시간 : %s\n", k36_sdt.format(k36_calt.getTime()));
		System.out.printf("***********************************************************\n");
				
	}

}
