package PPT5;
import java.time.LocalDateTime;
import java.text.DecimalFormat;
import java.time.format.DateTimeFormatter;

public class Practice401 {	//클래스 선언
//한양김치찌개
	public static void main(String[] args) { //메인함수 선언
		
		int iPrice_k36= 33000;	//정수형 변수 iPrice를 선언하며 합계금액을 부여함
		
		double iTaxRate_k36 = 0.1;	//실수형 변수 iTax를 선언하며 부가세 0.1의 값을 부여함
	
		int netprice_k36 = netprice_k36(iPrice_k36, iTaxRate_k36);	//k36_netprice함수는 static이므로 main에서 객체생성 없이 호출할 수 있다
		//과세품목가와 과세율을 netprice 함수에서 받아 정수형 세전가격을 반환한다
		
		int iTax_k36 = iPrice_k36 - netprice_k36;	//부가세 = 과세품목가 - 세전가격, 세전가격을 버림했으므로 부가세는 올림이 된다
		
		System.out.printf("\n\n신용승인\n");
		//줄바꿈을 두번 하고 신용승인을 출력후 줄바꿈 해준다		
		System.out.printf("단말기 : 2N68665898%18s\n","전표번호 : 041218");
		//단말기와 해당값을 표시해주고 전표번호와 해당값을 문자열로 받아 부여한 자리값에 출력 후 줄바꿈 해준다
		System.out.printf("가맹점 : 한양김치찌개\n");
		//가맹점 한양김치찌개를 표시해주고 줄바꿈 해준다
		System.out.printf("주  소 : 경기 성남시 분당구 황새울로351번길 10 , 1층\n");
		//주소와 해당주소를 표시해주고 줄바꿈 해준다
		System.out.printf("대표자 : 유창신\n");
		//대표자 유창신을 표시해주고 줄바꿈 해준다
		System.out.printf("사업자 : 752-53-00558%20s\n","TEL : 7055695");
		//사업자와 해당값을 표시해주고 전화번호를 문자열로 받아 부여한 자리값에 출력 후 줄바꿈 해준다
		System.out.printf("- - - - - - - - - - - - - - - - - - - - -\n");
		//지시선 표시후 줄바꿈 해준다
		DecimalFormat df_k36 = new DecimalFormat("###,###,###,###,###");
		//뒤에서 세자리마다 콤마를 찍어주는 DecimalFormat함수를 불러온다
		System.out.printf("금  액 %31s 원\n", df_k36.format(netprice_k36));
		//금액을 표시하며 세전값을 문자열로 받아 부여한 자리값에 출력 후 줄바꿈 해준다
		System.out.printf("부가세 %31s 원\n", df_k36.format(iTax_k36));
		//부가세를 표시하며 부가세값을 문자열로 받아 부여한 자리값에 출력 후 줄바꿈 해준다
		System.out.printf("합  계 %31s 원\n", df_k36.format(iPrice_k36));
		//합계를 표시하며 합계액을 문자열로 받아 부여한 자리값에 출력 후 줄바꿈 해준다
		System.out.printf("- - - - - - - - - - - - - - - - - - - - -\n");
		//지시선 표시후 줄바꿈 해준다
		System.out.printf("우리카드\n");
		//우리카드를 표시하고 줄바꿈 해준다
		System.out.printf("카드번호 : 2387-20**-****-4613(S)%5s\n", "일시불");
		//카드번호와 해당값을 표시하고 일시불을 문자열로 받아 부여한 자리값에 출력 후 줄바꿈 해준다
		LocalDateTime currentDateTime_k36 = LocalDateTime.now();
		//LocalDateTime 함수를 이용하여 현재시간을 불러온다
		DateTimeFormatter formatter_k36 = DateTimeFormatter.ofPattern("yy/MM/dd HH:mm:ss");
		//DateTimeFormatter함수를 이용하여 원하는 변수값을 받아 형태를 부여한다
		String formattedDateTime_k36 = currentDateTime_k36.format(formatter_k36);
		//불러온 현재시간을 원하는 형태에 맞게 출력할 수 있도록 String변수로 받는다
		System.out.printf("거래일시 : " + formattedDateTime_k36 + "\n");
		//거래일시를 표시하고 현재시간을 원하는 형태로 출력한 후 줄바꿈 해준다
		System.out.printf("승인번호 : 70404427\n");
		//승인번호와 해당값을 출력하고 줄바꿈 해준다
		System.out.printf("거래번호 : 357734873739\n");
		//거래번호와 해당값을 출력하고 줄바꿈 해준다
		System.out.printf("매입 : 비씨카드사%22s\n", "가맹 : 720068568");
		//매입과 해당카드사를 표시하고 가맹과 해당값의 문자열을 부여한 자리값에 출력 후 줄바꿈 해준다
		System.out.printf("알림 : EDC매출표\n");
		//알림과 EDC매출표를 표시하고 줄바꿈 해준다
		System.out.printf("문의 : TEL)1544-4700\n");
		//문의를 표시하고 해당번호를 출력한 후 줄바꿈 해준다
		System.out.printf("- - - - - - - - - - - - - - - - - - - - -\n");
		//지시선 표시후 줄바꿈 해준다
		System.out.printf("%23s\n", " * 감사합니다 *");
		//감사합니다를 문자열로 받아 부여한 자리값에 출력 후 줄바꿈 해준다
		System.out.printf("%39s\n\n","표준V2. 08_20200212");
		//표준표시를 문자열로 받아 부여한 자리값에 출력 후 끝!
	}
	
	public static int netprice_k36 (int price_k36, double rate_k36) {	
		//정수형 소비자가격, 소수형 세율을 받아 정수형 세전가격을 반환하는 함수
		
		return (int)(price_k36 / (1 + rate_k36));	//정수선언을 하면 세전가격은 버림이 된다
	}	
}
