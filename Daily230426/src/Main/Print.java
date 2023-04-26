package Main;

import java.util.ArrayList;
import java.util.List;

public class Print {

	public void PrintTotalPrice(int price, int number, double discountRate) {
		int totalPrice = (int)((float)price*(float)number*discountRate);	
		System.out.printf("\n가격은 %d 원입니다.\n감사합니다\n\n", totalPrice);			//금액을 totalPrice 배열에 저장 			
		System.out.printf("계속하시겠습니까?:\n1.네\n2.종료\n");
	}
	
	
	public void PrintAll(MakeTotalList totalList) {
		List<Order> ol = totalList.getOrderList(); 
		
		System.out.printf("===================에버랜드==================\n\n");			
		int sum = 0;

		for (int i = 0 ; i < ol.size(); i++)
			{	
			String ttype = "";
			if (ol.get(i).getDayNight() == 1) ttype="주간권";
			else ttype ="야간권"; 
			
			String aage = "";
			if (ol.get(i).getAge()<=2) aage="영유아"; 
			else if (ol.get(i).getAge()<=12) aage="어린이"; 
			else if (ol.get(i).getAge()<=18) aage="청소년"; 
			else if (ol.get(i).getAge()<=64) aage="어른"; 
			else aage="노인"; 
		
			String ddiscount = "";
			if(ol.get(i).getDiscount() == 1) ddiscount="*우대적용없음";
			else if(ol.get(i).getDiscount() == 2) ddiscount="*장애인우대적용";
			else if(ol.get(i).getDiscount() == 3) ddiscount="*국가유공자우대적용";
			else if(ol.get(i).getDiscount() == 4) ddiscount="*다자녀우대적용";
			else if(ol.get(i).getDiscount() == 5) ddiscount="*임산부우대적용";	
			
			System.out.printf("%5s %5s x %3d %10d원 %10s\n", ttype, aage, ol.get(i).getNumber(), ol.get(i).getPrice(), ddiscount); 
	    	
			sum += ol.get(i).getPrice();		//배열의 요소 합산 =총액 	
			}				
		System.out.printf("\n입장료 총액은 %d원입니다.\n\n=============================================", sum);			
		System.out.printf("\n\n계속 진행(1:새로운 주문, 2:프로그램 종료):");
		
	}
}
