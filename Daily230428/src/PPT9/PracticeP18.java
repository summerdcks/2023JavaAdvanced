package PPT9;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class PracticeP18 {

	public static JSONObject oneRec(String name_k36, int studentid_k36, int kor_k36, int eng_k36, int mat_k36) {
		JSONObject dataObject_k36 = new JSONObject();
		dataObject_k36.put("name", name_k36);
		dataObject_k36.put("studentid", studentid_k36);

		JSONArray score_k36 = new JSONArray();
		score_k36.add(kor_k36);
		score_k36.add(eng_k36);
		score_k36.add(mat_k36);
		dataObject_k36.put("score", score_k36);

		return dataObject_k36;
	}

	public static void main(String[] args) {
		JSONObject jsonObject_k36 = new JSONObject();
		JSONArray datasArray_k36 = new JSONArray();
		JSONObject dataObject_k36 = new JSONObject();
		dataObject_k36.put("name", "나연");
		dataObject_k36.put("studentid", 209901);
		JSONArray score_k36 = new JSONArray();
		score_k36.add(90);
		score_k36.add(100);
		score_k36.add(95);
		dataObject_k36.put("score", score_k36);
		datasArray_k36.add(dataObject_k36);

		datasArray_k36.add(oneRec("정연", 209902, 100, 85, 75));
		datasArray_k36.add(oneRec("모모", 209903, 90, 75, 85));
		datasArray_k36.add(oneRec("사나", 209904, 90, 85, 75));
		datasArray_k36.add(oneRec("지효", 209905, 80, 75, 85));
		datasArray_k36.add(oneRec("미나", 209906, 90, 85, 55));
		datasArray_k36.add(oneRec("다연", 209907, 70, 75, 65));
		datasArray_k36.add(oneRec("채영", 209908, 100, 75, 95));
		datasArray_k36.add(oneRec("쯔위", 209909, 80, 65, 95));

		FileWriter file_k36;
		try {
			file_k36 = new FileWriter("C:\\Users\\DataSWB\\Desktop\\test.json");
			file_k36.write(datasArray_k36.toJSONString());
			file_k36.flush();
			file_k36.close();
		} catch (IOException e_k36) {
			// TODO Auto-generated catch block
			e_k36.printStackTrace();
		}
		System.out.println("JSON만든거 : " + datasArray_k36);
	}

}
