/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package guiFrames;

/**
 *
 * @author jonathanleitschuh
 */
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;



public class ReadXMLFile {

    public static TeamList LoadTeamData(String fXmlFile) throws ParserConfigurationException, SAXException, IOException{
        
        //File fXmlFile = new File("src/guiFrames/Data/teamData/masterTeamList.xml");
        File reader = new File(fXmlFile);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(fXmlFile);
        doc.getDocumentElement().normalize();

        System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
        NodeList nList = doc.getElementsByTagName("team");
        System.out.println("-----------------------");
        
        s1 = new TeamList(new teamInfo(teamNumber,teamLetter,teamName));
        for (int temp = 0; temp < nList.getLength(); temp++) {
            
            Node nNode = nList.item(temp);
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                Element eElement = (Element) nNode;

                String teamNumber = getTagValue("teamnumber", eElement);
                String teamLetter = getTagValue("teamletter", eElement);
                String teamName = getTagValue("teamname", eElement);

            }
        } 

    }

    public static void main(String argv[]) {

        try {
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String getTagValue(String sTag, Element eElement) {
        NodeList nlList = eElement.getElementsByTagName(sTag).item(0).getChildNodes();

        Node nValue = (Node) nlList.item(0);

        return nValue.getNodeValue();
    }
}
