package PPT4;

public class PracticeFor {	//Ŭ���� ����

	public static void main(String[] args) {	//�����Լ� ����
		int kopo36_sum = 0;	//������ ���� sum�� �����ϸ� 0���� �ʱ�ȭ
		for(int kopo36_i = 0; kopo36_i < 10; kopo36_i++) {	//for���� ���ǹ����� ����� ������ ���� i�� �����ϸ� 0���� �ʱ�ȭ, �������� 1�� �����ϸ� 10�� �Ǳ� ���� ����ȴ�
			kopo36_sum = kopo36_sum + kopo36_i;	//sum������ i������ �����ϸ� ���س�����
		}
		System.out.printf("sum %d\n", kopo36_sum);	//sum���� ������ %d�� ���
		
		for(int kopo36_i = 1; kopo36_i < 10; kopo36_i++) {	//for���� ���ǹ����� ����� ������ ���� i�� �����ϸ� 1�� �ʱ�ȭ, �������� 1�� �����ϸ� 10�� �Ǳ� ���� ����ȴ�
			System.out.printf("**************************\n", kopo36_i);
			System.out.printf("       ������ %d ��\n", kopo36_i);	//i������ ������ %d�� ���
			System.out.printf("**************************\n", kopo36_i);
			for(int kopo36_j = 1; kopo36_j < 10; kopo36_j++) {	//for���� ���ǹ����� ����� ������ ���� j�� �����ϸ� 1�� �ʱ�ȭ, �������� 1�� �����ϸ� 10�� �Ǳ� ���� ����ȴ�
				System.out.printf(" %d * %d = %d \n", kopo36_i, kopo36_j, kopo36_i * kopo36_j);	//1*1���� 9*9���� ������ ���
			}
		}
	}
}
