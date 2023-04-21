package PPT6;

public class TvRemoconX extends TvRemocon {
		//부모클래스인 TvRemocon를 상속하는 자식클래스 TvRemoconX
		//새로운 함수를 override해준다
	void ckBattery_k36() {	//리턴값이 없는 void함수를 선언해준다
		help_k36 = String.format("배터리가 부족합니다");	//문자열형 변수help에 해당 문구를 할당해준다
	}

}
