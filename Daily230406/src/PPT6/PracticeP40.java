package PPT6;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PracticeP40 {	//Ŭ���� ����

	public static void main(String[] args) {	//�����Լ� ����
			
		int iPerson_k36 = 200;
		//������ ���� ����, ���ο����� ������ �Ҵ��Ѵ�
		int personPerPage_k36 = 30;
		//������ ���� ����, ���������� ��µ� �ο����� ������ �Ҵ��Ѵ�
		
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
						
		//���������� �հ� ���⿡ ����� ������ �������� �����ϰ� 0���� �ʱ�ȭ�Ѵ�
		int ksum_k36 = 0;
		int esum_k36 = 0;
		int msum_k36 = 0;
		int ssum_k36 = 0;
		int asum_k36 = 0;
		
		//���������� �հ� ���⿡ ����� ������ �������� �����ϰ� 0���� �ʱ�ȭ�Ѵ�	
		int korsum_k36 = 0;
		int engsum_k36 = 0;
		int matsum_k36 = 0;
		int sumsum_k36 = 0;
		int avesum_k36 = 0;
		
		int count_k36 = 1;
		//�������� ǥ�ø� ���� ������ ������ �����ϰ� 1�� �ʱ�ȭ�Ѵ�
				
		
		//��½���
		for(int i_k36 = 0; i_k36 < iPerson_k36; i_k36++) {	//�ο�����ŭ ������ ���� �������´�
								
			//��ܺ� ���
			if(i_k36 % personPerPage_k36 == 0) {	//�������� �Ҵ��ο����� �����°�� �Ǹ� ��ܺθ� ������ش� 
				System.out.printf("%19s\n", "��������ǥ");
				System.out.printf("%s%d%14s%s\n","Page: ",count_k36, "������� : ", formattedDateTime1_k36);
				//���������� ����ð��� ���Ŀ� �°� ����ϰ� �ٹٲ��Ѵ�
				System.out.printf("=============================================\n");
				System.out.printf("%s%5s%7s%4s%4s%4s%4s\n", "��ȣ", "�̸�", "����", "����", "����", "����", "���");
				System.out.printf("=============================================\n");
				
				//������ �� ������ ���������� �հ���� 0���� �ʱ�ȭ�Ѵ�
				ksum_k36 = 0;
				esum_k36 = 0;
				msum_k36 = 0;
				ssum_k36 = 0;
				asum_k36 = 0;								
			} else {
				
			}	
			//��ȣ, �̸�, ��������, �հ�, ����� ������ش�
			System.out.printf("%03d%9s%6d%6d%6d%6d%6d\n",
				i_k36+1, inData_k36.name_k36[i_k36], inData_k36.kor_k36[i_k36], inData_k36.eng_k36[i_k36], 
				inData_k36.mat_k36[i_k36],	inData_k36.sum_k36[i_k36], (int)inData_k36.ave_k36[i_k36]);
							
			//������������ ���������� �����ذ��� �ջ����ش�
			ksum_k36 = ksum_k36 + inData_k36.kor_k36[i_k36];
			esum_k36 = esum_k36 + inData_k36.eng_k36[i_k36];
			msum_k36 = msum_k36 + inData_k36.mat_k36[i_k36];
			ssum_k36 = ssum_k36 + inData_k36.sum_k36[i_k36];
			asum_k36 = asum_k36 + (int)inData_k36.ave_k36[i_k36];	
			//inData��ü�� ave[i]�� �Ǽ��� �迭�� i��° �Ǽ����̹Ƿ� ��������ȯ�Ͽ� ���س�����
				
			//���� ��� �������� ���������� �����ذ��� �ջ����ش�
			korsum_k36 = korsum_k36 + inData_k36.kor_k36[i_k36];
			engsum_k36 = engsum_k36 + inData_k36.eng_k36[i_k36];
			matsum_k36 = matsum_k36 + inData_k36.mat_k36[i_k36];
			sumsum_k36 = sumsum_k36+ inData_k36.sum_k36[i_k36];
			avesum_k36 = avesum_k36 + (int)inData_k36.ave_k36[i_k36];		
			//inData��ü�� ave[i]�� �Ǽ��� �迭�� i��° �Ǽ����̹Ƿ� ��������ȯ�Ͽ� ���س�����

			//�ϴܺ� ���
			if(i_k36 == iPerson_k36-1) {	//i�� iPerson-1��°�� ��, �� ���ο��� �� ��µǾ��� ��
				//������������ ������������ �հ�, ��հ��� ������ش�
				System.out.printf("=============================================\n");
				System.out.printf("����������\n");
				System.out.printf("%s%16d%6d%6d%6d%6d\n", "�հ�", ksum_k36, esum_k36, msum_k36, ssum_k36, asum_k36);
				System.out.printf("%s%16d%6d%6d%6d%6d\n", "���", ksum_k36/(iPerson_k36 - (count_k36-1) * personPerPage_k36),
						esum_k36/(iPerson_k36 - (count_k36-1) * personPerPage_k36), msum_k36/(iPerson_k36 - (count_k36-1) * personPerPage_k36),
						ssum_k36/(iPerson_k36 - (count_k36-1) * personPerPage_k36), asum_k36/(iPerson_k36 - (count_k36-1) * personPerPage_k36));	
						//������������ �հ踦 ��ü�ο���-((��������-1)*�������� �ο���) �� �������ָ� 
						//�������������� ��հ��� ���´�
				System.out.printf("=============================================\n");
				System.out.printf("����������\n");
				System.out.printf("%s%16d%6d%6d%6d%6d\n", "�հ�", korsum_k36, engsum_k36, matsum_k36, sumsum_k36, avesum_k36);
				System.out.printf("%s%16d%6d%6d%6d%6d\n\n\n", "���", korsum_k36/iPerson_k36, engsum_k36/iPerson_k36,
						 matsum_k36/iPerson_k36, sumsum_k36/iPerson_k36, avesum_k36/iPerson_k36);
						//�� �հ踦 ���ο����� �������ָ� ��ü �����հ��� ��հ��� ���´�
			} else {
					
			}	
				
			if((i_k36+1-personPerPage_k36) % personPerPage_k36 == 0) {	
				//(i+1-personPerPage)�� personPerPage�� ���� �������� 0�� ��, �� �������� �Ҵ��ο�����ŭ ��µǾ��� ������
				//������������ ������������ �հ�, ��հ��� ������ش�
				System.out.printf("=============================================\n");
				System.out.printf("����������\n");
				System.out.printf("%s%16d%6d%6d%6d%6d\n", "�հ�", ksum_k36, esum_k36, msum_k36, ssum_k36, asum_k36);
				System.out.printf("%s%16d%6d%6d%6d%6d\n", "���", ksum_k36/personPerPage_k36, esum_k36/personPerPage_k36,
						 msum_k36/personPerPage_k36, ssum_k36/personPerPage_k36, asum_k36/personPerPage_k36);		
				//������������ �հ踦 �������� �Ҵ��ο����� �������ָ� ������������ ��հ��� ���´�
				System.out.printf("=============================================\n");
				System.out.printf("����������\n");
				System.out.printf("%s%16d%6d%6d%6d%6d\n", "�հ�", korsum_k36, engsum_k36, matsum_k36, sumsum_k36, avesum_k36);
				System.out.printf("%s%16d%6d%6d%6d%6d\n\n\n", "���", korsum_k36/(i_k36+1), engsum_k36/(i_k36+1),
						matsum_k36/(i_k36+1), sumsum_k36/(i_k36+1), avesum_k36/(i_k36+1));
						//�� �հ踦 i+1�� �������ָ� 0���� i��°������(ȭ��󿡼� 1���� i+1��°) �л����� ��հ��� ���´� 
								
				count_k36 = count_k36 + 1;
				//�� ������ �������� ���������� 1�� ������Ų��
			} else {
				
			}							
		}
	}
}
