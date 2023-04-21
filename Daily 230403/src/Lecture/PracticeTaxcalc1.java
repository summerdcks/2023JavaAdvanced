package Lecture;

public class PracticeTaxcalc1 {	//클래스 선언

	public static int k36_taxcal(int k36_val, int k36_rate) {		//정수형 변수를 받아 정수형 변수를 반환하는 static함수 taxcal 선언
		int k36_ret;	//정수형 변수 선언
		
		if(((double)k36_val * (double)k36_rate / 100.0) == k36_val * k36_rate / 100) {	
			//실수형 연산결과와 정수형 연산결과가 같으면 소수점 이하의 값이 0이므로 해당값을 그대로 반환한다
			k36_ret = k36_val * k36_rate / 100;
			} else {
			k36_ret = k36_val * k36_rate / 100 + 1;
			//실수형 연산결과와 정수형 연산결과가 다르다면 소수점 이하에 값이 있으므로 올림처리를 위해 1을 더해준다
			}
		
		return k36_ret;		//반환값
	}
	
	public static void main(String[] args) {	//메인함수 선언
		int k36_val = 271;	//세전 물건값
		int k36_rate = 3;	//세금 3퍼센트
		
		int k36_tax = k36_taxcal(k36_val, k36_rate);	//k36_taxcal함수는 static이므로 객체 생성을 생략하고 호출할 수 있다
		
		System.out.printf("*************************************************\n");
		System.out.printf(" *            단순 세금 계산                    *\n");
		System.out.printf("실제 세금계산 : %f\n", k36_val * k36_rate / 100.0);	//하나라도 실수라면 실수형 연산이 적용되어 실수값이 나온다
		
		System.out.printf("세전가격 : %d 세금 : %d 세포함가격 : %d\n", k36_val, k36_tax, k36_val+k36_tax);	
		System.out.printf("*************************************************\n");
	}
}
