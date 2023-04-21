package Lecture;

public class PracticeTaxcalc1 {	//Ŭ���� ����

	public static int k36_taxcal(int k36_val, int k36_rate) {		//������ ������ �޾� ������ ������ ��ȯ�ϴ� static�Լ� taxcal ����
		int k36_ret;	//������ ���� ����
		
		if(((double)k36_val * (double)k36_rate / 100.0) == k36_val * k36_rate / 100) {	
			//�Ǽ��� �������� ������ �������� ������ �Ҽ��� ������ ���� 0�̹Ƿ� �ش簪�� �״�� ��ȯ�Ѵ�
			k36_ret = k36_val * k36_rate / 100;
			} else {
			k36_ret = k36_val * k36_rate / 100 + 1;
			//�Ǽ��� �������� ������ �������� �ٸ��ٸ� �Ҽ��� ���Ͽ� ���� �����Ƿ� �ø�ó���� ���� 1�� �����ش�
			}
		
		return k36_ret;		//��ȯ��
	}
	
	public static void main(String[] args) {	//�����Լ� ����
		int k36_val = 271;	//���� ���ǰ�
		int k36_rate = 3;	//���� 3�ۼ�Ʈ
		
		int k36_tax = k36_taxcal(k36_val, k36_rate);	//k36_taxcal�Լ��� static�̹Ƿ� ��ü ������ �����ϰ� ȣ���� �� �ִ�
		
		System.out.printf("*************************************************\n");
		System.out.printf(" *            �ܼ� ���� ���                    *\n");
		System.out.printf("���� ���ݰ�� : %f\n", k36_val * k36_rate / 100.0);	//�ϳ��� �Ǽ���� �Ǽ��� ������ ����Ǿ� �Ǽ����� ���´�
		
		System.out.printf("�������� : %d ���� : %d �����԰��� : %d\n", k36_val, k36_tax, k36_val+k36_tax);	
		System.out.printf("*************************************************\n");
	}
}
