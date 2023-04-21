package PPT4;

import java.text.DecimalFormat;

public class Practice13 {	//클래스 선언

	public static void main(String[] args) {	//메인함수 선언
		String k36_item = "사과";	//품목, 문자열 변수 선언
		int k36_unit_price = 5000;	//단가, 정수형 변수 선언
		int k36_num = 500;	//수량, 정수형 변수 선언
		int k36_total = 0;	//합계, 정수형 변수 선언
		
		DecimalFormat k36_df = new DecimalFormat( "###,###,###,###,###" );
		//자릿수에 맞줘 ,를 출력해주는 함수 df
		
		System.out.printf("======================================================\n");
		System.out.printf("%20.20s%8.8s%8.8s%8.8s\n", "품목", "단가", "수량", "합계");
		//%20.20s 문자열로 받아서 출력, 자리로 20칸을 배정하고 20자리까지 출력한다
		//%8.8s 문자열로 받아서 출력, 자리로 8칸을 배정하고 8자리까지 출력한다
		//각 %s에는 차례대로 품목, 단가, 수량, 합계가 출력된다
		System.out.printf("======================================================\n");
		
		System.out.printf("%20.20s%10.10s%10.10s%10.10s\n",
				k36_item, k36_df.format(k36_unit_price), k36_df.format(k36_num), k36_df.format(k36_unit_price * k36_num));
		//df함수를 이용해 각 변수의 자릿수에 맞춰 ,를 출력해준다 합계는 가격*수량으로 계산한다
		System.out.printf("======================================================\n");
	}
}
