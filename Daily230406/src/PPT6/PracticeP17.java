package PPT6;

public class PracticeP17 {	//클래스 선언

	public static void main(String[] args) {	//메인함수 선언
		TvRemoconX tvRemote3_k36;	//TvRemoconX클래스를 받아 객체tvRemote3를 생성
		
		tvRemote3_k36 = new TvRemoconX();	//인스턴스를 연결해준다
		
		for(int i_k36 = 0; i_k36 < 5; i_k36++) {	//볼륨을 5 올린다
			tvRemote3_k36.VolUp_k36();	//tvRemote3객체의 VolUp함수를 실행한다
			System.out.printf("MSG tvRemote3[%s]\n", tvRemote3_k36.help_k36);	
			//해당함수에 할당된 문구를 출력해준다
		}		
		for(int i_k36 = 0; i_k36 < 6; i_k36++) {	//볼륨을 6 내린다
			tvRemote3_k36.VolDn_k36();	//tvRemote3객체의 VolDn함수를 실행한다
			System.out.printf("MSG tvRemote3[%s]\n", tvRemote3_k36.help_k36);
			//해당함수에 할당된 문구를 출력해준다
		}		
		for(int i_k36 = 0; i_k36 < 10; i_k36++) {	//채널을 10 올린다
			tvRemote3_k36.ChannelUp_k36();	//tvRemote3객체의 ChannelUp함수를 실행한다
			System.out.printf("MSG tvRemote3[%s]\n", tvRemote3_k36.help_k36);
			//해당함수에 할당된 문구를 출력해준다
		}		
		for(int i_k36 = 0; i_k36 < 11; i_k36++) {	//채널을 11 올린다
			tvRemote3_k36.ChannelDn_k36();	//tvRemote3객체의 ChannelDn함수를 실행한다
			System.out.printf("MSG tvRemote3[%s]\n", tvRemote3_k36.help_k36);
			//해당함수에 할당된 문구를 출력해준다			
		}
		tvRemote3_k36.ckBattery_k36();	////tvRemote3객체의 ckBattery함수를 실행한다
		System.out.printf("MSG tvRemote3[%s]\n", tvRemote3_k36.help_k36);
		//해당함수에 할당된 문구를 출력해준다
	}
}
