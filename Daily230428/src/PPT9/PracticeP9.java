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

public class PracticeP9 {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {

		DocumentBuilder docBuilder_k36 = DocumentBuilderFactory.newInstance().newDocumentBuilder();

		Document doc_k36 = docBuilder_k36.parse(new File("C:\\Users\\DataSWB\\Desktop\\testdata.xml"));

		Element root_k36 = doc_k36.getDocumentElement();

		NodeList tag_name_k36 = doc_k36.getElementsByTagName("name");
		NodeList tag_studentid_k36 = doc_k36.getElementsByTagName("studentid");
		NodeList tag_kor_k36 = doc_k36.getElementsByTagName("kor");
		NodeList tag_eng_k36 = doc_k36.getElementsByTagName("eng");
		NodeList tag_mat_k36 = doc_k36.getElementsByTagName("mat");

		System.out.printf("***********************************\n");
		for (int i_k36 = 0; i_k36 < tag_name_k36.getLength(); i_k36++) {
			System.out.printf("이름 : %s\n", tag_name_k36.item(i_k36).getFirstChild().getNodeValue());
			System.out.printf("학번 : %s\n", tag_studentid_k36.item(i_k36).getFirstChild().getNodeValue());
			System.out.printf("국어 : %s\n", tag_kor_k36.item(i_k36).getFirstChild().getNodeValue());
			System.out.printf("영어 : %s\n", tag_eng_k36.item(i_k36).getFirstChild().getNodeValue());
			System.out.printf("수학 : %s\n", tag_mat_k36.item(i_k36).getFirstChild().getNodeValue());
			System.out.printf("***********************************\n");
		}
	}
}
