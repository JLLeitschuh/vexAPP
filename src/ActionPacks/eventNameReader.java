/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ActionPacks;

import Objects.MatchObject;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jonathanleitschuh
 */
public class eventNameReader {
    public ArrayList<MatchObject> readEventNameObject() throws ClassNotFoundException{
        
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("src/Data/eventData/events/MASTEREVENTLIST.dat"));
            ArrayList<MatchObject> match = (ArrayList<MatchObject>)ois.readObject();
            return match;
        } catch (IOException ex) {
            Logger.getLogger(teamReader.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
            return null;
        } finally {
            try {
                ois.close();
            } catch (IOException ex) {
                Logger.getLogger(teamReader.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println(ex.getMessage());
            }
        }
        
    }
    
}
