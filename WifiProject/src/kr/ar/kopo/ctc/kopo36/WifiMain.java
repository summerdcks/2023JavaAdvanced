package kr.ar.kopo.ctc.kopo36;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import kr.ac.kopo.ctc.kopo36.dao.WifiItemDao;
import kr.ac.kopo.ctc.kopo36.domain.WifiItem;
import kr.ac.kopo.ctc.kopo36.service.WifiItemService;

public class WifiMain {	//메인클래스 선언

	public static void main(String[] args) throws IOException {	//메인함수 선언
		System.out.println("wifi project");	//해당문구 출력
		
		WifiItemService wifiItemService_k36 = new WifiItemService();	//WifiItemService형식의 객체 wifiItemService 생성
		WifiItemDao wifiItemDao_k36 = new WifiItemDao();	//WifiItemDao형식의 객체 wifiItemDao 생성
		List<WifiItem> wifiItems_k36 = wifiItemDao_k36.selectAll();	
		//WifiItem형식의 객체를 변수로 한 List형식의 객체 wifiItems를 선언하며
		//wifiItemDao객체의 selectAll 메소드의 리턴값을 할당해준다
		
		WifiItem me_k36 = new WifiItem();	//WifiItem형식의 객체 me 생성
		me_k36.setLatitude_k36(37.3860521);	//me객체의 set메소드를 이용하여 Latitude변수에 값을 할당해준다
		me_k36.setLongitude_k36(127.1214038);	//me객체의 set메소드를 이용하여 Longitude변수에 값을 할당해준다
		
		//최소거리, 최대거리를 구하기 위해 실수형 변수 선언
		double minn_k36 = Double.MAX_VALUE;
		double maxx_k36 = Double.MIN_VALUE;
		
		//최소, 최대거리인 객체의 인덱스값을 담아둘 정수형 변수 선언
		int min_k36 = 0;
		int max_k36 = 0;
		
		for (WifiItem target_k36: wifiItems_k36) {	
			//wifiItem 객체배열의 변수들을 target변수로 대입하며 하나씩 차례대로 끝까지 살펴보는 for each문
			double d_k36 = wifiItemService_k36.getDistance_k36(me_k36, target_k36);	
			//wifiItemServicer객체의 getDistance메소드에 me와 target객체를 대입한 리턴값을 실수형 d로 할당해준다
			//현재위치와 상대위치의 위도와 경도값을 계산하여 현재지점과의 거리를 리턴해준다
			if(minn_k36 >= d_k36) {		//해당거리가 최소거리보다 작을때의
				min_k36 = target_k36.getId_k36();	//인덱스번호
			}
			if(maxx_k36 <= d_k36) {		//해당거리가 최대거리보다 크면
				max_k36 = target_k36.getId_k36();	//인덱스번호		
			}
			minn_k36 = Math.min(minn_k36, d_k36);	//최소거리 업데이트
			maxx_k36 = Math.max(maxx_k36, d_k36);	//최대거리 업데이트
			
			wifiItemService_k36.printAll_k36(target_k36, d_k36);	//모든 항목 차례대로 출력
			
		}		
		
			System.out.printf("**[최소거리]**************************\n");	//출력
			//wifiItems객체의 min번째 객체의 변수값들을 차례대로 출력해준다
			System.out.printf("%s : %s\n", wifiItems_k36.get(min_k36).getFieldName_k36()[2], wifiItems_k36.get(min_k36).getInstallationLocationDetails_k36());	//장소명
			System.out.printf("%s : %s\n", wifiItems_k36.get(min_k36).getFieldName_k36()[9], wifiItems_k36.get(min_k36).getRoadNameAddress_k36());		//도로명주소
			System.out.printf("%s : %s\n", wifiItems_k36.get(min_k36).getFieldName_k36()[10], wifiItems_k36.get(min_k36).getLotNumberAddress_k36());	//지번주소
			System.out.printf("%s : %f\n", wifiItems_k36.get(min_k36).getFieldName_k36()[13], wifiItems_k36.get(min_k36).getLatitude_k36());	//위도주소
			System.out.printf("%s : %f\n", wifiItems_k36.get(min_k36).getFieldName_k36()[14], wifiItems_k36.get(min_k36).getLongitude_k36());	//경도주소
			System.out.printf("현재지점과 거리 : %f\n", minn_k36);
			System.out.printf("************************************\n");	//출력
			//wifiItems객체의 max번째 객체의 변수값들을 차례대로 출력해준다
			System.out.printf("**[최대거리]**************************\n");	//출력
			System.out.printf("%s : %s\n", wifiItems_k36.get(max_k36).getFieldName_k36()[2],  wifiItems_k36.get(max_k36).getInstallationLocationDetails_k36());	//장소명
			System.out.printf("%s : %s\n", wifiItems_k36.get(max_k36).getFieldName_k36()[9], wifiItems_k36.get(max_k36).getRoadNameAddress_k36());		//도로명주소
			System.out.printf("%s : %s\n", wifiItems_k36.get(max_k36).getFieldName_k36()[10], wifiItems_k36.get(max_k36).getLotNumberAddress_k36());	//지번주소
			System.out.printf("%s : %f\n", wifiItems_k36.get(max_k36).getFieldName_k36()[13], wifiItems_k36.get(max_k36).getLatitude_k36());	//위도주소
			System.out.printf("%s : %f\n", wifiItems_k36.get(max_k36).getFieldName_k36()[14], wifiItems_k36.get(max_k36).getLongitude_k36());	//경도주소	
			System.out.printf("현재지점과 거리 : %f\n", maxx_k36);
			System.out.printf("************************************\n");	//출력			
	}
}
