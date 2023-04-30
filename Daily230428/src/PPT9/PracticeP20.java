package PPT9;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class PracticeP20 {	//클래스 선언

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		//메인함수 선언
		JSONParser parser_k36 = new JSONParser();	//JSONParser 객체 parser 생성

		Object obj_k36 = parser_k36.parse(new FileReader("C:\\Users\\DataSWB\\Desktop\\test.json"));
		//pc에서 해당 경로의 파일로부터 JSON 데이터를 읽어와 obj로 선언

		JSONArray array_k36 = (JSONArray) obj_k36;	//ob를 객체배열형 변환한 JSONArray 객체 array 선언

		System.out.println("******************************");	//구분선 출력
		for (int i_k36 = 0; i_k36 < array_k36.size(); i_k36++) { //array객체배열의 변수를 하나씩 살펴봄
			JSONObject result_k36 = (JSONObject) array_k36.get(i_k36);	
			//array객체배열에서 i번째 인덱스의 JSON 객체 추출하여 result로 선언
			System.out.println("이름 : " + result_k36.get("name"));	//result의 name항목 출력
			System.out.println("학번 : " + result_k36.get("studentid"));	//result의 studentid항목 출력

			JSONArray score_k36 = (JSONArray) result_k36.get("score"); 	//result에서 점수 배열 추출하여 score로 선언
			long kor_k36 = (long) score_k36.get(0);	//score의 0번째 인덱스 항목인 국어점수를 정수형 변수로 선언
			long eng_k36 = (long) score_k36.get(1);//score의 1번째 인덱스 항목인 영어점수를 정수형 변수로 선언
			long mat_k36 = (long) score_k36.get(2);//score의 2번째 인덱스 항목인 수학점수를 정수형 변수로 선언
			System.out.println("국어 : " + kor_k36);	//국어점수 출력
			System.out.println("영어 : " + eng_k36);	//영어점수 출력
			System.out.println("수학 : " + mat_k36);	//수학점수 출력
			System.out.println("총점 : " + (kor_k36 + eng_k36 + mat_k36));	//총점 출력
			System.out.println("평균 : " + (kor_k36 + eng_k36 + mat_k36) / 3.0);	//평균 출력
			System.out.println("******************************");	//구분선 출력
		}
	}
}
