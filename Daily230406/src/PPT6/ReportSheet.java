package PPT6;

public class ReportSheet {	//Ŭ���� ����

	public static void main(String[] args) {	//�����Լ� ����
	
		int iPerson_k36 = 10;	//������ ������ �����ϸ� �ش簪���� �ʱ�ȭ
								
		InputData inData_k36 = new InputData(iPerson_k36);
		//InputDataŬ�������� �ش簪��ŭ�� ũ���� �迭�� �����ȴ�
		
		for(int i_k36 = 0; i_k36 < iPerson_k36; i_k36++) {	
			//�Ʒ��� �������� iPerson���� ������ŭ �����Ǿ� �� �迭�� ������ ����ȴ�
			String name_k36 = String.format("ȫ��%02d", i_k36);	//�̸� �����
			int kor_k36 = (int)(Math.random()*100);	//Math.random�Լ��� �̿��Ͽ� ����,����,���� ���� �����
			int eng_k36 = (int)(Math.random()*100);	//Math.random�Լ��� ���� �Ǽ����̹Ƿ� 100�� ���Ͽ� ������ȯ�� �ϸ�
			int mat_k36 = (int)(Math.random()*100);	//0~99������ �������� ���´�
			inData_k36.SetData(i_k36, name_k36, kor_k36, eng_k36, mat_k36);
			//�ش簪���� inData��ü�� SetData�Լ����� �޾� ������ �迭�� ������ ������Ų��
		}
		for(int i_k36 = 0; i_k36 < iPerson_k36; i_k36++) {	//0���� iPerson-1��°���� �ش� ������ ����Ѵ�
			System.out.printf("��ȣ:%d, �̸�:%s, ����:%d, ����:%d, ����:%d, ����:%d, ���:%f\n",
					i_k36, inData_k36.name_k36[i_k36], inData_k36.kor_k36[i_k36], inData_k36.eng_k36[i_k36],
					inData_k36.mat_k36[i_k36], inData_k36.sum_k36[i_k36], inData_k36.ave_k36[i_k36]);
					//inData��ü�� ������ �迭�� i��° �������� �޾ƿ� ���ʴ�� ����Ѵ�
		}		
	}
}
