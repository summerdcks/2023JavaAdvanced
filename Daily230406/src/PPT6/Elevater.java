package PPT6;

public class Elevater {
	int limit_up_floor_k36 = 10;	//�ֻ�����
	int limit_down_floor_k36 = 0;	//��������
	int floor_k36 = 1;				//������
	String help_k36;
	
	void up_k36()		//���������Ͱ� �ö�
	{
		if (floor_k36 == limit_up_floor_k36) {
			help_k36 = "���������Դϴ�";
		} else {
			floor_k36++;	//�ֻ����� �ƴ� �� �� ���� �ö�
			help_k36 = String.format("%d���Դϴ�",floor_k36);
		}
	}
	
	void down_k36()		//���������Ͱ� ������
	{
		if (floor_k36 == limit_down_floor_k36) {
			help_k36 = "ó�����Դϴ�.";
		} else {
			floor_k36--;	//�������� �ƴ� �� �� ���� �ö�
			help_k36 = String.format("%d���Դϴ�", floor_k36);
		}
	}
}