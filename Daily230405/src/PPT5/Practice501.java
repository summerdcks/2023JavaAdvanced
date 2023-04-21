package PPT5;
import java.time.LocalDateTime;
import java.text.DecimalFormat;
import java.time.format.DateTimeFormatter;

public class Practice501 {
//다이소
	public static void main(String[] args) {
		
		String [] itemname_k36 = new String[3];		//크기가 3인 문자열형 배열 itemname을 선언한다
		
		itemname_k36[0] = "퓨어에어 비말차단용마스크(최고급형)";		//각 품목의 이름을 String형 배열 itemname 0~1번째에 할당한다
		itemname_k36[1] = "슬라이드식명찰(가로형) (100호)";
		itemname_k36[2] = "매직흡착 인테리어후크(알루미늄타입)";
		
		String [] return_k36 = new String[3];		//크기가 3인 문자열형 배열 return을 선언한다
						
		//for문을 이용하여 품목명 배열의 0번째부터 마지막번째 변수까지 차례대로 살펴본다
		for(int i_k36 = 0; i_k36 < itemname_k36.length ; i_k36++) {	
			byte [] ibytes_k36 = itemname_k36[i_k36].getBytes();
			//품목명함수의 i번째변수를 바이트단위로 쪼개어 ibytes배열에 담아준다				
			//ibytes배열의 갯수는 각 품목명의 바이트수가 된다
			if(ibytes_k36.length == 21) {
			//품목명의 i번째 배열의 바이트수가 21일 때				
				return_k36[i_k36]= itemname_k36[i_k36];
				//해당 품목명을 그대로 문자열 변수로 받는다						
			} else if(ibytes_k36.length > 21) {
				//품목명의 i번째 배열의 바이트수가 21보다 클 때				
				return_k36[i_k36] = cutString_k36(itemname_k36[i_k36], 21);	
				//outString 메소드를 이용하여 품목명을 21바이트까지 잘라내어 문자열 변수로 선언한다 				
				byte [] iibytes_k36 = return_k36[i_k36].getBytes();
	            //잘라낸 문자열을 다시 바이트단위로 잘라 바이트배열에 담는다				
				if(iibytes_k36.length < 21) {
					//잘라낸 문자열이 21보다 작을 경우(문자열에서 잘린 마지막부분이 한글일 경우 반환되는 문자열은 20바이트가 된다)					
					return_k36[i_k36] = return_k36[i_k36] + " ";
					//해당 변수에 띄어쓰기 한칸을 추가해 21바이트의 문자열로 만들어준다
				} 				
			} else {
				//품목명의 i번째 배열의 바이트수가 21보다 작을 때				
				return_k36[i_k36] = itemname_k36[i_k36];
				//해당 품목명을 그대로 문자열 변수로 받는다				
				//for문을 이용하여 21바이트보다 작은 문자열을 21바이트의 문자열로 만들어준다
				for(int a_k36 = ibytes_k36.length; a_k36 < 21; a_k36++) {
					//정수형 변수 a를 해당 문자열의 바이트수를 부여하여 해당값이 21이 될 때까지 1씩 증가하며 루프를 돈다					
					return_k36[i_k36] = return_k36[i_k36] + " ";
					//루프 횟수만큼 문자열 뒤에 띄어쓰기를 붙여준다							
				}			
			}
		}
		
		String itemcode1_k36 = "1031615";		//문자열 변수를 선언하며 각 품목번호를 값으로 할당해준다
		String itemcode2_k36 = "11008152";		
		String itemcode3_k36 = "1020800";		
		
		int price1_k36 = 3000;			//정수형 변수를 선언하며 각 품목의 가격을 값으로 할당해준다
		int price2_k36 = 2000;
		int price3_k36 = 700;
		
		int amount1_k36 = 1;			//정수형 변수를 선언하며 각 품목의 수량을 값으로 할당해준다
		int amount2_k36 = 2;
		int amount3_k36 = 3;		
		
		int salesPrice_k36 = price1_k36*amount1_k36 + price2_k36*amount2_k36 + price3_k36*amount3_k36;
		//정수형 변수 salesPrice를 선언하며 각 품목의 가격과 수량을 곱해 더한 총합계액을 값으로 할당해준다
		
		double iTaxRate_k36 = 0.1;		//실수형 변수를 선언하며 부가세 0.1값을 할당한다
			
		int netprice_k36 = netprice_k36(salesPrice_k36, iTaxRate_k36);	//k36_netprice함수는 static이므로 main에서 객체생성 없이 호출할 수 있다
		//과세품목가와 과세율을 netprice 함수에서 받아 정수형 세전가격을 반환한다
		
		int iTax_k36 = salesPrice_k36 - netprice_k36;	//부가세 = 과세품목가 - 세전가격, 세전가격을 버림했으므로 부가세는 올림이 된다
		
						
		 
		System.out.printf("           \"국민가게, 다이소\"\n");
		//국민가게 다이소를 역슬래쉬를 이용하여 큰따옴표와 함께 출력해주고 줄바꿈 해준다
		System.out.printf("(주)아성다이소_분당서현점\n");
		//지점명을 출력하고 줄바꿈 해준다
		System.out.printf("전화:031-702-6016\n");
		//전화표시와 전화번호를 출력하고 줄바꿈 해준다
		System.out.printf("본사:서울 강남구 남부순환로 2748 (도곡동)\n");
		//본사표시와 해당 주소를 출력하고 줄바꿈 해준다
		System.out.printf("대표:박정부,신호섭 213-81-52063\n");	
		//대표표시와 대표명과 사업자번호를 출력하고 출바꿈해준다
		System.out.printf("매장:경기도 성남시 분당구 분당로53번길 11 (서현동)\n");
		//매장표시와 해당 주소를 출력하고 줄바꿈 해준다	
		System.out.printf("=========================================\n");
		//표시선 출력 후 줄바꿈 해준다
		System.out.printf("      소비자중심경영(CCM) 인증기업\n");
		//해당 문구를 출력 후 줄바꿈 해준다
		System.out.printf("    ISO 9001 품질경영시스템 인증기업\n");
		//해당 문구를 출력 후 줄바꿈 해준다
		System.out.printf("=========================================\n");
		//표시선 출력 후 줄바꿈 해준다
		LocalDateTime currentDateTime_k36 = LocalDateTime.now();
		//LocalDateTime 함수를 이용하여 현재시간을 불러온다
		LocalDateTime refundDate_k36 = currentDateTime_k36.plusDays(14);
		//LocalDateTime 함수를 이용하여 불러온 현재시간에 14일을 더한 값을 refundDate로 받는다
		DateTimeFormatter formatter1_k36 = DateTimeFormatter.ofPattern("MM월dd일");
		//DateTimeFormatter함수를 이용하여 원하는 변수값을 받아 형태를 부여한다
		String formattedDateTime1_k36 = refundDate_k36.format(formatter1_k36);
		//불러온 현재시간을 원하는 형태에 맞게 출력할 수 있도록 String변수로 받는다
		System.out.printf("      교환/환불 14일("+formattedDateTime1_k36+")이내,\n");
		//교환환불 표시를 해주며 현재일자에서 14일을 더한 날짜를 함께 출력해주고 줄바꿈 해준다
		System.out.printf("(전자)영수증, 결제카드 지침 후 구입매장에서 가능\n");
		//해당 문구를 출력 후 줄바꿈 해준다
		System.out.printf("    포장/가격 택 훼손시 교환/환불 불가\n");
		//해당 문구를 출력 후 줄바꿈 해준다
		System.out.printf("      체크카드 취소 시 최대 7일 소요\n");
		//해당 문구를 출력 후 줄바꿈 해준다
		System.out.printf("=========================================\n");
		//표시선 출력 후 줄바꿈 해준다
		DateTimeFormatter formatter2_k36 = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
		//DateTimeFormatter함수를 이용하여 원하는 변수값을 받아 형태를 부여한다
		String formattedDateTime2_k36 = currentDateTime_k36.format(formatter2_k36);
		//불러온 현재시간을 원하는 형태에 맞게 출력할 수 있도록 String변수로 받는다
		System.out.printf("%s%27s\n", "[POS 1058231] ", formattedDateTime2_k36);
		//POS표시와 원하는 형태의 시간표시를 문자열로 받아 해당 문자열을 부여한 자리값에 출력 후 줄바꿈 해준다
		System.out.printf("=========================================\n");
		//표시선 출력 후 줄바꿈 해준다
		DecimalFormat df_k36 = new DecimalFormat("###,###,###,###,###");
		//뒤에서 세자리마다 콤마를 찍어주는 DecimalFormat함수를 불러온다
		System.out.printf("%s%8s%4s%8s\n", return_k36[0], df_k36.format(price1_k36), amount1_k36, df_k36.format(price1_k36*amount1_k36));
		//품목명배열의 0번째 변수와 해당 물품의 가격, 수량, 총액값을 문자열로 받아 해당 문자열을 부여한 자리값에 출력 후 줄바꿈 해준다
		System.out.printf("[%s]\n", itemcode1_k36);
		//품목번호를 문자열로 받아 해당 문자열을 부여한 자리값에 출력 후 줄바꿈 해준다
		System.out.printf("%s%8s%4s%8s\n", return_k36[1], df_k36.format(price2_k36), amount2_k36, df_k36.format(price2_k36*amount2_k36));
		//품목명배열의 1번째 변수와 해당 물품의 가격, 수량, 총액값을 문자열로 받아 해당 문자열을 부여한 자리값에 출력 후 줄바꿈 해준다
		System.out.printf("[%s]\n", itemcode2_k36);
		//품목번호를 문자열로 받아 해당 문자열을 부여한 자리값에 출력 후 줄바꿈 해준다
		System.out.printf("%s%8s%4s%8s\n", return_k36[2], df_k36.format(price3_k36), amount3_k36, df_k36.format(price3_k36*amount3_k36));
		//품목명배열의 2번째 변수와 해당 물품의 가격, 수량, 총액값을 문자열로 받아 해당 문자열을 부여한 자리값에 출력 후 줄바꿈 해준다
		System.out.printf("[%s]\n", itemcode3_k36);		
		//품목번호를 문자열로 받아 해당 문자열을 부여한 자리값에 출력 후 줄바꿈 해준다
		System.out.printf("%20s%17s\n", "과세합계", df_k36.format(netprice_k36));
		//과세합계 표시와 df함수를 이용하여 콤마표시해준 과세합계액을 문자열로 받아 해당 문자열을 부여한 자리값에 출력 후 줄바꿈 해준다
		System.out.printf("%21s%17s\n", "부가세", df_k36.format(iTax_k36));
		//과세합계 표시와 df함수를 이용하여 콤마표시해준 부가세 값을 문자열로 받아 해당 문자열을 부여한 자리값에 출력 후 줄바꿈 해준다
		System.out.printf("-----------------------------------------\n");
		//표시선 출력 후 줄바꿈 해준다
		System.out.printf("%s%33s\n", "판매합계", df_k36.format(salesPrice_k36));
		//판매합계표시와 df함수를 이용하여 콤마표시해준 합계액을 문자열로 받아 해당 문자열을 부여한 자리값에 출력 후 줄바꿈 해준다
		System.out.printf("=========================================\n");
		//표시선 출력 후 줄바꿈 해준다
		System.out.printf("%s%33s\n", "신용카드", df_k36.format(salesPrice_k36));
		//신용카드표시와 합계액을 문자열로 받아 해당 문자열을 부여한 자리값에 출력 후 줄바꿈 해준다
		System.out.printf("-----------------------------------------\n");
		//표시선 출력 후 줄바꿈 해준다
		System.out.printf("우리카드                 538720**********\n");
		//우리카드표시와 카드번호표시를 출력 후 줄바꿈 해준다
		System.out.printf("승인번호 77982843(0)%7s%10s\n", "승인금액",df_k36.format(salesPrice_k36) );
		//승인번호 표시와 해당값 출력 후 승인금액과 판매액 각각을 문자열로 받아 해당 문자열을 부여한 자리값에 출력 후 줄바꿈 해준다
		System.out.printf("=========================================\n");	
		//표시선 출력 후 줄바꿈 해준다
		System.out.printf("     " + formattedDateTime2_k36 + " 분당서현점\n");
		//지점표시와 원하는 형태의 시간표시를 문자열로 받아 해당 문자열을 부여한 자리값에 출력 후 줄바꿈 해준다
		System.out.printf("상품 및 기타 문의 : 1522-4400\n");
		//해당 문구를 출력 후 줄바꿈 해준다
		System.out.printf("멤버십 및 샵다이소 관련 문의 : 1599-2211\n");
		//해당 문구를 출력 후 줄바꿈 해준다
		System.out.printf("         ||||||||||||||||||||||\n");
		//바코드 출력 후 줄바꿈 해준다
		System.out.printf("         ||||||||||||||||||||||\n");
		//바코드 출력 후 줄바꿈 해준다
		System.out.printf("            2112820610158231\n");
		//해당 문구를 출력 후 줄바꿈 해준다
		System.out.printf("-----------------------------------------\n");
		//표시선 출력 후 줄바꿈 해준다
		System.out.printf("◈다이소 멤버십 앱 또는 홈페이지에 접속하셔서 회원가입 후 다양한 혜택을 누려보세요!◈");
		//해당 문구를 출력 후 끝!

	}
	public static int netprice_k36 (int price_k36, double rate_k36) {	
		//정수형 소비자가격, 소수형 세율을 받아 정수형 세전가격을 반환하는 함수
		
		return (int)(price_k36 / (1 + rate_k36));	//정수선언을 하면 세전가격은 버림이 된다
	}	
	
	public static String cutString_k36(String str_k36, int len_k36) { //문자열과 정수값을 받아 문자열을 반환해주는 함수 cutString을 선언한다

		  byte[] by_k36 = str_k36.getBytes();	//받아온 문자열을 바이트단위로 쪼개어 바이트배열에 담아준다
		  
		  int count_k36 = 0;	//문자열에 포함된 한글의 갯수를 담을 정수형 변수 count를 선언해주고 0으로 초기화한다
		  
		//try~catch구문을 이용하여 오류를 잡아낸다
		  try  {	//첫번째로 실행되는 부분
			  
		       for(int i_k36 = 0; i_k36 < len_k36; i_k36++) {	//for문을 이용하여 0부터 원하는 바이트수까지 루프를 돈다

		            if((by_k36[i_k36] & 0x80) == 0x80) count_k36++; 
		            //인덱스 값이 한글일 때 카운트를 1씩 추가하여 총 한글갯수를 카운트해준다
		       }

		       if((by_k36[len_k36 - 1] & 0x80) == 0x80 && (count_k36 % 2) == 1) len_k36--; 
		       //마지막 인덱스가 한글이고 한글의 갯수가 홀수일 때 마지막 바이트값을 빼준다

		       return new String(by_k36, 0, len_k36);   //바이트를 문자열로 변환한 값을 반환해준다

		  }
		  catch(java.lang.ArrayIndexOutOfBoundsException e_k36)	//오류가 있을 때 실행되는 부분
		  {
		       System.out.println(e_k36);	//오류가 발생한 범위와 이유를 출력해준다
		       
		       return "";	//빈 문자열을 반환해준다
		  }

	} 
}
