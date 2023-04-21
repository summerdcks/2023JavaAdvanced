package PPT5;
import java.time.LocalDateTime;
import java.text.DecimalFormat;
import java.time.format.DateTimeFormatter;

public class Practice6 {
//이마트
	public static void main(String[] args) {
		
		String [] itemname = {"4륜 구동 소형 농장 트랙터 50hp", "CJ 햇반솥반 통곡물밥 200g","[노브랜드] 칠리 새우 400g","피코크 케이준프라이 감자튀김700g","피코크 정통 꿔바로우500g",
				"[서울우유]비요뜨 초코링 (138g*2개)","[노브랜드] 그릴 닭가슴살 140g", "코카콜라제로 1.5LX2", "애호박(개)","(A)파머스픽 흙대파(봉)",
				"노브랜드 굿모닝 굿밀크 1L","[농심] 올리브 짜파게티 (140gx5입)","노브랜드 국산콩두부300g*2입","[직배송]이맛쌀 10kg_상등급","집들이 선물세트(소르베머그&원형접시)",
				"랜더스데이청소기 특가전(로봇/스틱/스팀청소기 등)","한국금거래소골드바 3.75g","[최초판매가 50,000원] 브랜바인 미국 특허 간 기능 개선 영양제 100캡슐",
				"드리미 L10s Ultra 올인원 로봇청소기 + 악세사리 키트 증정","LG울트라HD TV 벽걸이형 86UQ8300ENA (217cm)",
				"[LG전자] LG 디오스 냉장고 오브제컬렉션 T873MKE111 (870L)(희망일)","[5/11순차출고]스위치 젤다의 전설 티어스 오브 더 킹덤",
				"[뉴발란스] 2002 남여공용 운동화 ML2002RC","종가 행복이온 포기김치 10kg","[해남미소]땅끝농협 2022년 햇 깐마늘 10kg",
				"농심백산수 1L 36병","다농이네 달콤한 세척사과 2.5kg 12과내","스테비아 대추 방울토마토 2kg (500g x 4팩)","햇반 210g X36개",
				"[CJ직배송]카놀라유 900ML x 4","[CJ직배송]비비고미역국 500g x 10","브리지스톤22년형 V300-8 스틸아이언세트(8아이언(5~SW), NS PRO950 Neo R/S)"};
		int [] price = {79010481,4680,6980,8980,8480,2750,2380,4580,1980,3180,1790,4880,3280,29900,81000,349000,449600,38900,1399000,2863700,2086200,74800,209000,
				48900,112200,22300,21800,30900,41940,32000,54800,1550000};
		int [] num = {1,1,3,2,3,20,30,5,5,2,2,12,2,1,2,1,10,7,1,1,8,3,1,3,1,1,1,1,1,2,3,1};
		boolean [] taxfree = {false,false,false,false,false,false,false,false,true,true,false,false,false,true,false,false,false,false,false,false,false,false,false,false,true,false,true,true,false,false,false,false};
		
		
		
		int iTaxFree_k36 = 0;	//면세품목가
		int iNonTaxFree_k36 = 0; 	//과세품목가
		int iNum_k36 = 0;	//총품목수량
		
		
		
		for(int a = 0; a < itemname.length; a++) {								
			
			if(taxfree[a] == true) {
				iTaxFree_k36 = iTaxFree_k36 + price[a] * num[a];	//면세품목가
			}
			
			if(taxfree[a] == false) {
				iNonTaxFree_k36 = iNonTaxFree_k36 + price[a] * num[a];	//과세품목가
			}
			
			iNum_k36++;	//총품목수량
			
		}
						
		double iTaxRate_k36 = 0.1;	//과세율
		
		int k36_netprice = k36_netprice(iNonTaxFree_k36, iTaxRate_k36);	//k36_netprice함수는 static이므로 main에서 객체생성 없이 호출할 수 있음
		
		int iTax_k36 = iNonTaxFree_k36 - k36_netprice;	//세금 = 소비자가격 - 세전가격, 세전가격을 버림했으므로 세금은 올림이 된다
		
		int iPrice =iTaxFree_k36  + k36_netprice + iTax_k36;
		
	
		
		LocalDateTime currentDateTime = LocalDateTime.now();
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		String formattedDateTime1 = currentDateTime.format(formatter1);
		
		DecimalFormat df_k36 = new DecimalFormat("###,###,###,###,###");

		
		//출력시작

		System.out.printf("%34s\n", "이마트 죽전점 (031)888-1234");
		System.out.printf("%9s%20s\n","emart", "206-85-50913 강희석");
		System.out.printf("%28s\n", "용인 수지구 포은대로 552");
		System.out.printf("영수증 미지참시 교환/환불 불가\n");
		System.out.printf("정상상품에 한함, 30일 이내(신선 7일)\n");
		System.out.printf("※일부 브랜드매장 제외(매장 고지물참조)\n");
		System.out.printf("교환/환불 구매점에서 가능(결제카드 지참)\n");
		System.out.printf("\n");
		System.out.printf("[구 매]" + formattedDateTime1 + "%18s\n", "POS:0011-9861");
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%11s%12s%3s%5s\n", "상 품 명", "단 가", "수량", "금 액");
		
	
		
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
		
		System.out.printf("\n%22s%14s\n", "총 품목 수량", iNum_k36 );
		System.out.printf("%23s%14s\n", "(*)면 세  물 품", df_k36.format(iTaxFree_k36));
		System.out.printf("%23s%14s\n", "과 세  물 품", df_k36.format(k36_netprice));
		System.out.printf("%24s%14s\n", "부   가   세", df_k36.format(iTax_k36));
		System.out.printf("%25s%14s\n", "합        계", df_k36.format(iPrice));
		System.out.printf("%s%24s\n","결 제 대 상 금 액", df_k36.format(iPrice));
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%s%28s\n", "0012 KEB 하나","541707**0484/36860658");
		System.out.printf("%s%15s%11s\n", "카드결제(IC)", "일시불 / ", df_k36.format(iPrice));		
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%23s","[신세계포인트 적립]\n");	
		System.out.printf("홍*두 고객님의 포인트 현황입니다.\n");
		System.out.printf("금회발생포인트%17s%10s\n", "9530**9995", df_k36.format(iPrice/1000));
		System.out.printf("누계(가용)포인트%15s%10s\n", df_k36.format((iPrice/1000) + 5473), "(   5,473)");
		System.out.printf("*신세계포인트 유효기간은 2년입니다.\n");
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%22s", "구매금액기준 무료주차시간 자동부여\n");
		System.out.printf("%s%29s\n", "차량번호 : ", "34저****");

		LocalDateTime refundDate = currentDateTime.minusHours(3);	
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String formattedDateTime2 = refundDate.format(formatter2);
		
		System.out.printf("%s%30s\n", "입차시간 : ", formattedDateTime2);	//입차시간은 3시간 전
		System.out.printf("-----------------------------------------\n");
		System.out.printf("캐셔:084299 양00%25s\n", "1150");
		System.out.printf("   ||||||||||||||||||||||||||||||||||||\n");
		System.out.printf("   ||||||||||||||||||||||||||||||||||||\n");
		
		DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("yyyyMMdd");
		String formattedDateTime3 = currentDateTime.format(formatter3);
		
		System.out.printf("%14s%s\n", formattedDateTime3,"/00119861/00164980/31");
		
	}
	public static int k36_netprice(int k36_price, double k36_rate) {	//정수형 소비자가격, 소수형 세율을 받아 정수형 세전가격을 반환하는 함수
		return (int)(k36_price / (1 + k36_rate));	//정수선언을 하면 세전가격은 버림이 된다
	}
	

	public static String cutString(String str, int len) { 

		  byte[] by = str.getBytes();
		  int count = 0;
		  try  {
		       for(int i = 0; i < len; i++) {

		            if((by[i] & 0x80) == 0x80) count++; // 핵심 코드

		       }

		       if((by[len - 1] & 0x80) == 0x80 && (count % 2) == 1) len--; // 핵심코드

		       return new String(by, 0, len);   

		  }
		  catch(java.lang.ArrayIndexOutOfBoundsException e)
		  {
		       System.out.println(e);
		       return "";
		  }

		} 
	
}
