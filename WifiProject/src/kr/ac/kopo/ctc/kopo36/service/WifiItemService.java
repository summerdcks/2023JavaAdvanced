package kr.ac.kopo.ctc.kopo36.service;

import java.util.ArrayList;
import java.util.List;

import kr.ac.kopo.ctc.kopo36.domain.WifiItem;

public class WifiItemService {
		public double getDistance_k36(WifiItem me_k36, WifiItem target_k36) {	
			//�ΰ��� ��ü�� �޾ƿ� �Ǽ��� ������ ��ȯ�ϴ� �޼ҵ� ����

			System.out.printf("**[%d��° �׸�]**********************\n", target_k36.getId_k36());	//���
			System.out.printf("���θ��ּ� : %s\n", target_k36.getRoadNameAddress_k36());	//���θ��ּ�
			System.out.printf("�����ּ� : %s\n", target_k36.getLotNumberAddress_k36());	//�����ּ�
			System.out.printf("�����ּ� : %f\n", target_k36.getLatitude_k36());		//�����ּ�
			System.out.printf("�浵�ּ� : %f\n", target_k36.getLongitude_k36());	//�浵�ּ�
			double dist_k36 = Math.sqrt(Math.pow(target_k36.getLatitude_k36() - me_k36.getLatitude_k36(), 2)
					+ Math.pow(target_k36.getLongitude_k36() - me_k36.getLongitude_k36(), 2));	
			//��Ÿ��� ���� : �Ÿ�^2 = (����-��������)^2 + (�浵-����浵)^2 
			System.out.printf("���������� �Ÿ� : %f\n", dist_k36);		
			System.out.printf("************************************\n");	//���				
					
			return dist_k36;	//������������ �Ÿ� ��ȯ
		}
}
