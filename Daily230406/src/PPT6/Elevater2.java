package PPT6;

public class Elevater2 {
	public int limit_up_floor_k36;		//�ֻ�����
	public int limit_down_floor_k36;	//��������
	public int floor_k36;				//������
	public String help_k36;
	
	Elevater2() {
		limit_up_floor_k36 = 10;
		limit_down_floor_k36 = 1;
		floor_k36 = 1;
		help_k36 = "���������� �⺻ �ذ��Ϸ�";
	}
	
	//�ִ���, �ּ���, �������� �־ Ŭ������ ������ �� �ֵ��� ��
	Elevater2(int up_floor_k36, int d_floor_k36, int in_floor_k36) {
		limit_up_floor_k36 = up_floor_k36;
		limit_down_floor_k36 = d_floor_k36;
		floor_k36 = in_floor_k36;
		help_k36 = "���������� ���� �ذ��Ϸ�";
	}
	
	void up_k36() {
		if(floor_k36 == limit_up_floor_k36) {
			help_k36 = "������ ���Դϴ�";
		} else {
			floor_k36++;
			help_k36 = String.format("[%d] ���Դϴ�", floor_k36);
		}
	}
	
	void down_k36() {
		if(floor_k36 == limit_down_floor_k36) {
			help_k36 = "ó�� ���Դϴ�";
		} else {
			floor_k36--;
			help_k36 = String.format("[%d] ���Դϴ�", floor_k36);
		}
	}
	
	void up_k36(int u_k36) {
		for(int i_k36 = 0; i_k36 < u_k36; i_k36++) this.up_k36();
	}
	
	void down_k36(int u_k36) {
		for(int i_k36 = 0; i_k36 < u_k36; i_k36++) down_k36();
	}
	
	void msg_k36(String id_k36) {
		System.out.printf("%s => [%s] �ִ���[%d] �ּ���[%d] ������[%d]\n",
				id_k36,help_k36,limit_up_floor_k36,limit_down_floor_k36,floor_k36);
	}
}
