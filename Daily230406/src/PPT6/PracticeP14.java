package PPT6;

public class PracticeP14 {		//클래스 생성
	static TvRemocon tvRemote1_k36;		//TvRemocon클래스를 받아 객체 tvRemote1을 생성한다
	static TvRemocon tvRemote2_k36;		//TvRemocon클래스를 받아 객체 tvRemote1을 생성한다

	public static void main(String[] args) {	//메인함수 생성
		tvRemote1_k36 = new TvRemocon();	//매개변수가 없는 tvRemote1객체를 선언한다
		tvRemote2_k36 = new TvRemocon(15, 1, 7, 30, 1, 14);	//매개변수가 6개인 tvRemote2객체를 선언한다

		for (int i_k36 = 0; i_k36 < 5; i_k36++) {	//볼륨을 5 올린다
			tvRemote1_k36.VolUp_k36(); tvRemote1_k36.msg_k36("음량 올리기");
			//tvRemote1객체의 VolUp함수를 불러와 실행한다
			//tvRemote1객체의 msg함수는 문자열을 받아 해당객체에 대한 정보를 출력해준다
		//	tvRemote2_k36.VolUp_k36(); tvRemote2_k36.msg_k36("음량 올리기");
			//tvRemote2객체의 VolUp함수를 불러와 실행한다
			//tvRemote2객체의 msg함수는 문자열을 받아 해당객체에 대한 정보를 출력해준다
			
		}		
		for (int i_k36 = 0; i_k36 < 5; i_k36++) {	//볼륨을 5 내린다
		//	tvRemote1_k36.VolDn_k36(); tvRemote1_k36.msg_k36("음량 내리기");
			//tvRemote1객체의 VolDn함수를 불러와 실행한다
			//tvRemote1객체의 msg함수는 문자열을 받아 해당객체에 대한 정보를 출력해준다
		//	tvRemote2_k36.VolDn_k36(); tvRemote2_k36.msg_k36("음량 내리기");
			//tvRemote2객체의 VolDn함수를 불러와 실행한다
			//tvRemote2객체의 msg함수는 문자열을 받아 해당객체에 대한 정보를 출력해준다
		}		
		for (int i_k36 = 0; i_k36 < 10; i_k36++) {	//채널을 10 올린다
		//	tvRemote1_k36.ChannelUp_k36(); tvRemote1_k36.msg_k36("채널 올리기");
			//tvRemote1객체의 ChannelUp함수를 불러와 실행한다
			//tvRemote1객체의 msg함수는 문자열을 받아 해당객체에 대한 정보를 출력해준다
		//	tvRemote2_k36.ChannelUp_k36(); tvRemote2_k36.msg_k36("채널 올리기");
			//tvRemote2객체의 ChannelUp함수를 불러와 실행한다
			//tvRemote2객체의 msg함수는 문자열을 받아 해당객체에 대한 정보를 출력해준다
		}		
		for (int i_k36 = 0; i_k36 < 10; i_k36++) {	//채널을 10 내린다
		//	tvRemote1_k36.ChannelDn_k36(); tvRemote1_k36.msg_k36("채널 내리기");
			//tvRemote1객체의 ChannelDn함수를 불러와 실행한다
			//tvRemote1객체의 msg함수는 문자열을 받아 해당객체에 대한 정보를 출력해준다
		//	tvRemote2_k36.ChannelDn_k36(); tvRemote2_k36.msg_k36("채널 내리기");
			//tvRemote2객체의 ChannelDn함수를 불러와 실행한다
			//tvRemote2객체의 msg함수는 문자열을 받아 해당객체에 대한 정보를 출력해준다
		}
	}
}
