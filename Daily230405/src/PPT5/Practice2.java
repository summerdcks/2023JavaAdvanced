package PPT5;

public class Practice2 {	//Ŭ���� ����

	public static void main(String[] args) {	//�����Լ� ����
		
		for(int kopo36_i = 1; kopo36_i < 4; kopo36_i++) {	//for���� ���ǹ����� ����� ������ ���� i�� �����ϸ� 1�� �ʱ�ȭ, �������� 1�� �����ϸ� 4�� �Ǳ� ���� ����ȴ�
			System.out.printf("*****************\t*****************\t*****************\n");
			System.out.printf("   ������ %d �� \t\t   ������ %d �� \t\t   ������ %d �� \n", kopo36_i, kopo36_i+3, kopo36_i+6);	//i, i+3, i+6������ ������ %d�� ���
			System.out.printf("*****************\t*****************\t*****************\n");
			for(int kopo36_j = 1; kopo36_j < 10; kopo36_j++) {	//*1���� *9���� ���ʴ�� ��µȴ�
				//for���� ���ǹ����� ����� ������ ���� j�� �����ϸ� 1�� �ʱ�ȭ, �������� 1�� �����ϸ� 10�� �Ǳ� ���� ����ȴ�
				System.out.printf("   %d * %d = %d \t\t   %d * %d = %d \t\t   %d * %d = %d \n",	
						kopo36_i, kopo36_j, kopo36_i * kopo36_j,
						kopo36_i+3, kopo36_j, (kopo36_i+3) * kopo36_j,
						kopo36_i+6, kopo36_j, (kopo36_i+6) * kopo36_j);	//1��, 4��, 7���� ������ ����ϰ� ���� �ٲ��ش�
			}
		}
	}
}
