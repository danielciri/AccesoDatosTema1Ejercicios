package PkgEscribirFichObject;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class EscrituraFich {
	public static void main(String[] args) {
		try {
			//Declaramos el document builder para instanciar
			  DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			  //Declaramos el documento builder
			  DocumentBuilder db = dbf.newDocumentBuilder();
			  //Declaramos el doc
			  Document doc = db.newDocument();
			  //Definimos el nodo raiz  
			  Element eRaiz = doc.createElement("persona");
			  doc.appendChild(eRaiz);
			  //Declaramos los elementos y le asignamos el valor
			  Element eNombre = doc.createElement("nombre");
			  eNombre.appendChild(doc.createTextNode("Juan"));
			  eRaiz.appendChild(eNombre);
			  
			  Element eEdad= doc.createElement("edad");
			  eEdad.appendChild(doc.createTextNode("21"));
			  eRaiz.appendChild(eEdad);
			  //Clases implementadas para la creacion del archivo xml
			  TransformerFactory transformerFactory = TransformerFactory.newInstance();
			  Transformer transformer = transformerFactory.newTransformer();
			  DOMSource source = new DOMSource(doc);
			  StreamResult result = new StreamResult(new File("C:\\ADA\\persona.xml"));
			  transformer.transform(source, result);
			  System.out.println("Xml generado exitosamente!!");
			  
			} catch(Exception e) {
			  e.printStackTrace();
			}
	}

}
