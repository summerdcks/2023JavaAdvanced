package PPT7;

import PPT6.InputData;

public class PracticeP26 {

	public static void main(String[] args) {
		int iPerson_k36 = 5;	//������ ������ �����ϰ� ���ο� 5������ �ʱ�ȭ
		
		OneRec [] inData_k36 = new OneRec[iPerson_k36];	//Ŭ���� ������ ũ�Ⱑ iPerson�� �迭�� ����
		
		inData_k36[0] = new OneRec("ȫ��01", 100, 100, 90);	//�� �迭���� Ŭ���� �ν��Ͻ� ����
		inData_k36[1] = new OneRec("ȫ��02", 90, 90, 90);	//�� �迭���� Ŭ���� �ν��Ͻ� ����
		inData_k36[2] = new OneRec("ȫ��03", 80, 70, 90);	//�� �迭���� Ŭ���� �ν��Ͻ� ����
		inData_k36[3] = new OneRec("ȫ��04", 70, 60, 90);	//�� �迭���� Ŭ���� �ν��Ͻ� ����
		inData_k36[4] = new OneRec("ȫ��05", 60, 100, 90);	//�� �迭���� Ŭ���� �ν��Ͻ� ����

		for(int i_k36 = 0; i_k36 < iPerson_k36; i_k36++) {	//0���� iPerson-1��°���� �ش� ������ ����Ѵ�
			System.out.printf("��ȣ:%d, �̸�:%s, ����:%d, ����:%d, ����:%d, ����:%d, ���:%f\n",
					i_k36, inData_k36[i_k36].name_k36(), inData_k36[i_k36].kor_k36(), inData_k36[i_k36].eng_k36(),
					inData_k36[i_k36].mat_k36(), inData_k36[i_k36].sum_k36(), inData_k36[i_k36].ave_k36());
					//i��° inDataŬ������ �迭�� �������� �޾ƿ� ���ʴ�� ����Ѵ�
		}		
	}
}

