package PPT6;

public class PracticeP17 {	//Ŭ���� ����

	public static void main(String[] args) {	//�����Լ� ����
		TvRemoconX tvRemote3_k36;	//TvRemoconXŬ������ �޾� ��ütvRemote3�� ����
		
		tvRemote3_k36 = new TvRemoconX();	//�ν��Ͻ��� �������ش�
		
		for(int i_k36 = 0; i_k36 < 5; i_k36++) {	//������ 5 �ø���
			tvRemote3_k36.VolUp_k36();	//tvRemote3��ü�� VolUp�Լ��� �����Ѵ�
			System.out.printf("MSG tvRemote3[%s]\n", tvRemote3_k36.help_k36);	
			//�ش��Լ��� �Ҵ�� ������ ������ش�
		}		
		for(int i_k36 = 0; i_k36 < 6; i_k36++) {	//������ 6 ������
			tvRemote3_k36.VolDn_k36();	//tvRemote3��ü�� VolDn�Լ��� �����Ѵ�
			System.out.printf("MSG tvRemote3[%s]\n", tvRemote3_k36.help_k36);
			//�ش��Լ��� �Ҵ�� ������ ������ش�
		}		
		for(int i_k36 = 0; i_k36 < 10; i_k36++) {	//ä���� 10 �ø���
			tvRemote3_k36.ChannelUp_k36();	//tvRemote3��ü�� ChannelUp�Լ��� �����Ѵ�
			System.out.printf("MSG tvRemote3[%s]\n", tvRemote3_k36.help_k36);
			//�ش��Լ��� �Ҵ�� ������ ������ش�
		}		
		for(int i_k36 = 0; i_k36 < 11; i_k36++) {	//ä���� 11 �ø���
			tvRemote3_k36.ChannelDn_k36();	//tvRemote3��ü�� ChannelDn�Լ��� �����Ѵ�
			System.out.printf("MSG tvRemote3[%s]\n", tvRemote3_k36.help_k36);
			//�ش��Լ��� �Ҵ�� ������ ������ش�			
		}
		tvRemote3_k36.ckBattery_k36();	////tvRemote3��ü�� ckBattery�Լ��� �����Ѵ�
		System.out.printf("MSG tvRemote3[%s]\n", tvRemote3_k36.help_k36);
		//�ش��Լ��� �Ҵ�� ������ ������ش�
	}
}
