package PPT9;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class PracticeP9 {	//Ŭ���� ����

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		//�����Լ� ����� exceptionó��
		
		DocumentBuilder docBuilder_k36 = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		//�ľ��� ���� �غ�, DocumentBuilder �ν��Ͻ��� ����
		
		Document doc_k36 = docBuilder_k36.parse(new File("C:\\Users\\DataSWB\\Desktop\\testdata.xml"));
		//xml������ ó��, pc�ȿ� �־ ��ü��θ� ����, xml�Ľ�ó��

		Element root_k36 = doc_k36.getDocumentElement();
		//XML ������ root element�� ������ (������ ���̴� ���� ����)

		//name, studentid, kor, eng, mat �±��� NodeList�� ������
		NodeList tag_name_k36 = doc_k36.getElementsByTagName("name");
		NodeList tag_studentid_k36 = doc_k36.getElementsByTagName("studentid");
		NodeList tag_kor_k36 = doc_k36.getElementsByTagName("kor");
		NodeList tag_eng_k36 = doc_k36.getElementsByTagName("eng");
		NodeList tag_mat_k36 = doc_k36.getElementsByTagName("mat");

		System.out.printf("***********************************\n");	//���м� ���
		for (int i_k36 = 0; i_k36 < tag_name_k36.getLength(); i_k36++) {
			//��� �л��� ������ ���ʴ�� ����س���
			System.out.printf("�̸� : %s\n", tag_name_k36.item(i_k36).getFirstChild().getNodeValue());
			System.out.printf("�й� : %s\n", tag_studentid_k36.item(i_k36).getFirstChild().getNodeValue());
			System.out.printf("���� : %s\n", tag_kor_k36.item(i_k36).getFirstChild().getNodeValue());
			System.out.printf("���� : %s\n", tag_eng_k36.item(i_k36).getFirstChild().getNodeValue());
			System.out.printf("���� : %s\n", tag_mat_k36.item(i_k36).getFirstChild().getNodeValue());
			System.out.printf("***********************************\n");	//���м� ���
		}
	}
}
