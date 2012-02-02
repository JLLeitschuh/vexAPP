/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package guiFrames;

/**
 *
 * @author jonathanleitschuh
 */

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;

import com.sun.org.apache.xml.internal.serialize.XMLSerializer;
import com.sun.org.apache.xml.internal.serialize.OutputFormat;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class writeToXML {
    
    public writeToXML(){
        try{
            this.writeTeamsXML();
            
        }
        catch(ParserConfigurationException parse){
            
        }
        catch(FileNotFoundException filenotfound){
            
        }
        catch(IOException ioexception){
            
        }
    }
    
    private void writeTeamsXML() throws ParserConfigurationException, FileNotFoundException, IOException{
        //DocumentBuilderFactory
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        //DocumentBuilder
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
        //Document
        Document xmlDoc = docBuilder.newDocument();
        
        //Build XML Elements and Text Nodes
        Element rootElement = xmlDoc.createElement("Teams");
        
        Element mainElement = xmlDoc.createElement("team");
        mainElement.setAttribute("number", "4886");
        
        mainElement.appendChild(this.setTeamAtribute("name", "Aperature", xmlDoc));
        
        rootElement.appendChild(mainElement);
        
        xmlDoc.appendChild(rootElement);
        
        
        
        //Set  Output format
        OutputFormat outFormat = new OutputFormat(xmlDoc);
        outFormat.setIndenting(true);
        
        //Declare the File
        File xmlFile = new File("src/guiFrames/Data/teamData/masterTeamList.xml");
        //Declare the File OutputStream
        FileOutputStream outStream  = new FileOutputStream(xmlFile);
        
        //XMLSerializer to serialize the XML data
        XMLSerializer serializer = new XMLSerializer(outStream, outFormat);
        //with the specified Output format
        serializer.serialize(xmlDoc);
    }
    
    private Element setTeamAtribute(String name, String value, Document xmlDoc){
        
        Text teamName = xmlDoc.createTextNode(value);
        Element teamLabel = xmlDoc.createElement(name);
        teamLabel.appendChild(teamName);
        
        return teamLabel;
        
    }
    
    public static void main(String[] args){
        
        writeToXML teamsXML = new writeToXML();
        
    }
    
}
