package PPT6;

public class Elevater {
	int limit_up_floor_k36 = 10;	//최상위층
	int limit_down_floor_k36 = 0;	//최하위층
	int floor_k36 = 1;				//현재층
	String help_k36;
	
	void up_k36()		//엘리베이터가 올라감
	{
		if (floor_k36 == limit_up_floor_k36) {
			help_k36 = "마지막층입니다";
		} else {
			floor_k36++;	//최상층이 아닐 때 한 층씩 올라감
			help_k36 = String.format("%d층입니다",floor_k36);
		}
	}
	
	void down_k36()		//엘리베이터가 내려감
	{
		if (floor_k36 == limit_down_floor_k36) {
			help_k36 = "처음층입니다.";
		} else {
			floor_k36--;	//최하층이 아닐 때 한 층씩 올라감
			help_k36 = String.format("%d층입니다", floor_k36);
		}
	}
}