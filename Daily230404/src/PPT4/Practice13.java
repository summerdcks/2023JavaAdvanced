package PPT4;

import java.text.DecimalFormat;

public class Practice13 {	//Ŭ���� ����

	public static void main(String[] args) {	//�����Լ� ����
		String k36_item = "���";	//ǰ��, ���ڿ� ���� ����
		int k36_unit_price = 5000;	//�ܰ�, ������ ���� ����
		int k36_num = 500;	//����, ������ ���� ����
		int k36_total = 0;	//�հ�, ������ ���� ����
		
		DecimalFormat k36_df = new DecimalFormat( "###,###,###,###,###" );
		//�ڸ����� ���� ,�� ������ִ� �Լ� df
		
		System.out.printf("======================================================\n");
		System.out.printf("%20.20s%8.8s%8.8s%8.8s\n", "ǰ��", "�ܰ�", "����", "�հ�");
		//%20.20s ���ڿ��� �޾Ƽ� ���, �ڸ��� 20ĭ�� �����ϰ� 20�ڸ����� ����Ѵ�
		//%8.8s ���ڿ��� �޾Ƽ� ���, �ڸ��� 8ĭ�� �����ϰ� 8�ڸ����� ����Ѵ�
		//�� %s���� ���ʴ�� ǰ��, �ܰ�, ����, �հ谡 ��µȴ�
		System.out.printf("======================================================\n");
		
		System.out.printf("%20.20s%10.10s%10.10s%10.10s\n",
				k36_item, k36_df.format(k36_unit_price), k36_df.format(k36_num), k36_df.format(k36_unit_price * k36_num));
		//df�Լ��� �̿��� �� ������ �ڸ����� ���� ,�� ������ش� �հ�� ����*�������� ����Ѵ�
		System.out.printf("======================================================\n");
	}
}
