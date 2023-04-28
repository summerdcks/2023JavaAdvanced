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
		
		//�ּҰŸ�, �ִ�Ÿ��� ���ϱ� ���� �Ǽ��� ���� ����
		double minn_k36 = Double.MAX_VALUE;
		double maxx_k36 = Double.MIN_VALUE;
		
		//�ּ�, �ִ�Ÿ��� ��ü�� �ε������� ��Ƶ� ������ ���� ����
		int min_k36 = 0;
		int max_k36 = 0;
		
		for (WifiItem target_k36: wifiItems_k36) {	
			//wifiItem ��ü�迭�� �������� target������ �����ϸ� �ϳ��� ���ʴ�� ������ ���캸�� for each��
			double d_k36 = wifiItemService_k36.getDistance_k36(me_k36, target_k36);	
			//wifiItemServicer��ü�� getDistance�޼ҵ忡 me�� target��ü�� ������ ���ϰ��� �Ǽ��� d�� �Ҵ����ش�
			//������ġ�� �����ġ�� ������ �浵���� ����Ͽ� ������������ �Ÿ��� �������ش�
			if(minn_k36 >= d_k36) {		//�ش�Ÿ��� �ּҰŸ����� ��������
				min_k36 = target_k36.getId_k36();	//�ε�����ȣ
			}
			if(maxx_k36 <= d_k36) {		//�ش�Ÿ��� �ִ�Ÿ����� ũ��
				max_k36 = target_k36.getId_k36();	//�ε�����ȣ		
			}
			minn_k36 = Math.min(minn_k36, d_k36);	//�ּҰŸ� ������Ʈ
			maxx_k36 = Math.max(maxx_k36, d_k36);	//�ִ�Ÿ� ������Ʈ
			
			wifiItemService_k36.printAll_k36(target_k36, d_k36);	//��� �׸� ���ʴ�� ���
			
		}		
		
			System.out.printf("**[�ּҰŸ�]**************************\n");	//���
			//wifiItems��ü�� min��° ��ü�� ���������� ���ʴ�� ������ش�
			System.out.printf("%s : %s\n", wifiItems_k36.get(min_k36).getFieldName_k36()[2], wifiItems_k36.get(min_k36).getInstallationLocationDetails_k36());	//��Ҹ�
			System.out.printf("%s : %s\n", wifiItems_k36.get(min_k36).getFieldName_k36()[9], wifiItems_k36.get(min_k36).getRoadNameAddress_k36());		//���θ��ּ�
			System.out.printf("%s : %s\n", wifiItems_k36.get(min_k36).getFieldName_k36()[10], wifiItems_k36.get(min_k36).getLotNumberAddress_k36());	//�����ּ�
			System.out.printf("%s : %f\n", wifiItems_k36.get(min_k36).getFieldName_k36()[13], wifiItems_k36.get(min_k36).getLatitude_k36());	//�����ּ�
			System.out.printf("%s : %f\n", wifiItems_k36.get(min_k36).getFieldName_k36()[14], wifiItems_k36.get(min_k36).getLongitude_k36());	//�浵�ּ�
			System.out.printf("���������� �Ÿ� : %f\n", minn_k36);
			System.out.printf("************************************\n");	//���
			//wifiItems��ü�� max��° ��ü�� ���������� ���ʴ�� ������ش�
			System.out.printf("**[�ִ�Ÿ�]**************************\n");	//���
			System.out.printf("%s : %s\n", wifiItems_k36.get(max_k36).getFieldName_k36()[2],  wifiItems_k36.get(max_k36).getInstallationLocationDetails_k36());	//��Ҹ�
			System.out.printf("%s : %s\n", wifiItems_k36.get(max_k36).getFieldName_k36()[9], wifiItems_k36.get(max_k36).getRoadNameAddress_k36());		//���θ��ּ�
			System.out.printf("%s : %s\n", wifiItems_k36.get(max_k36).getFieldName_k36()[10], wifiItems_k36.get(max_k36).getLotNumberAddress_k36());	//�����ּ�
			System.out.printf("%s : %f\n", wifiItems_k36.get(max_k36).getFieldName_k36()[13], wifiItems_k36.get(max_k36).getLatitude_k36());	//�����ּ�
			System.out.printf("%s : %f\n", wifiItems_k36.get(max_k36).getFieldName_k36()[14], wifiItems_k36.get(max_k36).getLongitude_k36());	//�浵�ּ�	
			System.out.printf("���������� �Ÿ� : %f\n", maxx_k36);
			System.out.printf("************************************\n");	//���			
	}
}
