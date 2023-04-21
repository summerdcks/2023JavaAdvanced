package PPT6;

public class Elevater3 extends Elevater2 {

	void Repair_k36() {
		help_k36 = String.format("수리중입니다");
	}
	
	void up_k36() {		//엘리베이터가 올라감
		if (floor_k36 >= limit_up_floor_k36) {
			help_k36 = "마지막층입니다";
		} else {
			floor_k36 = floor_k36 + 2;	//최상층이 아닐 때 두 층씩 올라감
			help_k36 = String.format("%d층입니다", floor_k36);
		}
		
		this.down_k36();	//만일 이렇게 하면 두칸 올라가고 한칸 올라감
	}
	
	void down_k36() {	//엘리베이터가 내려감
		super.down_k36();
		System.out.printf("클래스 안에서 찍고있는 MSG [%s]\n", this.help_k36);
		//this.down(): 재귀호출시 뺑뺑이 돈다
	}
}
