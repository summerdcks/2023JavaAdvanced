package PPT9;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class PracticeP20 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		JSONParser parser_k36 = new JSONParser();

		Object obj_k36 = parser_k36.parse(new FileReader("C:\\Users\\DataSWB\\Desktop\\test.json"));

		JSONArray array_k36 = (JSONArray) obj_k36;

		System.out.println("******************************");
		for (int i_k36 = 0; i_k36 < array_k36.size(); i_k36++) {
			JSONObject result_k36 = (JSONObject) array_k36.get(i_k36);
			System.out.println("이름 : " + result_k36.get("name"));
			System.out.println("학번 : " + result_k36.get("studentid"));

			JSONArray score_k36 = (JSONArray) result_k36.get("score");
			long kor_k36 = (long) score_k36.get(0);
			long eng_k36 = (long) score_k36.get(1);
			long mat_k36 = (long) score_k36.get(2);
			System.out.println("국어 : " + kor_k36);
			System.out.println("영어 : " + eng_k36);
			System.out.println("수학 : " + mat_k36);
			System.out.println("총점 : " + (kor_k36 + eng_k36 + mat_k36));
			System.out.println("평균 : " + (kor_k36 + eng_k36 + mat_k36) / 3.0);
			System.out.println("******************************");
		}
	}
}
