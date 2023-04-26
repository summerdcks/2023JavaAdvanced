package Main;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Calculate {
	public int getAge(int[] birthData) {
		int age = 0;
		//현재날짜 불러오기			
		Date date = new Date();
		SimpleDateFormat y = new SimpleDateFormat("yyyy"); 
		SimpleDateFormat m = new SimpleDateFormat("MM");
		SimpleDateFormat d = new SimpleDateFormat("dd");
		String year = y.format(date);	
		String month = m.format(date);
		String day = d.format(date);				
		
		//나이계산하기 
		age = (Integer.parseInt(year) - birthData[0]) % 100;	
		if((Integer.parseInt(month) - birthData[1] <= 0) && (Integer.parseInt(day) - birthData[2] <= 0)) {
			age = age + 1;
		}
		
		return age;
	}
	
	public int appliedPrice(int dayNight, int age) {
		int price = 0;
		int DAY_ADULT=56000, DAY_TEEN=47000, DAY_CHILD=44000, DAY_OLD=44000, DAY_BABY=0, NIGHT_ADULT=46000, NIGHT_TEEN=40000, NIGHT_CHILD=37000, NIGHT_OLD=37000, NIGHT_BABY=0;

		if(dayNight == 1)				//주간권 
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
		
		else if(dayNight == 2)		//야간권 
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
		return price;
	}

	public double appliedDiscount(int discount) {
		double discountRate = 1;
		switch(discount) {
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
		return discountRate;
	}
}