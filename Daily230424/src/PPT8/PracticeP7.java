package PPT8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class PracticeP7 {

	public static void main(String[] args) throws IOException {
		File f_k36 = new File("C:\\Users\\DataSWB\\Desktop\\�������������������.csv");
		//�ش� ����� ������ ��ü�� ����
		BufferedReader br_k36 = new BufferedReader(new FileReader(f_k36));
		//��ü br�� �����ϸ� f�� FileReader�� BufferedReader�� �����ϸ� ����
		
		String readtxt_k36;	//���ڿ� ���� ����
		
		if((readtxt_k36 = br_k36.readLine()) == null) {	//���Ͽ� �о ������ ������
			System.out.printf("�� �����Դϴ�\n");	//�ش繮�� ���
			return;
		}
		String[] field_name_k36 = readtxt_k36.split(",");
		//�о���� ����(����)�� \t�������� ������ ���ڿ��迭�� �����
		
		int LineCnt_k36 = 0;	//�׸񰹼� ǥ�� ���� ������ ���� ����
		while((readtxt_k36 = br_k36.readLine()) != null) {	//���̻� ���� ������ ���� ������ �ݺ�
			String[] field_k36 = readtxt_k36.split(",");
			//�о���� ����(����)�� ,�������� ������ ���ʴ�� ���ڿ��迭 field�� �����
			System.out.printf("**[%d��° �׸�]**********************\n", LineCnt_k36);	//���
			for(int j_k36 = 0; j_k36 < field_name_k36.length; j_k36++) {	
				System.out.printf("%s : %s\n", field_name_k36[j_k36], field_k36[j_k36]);
				//�� �迭�� j�� �ε����� ����� ������ ���ʴ�� ���
			}
			System.out.printf("************************************\n");	//���
			if(LineCnt_k36 == 100) break;	//������ 100��°�ٱ��� count�Ǹ� �ݺ��� ����
			LineCnt_k36++;	//���ٱ��� �о����� +1�� ǥ��
		}
	br_k36.close();	//���� �ݱ�
	}
}