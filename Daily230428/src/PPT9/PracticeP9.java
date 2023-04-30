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

public class PracticeP9 {	//클래스 선언

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		//메인함수 선언과 exception처리
		
		DocumentBuilder docBuilder_k36 = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		//파씽을 위한 준비, DocumentBuilder 인스턴스를 생성
		
		Document doc_k36 = docBuilder_k36.parse(new File("C:\\Users\\DataSWB\\Desktop\\testdata.xml"));
		//xml파일을 처리, pc안에 있어서 전체경로를 지정, xml파싱처리

		Element root_k36 = doc_k36.getDocumentElement();
		//XML 파일의 root element를 가져옴 (지금은 쓰이는 곳이 없다)

		//name, studentid, kor, eng, mat 태그의 NodeList를 가져옴
		NodeList tag_name_k36 = doc_k36.getElementsByTagName("name");
		NodeList tag_studentid_k36 = doc_k36.getElementsByTagName("studentid");
		NodeList tag_kor_k36 = doc_k36.getElementsByTagName("kor");
		NodeList tag_eng_k36 = doc_k36.getElementsByTagName("eng");
		NodeList tag_mat_k36 = doc_k36.getElementsByTagName("mat");

		System.out.printf("***********************************\n");	//구분선 출력
		for (int i_k36 = 0; i_k36 < tag_name_k36.getLength(); i_k36++) {
			//모든 학생의 정보를 차례대로 출력해나감
			System.out.printf("이름 : %s\n", tag_name_k36.item(i_k36).getFirstChild().getNodeValue());
			System.out.printf("학번 : %s\n", tag_studentid_k36.item(i_k36).getFirstChild().getNodeValue());
			System.out.printf("국어 : %s\n", tag_kor_k36.item(i_k36).getFirstChild().getNodeValue());
			System.out.printf("영어 : %s\n", tag_eng_k36.item(i_k36).getFirstChild().getNodeValue());
			System.out.printf("수학 : %s\n", tag_mat_k36.item(i_k36).getFirstChild().getNodeValue());
			System.out.printf("***********************************\n");	//구분선 출력
		}
	}
}
