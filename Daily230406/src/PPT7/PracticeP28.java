package PPT7;

import java.util.ArrayList;

public class PracticeP28 {	//Ŭ���� ����

	public static void main(String[] args) {	//�����Լ� ����
		int iTestMAX_k36 = 10;	//������ ���� ����� 10���� �ʱ�ȭ
		ArrayList iAL_k36 = new ArrayList();
		//ArrayList������ iAL�� �����ϰ� �ν��Ͻ��� �����Ѵ�
                                                                                                         
		for(int i_k36 = 0; i_k36 < iTestMAX_k36; i_k36++) {	//iTestMAX������ŭ
			iAL_k36.add((int)(Math.random() * 1000000));
			//�����Լ��� �̿��� ������ �Ǽ����� 1000000�� ���ϰ� ��������ȯ�� ���� ������ �߰��Ѵ�
		}
		
		for(int i_k36 = 0; i_k36 < iAL_k36.size(); i_k36++) {	//0��°���� ��������°����
			System.out.printf(" ArrayList %d = %d\n", i_k36, iAL_k36.get(i_k36));
			//���° ���������� �������� ���ʴ�� ����Ѵ�
		}
		
		System.out.printf("***************************\n");	//���м� ���
		iAL_k36.sort(null);	//ArrayList�� �������� �������� �����Ѵ�
		
		for(int i_k36 = 0; i_k36 < iAL_k36.size(); i_k36++) {	//0��°���� ��������°����
			System.out.printf(" ArrayList %d = %d\n", i_k36, iAL_k36.get(i_k36));
			//���° ���������� �������� ���ʴ�� ����Ѵ�
		}
	}
}
