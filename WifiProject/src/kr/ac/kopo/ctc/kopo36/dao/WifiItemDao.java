package kr.ac.kopo.ctc.kopo36.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import kr.ac.kopo.ctc.kopo36.domain.WifiItem;

public class WifiItemDao {
	public WifiItem create(WifiItem wifiItem_k36) {
		return null;
	}
	
	public WifiItem selectOne(int id_k36) {
		return null;
	}
	
	public List<WifiItem> selectAll() throws IOException {	//��ü�迭 ������ �޼ҵ� ����
		List<WifiItem> item_k36 = new ArrayList<>();			//��ü�迭 item����
		File f_k36 = new File("C:\\Users\\DataSWB\\Desktop\\�������������������.txt");
		//�ش� ����� ������ ��ü�� ����
		BufferedReader br_k36 = new BufferedReader(new FileReader(f_k36));
		//��ü br�� �����ϸ� f�� FileReader�� BufferedReader�� �����ϸ� ����		
		String readtxt_k36;	//���ڿ� ���� ����		
		if((readtxt_k36 = br_k36.readLine()) == null) {	//���Ͽ� �о ������ ������
			System.out.printf("�� �����Դϴ�\n");	//�ش繮�� ���
		}
		while((readtxt_k36 = br_k36.readLine()) != null) {	//���̻� ���� ������ ���� ������ ���پ� �о���� �ݺ�
			String[] field_k36 = readtxt_k36.split("\t");	//�о�� ���� ���� �������� ���� ���� ���ڿ��� �迭 field ����
			WifiItem a_k36 = new WifiItem();	//WifiItem������ ��ü a ����
			a_k36.setId_k36(Integer.parseInt(field_k36[0]));	
			//�о�� ���� 0��° ���ڿ��� ������ȯ�Ͽ� a��ü�� set�޼ҵ�� �޾� �ش� ������ ���� ��������
			a_k36.setInstallationLocationDetails_k36(field_k36[2]);
			a_k36.setRoadNameAddress_k36(field_k36[9]);
			a_k36.setLotNumberAddress_k36(field_k36[10]);
			a_k36.setLatitude_k36(Double.parseDouble(field_k36[13]));
			a_k36.setLongitude_k36(Double.parseDouble(field_k36[14]));
			//�о�� ���� 14��° ���ڿ��� �Ǽ���ȯ�Ͽ� a��ü�� set�޼ҵ�� �޾� ������ ���� ��������
			item_k36.add(a_k36); //���� ����� a��ü�� item��ü�迭�� ������ �����
		}
		return item_k36;	//���ϳ����� item��ü�迭�� ��� ��� ���� ��������
	}
	
	public WifiItem update(WifiItem wifiItem_k36) {
		return null;
	}

	public WifiItem delete(int id_k36) {
		return null;
	}
}
