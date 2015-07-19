package Java_DOM;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Attr;
import org.w3c.dom.Comment;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

//一个比较综合的xml解析例子
public class DomTest2 {

	public static void main(String[] args) throws Exception {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.parse(new File("student.xml"));

		Element root = doc.getDocumentElement();
		parseElement(root);
	}

	private static void parseElement(Element element) {

		String tagName = element.getTagName();
		NodeList children = element.getChildNodes();
		System.out.print("<" + tagName);
		NamedNodeMap attributes = element.getAttributes();

		if (null != attributes) {
			for (int i = 0; i < attributes.getLength(); i++) {
				Attr attr = (Attr) attributes.item(i);
				String name = attr.getName();
				String value = attr.getValue();
				System.out.print(" " + name + "=\"" + value + "\"");
			}
		}
		System.out.print(">");
		for (int i = 0; i < children.getLength(); i++) {
			Node node = children.item(i);
			short nodeType = node.getNodeType();
			if (nodeType == node.ELEMENT_NODE) {
				parseElement((Element) node);
			} else if (nodeType == node.TEXT_NODE) {
				System.out.print(node.getNodeValue());
			} else if (nodeType == node.COMMENT_NODE) {
				System.out.print("<!--");
				Comment comment = (Comment) node;
				String data = comment.getData();
				System.out.print(data);
				System.out.print("-->");
			}
		}
		System.out.print("</" + tagName + ">");
	}

}
