package PPT4;

public class Practice4 {	//Ŭ���� ����

	public static void main(String[] args) {	//�����Լ� ����
		for(int k36_i = 1; k36_i < 13; k36_i++) {	//1������ 12������ �������� 1�� �����Ѵ�
			System.out.printf("%d�� =>", k36_i);
			for(int k36_j = 1; k36_j < 32; k36_j++) {	//1�Ϻ��� 31�ϱ��� �������� 1�� �����Ѵ�
				
				System.out.printf("%d", k36_j);
											
				if(k36_i == 1 && k36_j == 31) break;	//1������ 31�ϱ��� ��µǰ� ������ ����������
				if(k36_i == 2 && k36_j == 28) break;	//2������ 28�ϱ��� ��µǰ� ������ ����������
				if(k36_i == 3 && k36_j == 31) break;
				if(k36_i == 4 && k36_j == 30) break;
				if(k36_i == 5 && k36_j == 31) break;
				if(k36_i == 6 && k36_j == 30) break;
				if(k36_i == 7 && k36_j == 31) break;
				if(k36_i == 8 && k36_j == 31) break;
				if(k36_i == 9 && k36_j == 30) break;
				if(k36_i == 10 && k36_j == 31) break;
				if(k36_i == 11 && k36_j == 30) break;
				if(k36_i == 12 && k36_j == 31) break;
				
				System.out.printf(", ");	//������ ���������� �������� ���������� ,���
			}
			System.out.printf(".\n");	//��ħǥ ��� �ٹٲ�
		}
	}
}
