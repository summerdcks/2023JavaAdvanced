package Lecture;

public class PracticeTaxcalc3 {	//클래스 선언

	public static void main(String[] args) {	//메인함수 선언
		String [] k36_item = {"맛동산","웨하스","오예스","치토스","사브레"};	//과자 이름, String형 배열을 선언하며 5개의 변수값을 부여
		int[] k36_price = {1000,2000,3000,2500,1450};	//가격, integer형 배열을 선언하며 5개의 변수값을 부여
		int[] k36_amount = {10,2,1,3,5};	//갯수, integer형 배열을 선언하며 5개의 변수값을 부여
		double k36_tax_rate = 0.1;	//부가가치세율 10%, double형 변수를 선언하며 초기화
		int k36_total_sum = 0;	//총지불금액, integer형 변수를 선언하며 0으로 초기화
		
		System.out.printf("********************************************\n");
		System.out.printf("              너가 지른 과자들              \n");
		System.out.printf(" 항 목           단 가   수 량        합 계\n");
		for (int k36_i = 0; k36_i < k36_item.length; k36_i++) {
			int k36_sum = k36_price[k36_i] * k36_amount[k36_i];
			//integer형 변수 선언, 각각 가격배열과 갯수배열의 i번째 변수를 곱한 값
			k36_total_sum = k36_total_sum + k36_sum;	//0번째부터 4번째까지 각 item의 총액을 더하여 나감 
			System.out.printf(" %-9s %7d %7d %13d\n", k36_item[k36_i], k36_price[k36_i], k36_amount[k36_i],k36_sum);
		}
		System.out.printf("********************************************\n");
		System.out.printf(" 지불 금액 :           %20d\n", k36_total_sum);
		
		int k36_total_net_price = (int)(k36_total_sum / (1 + k36_tax_rate));	//과세대상금액은 총지불금액에서 (1+세율)을 나눈 값
		System.out.printf(" 과세금액 :            %20d\n", k36_total_net_price);
		int k36_tax = k36_total_sum - k36_total_net_price;	//세금은 총지불금액에서 과세대상금액을 제한 값
		System.out.printf(" 세    금 :            %20d\n", k36_tax);
 	}
}
