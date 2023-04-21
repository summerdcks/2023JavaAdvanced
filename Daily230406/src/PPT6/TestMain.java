package PPT6;

public class TestMain {
	
	public static int inVal_k36;
	public static void up_k36() {
		inVal_k36++;
		System.out.printf("난 그냥 메소드[%d]\n", inVal_k36);
	}


	public static void main(String[] args) {
	
		inVal_k36 = 0;		//자기내부 변수 사용
		Elevater elev_k36;	//클래스를 받아 객체를 만듦
			
		elev_k36 = new Elevater();	//인스턴스를 생성하여 객체에 연결
	
		up_k36();	//현재 소스 내 메소드
		for(int i_k36 = 0; i_k36 < 10; i_k36++) {
			elev_k36.up_k36();	//엘리베이터 클래스를 찍어낸 elev객체(인스턴스를 가지고 있음)
								//up메소드				
			System.out.printf("MSG[%s]\n", elev_k36.help_k36);
		}
			
		for(int i_k36 = 0; i_k36 < 10; i_k36++) {
			elev_k36.down_k36();
				
			System.out.printf("MSG[%s]\n", elev_k36.help_k36);
		}
	}
}
