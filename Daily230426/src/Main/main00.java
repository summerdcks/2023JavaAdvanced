package Main;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class main00 {	//클래스 선언

	public static int age, dayNight, number, price, discount;
	public static int flag, birthYear, birthMonth, birthDay;
	public static int answer, end;
	public static long socialNumber;
	public static double discountRate;
	public static final int DAY_ADULT=56000, DAY_TEEN=47000, DAY_CHILD=44000, DAY_OLD=44000, DAY_BABY=0, NIGHT_ADULT=46000, NIGHT_TEEN=40000, NIGHT_CHILD=37000, NIGHT_OLD=37000, NIGHT_BABY=0;

	public static void main(String[] args) {	
		
		do{
			
			int i = 0;
			String[] typeOfTicket = new String[20];
			String[] appliedDiscount = new String[20];
		 	String[] ageOfEntrant = new String[20];
			int[][] list = new int[10][2];		//count price
			Scanner scanner = new Scanner(System.in);
			
			do{		
				System.out.printf("권종을 입력하시오:\n1. 주간권\n2. 야간권\n");
				
				while(true)
				 {	
					dayNight = scanner.nextInt();	 	
				 	if(dayNight == 1 || dayNight == 2) break;
				 	else System.out.printf("다시 선택하시오\n");
				 }
						
				if (dayNight == 1) typeOfTicket[i]="주간권";
				else typeOfTicket[i]="야간권"; 
						
				System.out.printf("\n주민번호를 입력하시오:\n");
				while(true)
				 {
					socialNumber = scanner.nextLong();	 				 //주민번호 분해하기 
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
				 				
				System.out.printf("\n몇개를 주문하시겠습니까?(최대10개):\n");
				while(true)
				 {
					number = scanner.nextInt();	 	
				 	if(0 < number && number < 11) break;
				 	else System.out.printf("다시 선택하시오\n");
				 }
						
				list[i][0] = number; 
									
				System.out.printf("\n우대사항을 선택하시오:\n1.없음(나이우대는 자동처리)\n2.장애인\n3.국가유공자\n4.다자녀\n5.임산부\n");
				while(true)
				 {
					discount = scanner.nextInt();	 	
				 	if(0 < discount && discount < 6) break;
				 	else System.out.printf("다시 선택하시오\n");
				 }
				
				if(discount == 1) appliedDiscount[i]="*우대적용없음";
				else if(discount == 2) appliedDiscount[i]="*장애인우대적용";
				else if(discount == 3) appliedDiscount[i]="*국가유공자우대적용";
				else if(discount == 4) appliedDiscount[i]="*다자녀우대적용";
				else if(discount == 5) appliedDiscount[i]="*임산부우대적용";
			
				//현재년도 불러오기			
				Date date = new Date();
				SimpleDateFormat y = new SimpleDateFormat("yyyy"); 
				SimpleDateFormat m = new SimpleDateFormat("MM");
				SimpleDateFormat d = new SimpleDateFormat("dd");
				String year = y.format(date);	
				String month = m.format(date);
				String day = d.format(date);				
				
				//나이계산하기 
				age = (Integer.parseInt(year) - birthYear) % 100;	
				if((Integer.parseInt(month) - birthMonth <= 0) && (Integer.parseInt(day) - birthDay <= 0)) {
					age = age + 1;
				}
				
				if(dayNight==1)				//주간권 
				{
					if(age<=2) 
					price=DAY_BABY;
				
					else if(age<=12)
					price=DAY_CHILD;
					
					else if(age<=18)
					price=DAY_TEEN;
					
					else if(age<=64)
					price=DAY_ADULT;
					
					else
					price=DAY_OLD;				
				}
				
				else if(dayNight==2)		//야간권 
				{
					if(age<=2) 
					price=NIGHT_BABY;
				
					else if(age<=12)
					price=NIGHT_CHILD;
					
					else if(age<=18)
					price=NIGHT_TEEN;
				
					else if(age<=64)
					price=NIGHT_ADULT;
				
					else
					price=NIGHT_OLD;				
				}	
				
				if (price==DAY_BABY || price==NIGHT_BABY) ageOfEntrant[i]="영유아"; 
				else if (price==DAY_CHILD || price==NIGHT_CHILD) ageOfEntrant[i]="어린이"; 
				else if (price==DAY_TEEN || price==NIGHT_TEEN) ageOfEntrant[i]="청소년"; 
				else if (price==DAY_ADULT || price==NIGHT_ADULT) ageOfEntrant[i]="어른"; 
				else if (price==DAY_OLD || price==NIGHT_OLD) ageOfEntrant[i]="노인"; 
																				
				switch(discount)		//할인율
				{	
					case 1 :
						discountRate=1;
					break;
				
					case 2 :
						discountRate=0.6;
					break;
				
					case 3 :
						discountRate=0.5;
					break;
				
					case 4 :
						discountRate=0.8;
					break;
				
					case 5 :
						discountRate=0.85;
					break;				
				}
								
				System.out.printf("\n가격은 %d 원입니다.\n감사합니다\n\n", (int)((float)price*(float)number*discountRate));			
				list[i][1] = (int)((float)price*(float)number*discountRate);			//금액을 totalPrice 배열에 저장 			
				System.out.printf("계속하시겠습니까?:\n1.네\n2.종료\n");
				answer = scanner.nextInt();		 
				i++;		
				
			}while(answer==1);
				
			System.out.printf("===================에버랜드==================\n\n");			
			int sum =0;
			for (int j = 0 ; j < i ; j++)
				{	
				System.out.printf("%5s %5s x %3d %10d원 %10s\n", typeOfTicket[j], ageOfEntrant[j], list[j][0], list[j][1], appliedDiscount[j]); 
		    	
				sum += list[j][1];		//배열의 요소 합산 =총액 	
				}				
			System.out.printf("\n입장료 총액은 %d원입니다.\n\n=============================================", sum);			
			System.out.printf("\n\n계속 진행(1:새로운 주문, 2:프로그램 종료):");
			end = scanner.nextInt();
			
		}while(end==1);		
		
	}
}