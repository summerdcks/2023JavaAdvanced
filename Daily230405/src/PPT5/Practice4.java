package PPT5;
import java.time.LocalDateTime;
import java.text.DecimalFormat;
import java.time.format.DateTimeFormatter;

public class Practice4 {
//한양김치찌개(1)
	public static void main(String[] args) {
		int iPrice_k36= 33000; 
		double iTax_k36 = 0.1;
						
		System.out.printf("\n\n신용승인\n");
		System.out.printf("단말기 : 2N68665898%18s\n","전표번호 : 041218");
		System.out.printf("가맹점 : 한양김치찌개\n");
		System.out.printf("주  소 : 경기 성남시 분당구 황새울로351번길 10 , 1층\n");
		System.out.printf("대표자 : 유창신\n");
		System.out.printf("사업자 : 752-53-00558%20s\n","TEL : 7055695");
		System.out.printf("- - - - - - - - - - - - - - - - - - - - -\n");
		DecimalFormat df_k36 = new DecimalFormat("###,###,###,###,###");
		System.out.printf("금  액 %31s 원\n", df_k36.format((iPrice_k36/(1+iTax_k36))));
		System.out.printf("부가세 %31s 원\n", df_k36.format((int)(iPrice_k36-(iPrice_k36/(1+iTax_k36)))));
		System.out.printf("합  계 %31s 원\n", df_k36.format(iPrice_k36));
		System.out.printf("- - - - - - - - - - - - - - - - - - - - -\n");
		System.out.printf("우리카드\n");
		System.out.printf("카드번호 : 2387-20**-****-4613(S)%5s\n", "일시불");
		LocalDateTime currentDateTime_k36 = LocalDateTime.now();
		DateTimeFormatter formatter_k36 = DateTimeFormatter.ofPattern("yy/MM/dd HH:mm:ss");
		String formattedDateTime_k36 = currentDateTime_k36.format(formatter_k36);
		System.out.printf("거래일시 : " + formattedDateTime_k36 + "\n");
		System.out.printf("승인번호 : 70404427\n");
		System.out.printf("거래번호 : 357734873739\n");
		System.out.printf("매입 : 비씨카드사%22s\n", "가맹 : 720068568");
		System.out.printf("알림 : EDC매출표\n");
		System.out.printf("문의 : TEL)1544-4700\n");
		System.out.printf("- - - - - - - - - - - - - - - - - - - - -\n");
		System.out.printf("%23s\n", " * 감사합니다 *");
		System.out.printf("%39s\n\n","표준V2. 08_20200212");
	}
}
