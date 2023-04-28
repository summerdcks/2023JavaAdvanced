package PPT8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class PracticeP8 {

	public static void main(String[] args) throws IOException {
		File f_k36 = new File("C:\\Users\\DataSWB\\Desktop\\�������������������.txt");
		//�ش� ����� ������ ��ü�� ����
		BufferedReader br_k36 = new BufferedReader(new FileReader(f_k36));
		//��ü br�� �����ϸ� f�� FileReader�� BufferedReader�� �����ϸ� ����
		
		String readtxt_k36;	//���ڿ� ���� ����
		
		if((readtxt_k36 = br_k36.readLine()) == null) {	//���Ͽ� �о ������ ������
			System.out.printf("�� �����Դϴ�\n");	//�ش繮�� ���
			return;		//�����Լ� ����
		}
		String[] field_name_k36 = readtxt_k36.split("\t");
		//�о���� ����(����)�� \t�������� ������ ���ڿ��迭�� �����
		
		//������� ����,�浵�� �Ǽ��� ������ ����
		double lat_k36 = 37.3860521;
		double lng_k36 = 127.1214038; 
		
		//�ּҰŸ�, �ִ�Ÿ��� ���ϱ� ���� �Ǽ��� ���� ����
		double min_k36 = Double.MAX_VALUE;
		double max_k36 = Double.MIN_VALUE;
			
		//�ּ�, �ִ�Ÿ��� ���� �����Ͱ� ������ ���� ���ڿ��� �迭 ����
		String[] min__k36 = {};
		String[] max__k36 = {};
		
		int LineCnt_k36 = 1;	//�׸񰹼� ǥ�� ���� ������ ���� ����
		while((readtxt_k36 = br_k36.readLine()) != null) {	//���̻� ���� ������ ���� ������ �ݺ�
			String[] field_k36 = readtxt_k36.split("\t");
			//�о���� ����(����)�� \t�������� ������ ���ʴ�� ���ڿ��迭 field�� �����
			System.out.printf("**[%d��° �׸�]**********************\n", LineCnt_k36);	//���
			System.out.printf("%s : %s\n", field_name_k36[9], field_k36[9]);	//���θ��ּ�
			System.out.printf("%s : %s\n", field_name_k36[10], field_k36[10]);	//�����ּ�
			System.out.printf("%s : %s\n", field_name_k36[13], field_k36[13]);	//�����ּ�
			System.out.printf("%s : %s\n", field_name_k36[14], field_k36[14]);	//�浵�ּ�
			double dist_k36 = Math.sqrt(Math.pow(Double.parseDouble(field_k36[13]) - lat_k36, 2)
					+ Math.pow(Double.parseDouble(field_k36[14]) - lng_k36, 2));	
			//��Ÿ��� ���� : �Ÿ�^2 = (����-��������)^2 + (�浵-����浵)^2 
			System.out.printf("���������� �Ÿ� : %f\n", dist_k36);
			if(dist_k36 <= min_k36) {	//���� �����Ͱ� �ּҰŸ��� ��			
				min__k36 = field_k36;	//�ش� �����͸� min�迭�� ��������
			}
			if(dist_k36 >= max_k36) {	//���� �����Ͱ� �ִ�Ÿ��� ��			
				max__k36 = field_k36;	//�ش� �����͸� max�迭�� ��������
			}
			min_k36 = Math.min(min_k36, dist_k36);	//�ּҰŸ� ������Ʈ
			max_k36 = Math.max(max_k36, dist_k36);	//�ִ�Ÿ� ������Ʈ
			System.out.printf("************************************\n");	//���
			
			LineCnt_k36++;	//���ٱ��� �о����� +1�� ǥ��
		}	
		System.out.printf("**[�ּҰŸ�]**************************\n");	//���
		System.out.printf("%s : %s\n", field_name_k36[2], min__k36[2]);		//��Ҹ�
		System.out.printf("%s : %s\n", field_name_k36[9], min__k36[9]);		//���θ��ּ�
		System.out.printf("%s : %s\n", field_name_k36[10], min__k36[10]);	//�����ּ�
		System.out.printf("%s : %s\n", field_name_k36[13], min__k36[13]);	//�����ּ�
		System.out.printf("%s : %s\n", field_name_k36[14], min__k36[14]);	//�浵�ּ�
		System.out.printf("�ּҰŸ� : %f\n", min_k36);
		System.out.printf("************************************\n");	//���
				
		System.out.printf("**[�ִ�Ÿ�]**************************\n");	//���
		System.out.printf("%s : %s\n", field_name_k36[2], max__k36[2]);		//��Ҹ�
		System.out.printf("%s : %s\n", field_name_k36[9], max__k36[9]);		//���θ��ּ�
		System.out.printf("%s : %s\n", field_name_k36[10], max__k36[10]);	//�����ּ�
		System.out.printf("%s : %s\n", field_name_k36[13], max__k36[13]);	//�����ּ�
		System.out.printf("%s : %s\n", field_name_k36[14], max__k36[14]);	//�浵�ּ�	
		System.out.printf("�ִ�Ÿ� : %f\n", max_k36);
		System.out.printf("************************************\n");	//���
		
		br_k36.close();	//���� �ݱ�
	}
}
