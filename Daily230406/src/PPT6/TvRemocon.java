package PPT6;

public class TvRemocon {	//클래스 선언
	public int limit_up_vol_k36;	//볼륨의 최저치를 정수형 변수로 선언한다
	public int limit_down_vol_k36;	//볼륨의 최대치를 정수형 변수로 선언한다
	public int volnow_k36;			//현재볼륨을 정수형 변수로 선언한다
	public int limit_up_cha_k36;	//채널의 최저번호를 정수형 변수로 선언한다
	public int limit_down_cha_k36;	//채널의 최대번호를 정수형 변수로 선언한다
	public int chanow_k36;			//현재채널의 번호를 정수형 변수로 선언한다
	public String help_k36;			//출력할 대상을 받을 문자열형 변수를 미리 선언한다
	
	TvRemocon() {					//클래스가 호출되면 (new)생성자가 실행된다.
		limit_up_vol_k36 = 5;		//생성자는 클래스명과 동일한 public 메소드로 실행된다
		limit_down_vol_k36 = 0;		//각 변수에 값을 할당해준다
		volnow_k36 = 1;
		limit_up_cha_k36 = 10;
		limit_down_cha_k36 = 0;
		chanow_k36 = 1;
		help_k36 = "";
	}
	
	TvRemocon(int up_vol_k36, int dn_vol_k36, int in_vol_k36, int up_cha_k36, int dn_cha_k36, int in_cha_k36) {
		//메소드명이 같지만 매개변수의 종류와 갯수가 다르므로 오버로딩된다
		limit_up_vol_k36 = up_vol_k36;
		limit_down_vol_k36 = dn_vol_k36;
		volnow_k36 = in_vol_k36;
		limit_up_cha_k36 = up_cha_k36;
		limit_down_cha_k36 = dn_cha_k36;
		chanow_k36 = in_cha_k36;
		help_k36 = "";
	}
	
	void VolUp_k36() {	//리턴값이 없는 void함수를 선언한다
		if (volnow_k36 == limit_up_vol_k36) {
			help_k36 = "최대음량입니다";		//현재볼륨값이 최대볼륨값과 같으면 해당 문구를 출력해준다
		} else {
			volnow_k36++;		//같지 않으면 볼륨값을 1올려주고 현재볼륨에 대한 정보를 담은 해당 문구를 출력해준다
			help_k36 = String.format("음량 %d입니다",volnow_k36);
		}
	}
	
	void VolDn_k36() {	//리턴값이 없는 void함수를 선언한다
		if (volnow_k36 == limit_down_vol_k36) {
			help_k36 = "음소거 되었습니다";		//현재볼륨값이 최저볼륨값과 같으면 해당 문구를 출력해준다
		} else {
			volnow_k36--;		//같지 않으면 볼륨값을 1내려주고 현재볼륨에 대한 정보를 담은 해당 문구를 출력해준다
			help_k36 = String.format("음량 %d입니다", volnow_k36);
		}
	}
	
	void ChannelUp_k36() {	//리턴값이 없는 void함수를 선언한다
		if (chanow_k36 == limit_up_cha_k36) {
			help_k36 = "마지막 채널입니다";		//현재채널번호가 최대번호값과 같으면 해당 문구를 출력해준다
		} else {
			chanow_k36++;		//같지 않으면 채널번호를 1올려주고 현재채널번호에 대한 정보를 담은 해당 문구를 출력해준다
			help_k36 = String.format("%d번 채널입니다",chanow_k36);
		}
	}
	
	void ChannelDn_k36() {	//리턴값이 없는 void함수를 선언한다
		if (chanow_k36 == limit_down_cha_k36) {
			help_k36 = "첫번째 채널입니다";		//현재채널번호가 최저번호값과 같으면 해당 문구를 출력해준다
		} else {
			chanow_k36--;		//같지 않으면 채널번호를 1내려주고 현재채널번호에 대한 정보를 담은 해당 문구를 출력해준다
			help_k36 = String.format("%d번 채널입니다", chanow_k36);
		}
	}		
	
	void VolUp_k36(int u_k36) {		//정수형 변수를 받고 리턴값이 없는 void함수를 선언해준다
		for(int i_k36 = 0; i_k36 < u_k36; i_k36++) this.VolUp_k36();
		//0부터 해당값까지 반복하며 VolUp함수를 실행시킨다
		//this를 사용하면 같은 클래스 내에서 해당변수 또는 함수를 찾아 받아온다
	}
	
	void VolDn_k36(int u_k36) {		//정수형 변수를 받고 리턴값이 없는 void함수를 선언해준다
		for(int i_k36 = 0; i_k36 < u_k36; i_k36++) this.VolDn_k36();
		//0부터 해당값까지 반복하며 VolDn함수를 실행시킨다
		//this를 사용하면 같은 클래스 내에서 해당변수 또는 함수를 찾아 받아온다
	}
	
	void ChannelUp_k36(int u_k36) {		//정수형 변수를 받고 리턴값이 없는 void함수를 선언해준다
		for(int i_k36 = 0; i_k36 < u_k36; i_k36++) this.ChannelUp_k36();
		//0부터 해당값까지 반복하며 ChannelUp함수를 실행시킨다
		//this를 사용하면 같은 클래스 내에서 해당변수 또는 함수를 찾아 받아온다
	}
	
	void ChannelDn_k36(int u_k36) {		//정수형 변수를 받고 리턴값이 없는 void함수를 선언해준다
		for(int i_k36 = 0; i_k36 < u_k36; i_k36++) this.ChannelDn_k36();
		//0부터 해당값까지 반복하며 ChannelDn함수를 실행시킨다
		//this를 사용하면 같은 클래스 내에서 해당변수 또는 함수를 찾아 받아온다
	}
	
	void msg_k36(String id_k36) {		//정수형 변수를 받고 리턴값이 없는 void함수를 선언해준다
		System.out.printf("%s => [%s] 최대음량[%d] 최소음량[%d] 현재음량[%d] 최대채널[%d] 최소채널[%d] 현재채널[%d]\n",
				id_k36, help_k36, limit_up_vol_k36, limit_down_vol_k36, volnow_k36, limit_up_cha_k36, limit_down_cha_k36, chanow_k36);
		//해당 변수들의 값과 문구를 받아 차례대로 출력해준다
	}
	
}
