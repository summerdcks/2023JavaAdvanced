package PPT7;

public class PracticeP13 {	//클래스 선언

	public static void main(String[] args) {	//메인함수 선언
		String [] OneRec_k36 = {	//문자열형 배열인 OneRec를 선언하며 배열에 값을 담아준다
				"순번,상호명,소재지(도로명),연락처",
				"1,샤랄랄라,부산광역시 북구 금곡대로 469 농협하나로클럽 2층 (금곡동),051-363-9087",
				"2,꼬마다락방,부산광역시 북구 구포시장길 48 3층 (구포동),051-338-5559",
				"3,파리봉봉(화명점),부산광역시 북구 금곡대로303번길 2 시티타워 1201호 (화명동),051-363-0060",
				"4,더놀다 부산화명점,부산광역시 북구 화명대로 32 다운타운프라자 5층 502호 (화명동),051-363-3631",
				"5,아이점프 만덕점,부산광역시 북구 만덕3로16번길 1 4층(만덕동 벽산라인훼미리타운),070-8252-3921",
				"6,주니어킹덤(일반음식점 겸업),부산광역시 북구 화명대로 17 목양프라자 4층,051-363-2288"
		};
		
		String [] field_name_k36 = OneRec_k36[0].split(",");	
		//배열의 0번째 변수를 쉼표를 기준으로 분해하여 field_name배열에 담아준다
		for(int i_k36 = 1; i_k36 < OneRec_k36.length-1 ; i_k36++) {	
			//OneRec배열의 1번째부터 마지막까지 for문을 돌며 하나씩 살펴본다
			
			String [] field_k36 = OneRec_k36[i_k36].split(",");	
			//배열의 0번째 변수를 쉼표를 기준으로 분해하여 field배열에 담아준다
			System.out.printf("*************************************************\n");	
			//구분선 출력
			for (int j_k36 = 0; j_k36 < field_name_k36.length; j_k36++) {	
				//field_name배열의 0번째부터 마지막까지 for문을 돌며
				System.out.printf(" %s : %s\n", field_name_k36[j_k36], field_k36[j_k36]);	
				//field_name배열과 field배열의 i번째 변수의 정보를 출력해준다
			}
			System.out.printf("*************************************************\n");	
			//구분선 출력
		}
	}
}
