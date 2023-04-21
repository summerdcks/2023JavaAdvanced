package PPT7;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PracticeP33P35 {	//Ŭ���� ����
	
	public static void main(String[] args) {	//�����Լ� ����
		dataSet_k36();				//�����ͼ���	
		for(j_k36 = 0; j_k36 < ArrayOneRec_k36.size(); j_k36++) {					
			HeaderPrint_k36();		//����μ�								
			dataSort_k36();			//����������
			ItemPrint_k36(j_k36);	//�����μ�				
			TailPrint_k36();		//�����μ�			
		}			
	}
	
	static ArrayList<OneRec> ArrayOneRec_k36 = new ArrayList<OneRec>();
	//OneRec��ü�� ������ �ϴ� ArrayList������ ArrayOneRec�� �����ϰ� �ν��Ͻ��� �����Ѵ�	
	
	static int j_k36 = 0;	//class���� ���� �Լ����� ����� ������ �̸� ����
	static int count_k36 = 0;	//�������� ����� ���� ������ ���� ����
	static final int iPerson_k36 = 200;	//���ο����� ������ �ʴ� ������ ������ ����
	static final int personPerPage_k36 = 50;	//�������� �Ҵ��ο����� ������ �ʴ� ������ ������ ����
	
	//���������� �հ� ���⿡ ����� ������ �������� �����ϰ� 0���� �ʱ�ȭ�Ѵ�
	static int ksum_k36 = 0;
	static int esum_k36 = 0;
	static int msum_k36 = 0;
	static int ssum_k36 = 0;
	static int asum_k36 = 0;
				
	//���������� �հ� ���⿡ ����� ������ �������� �����ϰ� 0���� �ʱ�ȭ�Ѵ�	
	static int sumkor_k36 = 0;
	static int sumeng_k36 = 0;
	static int summat_k36 = 0;
	static int sumsum_k36 = 0;
	static int sumave_k36 = 0;
	
	public static void dataSet_k36() {		//���ϰ��� ���� �Լ� ����
		for(int i_k36 = 0; i_k36 < iPerson_k36; i_k36++) {		//�� �ο�����ŭ
			String name_k36 = String.format("ȫ��%02d", i_k36+1); //�̸������
			int kor_k36 = (int)(Math.random() * 100);	//�������� �����
			int eng_k36 = (int)(Math.random() * 100);	//�������� �����
			int mat_k36 = (int)(Math.random() * 100);	//�������� �����
			ArrayOneRec_k36.add(new OneRec(i_k36+1, name_k36, kor_k36, eng_k36, mat_k36));
			//ArrayOneRec�� ������ ������ ���� ���ο� OneRec ��ü�� �߰�
		}
	}
	
	public static void dataSort_k36() {		//���ϰ��� ���� �Լ� ����
		Comparator<OneRec> bikyeokijun_k36 = new Comparator<OneRec>() {
			//Comparator�� �ڹٿ��� �� ���� ��ü�� ���ϱ� ���� �������̽��� �� ����� ���� ������ �̷����
			//OneRecŬ������ ��ü�� ���ϱ� ���� Comparator<OneRec>�� ����Ѵ�
			public int compare(OneRec a1_k36, OneRec a2_k36) {
				//compare�Լ��� OneRec ��ü�� a1_k36�� a2_k36�� ���Ͽ� �������� ��ȯ�Ѵ�
				return (a2_k36.sum_k36() - a1_k36.sum_k36());	
			}	
		};
		Collections.sort(ArrayOneRec_k36, bikyeokijun_k36);	//����
		//ArrayOneRec����Ʈ�� �������� bikyeokijun Comparator ��ü�� ���� ����
		//Collections.reverse(ArrayOneRec_k36); //������, ������
	}
	
	public static void HeaderPrint_k36() {		//���ϰ��� ���� �Լ� ����
		if(j_k36 % personPerPage_k36 == 0) {	//j��°�� �������� �Ҵ��ο����� ����϶�
			//�������� �Ҵ��ο����� �����°�� �Ǹ� ��ܺθ� ������ش� 
			count_k36++;	//�������� ī��Ʈ
			LocalDateTime currenttime_k36 = LocalDateTime.now();
			//LocalDateTime�Լ��� �̿��� ����ð��� �ҷ��´�
			DateTimeFormatter formatter1_k36 = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
			//DateTimeFormatter�Լ��� �̿��Ͽ� ���ϴ� �������� �޾� ���¸� �ο��Ѵ�
			String formattedDateTime1_k36 = currenttime_k36.format(formatter1_k36);
			//�ҷ��� ����ð��� ���ϴ� ���¿� �°� ����� �� �ֵ��� String������ �޴´�
			System.out.printf("%19s\n", "��������ǥ");
			System.out.printf("%s%d%14s%s\n","Page: ",count_k36, "������� : ", formattedDateTime1_k36);
			//���������� ����ð��� ���Ŀ� �°� ����ϰ� �ٹٲ��Ѵ�
			System.out.printf("=============================================\n");	//���м� ���
			System.out.printf("%s%5s%7s%4s%4s%4s%4s\n", "��ȣ", "�̸�", "����", "����", "����", "����", "���");
			System.out.printf("=============================================\n");	//���м� ���
			//������������ �հ�� ����� �����ϱ� ���� ����� ����� ������ sum�� �ʱ�ȭ���ش�
			ksum_k36 = 0;
			esum_k36 = 0;
			msum_k36 = 0;
			ssum_k36 = 0;
			asum_k36 = 0;				
		}	
	} 

	public static void ItemPrint_k36(int j_k36) {		//������ �Է¹ް� ���ϰ��� ���� �Լ� ����
		OneRec rec_k36;	//OneRedŬ���� ������ ��ü rec�� ����
		
		rec_k36 = ArrayOneRec_k36.get(j_k36);	
		//ArrayOneRec����Ʈ���� j��° OneRec ��ü�� �����ͼ� rec������ �����Ѵ�
		System.out.printf("%03d%8s%6d%6d%6d%6d%6d\n", rec_k36.student_id(), rec_k36.name_k36(), rec_k36.kor_k36(),
				rec_k36.eng_k36(), rec_k36.mat_k36(), rec_k36.sum_k36(), (int)rec_k36.ave_k36());
				//rec��� �̸��� OneRec��ü�� �� �Լ��� ��ȯ���� ������ �ڸ��� ���ʴ�� ����Ѵ� ������ ������ ��������ȯ�Ͽ� ����Ѵ�
		
		//������������ �հ�� ����� �����ϱ� ���� 0��°���� j��°���� ���ʴ�� �������� ���س�����
		sumkor_k36 += rec_k36.kor_k36();
		sumeng_k36 += rec_k36.eng_k36();
		summat_k36 += rec_k36.mat_k36();
		sumsum_k36 += rec_k36.sum_k36();
		sumave_k36 += rec_k36.ave_k36();	
		
		//������������ �հ�� ����� �����ϱ� ���� ����� ��µǴ� �κк��� j��°���� ���ʴ�� �������� ���س�����
		ksum_k36 += rec_k36.kor_k36();
		esum_k36 += rec_k36.eng_k36();
		msum_k36 += rec_k36.mat_k36();
		ssum_k36 += rec_k36.sum_k36();
		asum_k36 += rec_k36.ave_k36();	
	}
	
	public static void TailPrint_k36() {		//���ϰ��� ���� �Լ� ����
		if ((j_k36+1-personPerPage_k36) % personPerPage_k36 == 0){
			System.out.printf("=============================================\n");	//���м� ���
			System.out.printf("����������\n");
			System.out.printf("%s%16d%6d%6d%6d%6d\n", "�հ�", ksum_k36, esum_k36, msum_k36, ssum_k36, asum_k36);
			System.out.printf("%s%16d%6d%6d%6d%6d\n", "���", ksum_k36/personPerPage_k36, esum_k36/personPerPage_k36,
					msum_k36/personPerPage_k36, ssum_k36/personPerPage_k36, asum_k36/personPerPage_k36);		
					//������������ �հ踦 �������� �Ҵ��ο����� �������ָ� ������������ ��հ��� ���´�
			System.out.printf("=============================================\n");	//���м� ���
			System.out.printf("����������\n");
			System.out.printf("%s%16d%6d%6d%6d%6d\n", "�հ�", sumkor_k36, sumeng_k36, summat_k36, sumsum_k36, sumave_k36);
			System.out.printf("%s%16d%6d%6d%6d%6d\n\n\n", "���", sumkor_k36 / (j_k36+1), sumeng_k36 / (j_k36+1),
					summat_k36 / (j_k36+1), sumsum_k36 / (j_k36+1), sumave_k36 / (j_k36+1));
					//�� �հ踦 j+1�� �������ָ� 0���� j��°������(ȭ��󿡼� 1���� j+1��°) �л����� ��հ��� ���´�
		} else if (j_k36 == iPerson_k36-1) {
			System.out.printf("=============================================\n");	//���м� ���
			System.out.printf("����������\n");	//���� ���
			System.out.printf("%s%16d%6d%6d%6d%6d\n", "�հ�", ksum_k36, esum_k36, msum_k36, ssum_k36, asum_k36);
			System.out.printf("%s%16d%6d%6d%6d%6d\n", "���", ksum_k36 / (iPerson_k36 - ((count_k36-1) * personPerPage_k36)),
					esum_k36/(iPerson_k36 - ((count_k36-1) * personPerPage_k36)), msum_k36/(iPerson_k36 - ((count_k36-1) * personPerPage_k36)),
					ssum_k36/(iPerson_k36 - ((count_k36-1) * personPerPage_k36)), asum_k36/(iPerson_k36 - ((count_k36-1) * personPerPage_k36)));		
					//������������ �հ踦 ��ü�ο���-((��������-1)*�������� �ο���) �� �������ָ� 
					//�������������� ��հ��� ���´�
			System.out.printf("=============================================\n");	//���м� ���
			System.out.printf("����������\n");	//���� ���
			System.out.printf("%s%16d%6d%6d%6d%6d\n", "�հ�", sumkor_k36, sumeng_k36, summat_k36, sumsum_k36, sumave_k36);
			System.out.printf("%s%16d%6d%6d%6d%6d\n\n\n", "���", sumkor_k36 / (j_k36+1), sumeng_k36 / (j_k36+1),
					summat_k36 / (j_k36+1), sumsum_k36 / (j_k36+1), sumave_k36 / (j_k36+1));
					//�� �հ踦 j+1�� �������ָ� 0���� j��°������(ȭ��󿡼� 1���� j+1��°) �л����� ��հ��� ���´�
		} 
	}
 }
