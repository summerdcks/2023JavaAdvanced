package Lecture;

public class PracticeTaxcalc2 {	//클래스 선언

	public static int k36_netprice(int k36_price, double k36_rate) {	//정수형 소비자가격, 소수형 세율을 받아 정수형 세전가격을 반환하는 함수
		return (int)(k36_price / (1 + k36_rate));	//정수선언을 하면 세전가격은 버림이 된다
	}
	
	public static void main(String[] args) {	//메인함수 선언
		int k36_price = 1234;	//소비자가격 정수형변수 선언
		double k36_tax_rate = 0.1;	//세율 소수형변수 선언
		
		int k36_netprice = k36_netprice(k36_price, k36_tax_rate);	//k36_netprice함수는 static이므로 main에서 객체생성 없이 호출할 수 있음
		int k36_tax = k36_price - k36_netprice;	//세금 = 소비자가격 - 세전가격, 세전가격을 버림했으므로 세금은 올림이 된다
		
		System.out.printf("**************************************************\n");
		System.out.printf("*        소비자가, 세전가격, 세금 계산           *\n");
		System.out.printf("소비자가격 : %d, 세전가격 : %d, 세금 : %d\n", k36_price, k36_netprice, k36_tax);
		System.out.printf("**************************************************\n");

	}
}
