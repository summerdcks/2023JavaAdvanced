package PPT9;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class PracticeP20 {	//Ŭ���� ����

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		//�����Լ� ����
		JSONParser parser_k36 = new JSONParser();	//JSONParser ��ü parser ����

		Object obj_k36 = parser_k36.parse(new FileReader("C:\\Users\\DataSWB\\Desktop\\test.json"));
		//pc���� �ش� ����� ���Ϸκ��� JSON �����͸� �о�� obj�� ����

		JSONArray array_k36 = (JSONArray) obj_k36;	//ob�� ��ü�迭�� ��ȯ�� JSONArray ��ü array ����

		System.out.println("******************************");	//���м� ���
		for (int i_k36 = 0; i_k36 < array_k36.size(); i_k36++) { //array��ü�迭�� ������ �ϳ��� ���캽
			JSONObject result_k36 = (JSONObject) array_k36.get(i_k36);	
			//array��ü�迭���� i��° �ε����� JSON ��ü �����Ͽ� result�� ����
			System.out.println("�̸� : " + result_k36.get("name"));	//result�� name�׸� ���
			System.out.println("�й� : " + result_k36.get("studentid"));	//result�� studentid�׸� ���

			JSONArray score_k36 = (JSONArray) result_k36.get("score"); 	//result���� ���� �迭 �����Ͽ� score�� ����
			long kor_k36 = (long) score_k36.get(0);	//score�� 0��° �ε��� �׸��� ���������� ������ ������ ����
			long eng_k36 = (long) score_k36.get(1);//score�� 1��° �ε��� �׸��� ���������� ������ ������ ����
			long mat_k36 = (long) score_k36.get(2);//score�� 2��° �ε��� �׸��� ���������� ������ ������ ����
			System.out.println("���� : " + kor_k36);	//�������� ���
			System.out.println("���� : " + eng_k36);	//�������� ���
			System.out.println("���� : " + mat_k36);	//�������� ���
			System.out.println("���� : " + (kor_k36 + eng_k36 + mat_k36));	//���� ���
			System.out.println("��� : " + (kor_k36 + eng_k36 + mat_k36) / 3.0);	//��� ���
			System.out.println("******************************");	//���м� ���
		}
	}
}
