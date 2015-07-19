package Java_DOM;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class DomTest1 {

	public static void main(String[] args) throws Exception {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document document = db.parse(new File("candidate.xml"));
		/*String nodeName = document.getDocumentElement().getNodeName();
		System.out.println("root:"+nodeName);*/
		NodeList list = document.getElementsByTagName("PERSON");
		for (int i = 0; i < list.getLength(); i++) {
			Element element = (Element)list.item(i);
			String name = element.getElementsByTagName("NAME").item(0).getFirstChild().getNodeValue();
			System.out.println("name:"+name);
			String address = element.getElementsByTagName("ADDRESS").item(0).getFirstChild().getNodeValue();
			System.out.println("address:"+address);
			String tel = element.getElementsByTagName("TEL").item(0).getFirstChild().getNodeValue();
			System.out.println("tel:"+tel);
			String fax = element.getElementsByTagName("FAX").item(0).getFirstChild().getNodeValue();
			System.out.println("fax:"+fax);
			String email = element.getElementsByTagName("EMAIL").item(0).getFirstChild().getNodeValue();
			System.out.println("email:"+email);
			System.out.println("-------------------------------");
		}
	}

}
