package Lecture;

public class Practice5 {	//Ŭ���� ����

	public static void main(String[] args) {	//�����Լ� ����
		//#5. �Ҽ��� ���Ͽ����� ��� �ұ�
		
		int k36_MyVal = 14 / 5;	//2.8������ ������ ������ �����Ͽ����Ƿ� 2�� �ȴ�
		
		System.out.printf("5-1 : %d\n", k36_MyVal);	//�׳� ������ �����ϸ� ������

		double k36_MyValF;	//�Ǽ��� ���� ����
		
		k36_MyValF = 14 / 5;	//�Ǽ��� �������� ������ ������ �Ͽ����Ƿ� 2�� �Ǽ��� ǥ�õȴ�
		System.out.printf("5-2 : %f\n", k36_MyValF); 
		
		k36_MyValF = 14.0 / 5;	//���� �ϳ��� �Ǽ��� �Ǽ��� ������ �Ǿ� 2.8�̶�� ���� ���´�
		System.out.printf("5-3 : %f\n", k36_MyValF);
		
		k36_MyValF = (14.0) / 5 + 0.5;	//�Ǽ��� �����̹Ƿ� 3.3�� ���´�
		System.out.printf("5-4 : %f\n", k36_MyValF);
		
		k36_MyVal = (int) ((14.0) / 5 + 0.5);	//�Ǽ��� ������ �ϰ� ������ ����ȯ�� �ϸ� �����Ǿ� 3�� ���� ���´�
		System.out.printf("5-5 : %d\n", k36_MyVal);
	}
}
