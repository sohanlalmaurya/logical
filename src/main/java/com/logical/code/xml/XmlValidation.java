package com.logical.code.xml;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XmlValidation {
	public static void main(String[] args) throws SAXException, IOException {
		System.out.println(validateXmlFile("student.xml", "student.xsd"));
		System.out.println(readXmlFile("student.xml"));
	}

	public static List<Student> readXmlFile(String xmlFile) {

		List<Student> list = new ArrayList<>();
		try {
			DocumentBuilderFactory builder = DocumentBuilderFactory.newInstance();
			DocumentBuilder documentBuilder = builder.newDocumentBuilder();
			Document doc = documentBuilder.parse(xmlFile);
			doc.getDocumentElement().normalize();
			System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
			NodeList nodeList = doc.getElementsByTagName("student");
			for (int i = 0; i < nodeList.getLength(); i++) {
				Node node = nodeList.item(i);
				if (node.getNodeType() == Node.ELEMENT_NODE) {
					Element element = (Element) node;

					list.add(new Student(Integer.valueOf(element.getAttribute("rollno").toString()),
							element.getElementsByTagName("firstname").item(0).getTextContent(),
							element.getElementsByTagName("lastname").item(0).getTextContent(),
							element.getElementsByTagName("nickname").item(0).getTextContent(),
							Integer.valueOf(element.getElementsByTagName("marks").item(0).getTextContent())));
				}
			}
		} catch (Exception e) {
		}
		return list;
	}

	private static boolean validateXmlFile(String xmlFile, String xsdFile) {
		try {
			SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
			Schema schema = factory.newSchema(new File(xsdFile));
			Validator validator = schema.newValidator();
			validator.validate(new StreamSource(new File(xmlFile)));
		} catch (IOException e) {
			System.out.println("Exception: " + e.getMessage());
			return false;
		} catch (SAXException e1) {
			System.out.println("SAX Exception: " + e1.getMessage());
			return false;
		}
		return true;
	}
}
