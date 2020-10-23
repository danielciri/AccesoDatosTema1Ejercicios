package PkgcrearEmpleadoXm;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;
import java.io.*;
public class CrearEmpleadoXm {
  public static void main(String[] args) throws IOException{
	  //Declaracion de la ruta y el fichero
    File f = new File("C:\\ADA\\AleatorioEmple.dat");
    if(!f.exists()) {
    	System.out.println("Directorio no existente");
    }else {
    	RandomAccessFile raf = new RandomAccessFile(f, "r");
        //Declaracion de las variables
        int id, departamento;
        float salario;
        String apellidoS;
        //Capturamos los errores
        try {

          DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
          DocumentBuilder builder = factory.newDocumentBuilder();
          DOMImplementation implementation = builder.getDOMImplementation();
          Document document = implementation.createDocument(null, "Empleados", null);
          document.setXmlVersion("1.0");
          //Implementamos un bucle for
          for(;;) {
        	  //Leemos variables por teclado
            id = raf.readInt();
            apellidoS = raf.readUTF();
            departamento = raf.readInt();
            salario = raf.readFloat();
            //Imprimimos por pantalla
            System.out.println("ID: " + id + "; Apellido: " + apellidoS +
                "; Departamento: " + departamento + "; Salario: " + salario);
            Element raiz = document.createElement("empleado");
            //Obtenemos los datos
            document.getDocumentElement().appendChild(raiz);
            crearElemento("ID",Integer.toString(id),raiz,document); // añadir ID
            crearElemento("apellido",apellidoS.trim(),raiz,document); // añadir apellido
            crearElemento("departamento",Integer.toString(departamento),raiz,document); // añadir DEP
            crearElemento("salario",Float.toString(salario),raiz,document); // añadir salario
            if (raf.getFilePointer() >= raf.length()) break;
          }
          //Implementamos el DOM
          Source source = new DOMSource(document);
          Result result = new StreamResult (new File("C:\\ADA\\Empleados.xml"));
          Transformer transformer = TransformerFactory.newInstance().newTransformer();
          transformer.transform(source,result);
        }catch(EOFException eofe) {
          System.out.println("Error End Of File: " + eofe.getMessage());
        }catch(IOException e) {
          System.out.println("Error IO: " + e.getMessage());
        }catch(TransformerConfigurationException tce) {
          System.out.println("Error Transformer Configuration: " + tce.getMessage());
        }catch(TransformerException te) {
          System.out.println("Error Transformer: " + te.getMessage());
        }catch(ParserConfigurationException pce) {
          System.out.println("Error Parser Configuration: " + pce.getMessage());
        }finally {
          raf.close();
        }
       lecturaXml();
    	
    }
    
  }
  static void crearElemento(String datoEmpleado, String valor, Element raiz, Document document) {
    Element elem = document.createElement (datoEmpleado); //creamos hijo
    Text text = document.createTextNode(valor); // damos valor al campo
    raiz.appendChild(elem); //pegamos el elemento hijo a la raiz
    elem.appendChild(text); //pegamos el valor
  }
  public static void lecturaXml() {
	  File file = new File("C:\\ADA\\empleados.xml");
	  try {
		  DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		  DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		  Document doc = dBuilder.parse(file);
		  NodeList empleados = doc.getElementsByTagName("empleado");
		
		  for (int i = 0; i < empleados.getLength(); i++) {
				Node node = empleados.item(i);
				if (node.getNodeType() == Node.ELEMENT_NODE) {
				    Element eElement = (Element) node;
				    if(eElement.hasChildNodes()) {
				      NodeList nl = node.getChildNodes();
				      for(int j=0; j<nl.getLength(); j++) {
				        Node nd = nl.item(j);
				        System.out.println(nd.getTextContent());
				      }
				    }
				  }
				
			}
		} catch(Exception e) {
		  e.printStackTrace();
		}
	
  }
}
