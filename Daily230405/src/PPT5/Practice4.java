package PPT5;
import java.time.LocalDateTime;
import java.text.DecimalFormat;
import java.time.format.DateTimeFormatter;

public class Practice4 {
//�Ѿ��ġ�(1)
	public static void main(String[] args) {
		int iPrice_k36= 33000; 
		double iTax_k36 = 0.1;
						
		System.out.printf("\n\n�ſ����\n");
		System.out.printf("�ܸ��� : 2N68665898%18s\n","��ǥ��ȣ : 041218");
		System.out.printf("������ : �Ѿ��ġ�\n");
		System.out.printf("��  �� : ��� ������ �д籸 Ȳ�����351���� 10 , 1��\n");
		System.out.printf("��ǥ�� : ��â��\n");
		System.out.printf("����� : 752-53-00558%20s\n","TEL : 7055695");
		System.out.printf("- - - - - - - - - - - - - - - - - - - - -\n");
		DecimalFormat df_k36 = new DecimalFormat("###,###,###,###,###");
		System.out.printf("��  �� %31s ��\n", df_k36.format((iPrice_k36/(1+iTax_k36))));
		System.out.printf("�ΰ��� %31s ��\n", df_k36.format((int)(iPrice_k36-(iPrice_k36/(1+iTax_k36)))));
		System.out.printf("��  �� %31s ��\n", df_k36.format(iPrice_k36));
		System.out.printf("- - - - - - - - - - - - - - - - - - - - -\n");
		System.out.printf("�츮ī��\n");
		System.out.printf("ī���ȣ : 2387-20**-****-4613(S)%5s\n", "�Ͻú�");
		LocalDateTime currentDateTime_k36 = LocalDateTime.now();
		DateTimeFormatter formatter_k36 = DateTimeFormatter.ofPattern("yy/MM/dd HH:mm:ss");
		String formattedDateTime_k36 = currentDateTime_k36.format(formatter_k36);
		System.out.printf("�ŷ��Ͻ� : " + formattedDateTime_k36 + "\n");
		System.out.printf("���ι�ȣ : 70404427\n");
		System.out.printf("�ŷ���ȣ : 357734873739\n");
		System.out.printf("���� : ��ī���%22s\n", "���� : 720068568");
		System.out.printf("�˸� : EDC����ǥ\n");
		System.out.printf("���� : TEL)1544-4700\n");
		System.out.printf("- - - - - - - - - - - - - - - - - - - - -\n");
		System.out.printf("%23s\n", " * �����մϴ� *");
		System.out.printf("%39s\n\n","ǥ��V2. 08_20200212");
	}
}
