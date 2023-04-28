package kr.ac.kopo.ctc.kopo36.service;

import java.util.ArrayList;
import java.util.List;

import kr.ac.kopo.ctc.kopo36.domain.WifiItem;

public class WifiItemService {
		public double getDistance_k36(WifiItem me_k36, WifiItem target_k36) {	
			//두개의 객체를 받아와 실수형 변수를 반환하는 메소드 선언
			double dist_k36 = Math.sqrt(Math.pow(target_k36.getLatitude_k36() - me_k36.getLatitude_k36(), 2)
					+ Math.pow(target_k36.getLongitude_k36() - me_k36.getLongitude_k36(), 2));	
			//피타고라스 정리 : 거리^2 = (위도-현재위도)^2 + (경도-현재경도)^2 								
			return dist_k36;	//현재지점과의 거리 반환
		}
		
		public void printAll_k36(WifiItem target_k36, double d_k36) {		
				//객체 target과 현재지점과의 거리를 받아와 출력해주는 메소드 선언
				System.out.printf("**[%d번째 항목]**********************\n", target_k36.getId_k36());	//출력
				System.out.printf("%s : %s\n", target_k36.getFieldName_k36()[2], target_k36.getInstallationLocationDetails_k36());	//장소명
				System.out.printf("%s : %s\n", target_k36.getFieldName_k36()[9], target_k36.getRoadNameAddress_k36());	//도로명주소
				System.out.printf("%s : %s\n", target_k36.getFieldName_k36()[10], target_k36.getLotNumberAddress_k36());	//지번주소
				System.out.printf("%s : %f\n", target_k36.getFieldName_k36()[13], target_k36.getLatitude_k36());		//위도주소
				System.out.printf("%s : %f\n", target_k36.getFieldName_k36()[14], target_k36.getLongitude_k36());	//경도주소
				System.out.printf("현재지점과 거리 : %f\n", d_k36);		
				System.out.printf("************************************\n");	//출력					
		}
}
