package PPT4;

public class Practice12 {	//Ŭ���� ����

	public static void main(String[] args) {	//�����Լ� ����
		int k36_n, k36_m;	//������ ���� ����
		k36_m = 20;	//����� 20ĭ���� ����
		k36_n = 1;	//���� 1ĭ���� ����
		
		while(true) {
			
			for(int k36_i = 0; k36_i < k36_m; k36_i++) System.out.printf(" "); 
			//ù�ٺ��� ���ʴ�� �Ҵ�� ������ŭ ���� ���
			for(int k36_i = 0; k36_i < k36_n; k36_i++) System.out.printf("*");	
			//ù�ٺ��� ���ʴ�� �Ҵ�� ������ŭ �� ���
			System.out.printf("\n");	//������ ��µǰ� �ٹٲ�
			
			k36_m = k36_m - 1;	//����� �� �ٸ��� ��ĭ�� �پ���
			k36_n = k36_n + 2;	//���� �� �ٸ��� 2ĭ�� �þ��
			
			if(k36_m < 0) break;	//20��° ����ϰ� ������ �������´�
		}
	}
}
