package PPT5;
import java.time.LocalDateTime;
import java.text.DecimalFormat;
import java.time.format.DateTimeFormatter;

public class Practice401 {	//Ŭ���� ����
//�Ѿ��ġ�
	public static void main(String[] args) { //�����Լ� ����
		
		int iPrice_k36= 33000;	//������ ���� iPrice�� �����ϸ� �հ�ݾ��� �ο���
		
		double iTaxRate_k36 = 0.1;	//�Ǽ��� ���� iTax�� �����ϸ� �ΰ��� 0.1�� ���� �ο���
	
		int netprice_k36 = netprice_k36(iPrice_k36, iTaxRate_k36);	//k36_netprice�Լ��� static�̹Ƿ� main���� ��ü���� ���� ȣ���� �� �ִ�
		//����ǰ�񰡿� �������� netprice �Լ����� �޾� ������ ���������� ��ȯ�Ѵ�
		
		int iTax_k36 = iPrice_k36 - netprice_k36;	//�ΰ��� = ����ǰ�� - ��������, ���������� ���������Ƿ� �ΰ����� �ø��� �ȴ�
		
		System.out.printf("\n\n�ſ����\n");
		//�ٹٲ��� �ι� �ϰ� �ſ������ ����� �ٹٲ� ���ش�		
		System.out.printf("�ܸ��� : 2N68665898%18s\n","��ǥ��ȣ : 041218");
		//�ܸ���� �ش簪�� ǥ�����ְ� ��ǥ��ȣ�� �ش簪�� ���ڿ��� �޾� �ο��� �ڸ����� ��� �� �ٹٲ� ���ش�
		System.out.printf("������ : �Ѿ��ġ�\n");
		//������ �Ѿ��ġ��� ǥ�����ְ� �ٹٲ� ���ش�
		System.out.printf("��  �� : ��� ������ �д籸 Ȳ�����351���� 10 , 1��\n");
		//�ּҿ� �ش��ּҸ� ǥ�����ְ� �ٹٲ� ���ش�
		System.out.printf("��ǥ�� : ��â��\n");
		//��ǥ�� ��â���� ǥ�����ְ� �ٹٲ� ���ش�
		System.out.printf("����� : 752-53-00558%20s\n","TEL : 7055695");
		//����ڿ� �ش簪�� ǥ�����ְ� ��ȭ��ȣ�� ���ڿ��� �޾� �ο��� �ڸ����� ��� �� �ٹٲ� ���ش�
		System.out.printf("- - - - - - - - - - - - - - - - - - - - -\n");
		//���ü� ǥ���� �ٹٲ� ���ش�
		DecimalFormat df_k36 = new DecimalFormat("###,###,###,###,###");
		//�ڿ��� ���ڸ����� �޸��� ����ִ� DecimalFormat�Լ��� �ҷ��´�
		System.out.printf("��  �� %31s ��\n", df_k36.format(netprice_k36));
		//�ݾ��� ǥ���ϸ� �������� ���ڿ��� �޾� �ο��� �ڸ����� ��� �� �ٹٲ� ���ش�
		System.out.printf("�ΰ��� %31s ��\n", df_k36.format(iTax_k36));
		//�ΰ����� ǥ���ϸ� �ΰ������� ���ڿ��� �޾� �ο��� �ڸ����� ��� �� �ٹٲ� ���ش�
		System.out.printf("��  �� %31s ��\n", df_k36.format(iPrice_k36));
		//�հ踦 ǥ���ϸ� �հ���� ���ڿ��� �޾� �ο��� �ڸ����� ��� �� �ٹٲ� ���ش�
		System.out.printf("- - - - - - - - - - - - - - - - - - - - -\n");
		//���ü� ǥ���� �ٹٲ� ���ش�
		System.out.printf("�츮ī��\n");
		//�츮ī�带 ǥ���ϰ� �ٹٲ� ���ش�
		System.out.printf("ī���ȣ : 2387-20**-****-4613(S)%5s\n", "�Ͻú�");
		//ī���ȣ�� �ش簪�� ǥ���ϰ� �Ͻú��� ���ڿ��� �޾� �ο��� �ڸ����� ��� �� �ٹٲ� ���ش�
		LocalDateTime currentDateTime_k36 = LocalDateTime.now();
		//LocalDateTime �Լ��� �̿��Ͽ� ����ð��� �ҷ��´�
		DateTimeFormatter formatter_k36 = DateTimeFormatter.ofPattern("yy/MM/dd HH:mm:ss");
		//DateTimeFormatter�Լ��� �̿��Ͽ� ���ϴ� �������� �޾� ���¸� �ο��Ѵ�
		String formattedDateTime_k36 = currentDateTime_k36.format(formatter_k36);
		//�ҷ��� ����ð��� ���ϴ� ���¿� �°� ����� �� �ֵ��� String������ �޴´�
		System.out.printf("�ŷ��Ͻ� : " + formattedDateTime_k36 + "\n");
		//�ŷ��Ͻø� ǥ���ϰ� ����ð��� ���ϴ� ���·� ����� �� �ٹٲ� ���ش�
		System.out.printf("���ι�ȣ : 70404427\n");
		//���ι�ȣ�� �ش簪�� ����ϰ� �ٹٲ� ���ش�
		System.out.printf("�ŷ���ȣ : 357734873739\n");
		//�ŷ���ȣ�� �ش簪�� ����ϰ� �ٹٲ� ���ش�
		System.out.printf("���� : ��ī���%22s\n", "���� : 720068568");
		//���԰� �ش�ī��縦 ǥ���ϰ� ���Ͱ� �ش簪�� ���ڿ��� �ο��� �ڸ����� ��� �� �ٹٲ� ���ش�
		System.out.printf("�˸� : EDC����ǥ\n");
		//�˸��� EDC����ǥ�� ǥ���ϰ� �ٹٲ� ���ش�
		System.out.printf("���� : TEL)1544-4700\n");
		//���Ǹ� ǥ���ϰ� �ش��ȣ�� ����� �� �ٹٲ� ���ش�
		System.out.printf("- - - - - - - - - - - - - - - - - - - - -\n");
		//���ü� ǥ���� �ٹٲ� ���ش�
		System.out.printf("%23s\n", " * �����մϴ� *");
		//�����մϴٸ� ���ڿ��� �޾� �ο��� �ڸ����� ��� �� �ٹٲ� ���ش�
		System.out.printf("%39s\n\n","ǥ��V2. 08_20200212");
		//ǥ��ǥ�ø� ���ڿ��� �޾� �ο��� �ڸ����� ��� �� ��!
	}
	
	public static int netprice_k36 (int price_k36, double rate_k36) {	
		//������ �Һ��ڰ���, �Ҽ��� ������ �޾� ������ ���������� ��ȯ�ϴ� �Լ�
		
		return (int)(price_k36 / (1 + rate_k36));	//���������� �ϸ� ���������� ������ �ȴ�
	}	
}
