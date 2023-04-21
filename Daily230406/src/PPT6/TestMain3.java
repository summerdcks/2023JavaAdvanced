package PPT6;

public class TestMain3 {

	public static void main(String[] args) {
		Elevater3 elev3_k36;
		
		elev3_k36 = new Elevater3();
		for(int i_k36 = 0; i_k36 < 10; i_k36++) {
			elev3_k36.up_k36();
			System.out.printf("MSG elev3[%s]\n", elev3_k36.help_k36);
		}
		
		for(int i_k36 = 0; i_k36 < 10; i_k36++) {
			elev3_k36.down_k36();
			System.out.printf("MSG elev3[%s]\n", elev3_k36.help_k36);
		}

		elev3_k36.Repair_k36();
		System.out.printf("MSG elev3[%s]\n", elev3_k36.help_k36);
	}

}
