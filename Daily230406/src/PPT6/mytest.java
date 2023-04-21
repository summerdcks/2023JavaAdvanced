package PPT6;

public class mytest {
	
	static Elevater2 elev1_k36;
	static Elevater2 elev2_k36;
	static Elevater2 elev3_k36;
	
	public static void main(String[] args) {

		elev1_k36 = new Elevater2();
		elev2_k36 = new Elevater2(20,1,8);
		elev3_k36 = new Elevater2(50,-3,5);
		
		for (int i_k36 = 0; i_k36 < 20; i_k36++) {
			elev1_k36.up_k36(); elev1_k36.msg_k36("1¹ø¿¤·¹ ÇÑÃþ ¿À¸£±â");
		//	elev2_k36.up_k36(); elev2_k36.msg_k36("2¹ø¿¤·¹ ÇÑÃþ ¿À¸£±â");
		//	elev3_k36.up_k36(); elev3_k36.msg_k36("3¹ø¿¤·¹ ÇÑÃþ ¿À¸£±â");		
		}
		
		for (int i_k36 = 0; i_k36 < 20; i_k36++) {
		//	elev1_k36.up_k36(2); elev1_k36.msg_k36("1¹ø¿¤·¹ 2Ãþ¾¿ ¿À¸£±â");
		//	elev2_k36.up_k36(2); elev2_k36.msg_k36("2¹ø¿¤·¹ 2Ãþ¾¿ ¿À¸£±â");
		//	elev3_k36.up_k36(2); elev3_k36.msg_k36("3¹ø¿¤·¹ 2Ãþ¾¿ ¿À¸£±â");		
		}
		
		for (int i_k36 = 0; i_k36 < 20; i_k36++) {
		//	elev1_k36.down_k36(3); elev1_k36.msg_k36("1¹ø¿¤·¹ 3Ãþ¾¿ ³»¸®±â");
		//	elev2_k36.down_k36(3); elev2_k36.msg_k36("2¹ø¿¤·¹ 3Ãþ¾¿ ³»¸®±â");
		//	elev3_k36.down_k36(3); elev3_k36.msg_k36("3¹ø¿¤·¹ 3Ãþ¾¿ ³»¸®±â");		
		}

	}

}
