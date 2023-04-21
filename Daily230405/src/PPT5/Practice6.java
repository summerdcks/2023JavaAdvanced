package PPT5;
import java.time.LocalDateTime;
import java.text.DecimalFormat;
import java.time.format.DateTimeFormatter;

public class Practice6 {
//�̸�Ʈ
	public static void main(String[] args) {
		
		String [] itemname = {"4�� ���� ���� ���� Ʈ���� 50hp", "CJ �޹ݼܹ� ���� 200g","[��귣��] ĥ�� ���� 400g","����ũ ������������ ����Ƣ��700g","����ũ ���� ��ٷο�500g",
				"[�������]���� ���ڸ� (138g*2��)","[��귣��] �׸� �߰����� 140g", "��ī�ݶ����� 1.5LX2", "��ȣ��(��)","(A)�ĸӽ��� �����(��)",
				"��귣�� �¸�� �¹�ũ 1L","[���] �ø��� ¥�İ�Ƽ (140gx5��)","��귣�� ������κ�300g*2��","[�����]�̸��� 10kg_����","������ ������Ʈ(�Ҹ����ӱ�&��������)",
				"����������û�ұ� Ư����(�κ�/��ƽ/����û�ұ� ��)","�ѱ��ݰŷ��Ұ��� 3.75g","[�����ǸŰ� 50,000��] �귣���� �̱� Ư�� �� ��� ���� ������ 100ĸ��",
				"�帮�� L10s Ultra ���ο� �κ�û�ұ� + �Ǽ��縮 ŰƮ ����","LG��Ʈ��HD TV �������� 86UQ8300ENA (217cm)",
				"[LG����] LG ����� ����� �������÷��� T873MKE111 (870L)(�����)","[5/11�������]����ġ ������ ���� Ƽ� ���� �� ŷ��",
				"[���߶���] 2002 �������� �ȭ ML2002RC","���� �ູ�̿� �����ġ 10kg","[�س��̼�]�������� 2022�� �� �񸶴� 10kg",
				"��ɹ��� 1L 36��","�ٳ��̳� ������ ��ô��� 2.5kg 12����","���׺�� ���� ����丶�� 2kg (500g x 4��)","�޹� 210g X36��",
				"[CJ�����]ī����� 900ML x 4","[CJ�����]����̿��� 500g x 10","�긮������22���� V300-8 ��ƿ���̾�Ʈ(8���̾�(5~SW), NS PRO950 Neo R/S)"};
		int [] price = {79010481,4680,6980,8980,8480,2750,2380,4580,1980,3180,1790,4880,3280,29900,81000,349000,449600,38900,1399000,2863700,2086200,74800,209000,
				48900,112200,22300,21800,30900,41940,32000,54800,1550000};
		int [] num = {1,1,3,2,3,20,30,5,5,2,2,12,2,1,2,1,10,7,1,1,8,3,1,3,1,1,1,1,1,2,3,1};
		boolean [] taxfree = {false,false,false,false,false,false,false,false,true,true,false,false,false,true,false,false,false,false,false,false,false,false,false,false,true,false,true,true,false,false,false,false};
		
		
		
		int iTaxFree_k36 = 0;	//�鼼ǰ��
		int iNonTaxFree_k36 = 0; 	//����ǰ��
		int iNum_k36 = 0;	//��ǰ�����
		
		
		
		for(int a = 0; a < itemname.length; a++) {								
			
			if(taxfree[a] == true) {
				iTaxFree_k36 = iTaxFree_k36 + price[a] * num[a];	//�鼼ǰ��
			}
			
			if(taxfree[a] == false) {
				iNonTaxFree_k36 = iNonTaxFree_k36 + price[a] * num[a];	//����ǰ��
			}
			
			iNum_k36++;	//��ǰ�����
			
		}
						
		double iTaxRate_k36 = 0.1;	//������
		
		int k36_netprice = k36_netprice(iNonTaxFree_k36, iTaxRate_k36);	//k36_netprice�Լ��� static�̹Ƿ� main���� ��ü���� ���� ȣ���� �� ����
		
		int iTax_k36 = iNonTaxFree_k36 - k36_netprice;	//���� = �Һ��ڰ��� - ��������, ���������� ���������Ƿ� ������ �ø��� �ȴ�
		
		int iPrice =iTaxFree_k36  + k36_netprice + iTax_k36;
		
	
		
		LocalDateTime currentDateTime = LocalDateTime.now();
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		String formattedDateTime1 = currentDateTime.format(formatter1);
		
		DecimalFormat df_k36 = new DecimalFormat("###,###,###,###,###");

		
		//��½���

		System.out.printf("%34s\n", "�̸�Ʈ ������ (031)888-1234");
		System.out.printf("%9s%20s\n","emart", "206-85-50913 ����");
		System.out.printf("%28s\n", "���� ������ ������� 552");
		System.out.printf("������ �������� ��ȯ/ȯ�� �Ұ�\n");
		System.out.printf("�����ǰ�� ����, 30�� �̳�(�ż� 7��)\n");
		System.out.printf("���Ϻ� �귣����� ����(���� ����������)\n");
		System.out.printf("��ȯ/ȯ�� ���������� ����(����ī�� ����)\n");
		System.out.printf("\n");
		System.out.printf("[�� ��]" + formattedDateTime1 + "%18s\n", "POS:0011-9861");
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%11s%12s%3s%5s\n", "�� ǰ ��", "�� ��", "����", "�� ��");
		
	
		
		for(int i = 0; i < itemname.length ; i++) {
			
			if(i % 5 == 0) {
				System.out.printf("-----------------------------------------\n");
			}
		
			
			if(taxfree[i] == true) {
				System.out.printf("* ");
			} else {
				System.out.printf("  ");
			}
					
			byte [] ibytes = itemname[i].getBytes();
			
			
			if(ibytes.length == 14) {
				
				String ii = itemname[i];
				
				System.out.printf("%7s%11s%3s%11s\n", ii, df_k36.format(price[i]), num[i], df_k36.format(price[i]*num[i]));	
				
			} else if(ibytes.length > 14) {
				
				String ii = cutString(itemname[i], 14);	
				
				byte [] iibytes = ii.getBytes();
	             
				if(iibytes.length < 14) {
					
					System.out.printf("%7s%12s%3s%11s\n", ii, df_k36.format(price[i]), num[i], df_k36.format(price[i]*num[i]));
					
				} else {
				
					System.out.printf("%7s%11s%3s%11s\n", ii, df_k36.format(price[i]), num[i], df_k36.format(price[i]*num[i]));					
				
				}
			} else {
				String ii = itemname[i];
				for(int a = ibytes.length; a <= 14; a++) {
									
					ii = ii + " ";
							
				}
				System.out.printf("%7s%10s%3s%11s\n", ii, df_k36.format(price[i]), num[i], df_k36.format(price[i]*num[i]));	
			}
			
		}
		
		System.out.printf("\n%22s%14s\n", "�� ǰ�� ����", iNum_k36 );
		System.out.printf("%23s%14s\n", "(*)�� ��  �� ǰ", df_k36.format(iTaxFree_k36));
		System.out.printf("%23s%14s\n", "�� ��  �� ǰ", df_k36.format(k36_netprice));
		System.out.printf("%24s%14s\n", "��   ��   ��", df_k36.format(iTax_k36));
		System.out.printf("%25s%14s\n", "��        ��", df_k36.format(iPrice));
		System.out.printf("%s%24s\n","�� �� �� �� �� ��", df_k36.format(iPrice));
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%s%28s\n", "0012 KEB �ϳ�","541707**0484/36860658");
		System.out.printf("%s%15s%11s\n", "ī�����(IC)", "�Ͻú� / ", df_k36.format(iPrice));		
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%23s","[�ż�������Ʈ ����]\n");	
		System.out.printf("ȫ*�� ������ ����Ʈ ��Ȳ�Դϴ�.\n");
		System.out.printf("��ȸ�߻�����Ʈ%17s%10s\n", "9530**9995", df_k36.format(iPrice/1000));
		System.out.printf("����(����)����Ʈ%15s%10s\n", df_k36.format((iPrice/1000) + 5473), "(   5,473)");
		System.out.printf("*�ż�������Ʈ ��ȿ�Ⱓ�� 2���Դϴ�.\n");
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%22s", "���űݾױ��� ���������ð� �ڵ��ο�\n");
		System.out.printf("%s%29s\n", "������ȣ : ", "34��****");

		LocalDateTime refundDate = currentDateTime.minusHours(3);	
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String formattedDateTime2 = refundDate.format(formatter2);
		
		System.out.printf("%s%30s\n", "�����ð� : ", formattedDateTime2);	//�����ð��� 3�ð� ��
		System.out.printf("-----------------------------------------\n");
		System.out.printf("ĳ��:084299 ��00%25s\n", "1150");
		System.out.printf("   ||||||||||||||||||||||||||||||||||||\n");
		System.out.printf("   ||||||||||||||||||||||||||||||||||||\n");
		
		DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("yyyyMMdd");
		String formattedDateTime3 = currentDateTime.format(formatter3);
		
		System.out.printf("%14s%s\n", formattedDateTime3,"/00119861/00164980/31");
		
	}
	public static int k36_netprice(int k36_price, double k36_rate) {	//������ �Һ��ڰ���, �Ҽ��� ������ �޾� ������ ���������� ��ȯ�ϴ� �Լ�
		return (int)(k36_price / (1 + k36_rate));	//���������� �ϸ� ���������� ������ �ȴ�
	}
	

	public static String cutString(String str, int len) { 

		  byte[] by = str.getBytes();
		  int count = 0;
		  try  {
		       for(int i = 0; i < len; i++) {

		            if((by[i] & 0x80) == 0x80) count++; // �ٽ� �ڵ�

		       }

		       if((by[len - 1] & 0x80) == 0x80 && (count % 2) == 1) len--; // �ٽ��ڵ�

		       return new String(by, 0, len);   

		  }
		  catch(java.lang.ArrayIndexOutOfBoundsException e)
		  {
		       System.out.println(e);
		       return "";
		  }

		} 
	
}
