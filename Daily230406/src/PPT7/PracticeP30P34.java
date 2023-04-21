package PPT7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class PracticeP30P34 {	//Ŭ���� ����
	
	public static void main(String[] args) {	//�����Լ� ����
		dataSet_k36();	//�����ͼ���
		dataSort_k36();	//����������
		HeaderPrint_k36();	//����μ�		
		for(int i_k36 = 0; i_k36 < ArrayOneRec_k36.size(); i_k36++) {	
			//ArrayOneRec�� 0��°���� ��������° �������� for���� ����
			ItemPrint_k36(i_k36);	//�����μ�
		}
		TailPrint_k36();	//�����μ�
	}
	
	static ArrayList<OneRec> ArrayOneRec_k36 = new ArrayList<OneRec>();
	//OneRec��ü�� ������ �ϴ� ArrayList������ ArrayOneRec�� �����ϰ� �ν��Ͻ��� �����Ѵ�
	
	//�հ�� ��� ���⿡ ����� ������ �������� �����ϰ� 0���� �ʱ�ȭ�Ѵ�
	static int sumkor_k36 = 0;
	static int sumeng_k36 = 0;
	static int summat_k36 = 0;
	static int sumsum_k36 = 0;
	static int sumave_k36 = 0;
	
	static final int iPerson_k36 = 20;
	//���ο����� ������ �ʴ� final ������ ������ �����Ѵ�
	
	public static void dataSet_k36() {		//���ϰ��� ���� �Լ� ����
		for(int i_k36 = 0; i_k36 < iPerson_k36; i_k36++) {		//���ο�����ŭ
			String name_k36 = String.format("ȫ��%02d", i_k36); //�̸������
			int kor_k36 = (int)(Math.random() * 100);	//�������� �����
			int eng_k36 = (int)(Math.random() * 100);	//�������� �����
			int mat_k36 = (int)(Math.random() * 100);	//�������� �����
			ArrayOneRec_k36.add(new OneRec(i_k36, name_k36, kor_k36, eng_k36, mat_k36));
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
		System.out.printf("***************************************\n");	//���м� ���
		System.out.printf("%2s %4s %2s %2s %2s %2s  %3s\n", "��ȣ", "�̸�", "����", "����", "����", "�հ�", "���");
		//���ڿ� 6���� ���� �Ҵ�� �ڸ��� ���ʴ�� ���
		System.out.printf("***************************************\n");	//���м� ���
	} 

	public static void ItemPrint_k36(int i_k36) {		//������ �Է¹ް� ���ϰ��� ���� �Լ� ����
		OneRec rec_k36;	//OneRedŬ���� ������ ��ü rec�� ����
		
		rec_k36 = ArrayOneRec_k36.get(i_k36);
		//ArrayOneRec����Ʈ���� j��° OneRec ��ü�� �����ͼ� rec������ �����Ѵ�
		System.out.printf("%4d %4s %4d %4d %4d %4d %6.2f\n", rec_k36.student_id(), rec_k36.name_k36(), rec_k36.kor_k36(),
				rec_k36.eng_k36(), rec_k36.mat_k36(), rec_k36.sum_k36(), rec_k36.ave_k36());
		//rec��� �̸��� OneRec��ü�� �� �Լ��� ��ȯ���� ������ �ڸ��� ���ʴ�� ����Ѵ� ������ ������ ��������ȯ�Ͽ� ����Ѵ�
		
		//�հ�� ����� �����ϱ� ���� 0��°���� i��°���� ���ʴ�� �������� ���س�����
		sumkor_k36 += rec_k36.kor_k36();
		sumeng_k36 += rec_k36.eng_k36();
		summat_k36 += rec_k36.mat_k36();
		sumsum_k36 += rec_k36.sum_k36();
		sumave_k36 += rec_k36.ave_k36();	
	}
	
	public static void TailPrint_k36() {		//���ϰ��� ���� �Լ� ����
		System.out.printf("***************************************\n");	//���м� ���
		//�� ������ �հ踦 ������, �� ���� ArrayOneRec�� ������ �� ��ü�� ����ŭ ���� ��հ��� �Ǽ�����ȯ�Ͽ� ������ش�
		System.out.printf("�����հ� %d  �������: %6.2f\n", sumkor_k36, sumkor_k36 / (double)ArrayOneRec_k36.size());
		System.out.printf("�����հ� %d  �������: %6.2f\n", sumeng_k36, sumeng_k36 / (double)ArrayOneRec_k36.size());
		System.out.printf("�����հ� %d  �������: %6.2f\n", summat_k36, summat_k36 / (double)ArrayOneRec_k36.size());
		System.out.printf("***************************************\n");	//���м� ���
		System.out.printf("������հ� %d  �����: %6.2f\n", sumave_k36, sumave_k36 / (double)ArrayOneRec_k36.size());	
		//����� �հ踦 ������, �� ���� ArrayOneRec�� ������ �� ��ü�� ����ŭ ���� ��հ��� �Ǽ�����ȯ�Ͽ� ������ش�
	}
 }
