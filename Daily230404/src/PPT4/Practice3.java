package PPT4;

public class Practice3 {	//Ŭ���� ����

	public static void main(String[] args) {	//�����Լ� ����
		int k36_iVal;	//������ ���� iVal ����
		for(int k36_i = 0; k36_i < 300; k36_i++) { 	//������ ���� i�� 0���� 300�� �Ǳ� �������� �������� 1�� �����Ѵ�
			
			k36_iVal = 5 * k36_i;	//iVal�� i�� 5���
			
			if(k36_iVal >= 0 && k36_iVal < 10) System.out.printf("�� %d\n", k36_iVal);
			//5��� ���ڰ� ���� �ڸ��� ��(0���� ���ų� ũ�� 10���� ���� ��) �� ���
			else if(k36_iVal >= 10 && k36_iVal < 100) System.out.printf("�� %d\n", k36_iVal);
			//5��� ���ڰ� ���� �ڸ��� ��(10���� ���ų� ũ�� 100���� ���� ��) �� ���
			else if(k36_iVal >= 100 && k36_iVal < 1000) System.out.printf("�� %d\n", k36_iVal);
			//5��� ���ڰ� ���� �ڸ��� ��(100���� ���ų� ũ�� 1000���� ���� ��) �� ���
			else System.out.printf("õ %d\n", k36_iVal);
			//�������� ��� (iVal�� 1000���� ũ�ų� ���� 1500���� ���� ���) õ ���
		}
	}
}
