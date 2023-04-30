package PPT9;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class PracticeP18 {

	public static JSONObject oneRec(String name_k36, int studentid_k36, int kor_k36, 
															int eng_k36, int mat_k36) {
		//JSON 형식으로 하나의 학생의 정보를 담은 JSONObject를 반환하는 메소드
		JSONObject dataObject_k36 = new JSONObject();	//새로운 JSONObject 객체 dataObject 생성
		dataObject_k36.put("name", name_k36);	//dataObject에 학생 이름 추가
		dataObject_k36.put("studentid", studentid_k36);	//dataObject에 학생 학번 추가

		JSONArray score_k36 = new JSONArray();	//JSONArray 객체 score 생성
		score_k36.add(kor_k36);	//score에 국어 점수 추가
		score_k36.add(eng_k36);	//score에 영어 점수 추가
		score_k36.add(mat_k36);	//score에 수학 점수 추가
		dataObject_k36.put("score", score_k36);	//dataObject에 점수정보 추가

		return dataObject_k36;	//dataObject 객체를 반환
	}

	public static void main(String[] args) {
		//JSON 형식으로 학생들의 정보를 담은 JSONArray를 생성하고, 파일로 저장하는 메소드
		JSONObject jsonObject_k36 = new JSONObject();	//JSONObject 객체 jsonObject 생성
		JSONArray datasArray_k36 = new JSONArray();	//JSONArray 객체 datasArray 생성
		JSONObject dataObject_k36 = new JSONObject();	
		//학생 정보 JSONObject 객체 dataObject 생성학생
		dataObject_k36.put("name", "나연");	//학생 이름 추가	
		dataObject_k36.put("studentid", 209901);	//학번 추가
		JSONArray score_k36 = new JSONArray();	//JSONArray 객체 score 추가
		score_k36.add(90);	//점수 추가
		score_k36.add(100);	//점수 추가
		score_k36.add(95);	//점수 추가
		dataObject_k36.put("score", score_k36);	//dataObject에 점수정보 추가
		datasArray_k36.add(dataObject_k36);	//학생 정보를 datasArray에 추가

		//JSONObject 객체인 oneRec를 생성하고, 학생 이름, 학번, 점수 정보를 추가한 후,
		//학생 정보 JSONArray 객체인 datasArray에 추가
		datasArray_k36.add(oneRec("정연", 209902, 100, 85, 75));
		datasArray_k36.add(oneRec("모모", 209903, 90, 75, 85));
		datasArray_k36.add(oneRec("사나", 209904, 90, 85, 75));
		datasArray_k36.add(oneRec("지효", 209905, 80, 75, 85));
		datasArray_k36.add(oneRec("미나", 209906, 90, 85, 55));
		datasArray_k36.add(oneRec("다연", 209907, 70, 75, 65));
		datasArray_k36.add(oneRec("채영", 209908, 100, 75, 95));
		datasArray_k36.add(oneRec("쯔위", 209909, 80, 65, 95));

		FileWriter file_k36;	//JSON 파일을 쓰기 위한 FileWriter 객체 생성
		try {
			file_k36 = new FileWriter("C:\\Users\\DataSWB\\Desktop\\test.json");
			//FileWriter클래스를 이용하여 해당 경로에 파일을 생성
			file_k36.write(datasArray_k36.toJSONString());	
			//datasArray 객체를 문자열로 변환하여 파일에 작성
			file_k36.flush();	//파일에 내용을 강제로 작성
			file_k36.close();	//파일 닫기
		} catch (IOException e_k36) {	//에러 처리
			// TODO Auto-generated catch block
			e_k36.printStackTrace();	//에러정보 출력
		}
		System.out.println("JSON만든거 : " + datasArray_k36);	//해당 문구와 datasArray 출력
	}

}
