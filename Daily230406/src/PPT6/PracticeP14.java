package PPT6;

public class PracticeP14 {		//Ŭ���� ����
	static TvRemocon tvRemote1_k36;		//TvRemoconŬ������ �޾� ��ü tvRemote1�� �����Ѵ�
	static TvRemocon tvRemote2_k36;		//TvRemoconŬ������ �޾� ��ü tvRemote1�� �����Ѵ�

	public static void main(String[] args) {	//�����Լ� ����
		tvRemote1_k36 = new TvRemocon();	//�Ű������� ���� tvRemote1��ü�� �����Ѵ�
		tvRemote2_k36 = new TvRemocon(15, 1, 7, 30, 1, 14);	//�Ű������� 6���� tvRemote2��ü�� �����Ѵ�

		for (int i_k36 = 0; i_k36 < 5; i_k36++) {	//������ 5 �ø���
			tvRemote1_k36.VolUp_k36(); tvRemote1_k36.msg_k36("���� �ø���");
			//tvRemote1��ü�� VolUp�Լ��� �ҷ��� �����Ѵ�
			//tvRemote1��ü�� msg�Լ��� ���ڿ��� �޾� �ش簴ü�� ���� ������ ������ش�
		//	tvRemote2_k36.VolUp_k36(); tvRemote2_k36.msg_k36("���� �ø���");
			//tvRemote2��ü�� VolUp�Լ��� �ҷ��� �����Ѵ�
			//tvRemote2��ü�� msg�Լ��� ���ڿ��� �޾� �ش簴ü�� ���� ������ ������ش�
			
		}		
		for (int i_k36 = 0; i_k36 < 5; i_k36++) {	//������ 5 ������
		//	tvRemote1_k36.VolDn_k36(); tvRemote1_k36.msg_k36("���� ������");
			//tvRemote1��ü�� VolDn�Լ��� �ҷ��� �����Ѵ�
			//tvRemote1��ü�� msg�Լ��� ���ڿ��� �޾� �ش簴ü�� ���� ������ ������ش�
		//	tvRemote2_k36.VolDn_k36(); tvRemote2_k36.msg_k36("���� ������");
			//tvRemote2��ü�� VolDn�Լ��� �ҷ��� �����Ѵ�
			//tvRemote2��ü�� msg�Լ��� ���ڿ��� �޾� �ش簴ü�� ���� ������ ������ش�
		}		
		for (int i_k36 = 0; i_k36 < 10; i_k36++) {	//ä���� 10 �ø���
		//	tvRemote1_k36.ChannelUp_k36(); tvRemote1_k36.msg_k36("ä�� �ø���");
			//tvRemote1��ü�� ChannelUp�Լ��� �ҷ��� �����Ѵ�
			//tvRemote1��ü�� msg�Լ��� ���ڿ��� �޾� �ش簴ü�� ���� ������ ������ش�
		//	tvRemote2_k36.ChannelUp_k36(); tvRemote2_k36.msg_k36("ä�� �ø���");
			//tvRemote2��ü�� ChannelUp�Լ��� �ҷ��� �����Ѵ�
			//tvRemote2��ü�� msg�Լ��� ���ڿ��� �޾� �ش簴ü�� ���� ������ ������ش�
		}		
		for (int i_k36 = 0; i_k36 < 10; i_k36++) {	//ä���� 10 ������
		//	tvRemote1_k36.ChannelDn_k36(); tvRemote1_k36.msg_k36("ä�� ������");
			//tvRemote1��ü�� ChannelDn�Լ��� �ҷ��� �����Ѵ�
			//tvRemote1��ü�� msg�Լ��� ���ڿ��� �޾� �ش簴ü�� ���� ������ ������ش�
		//	tvRemote2_k36.ChannelDn_k36(); tvRemote2_k36.msg_k36("ä�� ������");
			//tvRemote2��ü�� ChannelDn�Լ��� �ҷ��� �����Ѵ�
			//tvRemote2��ü�� msg�Լ��� ���ڿ��� �޾� �ش簴ü�� ���� ������ ������ش�
		}
	}
}
