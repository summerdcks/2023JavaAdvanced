package PPT5;
import java.time.LocalDateTime;
import java.text.DecimalFormat;
import java.time.format.DateTimeFormatter;

public class Practice5 {
//���̼ҽǽ�(1)������
	public static void main(String[] args) {
		
		
		String a = "ǻ��� �����ܿ븶��ũ(�ְ����)";
		String b = "�����̵�ĸ���(������) (100ȣ)";
		String c = "�������� ���׸�����ũ(�˷�̴�Ÿ��)";
		byte[] aa = a.getBytes();
		byte[] bb = b.getBytes();
		byte[] cc = c.getBytes();
		String aaa = new String(aa,0,26);
		String bbb = new String(bb,0,26);
		String ccc = new String(cc,0,26);
		
		if(aa_k36.length >= 22) {	//���� a���ڿ��� ����Ʈ���� 22���� ũ�ų� ���ٸ�
			String aaaa_k36 = cutString_k36(aaa_k36, 22);	
			//outString �޼ҵ带 �̿��Ͽ� ǰ����� 14����Ʈ���� �߶󳻾� ���ڿ� ������ �����Ѵ� 
			byte [] ibytes_k36 = aaaa_k36.getBytes();
            //�߶� ���ڿ��� �ٽ� ����Ʈ������ �߶� ����Ʈ�迭�� ��´�
			
			if(ibytes_k36.length < 22) {
				//�߶� ���ڿ��� 22���� ���� ���(���ڿ����� �߸� �������κ��� �ѱ��� ��� ��ȯ�Ǵ� ���ڿ��� 13����Ʈ�� �ȴ�)
				
				aaaa_k36 = aaaa_k36 + " ";
				
			} else {								
					
			}
		} else {					//���� a���ڿ��� ����Ʈ���� 22���� �۴ٸ�
			aaa_k36 = a_k36;		//�ش� ���ڿ��� �״�� ���ڿ����� aaa�� �Ҵ��Ѵ�
			for(int i_k36 = aa_k36.length; i_k36 < 22; i_k36++) {	//�� ��� �ش� ���ڿ��� 22����Ʈ�� �� ������
				aaa_k36 = aaa_k36 + " ";							//���⸦ �̾�ٿ��ش�
			}
		}
	

		if(bb_k36.length >= 22) {	//���� b���ڿ��� ����Ʈ���� 22���� ũ�ų� ���ٸ�
			String aaaa_k36 = cutString_k36(aaa_k36, 22);	
			//outString �޼ҵ带 �̿��Ͽ� ǰ����� 14����Ʈ���� �߶󳻾� ���ڿ� ������ �����Ѵ� 
		} else {					//���� b���ڿ��� ����Ʈ���� 22���� �۴ٸ�
			bbb_k36 = b_k36;		//�ش� ���ڿ��� �״�� ���ڿ����� bbb�� �Ҵ��Ѵ�
			for(int i_k36 = bb_k36.length; i_k36 < 22; i_k36++) {	//�� ��� �ش� ���ڿ��� 22����Ʈ�� �� ������
				bbb_k36 = bbb_k36 + " ";							//���⸦ �̾�ٿ��ش�
			}
		}
		

		if(cc_k36.length >= 22) {	//���� c���ڿ��� ����Ʈ���� 22���� ũ�ų� ���ٸ�
			String aaaa_k36 = cutString_k36(aaa_k36, 22);	
			//outString �޼ҵ带 �̿��Ͽ� ǰ����� 14����Ʈ���� �߶󳻾� ���ڿ� ������ �����Ѵ� 
		} else {					//���� ca���ڿ��� ����Ʈ���� 22���� �۴ٸ�
			ccc_k36 = c_k36;		//�ش� ���ڿ��� �״�� ���ڿ����� ccc�� �Ҵ��Ѵ�
			for(int i_k36 = cc_k36.length; i_k36 < 22; i_k36++) {	//�� ��� �ش� ���ڿ��� 22����Ʈ�� �� ������
				ccc_k36 = ccc_k36 + " ";							//���⸦ �̾�ٿ��ش�
			}
		}
		
		String itemcode1 = "1031615";
		String itemcode2 = "11008152";
		String itemcode3 = "1020800";
		
		int price1 = 3000;
		int price2 = 1000;
		int price3 = 1000;
		
		int amount1 = 1;
		int amount2 = 1;
		int amount3 = 1;		
		
		int salesPrice = price1*amount1 + price2*amount2 + price3*amount3;
		double iTax_k36 = 0.1;
		 
		System.out.printf("           \"���ΰ���, ���̼�\"\n");
		System.out.printf("(��)�Ƽ����̼�_�д缭����\n");
		System.out.printf("��ȭ:031-702-6016\n");
		System.out.printf("����:���� ������ ���μ�ȯ�� 2748 (���)\n");
		System.out.printf("��ǥ:������,��ȣ�� 213-81-52063\n");
		System.out.printf("����:��⵵ ������ �д籸 �д��53���� 11 (������)\n");
		System.out.printf("=========================================\n");
		System.out.printf("      �Һ����߽ɰ濵(CCM) �������\n");
		System.out.printf("    ISO 9001 ǰ���濵�ý��� �������\n");
		System.out.printf("=========================================\n");
		LocalDateTime currentDateTime = LocalDateTime.now();
		LocalDateTime refundDate = currentDateTime.plusDays(14);
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("MM��dd��");
		String formattedDateTime1 = refundDate.format(formatter1);
		System.out.printf("      ��ȯ/ȯ�� 14��("+formattedDateTime1+")�̳�,\n");
		System.out.printf("(����)������, ����ī�� ��ħ �� ���Ը��忡�� ����\n");
		System.out.printf("    ����/���� �� �Ѽս� ��ȯ/ȯ�� �Ұ�\n");
		System.out.printf("      üũī�� ��� �� �ִ� 7�� �ҿ�\n");
		System.out.printf("=========================================\n");
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
		String formattedDateTime2 = currentDateTime.format(formatter2);
		System.out.printf("%s%27s\n", "[POS 1058231] ", formattedDateTime2);
		System.out.printf("=========================================\n");
		DecimalFormat df_k36 = new DecimalFormat("###,###,###,###,###");
		System.out.printf("%s%7s%2s%6s\n", aaa, df_k36.format(price1), amount1, df_k36.format(price1*amount1));
		System.out.printf("[%s]\n", itemcode1);
		System.out.printf("%s%7s%2s%6s\n", bbb, df_k36.format(price2), amount2, df_k36.format(price2*amount2));
		System.out.printf("[%s]\n", itemcode2);
		System.out.printf("%s%7s%2s%6s\n", ccc, df_k36.format(price3), amount3, df_k36.format(price3*amount3));
		System.out.printf("[%s]\n", itemcode3);
		System.out.printf("%20s%17s\n", "�����հ�", df_k36.format(salesPrice/(1+iTax_k36)));
		System.out.printf("%21s%17s\n", "�ΰ���", df_k36.format((salesPrice-(salesPrice/(1+iTax_k36)))));
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%s%33s\n", "�Ǹ��հ�", df_k36.format(salesPrice));
		System.out.printf("=========================================\n");
		System.out.printf("%s%33s\n", "�ſ�ī��", df_k36.format(salesPrice));
		System.out.printf("-----------------------------------------\n");
		System.out.printf("�츮ī��                 538720**********\n");
		System.out.printf("���ι�ȣ 77982843(0)%7s%10s\n", "���αݾ�",df_k36.format(salesPrice) );
		System.out.printf("=========================================\n");	
		System.out.printf("     " + formattedDateTime2 + " �д缭����\n");
		System.out.printf("��ǰ �� ��Ÿ ���� : 1522-4400\n");
		System.out.printf("����� �� �����̼� ���� ���� : 1599-2211\n");
		System.out.printf("         ||||||||||||||||||||||\n");
		System.out.printf("         ||||||||||||||||||||||\n");
		System.out.printf("            2112820610158231\n");
		System.out.printf("-----------------------------------------\n");
		System.out.printf("�´��̼� ����� �� �Ǵ� Ȩ�������� �����ϼż� ȸ������ �� �پ��� ������ ����������!��\n");
	}

}
