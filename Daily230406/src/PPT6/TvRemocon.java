package PPT6;

public class TvRemocon {	//Ŭ���� ����
	public int limit_up_vol_k36;	//������ ����ġ�� ������ ������ �����Ѵ�
	public int limit_down_vol_k36;	//������ �ִ�ġ�� ������ ������ �����Ѵ�
	public int volnow_k36;			//���纼���� ������ ������ �����Ѵ�
	public int limit_up_cha_k36;	//ä���� ������ȣ�� ������ ������ �����Ѵ�
	public int limit_down_cha_k36;	//ä���� �ִ��ȣ�� ������ ������ �����Ѵ�
	public int chanow_k36;			//����ä���� ��ȣ�� ������ ������ �����Ѵ�
	public String help_k36;			//����� ����� ���� ���ڿ��� ������ �̸� �����Ѵ�
	
	TvRemocon() {					//Ŭ������ ȣ��Ǹ� (new)�����ڰ� ����ȴ�.
		limit_up_vol_k36 = 5;		//�����ڴ� Ŭ������� ������ public �޼ҵ�� ����ȴ�
		limit_down_vol_k36 = 0;		//�� ������ ���� �Ҵ����ش�
		volnow_k36 = 1;
		limit_up_cha_k36 = 10;
		limit_down_cha_k36 = 0;
		chanow_k36 = 1;
		help_k36 = "";
	}
	
	TvRemocon(int up_vol_k36, int dn_vol_k36, int in_vol_k36, int up_cha_k36, int dn_cha_k36, int in_cha_k36) {
		//�޼ҵ���� ������ �Ű������� ������ ������ �ٸ��Ƿ� �����ε��ȴ�
		limit_up_vol_k36 = up_vol_k36;
		limit_down_vol_k36 = dn_vol_k36;
		volnow_k36 = in_vol_k36;
		limit_up_cha_k36 = up_cha_k36;
		limit_down_cha_k36 = dn_cha_k36;
		chanow_k36 = in_cha_k36;
		help_k36 = "";
	}
	
	void VolUp_k36() {	//���ϰ��� ���� void�Լ��� �����Ѵ�
		if (volnow_k36 == limit_up_vol_k36) {
			help_k36 = "�ִ������Դϴ�";		//���纼������ �ִ뺼������ ������ �ش� ������ ������ش�
		} else {
			volnow_k36++;		//���� ������ �������� 1�÷��ְ� ���纼���� ���� ������ ���� �ش� ������ ������ش�
			help_k36 = String.format("���� %d�Դϴ�",volnow_k36);
		}
	}
	
	void VolDn_k36() {	//���ϰ��� ���� void�Լ��� �����Ѵ�
		if (volnow_k36 == limit_down_vol_k36) {
			help_k36 = "���Ұ� �Ǿ����ϴ�";		//���纼������ ������������ ������ �ش� ������ ������ش�
		} else {
			volnow_k36--;		//���� ������ �������� 1�����ְ� ���纼���� ���� ������ ���� �ش� ������ ������ش�
			help_k36 = String.format("���� %d�Դϴ�", volnow_k36);
		}
	}
	
	void ChannelUp_k36() {	//���ϰ��� ���� void�Լ��� �����Ѵ�
		if (chanow_k36 == limit_up_cha_k36) {
			help_k36 = "������ ä���Դϴ�";		//����ä�ι�ȣ�� �ִ��ȣ���� ������ �ش� ������ ������ش�
		} else {
			chanow_k36++;		//���� ������ ä�ι�ȣ�� 1�÷��ְ� ����ä�ι�ȣ�� ���� ������ ���� �ش� ������ ������ش�
			help_k36 = String.format("%d�� ä���Դϴ�",chanow_k36);
		}
	}
	
	void ChannelDn_k36() {	//���ϰ��� ���� void�Լ��� �����Ѵ�
		if (chanow_k36 == limit_down_cha_k36) {
			help_k36 = "ù��° ä���Դϴ�";		//����ä�ι�ȣ�� ������ȣ���� ������ �ش� ������ ������ش�
		} else {
			chanow_k36--;		//���� ������ ä�ι�ȣ�� 1�����ְ� ����ä�ι�ȣ�� ���� ������ ���� �ش� ������ ������ش�
			help_k36 = String.format("%d�� ä���Դϴ�", chanow_k36);
		}
	}		
	
	void VolUp_k36(int u_k36) {		//������ ������ �ް� ���ϰ��� ���� void�Լ��� �������ش�
		for(int i_k36 = 0; i_k36 < u_k36; i_k36++) this.VolUp_k36();
		//0���� �ش簪���� �ݺ��ϸ� VolUp�Լ��� �����Ų��
		//this�� ����ϸ� ���� Ŭ���� ������ �ش纯�� �Ǵ� �Լ��� ã�� �޾ƿ´�
	}
	
	void VolDn_k36(int u_k36) {		//������ ������ �ް� ���ϰ��� ���� void�Լ��� �������ش�
		for(int i_k36 = 0; i_k36 < u_k36; i_k36++) this.VolDn_k36();
		//0���� �ش簪���� �ݺ��ϸ� VolDn�Լ��� �����Ų��
		//this�� ����ϸ� ���� Ŭ���� ������ �ش纯�� �Ǵ� �Լ��� ã�� �޾ƿ´�
	}
	
	void ChannelUp_k36(int u_k36) {		//������ ������ �ް� ���ϰ��� ���� void�Լ��� �������ش�
		for(int i_k36 = 0; i_k36 < u_k36; i_k36++) this.ChannelUp_k36();
		//0���� �ش簪���� �ݺ��ϸ� ChannelUp�Լ��� �����Ų��
		//this�� ����ϸ� ���� Ŭ���� ������ �ش纯�� �Ǵ� �Լ��� ã�� �޾ƿ´�
	}
	
	void ChannelDn_k36(int u_k36) {		//������ ������ �ް� ���ϰ��� ���� void�Լ��� �������ش�
		for(int i_k36 = 0; i_k36 < u_k36; i_k36++) this.ChannelDn_k36();
		//0���� �ش簪���� �ݺ��ϸ� ChannelDn�Լ��� �����Ų��
		//this�� ����ϸ� ���� Ŭ���� ������ �ش纯�� �Ǵ� �Լ��� ã�� �޾ƿ´�
	}
	
	void msg_k36(String id_k36) {		//������ ������ �ް� ���ϰ��� ���� void�Լ��� �������ش�
		System.out.printf("%s => [%s] �ִ�����[%d] �ּ�����[%d] ��������[%d] �ִ�ä��[%d] �ּ�ä��[%d] ����ä��[%d]\n",
				id_k36, help_k36, limit_up_vol_k36, limit_down_vol_k36, volnow_k36, limit_up_cha_k36, limit_down_cha_k36, chanow_k36);
		//�ش� �������� ���� ������ �޾� ���ʴ�� ������ش�
	}
	
}
