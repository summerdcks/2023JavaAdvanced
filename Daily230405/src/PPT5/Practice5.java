package PPT5;
import java.time.LocalDateTime;
import java.text.DecimalFormat;
import java.time.format.DateTimeFormatter;

public class Practice5 {
//다이소실습(1)수정전
	public static void main(String[] args) {
		
		
		String a = "퓨어에어 비말차단용마스크(최고급형)";
		String b = "슬라이드식명찰(가로형) (100호)";
		String c = "매직흡착 인테리어후크(알루미늄타입)";
		byte[] aa = a.getBytes();
		byte[] bb = b.getBytes();
		byte[] cc = c.getBytes();
		String aaa = new String(aa,0,26);
		String bbb = new String(bb,0,26);
		String ccc = new String(cc,0,26);
		
		if(aa_k36.length >= 22) {	//만약 a문자열의 바이트수가 22보다 크거나 같다면
			String aaaa_k36 = cutString_k36(aaa_k36, 22);	
			//outString 메소드를 이용하여 품목명을 14바이트까지 잘라내어 문자열 변수로 선언한다 
			byte [] ibytes_k36 = aaaa_k36.getBytes();
            //잘라낸 문자열을 다시 바이트단위로 잘라 바이트배열에 담는다
			
			if(ibytes_k36.length < 22) {
				//잘라낸 문자열이 22보다 작을 경우(문자열에서 잘린 마지막부분이 한글일 경우 반환되는 문자열은 13바이트가 된다)
				
				aaaa_k36 = aaaa_k36 + " ";
				
			} else {								
					
			}
		} else {					//만약 a문자열의 바이트수가 22보다 작다면
			aaa_k36 = a_k36;		//해당 문자열을 그대로 문자열변수 aaa에 할당한다
			for(int i_k36 = aa_k36.length; i_k36 < 22; i_k36++) {	//이 경우 해당 문자열이 22바이트가 될 때까지
				aaa_k36 = aaa_k36 + " ";							//띄어쓰기를 이어붙여준다
			}
		}
	

		if(bb_k36.length >= 22) {	//만약 b문자열의 바이트수가 22보다 크거나 같다면
			String aaaa_k36 = cutString_k36(aaa_k36, 22);	
			//outString 메소드를 이용하여 품목명을 14바이트까지 잘라내어 문자열 변수로 선언한다 
		} else {					//만약 b문자열의 바이트수가 22보다 작다면
			bbb_k36 = b_k36;		//해당 문자열을 그대로 문자열변수 bbb에 할당한다
			for(int i_k36 = bb_k36.length; i_k36 < 22; i_k36++) {	//이 경우 해당 문자열이 22바이트가 될 때까지
				bbb_k36 = bbb_k36 + " ";							//띄어쓰기를 이어붙여준다
			}
		}
		

		if(cc_k36.length >= 22) {	//만약 c문자열의 바이트수가 22보다 크거나 같다면
			String aaaa_k36 = cutString_k36(aaa_k36, 22);	
			//outString 메소드를 이용하여 품목명을 14바이트까지 잘라내어 문자열 변수로 선언한다 
		} else {					//만약 ca문자열의 바이트수가 22보다 작다면
			ccc_k36 = c_k36;		//해당 문자열을 그대로 문자열변수 ccc에 할당한다
			for(int i_k36 = cc_k36.length; i_k36 < 22; i_k36++) {	//이 경우 해당 문자열이 22바이트가 될 때까지
				ccc_k36 = ccc_k36 + " ";							//띄어쓰기를 이어붙여준다
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
		 
		System.out.printf("           \"국민가게, 다이소\"\n");
		System.out.printf("(주)아성다이소_분당서현점\n");
		System.out.printf("전화:031-702-6016\n");
		System.out.printf("본사:서울 강남구 남부순환로 2748 (도곡동)\n");
		System.out.printf("대표:박정부,신호섭 213-81-52063\n");
		System.out.printf("매장:경기도 성남시 분당구 분당로53번길 11 (서현동)\n");
		System.out.printf("=========================================\n");
		System.out.printf("      소비자중심경영(CCM) 인증기업\n");
		System.out.printf("    ISO 9001 품질경영시스템 인증기업\n");
		System.out.printf("=========================================\n");
		LocalDateTime currentDateTime = LocalDateTime.now();
		LocalDateTime refundDate = currentDateTime.plusDays(14);
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("MM월dd일");
		String formattedDateTime1 = refundDate.format(formatter1);
		System.out.printf("      교환/환불 14일("+formattedDateTime1+")이내,\n");
		System.out.printf("(전자)영수증, 결제카드 지침 후 구입매장에서 가능\n");
		System.out.printf("    포장/가격 택 훼손시 교환/환불 불가\n");
		System.out.printf("      체크카드 취소 시 최대 7일 소요\n");
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
		System.out.printf("%20s%17s\n", "과세합계", df_k36.format(salesPrice/(1+iTax_k36)));
		System.out.printf("%21s%17s\n", "부가세", df_k36.format((salesPrice-(salesPrice/(1+iTax_k36)))));
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%s%33s\n", "판매합계", df_k36.format(salesPrice));
		System.out.printf("=========================================\n");
		System.out.printf("%s%33s\n", "신용카드", df_k36.format(salesPrice));
		System.out.printf("-----------------------------------------\n");
		System.out.printf("우리카드                 538720**********\n");
		System.out.printf("승인번호 77982843(0)%7s%10s\n", "승인금액",df_k36.format(salesPrice) );
		System.out.printf("=========================================\n");	
		System.out.printf("     " + formattedDateTime2 + " 분당서현점\n");
		System.out.printf("상품 및 기타 문의 : 1522-4400\n");
		System.out.printf("멤버십 및 샵다이소 관련 문의 : 1599-2211\n");
		System.out.printf("         ||||||||||||||||||||||\n");
		System.out.printf("         ||||||||||||||||||||||\n");
		System.out.printf("            2112820610158231\n");
		System.out.printf("-----------------------------------------\n");
		System.out.printf("◈다이소 멤버십 앱 또는 홈페이지에 접속하셔서 회원가입 후 다양한 혜택을 누려보세요!◈\n");
	}

}
