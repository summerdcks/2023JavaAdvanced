package PPT7;

import java.util.ArrayList;

public class PracticeP27 {	//Ŭ���� ����

	public static void main(String[] args) {	//�����Լ� ����
		ArrayList iAL_k36 = new ArrayList();	
		//ArrayList������ iAL�� �����ϰ� �ν��Ͻ��� �����Ѵ�
		iAL_k36.add("abc");		//0��° ���� add
		iAL_k36.add("abcd");	//1��° ���� add
		iAL_k36.add("efga");	//2��° ���� add
		iAL_k36.add("������0");	//3��° ���� add
		iAL_k36.add("1234");	//4��° ���� add
		iAL_k36.add("12rk34");	//5��° ���� add
		
		System.out.printf("******************************\n");	//���м� ���
		System.out.printf(" ���� ArraySize %d \n", iAL_k36.size()); //����� ����Ʈ������ ���
		for(int i_k36 = 0; i_k36 < iAL_k36.size(); i_k36++) {	//0��°���� ������ �������� ���ʴ��
			System.out.printf(" ArrayList %d = %s\n", i_k36, iAL_k36.get(i_k36));	//����Ѵ�
		}
		
		iAL_k36.set(3, "������");//3�� ��̸���Ʈ ���뺯��
		System.out.printf("******************************\n");	//���м� ���
		System.out.printf(" ���뺯�� ArraySize %d \n", iAL_k36.size());//����� ����Ʈ������ ���
		for(int i_k36 = 0; i_k36 < iAL_k36.size(); i_k36++) {	//0��°���� ������ �������� ���ʴ��
			System.out.printf(" ArrayList %d = %s\n", i_k36, iAL_k36.get(i_k36));	//����Ѵ�
		}
		
		iAL_k36.remove(4);//4�� ��̸���Ʈ ����
		System.out.printf("******************************\n");	//���м� ���
		System.out.printf(" ���뺯�� ArraySize %d \n", iAL_k36.size());//����� ����Ʈ������ ���
		for(int i_k36 = 0; i_k36 < iAL_k36.size(); i_k36++) {	//0��°���� ������ �������� ���ʴ��
			System.out.printf(" ArrayList %d = %s\n", i_k36, iAL_k36.get(i_k36));	//����Ѵ�
		}
		
		iAL_k36.sort(null);//��̸���Ʈ ����
		System.out.printf("******************************\n");	//���м� ���
		System.out.printf(" ����ƮSort ArraySize %d \n", iAL_k36.size());//����� ����Ʈ������ ���
		for(int i_k36 = 0; i_k36 < iAL_k36.size(); i_k36++) {	//0��°���� ������ �������� ���ʴ��
			System.out.printf(" ArrayList %d = %s\n", i_k36, iAL_k36.get(i_k36));	//����Ѵ�
		}
		
		iAL_k36.clear();//��̸���Ʈ ����
		System.out.printf("******************************\n");	//���м� ���
		System.out.printf(" ���� ���� ArraySize %d \n", iAL_k36.size());//����� ����Ʈ������ ���
		for(int i_k36 = 0; i_k36 < iAL_k36.size(); i_k36++) {	//0��°���� ������ �������� ���ʴ��
			System.out.printf(" ArrayList %d = %s\n", i_k36, iAL_k36.get(i_k36));	//����Ѵ�
		}

	}

}
