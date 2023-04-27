package kr.ar.kopo.ctc.kopo36;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import kr.ac.kopo.ctc.kopo36.dao.WifiItemDao;
import kr.ac.kopo.ctc.kopo36.domain.WifiItem;
import kr.ac.kopo.ctc.kopo36.service.WifiItemService;

public class WifiMain {	//����Ŭ���� ����

	public static void main(String[] args) throws IOException {	//�����Լ� ����
		System.out.println("wifi project");	//�ش繮�� ���
		
		WifiItemService wifiItemService_k36 = new WifiItemService();	//WifiItemService������ ��ü wifiItemService ����
		WifiItemDao wifiItemDao_k36 = new WifiItemDao();	//WifiItemDao������ ��ü wifiItemDao ����
		List<WifiItem> wifiItems_k36 = wifiItemDao_k36.selectAll();	
		//WifiItem������ ��ü�� ������ �� List������ ��ü wifiItems�� �����ϸ�
		//wifiItemDao��ü�� selectAll �޼ҵ��� ���ϰ��� �Ҵ����ش�
		
		WifiItem me_k36 = new WifiItem();	//WifiItem������ ��ü me ����
		me_k36.setLatitude_k36(37.3860521);	//me��ü�� set�޼ҵ带 �̿��Ͽ� Latitude������ ���� �Ҵ����ش�
		me_k36.setLongitude_k36(127.1214038);	//me��ü�� set�޼ҵ带 �̿��Ͽ� Longitude������ ���� �Ҵ����ش�
		
		WifiItem min_k36 = new WifiItem();	//�ּҰŸ��� ���� ��ü���� �������� WifiItem������ ��ü min ����
		WifiItem max_k36 = new WifiItem();	//�ִ�Ÿ��� ���� ��ü���� �������� WifiItem������ ��ü max ����
		
		//�ּҰŸ�, �ִ�Ÿ��� ���ϱ� ���� �Ǽ��� ���� ����
		double minn_k36 = Double.MAX_VALUE;
		double maxx_k36 = Double.MIN_VALUE;
		
		for (WifiItem target_k36: wifiItems_k36) {	
			//wifiItem ��ü�迭�� �������� target������ �����ϸ� �ϳ��� ���ʴ�� ������ ���캸�� for each��
			double d_k36 = wifiItemService_k36.getDistance_k36(me_k36, target_k36);	
			//wifiItemServicer��ü�� getDistance�޼ҵ忡 me�� target��ü�� ������ ���ϰ��� �Ǽ��� d�� �Ҵ����ش�
			//������ġ�� �����ġ�� ������ �浵���� ����Ͽ� ������������ �Ÿ��� �������ش�
			if(minn_k36 >= d_k36) {		//�ش�Ÿ��� �ּҰŸ����� ������
				min_k36 = target_k36;	//min��ü�� ���� ���캸�� �ִ� ��ü�� �Ҵ�
			}
			if(maxx_k36 <= d_k36) {		//�ش�Ÿ��� �ִ�Ÿ����� ũ��
				max_k36 = target_k36;	//max��ü�� ���� ���캸�� �ִ� ��ü�� �Ҵ�
			}
			minn_k36 = Math.min(minn_k36, d_k36);	//�ּҰŸ� ������Ʈ
			maxx_k36 = Math.max(maxx_k36, d_k36);	//�ִ�Ÿ� ������Ʈ
		}		
			System.out.printf("**[�ּҰŸ�]**************************\n");	//���
			//min��ü�� �Ҵ�Ǿ� �ִ� ���������� ���ʴ�� ������ش�
			System.out.printf("��ġ��һ� : %s\n", min_k36.getInstallationLocationDetails_k36());	//��Ҹ�
			System.out.printf("���������θ��ּ� : %s\n", min_k36.getRoadNameAddress_k36());		//���θ��ּ�
			System.out.printf("�����������ּ� : %s\n", min_k36.getLotNumberAddress_k36());	//�����ּ�
			System.out.printf("WGS84���� : %f\n", min_k36.getLatitude_k36());	//�����ּ�
			System.out.printf("WGS84�浵 : %f\n", min_k36.getLongitude_k36());	//�浵�ּ�
			System.out.printf("�ּҰŸ� : %f\n", minn_k36);
			System.out.printf("************************************\n");	//���
			//max��ü�� �Ҵ�Ǿ� �ִ� ���������� ���ʴ�� ������ش�
			System.out.printf("**[�ִ�Ÿ�]**************************\n");	//���
			System.out.printf("��ġ��һ� : %s\n", max_k36.getInstallationLocationDetails_k36());	//��Ҹ�
			System.out.printf("���������θ��ּ� : %s\n", max_k36.getRoadNameAddress_k36());		//���θ��ּ�
			System.out.printf("�����������ּ� : %s\n", max_k36.getLotNumberAddress_k36());	//�����ּ�
			System.out.printf("WGS84���� : %f\n", max_k36.getLatitude_k36());	//�����ּ�
			System.out.printf("WGS84�浵 : %f\n", max_k36.getLongitude_k36());	//�浵�ּ�	
			System.out.printf("�ִ�Ÿ� : %f\n", maxx_k36);
			System.out.printf("************************************\n");	//���			
	}
}
