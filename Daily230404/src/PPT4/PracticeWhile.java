package PPT4;

public class PracticeWhile {	//Ŭ���� ����

	public static void main(String[] args) {	//�����Լ� ����
		for(int kopo36_i = 2; kopo36_i <= 9; kopo36_i++) {	//for���� ���ǹ����� ����� ������ ���� i�� 2�� �ʱ�ȭ, �������� 1�� �����ϸ� 9���� �ݺ��ȴ�
			for(int kopo36_j = 1; kopo36_j <= 9; kopo36_j++) {	//for���� ���ǹ����� ����� ������ ���� j�� 1�� �ʱ�ȭ, �������� 1�� �����ϸ� 9���� �ݺ��ȴ�
				System.out.println(kopo36_i + " * " + kopo36_j + " = " + kopo36_i * kopo36_j);	//2*1���� 9*9���� ������ ���
			}
		}
		
		System.out.println();
		
		int kopo36_i = 2;	//������ ���� i�� �����ϸ� 2�� �ʱ�ȭ
		while(kopo36_i <= 9) {	//i�� 9�� �� ������ �ݺ��Ǵ� while��
			int kopo36_j = 1;	//���ǹ����� ���� ������ ���� j�� �����ϸ� 1�� �ʱ�ȭ
			while(kopo36_j <= 9) {	//j�� 9�� �� ������ �ݺ��Ǵ� while��
				System.out.println(kopo36_i + " * " + kopo36_j + " = " + kopo36_i * kopo36_j);	//2*1���� 9*9���� ������ ���
				kopo36_j++;	//j�� �������� 1�� ������
			}
			kopo36_i++;	//i�� �������� 1�� ������
		}
	}
}
