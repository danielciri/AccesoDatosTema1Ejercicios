package Pkglecturaxml;
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class LecturaXml {
	public static void main(String[] args) {
		  File file = new File("C:\\ADA\\empleados.xml");
		  try {
			  //Declaro un builder factory para instancear nuestra clase
			  DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			  //Declaro documentBuilder
			  DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			  //Parseo mi archivo
			 Document doc = dBuilder.parse(file);
			  //Obtengo la lista de los nodos
			  NodeList empleados = doc.getElementsByTagName("empleado");
			//Recorro los nodos
			  for (int i = 0; i < empleados.getLength(); i++) {
				  Node node = empleados.item(i);
				  //Comparo si el tipo de nodo es un elemento 
				  if (node.getNodeType() == Node.ELEMENT_NODE) {
					  //Hago un cast de element a nodo
				    Element eElement = (Element) node;
				    //Valido si tiene hijos
				    if(eElement.hasChildNodes()) {
				    	//OBTENGO una lista de nodos hijos
				      NodeList nl = node.getChildNodes();
				      //Bucle recorro la lista de los nodos hijos
				      for(int j=0; j<nl.getLength(); j++) {
				    	//Obtengo los nodos de la lista  
				        Node nd = nl.item(j);
				        //Imprimo por pantalla
				        System.out.println(nd.getTextContent() + " " + nd.getNodeName());
				      }
				    }
				  }
				}
					

			} catch(Exception e) {
			  e.printStackTrace();
			}	
	}
}
