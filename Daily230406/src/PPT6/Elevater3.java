package PPT6;

public class Elevater3 extends Elevater2 {

	void Repair_k36() {
		help_k36 = String.format("�������Դϴ�");
	}
	
	void up_k36() {		//���������Ͱ� �ö�
		if (floor_k36 >= limit_up_floor_k36) {
			help_k36 = "���������Դϴ�";
		} else {
			floor_k36 = floor_k36 + 2;	//�ֻ����� �ƴ� �� �� ���� �ö�
			help_k36 = String.format("%d���Դϴ�", floor_k36);
		}
		
		this.down_k36();	//���� �̷��� �ϸ� ��ĭ �ö󰡰� ��ĭ �ö�
	}
	
	void down_k36() {	//���������Ͱ� ������
		super.down_k36();
		System.out.printf("Ŭ���� �ȿ��� ����ִ� MSG [%s]\n", this.help_k36);
		//this.down(): ���ȣ��� ������ ����
	}
}
