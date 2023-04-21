package PPT6;

public class PracticeP9 {	//클래스 선언

	public static void main(String[] args) {	//메인함수 선언
		TvRemocon tv_k36;	//클래스를 받아 객체를 만듬
		tv_k36 = new TvRemocon();	//인스턴스를 생성하여 객체에 연결
		
		for(int i_k36 = 0; i_k36 < 5; i_k36++) {	//볼륨을 5 올린다
			tv_k36.VolUp_k36();		//TvRemocon클래스에 있는 VolUp메소드를 실행한다
			System.out.printf("[%s]\n", tv_k36.help_k36);
			//메소드를 실행했을 때 할당된 문구를 출력한다
		}
		for(int i_k36 = 0; i_k36 < 5; i_k36++) {	//볼륨을 5 내린다
			tv_k36.VolDn_k36();		//TvRemocon클래스에 있는 VolDn메소드를 실행한다
			System.out.printf("[%s]\n", tv_k36.help_k36);
			//메소드를 실행했을 때 할당된 문구를 출력한다
		}
		
		for(int i_k36 = 0; i_k36 < 10; i_k36++) {	//채널을 10 올린다
			tv_k36.ChannelUp_k36();		//TvRemocon클래스에 있는 ChannelUp메소드를 실행한다
			System.out.printf("[%s]\n", tv_k36.help_k36);
			//메소드를 실행했을 때 할당된 문구를 출력한다
		}
		for(int i_k36 = 0; i_k36 < 10; i_k36++) {	//채널을 10 내린다
			tv_k36.ChannelDn_k36();		//TvRemocon클래스에 있는 ChannelDn메소드를 실행한다
			System.out.printf("[%s]\n", tv_k36.help_k36);
			//메소드를 실행했을 때 할당된 문구를 출력한다
		}
	}
}
