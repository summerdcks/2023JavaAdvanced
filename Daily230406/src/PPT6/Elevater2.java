package PPT6;

public class Elevater2 {
	public int limit_up_floor_k36;		//최상위층
	public int limit_down_floor_k36;	//최하위층
	public int floor_k36;				//현재층
	public String help_k36;
	
	Elevater2() {
		limit_up_floor_k36 = 10;
		limit_down_floor_k36 = 1;
		floor_k36 = 1;
		help_k36 = "엘리베이터 기본 준공완료";
	}
	
	//최대층, 최소층, 현재층을 주어서 클래스를 생성할 수 있도록 함
	Elevater2(int up_floor_k36, int d_floor_k36, int in_floor_k36) {
		limit_up_floor_k36 = up_floor_k36;
		limit_down_floor_k36 = d_floor_k36;
		floor_k36 = in_floor_k36;
		help_k36 = "엘리베이터 맞춤 준공완료";
	}
	
	void up_k36() {
		if(floor_k36 == limit_up_floor_k36) {
			help_k36 = "마지막 층입니다";
		} else {
			floor_k36++;
			help_k36 = String.format("[%d] 층입니다", floor_k36);
		}
	}
	
	void down_k36() {
		if(floor_k36 == limit_down_floor_k36) {
			help_k36 = "처음 층입니다";
		} else {
			floor_k36--;
			help_k36 = String.format("[%d] 층입니다", floor_k36);
		}
	}
	
	void up_k36(int u_k36) {
		for(int i_k36 = 0; i_k36 < u_k36; i_k36++) this.up_k36();
	}
	
	void down_k36(int u_k36) {
		for(int i_k36 = 0; i_k36 < u_k36; i_k36++) down_k36();
	}
	
	void msg_k36(String id_k36) {
		System.out.printf("%s => [%s] 최대층[%d] 최소층[%d] 현재층[%d]\n",
				id_k36,help_k36,limit_up_floor_k36,limit_down_floor_k36,floor_k36);
	}
}
