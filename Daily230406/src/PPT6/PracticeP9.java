package PPT6;

public class PracticeP9 {	//Ŭ���� ����

	public static void main(String[] args) {	//�����Լ� ����
		TvRemocon tv_k36;	//Ŭ������ �޾� ��ü�� ����
		tv_k36 = new TvRemocon();	//�ν��Ͻ��� �����Ͽ� ��ü�� ����
		
		for(int i_k36 = 0; i_k36 < 5; i_k36++) {	//������ 5 �ø���
			tv_k36.VolUp_k36();		//TvRemoconŬ������ �ִ� VolUp�޼ҵ带 �����Ѵ�
			System.out.printf("[%s]\n", tv_k36.help_k36);
			//�޼ҵ带 �������� �� �Ҵ�� ������ ����Ѵ�
		}
		for(int i_k36 = 0; i_k36 < 5; i_k36++) {	//������ 5 ������
			tv_k36.VolDn_k36();		//TvRemoconŬ������ �ִ� VolDn�޼ҵ带 �����Ѵ�
			System.out.printf("[%s]\n", tv_k36.help_k36);
			//�޼ҵ带 �������� �� �Ҵ�� ������ ����Ѵ�
		}
		
		for(int i_k36 = 0; i_k36 < 10; i_k36++) {	//ä���� 10 �ø���
			tv_k36.ChannelUp_k36();		//TvRemoconŬ������ �ִ� ChannelUp�޼ҵ带 �����Ѵ�
			System.out.printf("[%s]\n", tv_k36.help_k36);
			//�޼ҵ带 �������� �� �Ҵ�� ������ ����Ѵ�
		}
		for(int i_k36 = 0; i_k36 < 10; i_k36++) {	//ä���� 10 ������
			tv_k36.ChannelDn_k36();		//TvRemoconŬ������ �ִ� ChannelDn�޼ҵ带 �����Ѵ�
			System.out.printf("[%s]\n", tv_k36.help_k36);
			//�޼ҵ带 �������� �� �Ҵ�� ������ ����Ѵ�
		}
	}
}
