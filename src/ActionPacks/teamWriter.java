/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ActionPacks;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jonathanleitschuh
 */
public class teamWriter {
    public void writeTeamObject(String TEAMNUMBER, String TEAMLETTER, Object Team) throws FileNotFoundException{
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(new File("lib/" + TEAMNUMBER + "_" + TEAMLETTER + ".dat")));
            oos.writeObject(Team);
            
        } catch (IOException ex) {
            Logger.getLogger(teamWriter.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                oos.close();
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        
    }
    
}
