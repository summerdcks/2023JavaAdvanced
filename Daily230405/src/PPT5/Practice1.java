package PPT5;

public class Practice1 {	//Ŭ���� ����

	public static void main(String[] args) {	//�����Լ� ����
		
		for(int kopo36_i = 1; kopo36_i < 10; kopo36_i = kopo36_i + 3) {	//for���� ���ǹ����� ����� ������ ���� i�� �����ϸ� 1�� �ʱ�ȭ, �������� 3�� �����ϸ� 10�� �Ǳ� ���� ����ȴ�
			System.out.printf("*****************\t*****************\t*****************\n");
			System.out.printf("   ������ %d �� \t\t   ������ %d �� \t\t   ������ %d �� \n", kopo36_i, kopo36_i+1, kopo36_i+2);	//i, i+1, i+2������ ������ %d�� ���
			System.out.printf("*****************\t*****************\t*****************\n");
			for(int kopo36_j = 1; kopo36_j < 10; kopo36_j++) {	//*1���� *9���� ������ ���
				//for���� ���ǹ����� ����� ������ ���� j�� �����ϸ� 1�� �ʱ�ȭ, �������� 1�� �����ϸ� 10�� �Ǳ� ���� ����ȴ�
				System.out.printf("   %d * %d = %d \t\t   %d * %d = %d \t\t   %d * %d = %d \n",	
						kopo36_i, kopo36_j, kopo36_i * kopo36_j,
						kopo36_i+1, kopo36_j, (kopo36_i+1) * kopo36_j,
						kopo36_i+2, kopo36_j, (kopo36_i+2) * kopo36_j);	//1��, 2��, 3���� ������ ����ϰ� ���� �ٲ��ش�
			}
		}
	}
}
