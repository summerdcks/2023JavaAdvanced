package PPT4;

public class Practice6 {	//Ŭ���� ����

	public static void main(String[] args) {	//�����Լ� ����
		for(int k36_i = 1; k36_i < 13; k36_i++ ) {	//1������ 12������ �������� 1�� �����Ѵ�
			System.out.printf("%d�� =>", k36_i);	//1������ 12������ ������ ������ ������ ���ʴ�� ��µȴ�
			LOOP: for(int k36_j = 1; k36_j < 32; k36_j++) {		//1�Ϻ��� 31�ϱ��� �������� 1�� �����Ѵ�
				
				System.out.printf("%d, ", k36_j);	//1�Ϻ��� 31�ϱ��� ������ ���� ���ʴ�� ��µȴ�
				
				switch(k36_i) {
				case 4 : case 6 : case 9 : case 7 : case 11 :
					if(k36_j == 30) break LOOP;
					break;
					//4,6,9,7,11������ 30�ϱ��� ��µǰ� ������ ������
				case 2 :
					if(k36_j == 28) break LOOP;
					break;
					//2������ 28�ϱ��� ��µǰ� ������ ������
				}
			}
			System.out.printf("\n");	//���� ���������� �ٹٲ�
		}
	}
}
//������� �ʴ� ���