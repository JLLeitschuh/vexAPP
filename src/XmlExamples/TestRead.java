/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package XmlExamples;

/**
 *
 * @author jonathanleitschuh
 */

import java.util.List;


public class TestRead {
	public static void main(String args[]) {
		StaXParser read = new StaXParser();
		List<Item> readConfig = read.readConfig("src/XmlExamples/config.xml");
		for (Item item : readConfig) {
			System.out.println(item);
		}
	}
}