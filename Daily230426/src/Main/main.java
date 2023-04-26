package Main;

import java.util.Scanner;


public class main {	//클래스 선언

	public static int DAY_ADULT=56000, DAY_TEEN=47000, DAY_CHILD=44000, DAY_OLD=44000, DAY_BABY=0, NIGHT_ADULT=46000, NIGHT_TEEN=40000, NIGHT_CHILD=37000, NIGHT_OLD=37000, NIGHT_BABY=0;
	public static void main(String[] args) {	
		int end = 0;
		do{			
			Scanner scanner = new Scanner(System.in);
			MakeTotalList totalList = new MakeTotalList();
			
			int answer = 0;
			do{		
				Input input = new Input();									//*Input클래스*
				
				int dayNight = input.selectType();							//주간야간입력 -> int 주간권야간권
				int[] birthData = input.inputSocialNumber();				//주민번호입력 -> Int {생년,월,일}					
										
				int number = input.inputNumber();							//구매수량입력 -> Int 수량
				int discount = input.selectDiscount();						//우대사항입력 -> String 우대사항
				 																								
				Calculate calculate =  new Calculate();						//*Calculate클래스*
				
				int age = calculate.getAge(birthData);						//나이 구하기 -> int 나이
				int price = calculate.appliedPrice(dayNight, age);			//가격 구하기 -> int 가격
				double discountRate = calculate.appliedDiscount(discount);	//할인율 구하기 -> double 할인율
				
				MakeTotalList.orderList(dayNight, age, number, price, discountRate);	//주문내역을 객체배열에 담기
				
				Print print = new Print();									//*Print클래스*
				print.PrintTotalPrice(price, number, discountRate);			//해당주문 가격출력		
				answer = scanner.nextInt();		 		
				
			}while(answer==1);
			
			Print print = new Print();										//*Print클래스*
			print.PrintAll(totalList);										//총주문내역 출력
			end = scanner.nextInt();
			
		}while(end==1);				
	}
}



