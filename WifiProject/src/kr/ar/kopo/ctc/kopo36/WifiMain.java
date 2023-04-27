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
		
		WifiItem min_k36 = new WifiItem();	//최소거리일 때의 객체값을 저장해줄 WifiItem형식의 객체 min 생성
		WifiItem max_k36 = new WifiItem();	//최대거리일 때의 객체값을 저장해줄 WifiItem형식의 객체 max 생성
		
		//최소거리, 최대거리를 구하기 위해 실수형 변수 선언
		double minn_k36 = Double.MAX_VALUE;
		double maxx_k36 = Double.MIN_VALUE;
		
		for (WifiItem target_k36: wifiItems_k36) {	
			//wifiItem 객체배열의 변수들을 target변수로 대입하며 하나씩 차례대로 끝까지 살펴보는 for each문
			double d_k36 = wifiItemService_k36.getDistance_k36(me_k36, target_k36);	
			//wifiItemServicer객체의 getDistance메소드에 me와 target객체를 대입한 리턴값을 실수형 d로 할당해준다
			//현재위치와 상대위치의 위도와 경도값을 계산하여 현재지점과의 거리를 리턴해준다
			if(minn_k36 >= d_k36) {		//해당거리가 최소거리보다 작으면
				min_k36 = target_k36;	//min객체에 현재 살펴보고 있는 객체를 할당
			}
			if(maxx_k36 <= d_k36) {		//해당거리가 최대거리보다 크면
				max_k36 = target_k36;	//max객체에 현재 살펴보고 있는 객체를 할당
			}
			minn_k36 = Math.min(minn_k36, d_k36);	//최소거리 업데이트
			maxx_k36 = Math.max(maxx_k36, d_k36);	//최대거리 업데이트
		}		
			System.out.printf("**[최소거리]**************************\n");	//출력
			//min객체에 할당되어 있던 변수값들을 차례대로 출력해준다
			System.out.printf("설치장소상세 : %s\n", min_k36.getInstallationLocationDetails_k36());	//장소명
			System.out.printf("소재지도로명주소 : %s\n", min_k36.getRoadNameAddress_k36());		//도로명주소
			System.out.printf("소재지지번주소 : %s\n", min_k36.getLotNumberAddress_k36());	//지번주소
			System.out.printf("WGS84위도 : %f\n", min_k36.getLatitude_k36());	//위도주소
			System.out.printf("WGS84경도 : %f\n", min_k36.getLongitude_k36());	//경도주소
			System.out.printf("최소거리 : %f\n", minn_k36);
			System.out.printf("************************************\n");	//출력
			//max객체에 할당되어 있던 변수값들을 차례대로 출력해준다
			System.out.printf("**[최대거리]**************************\n");	//출력
			System.out.printf("설치장소상세 : %s\n", max_k36.getInstallationLocationDetails_k36());	//장소명
			System.out.printf("소재지도로명주소 : %s\n", max_k36.getRoadNameAddress_k36());		//도로명주소
			System.out.printf("소재지지번주소 : %s\n", max_k36.getLotNumberAddress_k36());	//지번주소
			System.out.printf("WGS84위도 : %f\n", max_k36.getLatitude_k36());	//위도주소
			System.out.printf("WGS84경도 : %f\n", max_k36.getLongitude_k36());	//경도주소	
			System.out.printf("최대거리 : %f\n", maxx_k36);
			System.out.printf("************************************\n");	//출력			
	}
}
