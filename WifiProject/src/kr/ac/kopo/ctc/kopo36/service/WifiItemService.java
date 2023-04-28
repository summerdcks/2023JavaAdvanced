package kr.ac.kopo.ctc.kopo36.service;

import java.util.ArrayList;
import java.util.List;

import kr.ac.kopo.ctc.kopo36.domain.WifiItem;

public class WifiItemService {
		public double getDistance_k36(WifiItem me_k36, WifiItem target_k36) {	
			//�ΰ��� ��ü�� �޾ƿ� �Ǽ��� ������ ��ȯ�ϴ� �޼ҵ� ����
			double dist_k36 = Math.sqrt(Math.pow(target_k36.getLatitude_k36() - me_k36.getLatitude_k36(), 2)
					+ Math.pow(target_k36.getLongitude_k36() - me_k36.getLongitude_k36(), 2));	
			//��Ÿ��� ���� : �Ÿ�^2 = (����-��������)^2 + (�浵-����浵)^2 								
			return dist_k36;	//������������ �Ÿ� ��ȯ
		}
		
		public void printAll_k36(WifiItem target_k36, double d_k36) {		
				//��ü target�� ������������ �Ÿ��� �޾ƿ� ������ִ� �޼ҵ� ����
				System.out.printf("**[%d��° �׸�]**********************\n", target_k36.getId_k36());	//���
				System.out.printf("%s : %s\n", target_k36.getFieldName_k36()[2], target_k36.getInstallationLocationDetails_k36());	//��Ҹ�
				System.out.printf("%s : %s\n", target_k36.getFieldName_k36()[9], target_k36.getRoadNameAddress_k36());	//���θ��ּ�
				System.out.printf("%s : %s\n", target_k36.getFieldName_k36()[10], target_k36.getLotNumberAddress_k36());	//�����ּ�
				System.out.printf("%s : %f\n", target_k36.getFieldName_k36()[13], target_k36.getLatitude_k36());		//�����ּ�
				System.out.printf("%s : %f\n", target_k36.getFieldName_k36()[14], target_k36.getLongitude_k36());	//�浵�ּ�
				System.out.printf("���������� �Ÿ� : %f\n", d_k36);		
				System.out.printf("************************************\n");	//���					
		}
}
