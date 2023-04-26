package Main;

import java.util.Scanner;

public class Input {
	Scanner scanner = new Scanner(System.in);
	public int selectType() {
		int dayNight;
		System.out.printf("권종을 입력하시오:\n1. 주간권\n2. 야간권\n");
		
		while(true)
		 {	
			dayNight = scanner.nextInt();	 	
		 	if(dayNight == 1 || dayNight == 2) break;
		 	else System.out.printf("다시 선택하시오\n");
		 }
		return dayNight;
	}
	
	public int[] inputSocialNumber() {
		int[] birthData = new int[3];
		//{year, month, day}
		int flag, birthYear, birthMonth, birthDay;
		long socialNumber;
		System.out.printf("\n주민번호를 입력하시오:\n");
		while(true)
		 {
			socialNumber = scanner.nextLong();	 				 		
	 		//주민번호 분해하기 
			birthYear = (int)(socialNumber / 100000000000L);	//생년 
			birthMonth = (int)(socialNumber / 1000000000 % 100); //월 
			birthDay = (int)(socialNumber / 10000000 % 100);	//일 
			flag = (int)(socialNumber / 1000000 % 10);			//주민번호뒷자리첫번째 
						
	 		if(
			  (999999999999L < socialNumber && socialNumber < 10000000000000L)
			  &&
			  (1 <= birthMonth && birthMonth <= 12)
			  &&
			  (1 <= birthDay && birthDay <= 31)
			  &&
		 	  (flag == 1 || flag == 2 || flag == 3 || flag == 4)
		 	 )
			break;			
			 	
	 		else System.out.printf("다시 선택하시오\n");
		 }
		birthData[0] = birthYear;
		birthData[1] = birthMonth;
		birthData[2] = birthDay;
		return birthData;
	}
	
	public int inputNumber() {
		int number = 0;
		System.out.printf("\n몇개를 주문하시겠습니까?(최대10개):\n");
		while(true)
		 {
			number = scanner.nextInt();	 	
		 	if(0 < number && number < 11) break;
		 	else System.out.printf("다시 선택하시오\n");
		 }
		return number;
	}
	
	public int selectDiscount() {
		int discount = 0;
		System.out.printf("\n우대사항을 선택하시오:\n1.없음(나이우대는 자동처리)\n2.장애인\n3.국가유공자\n4.다자녀\n5.임산부\n");
		while(true)
		 {
			discount = scanner.nextInt();	 	
		 	if(0 < discount && discount < 6) break;
		 	else System.out.printf("다시 선택하시오\n");
		 }			
		return discount;
	}	
}