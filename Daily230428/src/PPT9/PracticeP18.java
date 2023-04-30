package PPT9;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class PracticeP18 {

	public static JSONObject oneRec(String name_k36, int studentid_k36, int kor_k36, 
															int eng_k36, int mat_k36) {
		//JSON �������� �ϳ��� �л��� ������ ���� JSONObject�� ��ȯ�ϴ� �޼ҵ�
		JSONObject dataObject_k36 = new JSONObject();	//���ο� JSONObject ��ü dataObject ����
		dataObject_k36.put("name", name_k36);	//dataObject�� �л� �̸� �߰�
		dataObject_k36.put("studentid", studentid_k36);	//dataObject�� �л� �й� �߰�

		JSONArray score_k36 = new JSONArray();	//JSONArray ��ü score ����
		score_k36.add(kor_k36);	//score�� ���� ���� �߰�
		score_k36.add(eng_k36);	//score�� ���� ���� �߰�
		score_k36.add(mat_k36);	//score�� ���� ���� �߰�
		dataObject_k36.put("score", score_k36);	//dataObject�� �������� �߰�

		return dataObject_k36;	//dataObject ��ü�� ��ȯ
	}

	public static void main(String[] args) {
		//JSON �������� �л����� ������ ���� JSONArray�� �����ϰ�, ���Ϸ� �����ϴ� �޼ҵ�
		JSONObject jsonObject_k36 = new JSONObject();	//JSONObject ��ü jsonObject ����
		JSONArray datasArray_k36 = new JSONArray();	//JSONArray ��ü datasArray ����
		JSONObject dataObject_k36 = new JSONObject();	
		//�л� ���� JSONObject ��ü dataObject �����л�
		dataObject_k36.put("name", "����");	//�л� �̸� �߰�	
		dataObject_k36.put("studentid", 209901);	//�й� �߰�
		JSONArray score_k36 = new JSONArray();	//JSONArray ��ü score �߰�
		score_k36.add(90);	//���� �߰�
		score_k36.add(100);	//���� �߰�
		score_k36.add(95);	//���� �߰�
		dataObject_k36.put("score", score_k36);	//dataObject�� �������� �߰�
		datasArray_k36.add(dataObject_k36);	//�л� ������ datasArray�� �߰�

		//JSONObject ��ü�� oneRec�� �����ϰ�, �л� �̸�, �й�, ���� ������ �߰��� ��,
		//�л� ���� JSONArray ��ü�� datasArray�� �߰�
		datasArray_k36.add(oneRec("����", 209902, 100, 85, 75));
		datasArray_k36.add(oneRec("���", 209903, 90, 75, 85));
		datasArray_k36.add(oneRec("�糪", 209904, 90, 85, 75));
		datasArray_k36.add(oneRec("��ȿ", 209905, 80, 75, 85));
		datasArray_k36.add(oneRec("�̳�", 209906, 90, 85, 55));
		datasArray_k36.add(oneRec("�ٿ�", 209907, 70, 75, 65));
		datasArray_k36.add(oneRec("ä��", 209908, 100, 75, 95));
		datasArray_k36.add(oneRec("����", 209909, 80, 65, 95));

		FileWriter file_k36;	//JSON ������ ���� ���� FileWriter ��ü ����
		try {
			file_k36 = new FileWriter("C:\\Users\\DataSWB\\Desktop\\test.json");
			//FileWriterŬ������ �̿��Ͽ� �ش� ��ο� ������ ����
			file_k36.write(datasArray_k36.toJSONString());	
			//datasArray ��ü�� ���ڿ��� ��ȯ�Ͽ� ���Ͽ� �ۼ�
			file_k36.flush();	//���Ͽ� ������ ������ �ۼ�
			file_k36.close();	//���� �ݱ�
		} catch (IOException e_k36) {	//���� ó��
			// TODO Auto-generated catch block
			e_k36.printStackTrace();	//�������� ���
		}
		System.out.println("JSON����� : " + datasArray_k36);	//�ش� ������ datasArray ���
	}

}
