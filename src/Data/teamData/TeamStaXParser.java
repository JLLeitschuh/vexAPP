/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.teamData;

/**
 *
 * @author jonathanleitschuh
 */
// CREDITS FOR THIS CODE GOES TO: Lars Vogel  http://www.vogella.de/articles/JavaXML/article.html

import Objects.TeamObject;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

//import TeamObject;

public class TeamStaXParser {
	static final String ID = "id";
	static final String TEAM = "team";
	static final String TEAMNUMBER = "teamnumber";
	static final String TEAMLETTER = "teamletter";
	static final String TEAMNAME = "teamname";
	static final String LOCATION = "location";
        static final String ROBOTNAME = "robotname";

	@SuppressWarnings({ "unchecked", "null" })
	public List<TeamObject> readConfig(String configFile) {
		List<TeamObject> items = new ArrayList<TeamObject>();
		try {
			// First create a new XMLInputFactory
			XMLInputFactory inputFactory = XMLInputFactory.newInstance();
			// Setup a new eventReader
			InputStream in = new FileInputStream(configFile);
			XMLEventReader eventReader = inputFactory.createXMLEventReader(in);
			// Read the XML document
			TeamObject item = null;

			while (eventReader.hasNext()) {
				XMLEvent event = eventReader.nextEvent();

				if (event.isStartElement()) {
					StartElement startElement = event.asStartElement();
					// If we have a item element we create a new item
					if (startElement.getName().getLocalPart() == (TEAM)) {
						item = new TeamObject();
						// We read the attributes from this tag and add the id
						// attribute to our object
						Iterator<Attribute> attributes = startElement
								.getAttributes();
						while (attributes.hasNext()) {
							Attribute attribute = attributes.next();
							if (attribute.getName().toString().equals(ID)) {
								item.setId(attribute.getValue());
							}

						}
					}

					if (event.isStartElement()) {
						if (event.asStartElement().getName().getLocalPart()
								.equals(TEAMNUMBER)) {
							event = eventReader.nextEvent();
							item.setTeamNumber(event.asCharacters().getData());
							continue;
						}
					}
					if (event.asStartElement().getName().getLocalPart()
							.equals(TEAMLETTER)) {
						event = eventReader.nextEvent();
						item.setTeamLetter(event.asCharacters().getData());
						continue;
					}

					if (event.asStartElement().getName().getLocalPart()
							.equals(TEAMNAME)) {
						event = eventReader.nextEvent();
						item.setTeamName(event.asCharacters().getData());
						continue;
					}

					if (event.asStartElement().getName().getLocalPart()
							.equals(LOCATION)) {
						event = eventReader.nextEvent();
						item.setLocation(event.asCharacters().getData());
						continue;
					}
                                        if (event.asStartElement().getName().getLocalPart()
							.equals(ROBOTNAME)) {
						event = eventReader.nextEvent();
						item.setRobotName(event.asCharacters().getData());
						continue;
					}
				}
				// If we reach the end of an item element we add it to the list
				if (event.isEndElement()) {
					EndElement endElement = event.asEndElement();
					if (endElement.getName().getLocalPart() == (TEAM)) {
						items.add(item);
					}
				}

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (XMLStreamException e) {
			e.printStackTrace();
		}
		return items;
	}

}
