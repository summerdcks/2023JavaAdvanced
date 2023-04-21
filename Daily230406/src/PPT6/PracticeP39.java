package PPT6;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PracticeP39 {	//Ŭ���� ����

	public static void main(String[] args) {	//�����Լ� ����
		
		int iPerson_k36 = 30;		
		//������ ���� ����, ���ο����� ������ �Ҵ��Ѵ�
		
		InputData inData_k36 = new InputData(iPerson_k36);		
		//InputDataŬ������ �޾� �ν��Ͻ��� �����Ͽ� ��ü�� �����Ѵ�
			
		for(int i_k36 = 0; i_k36 < iPerson_k36; i_k36++) {	
			//�Ʒ��� �������� iPerson���� ������ŭ �����Ǿ� �� �迭�� ������ ����ȴ�
			String name_k36 = String.format("ȫ��%02d", i_k36+1);	//�̸� �����
			int kor_k36 = (int)(Math.random()*100);	//Math.random�Լ��� �̿��Ͽ� ����,����,���� ���� �����
			int eng_k36 = (int)(Math.random()*100);	//Math.random�Լ��� ���� �Ǽ����̹Ƿ� 100�� ���Ͽ� ������ȯ�� �ϸ�
			int mat_k36 = (int)(Math.random()*100);	//0~99������ �������� ���´�
			inData_k36.SetData(i_k36, name_k36, kor_k36, eng_k36, mat_k36);
			//�ش簪���� inData��ü�� SetData�Լ����� �޾� ������ �迭�� ������ ������Ų��
		}
		
		LocalDateTime currenttime_k36 = LocalDateTime.now();
		//LocalDateTime�Լ��� �̿��� ����ð��� �ҷ��´�
		DateTimeFormatter formatter1_k36 = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
		//DateTimeFormatter�Լ��� �̿��Ͽ� ���ϴ� �������� �޾� ���¸� �ο��Ѵ�
		String formattedDateTime1_k36 = currenttime_k36.format(formatter1_k36);
		//�ҷ��� ����ð��� ���ϴ� ���¿� �°� ����� �� �ֵ��� String������ �޴´�
		
		//����ǥ ��ܺ� ���
		System.out.printf("%19s\n", "��������ǥ");
		System.out.printf("%22s%s\n", "������� : ", formattedDateTime1_k36);
		//���ڿ� ������ ������ ����ð��� ���Ŀ� �°� ����ϰ� �ٹٲ��Ѵ�
		System.out.printf("=============================================\n");
		System.out.printf("%s%5s%5s%4s%4s%4s%4s\n", "��ȣ", "�̸�", "����", "����", "����", "����", "���");
		System.out.printf("=============================================\n");
			
		//�հ�, ��հ� ���⿡ ����� ������ �������� �����ϰ� 0���� �ʱ�ȭ�Ѵ�	
		int korsum_k36 = 0;
		int engsum_k36 = 0;
		int matsum_k36 = 0;
		int sumsum_k36 = 0;
		int avesum_k36 = 0;
		
		for(int i_k36 = 0; i_k36 < iPerson_k36; i_k36++) {	//0���� iPerson-1��° �������� ���ʴ�� ����Ѵ�
			System.out.printf("%03d%8s%5d%6d%6d%6d%6d\n",
					i_k36+1, inData_k36.name_k36[i_k36], inData_k36.kor_k36[i_k36], inData_k36.eng_k36[i_k36],
					inData_k36.mat_k36[i_k36], inData_k36.sum_k36[i_k36], (int)inData_k36.ave_k36[i_k36]);
					//inData��ü�� �� �迭�� i��° ������ ������ش�, ave�� �Ǽ����̹Ƿ� ��������ȯ�Ͽ� ����Ѵ�
			//������������ ���������� �����ذ��� �ջ����ش�
			korsum_k36 = korsum_k36 + inData_k36.kor_k36[i_k36];
			engsum_k36 = engsum_k36 + inData_k36.eng_k36[i_k36];
			matsum_k36 = matsum_k36 + inData_k36.mat_k36[i_k36];
			sumsum_k36 = sumsum_k36 + inData_k36.sum_k36[i_k36];
			avesum_k36 = avesum_k36 + (int)inData_k36.ave_k36[i_k36];		
			//inData��ü�� ave[i]�� �Ǽ��� �迭�� i��° �Ǽ����̹Ƿ� ��������ȯ�Ͽ� ���س�����
		
		}		
	
		System.out.printf("=============================================\n");
		System.out.printf("%s%14d%6d%6d%6d%6d\n", "�հ�", korsum_k36, engsum_k36, matsum_k36, sumsum_k36, avesum_k36);
		//�� ���� ����, ����, ����� �հ踦 ������ش�
		System.out.printf("%s%14d%6d%6d%6d%6d\n", "���", korsum_k36/iPerson_k36, engsum_k36/iPerson_k36,
				matsum_k36/iPerson_k36, sumsum_k36/iPerson_k36, avesum_k36/iPerson_k36);
		//���հ踦 ���ο����� ���� ��հ��� ������ش�
	}
}
