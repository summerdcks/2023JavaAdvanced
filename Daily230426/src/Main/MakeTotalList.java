package Main;

import java.util.ArrayList;
import java.util.List;

public class MakeTotalList {
	 static List<Order> orderList = new ArrayList<>();

	public static void orderList(int dayNight, int age, int number, int price, double discountRate) {
		Order order = new Order();
		order.setDayNight(dayNight);
		order.setAge(age);
		order.setNumber(number);
		order.setPrice((int)((float)price*(float)number*discountRate));
		order.setDiscountRate(discountRate);	
		orderList.add(order);
	}

	public List<Order> getOrderList() {
		return orderList;
	}
}