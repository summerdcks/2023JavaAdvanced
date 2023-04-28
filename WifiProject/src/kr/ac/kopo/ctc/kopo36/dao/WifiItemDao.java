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
		List<WifiItem> wifiItems_k36 = new ArrayList<>();	//��ü�迭 items����
		File f_k36 = new File("C:\\Users\\DataSWB\\Desktop\\�������������������.txt");
		//�ش� ����� ������ ��ü�� ����
		BufferedReader br_k36 = new BufferedReader(new FileReader(f_k36));
		//��ü br�� �����ϸ� f�� FileReader�� BufferedReader�� �����ϸ� ����		
		String readtxt_k36;	//���ڿ� ���� ����		
		if((readtxt_k36 = br_k36.readLine()) == null) {	//���Ͽ� �о ������ ������
			System.out.printf("�� �����Դϴ�\n");	//�ش繮�� ���
		}
		
		String[] fieldName_k36 = readtxt_k36.split("\t");
		
		while((readtxt_k36 = br_k36.readLine()) != null) {	//���̻� ���� ������ ���� ������ ���پ� �о���� �ݺ�
			String[] field_k36 = readtxt_k36.split("\t");	//�о�� ���� ���� �������� ���� ���� ���ڿ��� �迭 field ����
			WifiItem wifiItem_k36 = new WifiItem();	//WifiItem������ ��ü a ����
			wifiItem_k36.setId_k36(Integer.parseInt(field_k36[0]));	
			wifiItem_k36.setInstallationLocationName_k36(field_k36[1]);
			//�о�� ���� 0��° ���ڿ��� ������ȯ�Ͽ� a��ü�� set�޼ҵ�� �޾� �ش� ������ ���� ��������
			wifiItem_k36.setInstallationLocationDetails_k36(field_k36[2]);
			wifiItem_k36.setInstallationCityName_k36(field_k36[3]);
			wifiItem_k36.setInstallationDistrictName_k36(field_k36[4]);
			wifiItem_k36.setInstallationFacilityType_k36(field_k36[5]);
			wifiItem_k36.setServiceProviderName_k36(field_k36[6]);
			wifiItem_k36.setWifiSsid_k36(field_k36[7]);
			wifiItem_k36.setDateOfInstallation_k36(field_k36[8]);
			wifiItem_k36.setRoadNameAddress_k36(field_k36[9]);
			wifiItem_k36.setLotNumberAddress_k36(field_k36[10]);
			wifiItem_k36.setManagementAgencyName_k36(field_k36[11]);
			wifiItem_k36.setManagementAgencyPhoneNumber_k36(field_k36[12]);
			wifiItem_k36.setLatitude_k36(Double.parseDouble(field_k36[13]));
			wifiItem_k36.setLongitude_k36(Double.parseDouble(field_k36[14]));
			wifiItem_k36.setCreated_k36(field_k36[15]);
			wifiItem_k36.setFieldName_k36(fieldName_k36);
			//�о�� ���� 14��° ���ڿ��� �Ǽ���ȯ�Ͽ� a��ü�� set�޼ҵ�� �޾� ������ ���� ��������
			wifiItems_k36.add(wifiItem_k36); //���� ����� a��ü�� items��ü�迭�� ������ �����
		}
		return wifiItems_k36;	//���ϳ����� items��ü�迭�� ��� ��� ���� ��������
	}
	
	public WifiItem update(WifiItem wifiItem_k36) {
		return null;
	}

	public WifiItem delete(int id_k36) {
		return null;
	}
}
