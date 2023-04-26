package Main;

public class Order {
	int dayNight;		//주간야간권
	int age;			//어른아이
	int number;			//수량
	int price;			//가격
	int discount;		//우대사항
	double discountRate;		//할인율
	
	public int getDayNight() {
		return dayNight;
	}
	public void setDayNight(int dayNight) {
		this.dayNight = dayNight;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	
}