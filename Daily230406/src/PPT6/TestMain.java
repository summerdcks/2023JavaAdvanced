package PPT6;

public class TestMain {
	
	public static int inVal_k36;
	public static void up_k36() {
		inVal_k36++;
		System.out.printf("�� �׳� �޼ҵ�[%d]\n", inVal_k36);
	}


	public static void main(String[] args) {
	
		inVal_k36 = 0;		//�ڱ⳻�� ���� ���
		Elevater elev_k36;	//Ŭ������ �޾� ��ü�� ����
			
		elev_k36 = new Elevater();	//�ν��Ͻ��� �����Ͽ� ��ü�� ����
	
		up_k36();	//���� �ҽ� �� �޼ҵ�
		for(int i_k36 = 0; i_k36 < 10; i_k36++) {
			elev_k36.up_k36();	//���������� Ŭ������ �� elev��ü(�ν��Ͻ��� ������ ����)
								//up�޼ҵ�				
			System.out.printf("MSG[%s]\n", elev_k36.help_k36);
		}
			
		for(int i_k36 = 0; i_k36 < 10; i_k36++) {
			elev_k36.down_k36();
				
			System.out.printf("MSG[%s]\n", elev_k36.help_k36);
		}
	}
}
