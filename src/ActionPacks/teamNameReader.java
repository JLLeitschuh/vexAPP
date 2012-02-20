/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ActionPacks;

import Objects.TeamObject;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jonathanleitschuh
 */
public class teamNameReader {
    public Object readTeamObject(String TEAMNUMBER, String TEAMLETTER) throws ClassNotFoundException{
        
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("src/Data/teamData/teams/" + TEAMNUMBER + "_" + TEAMLETTER + ".dat"));
            TeamObject team = (TeamObject)ois.readObject();
            return team;
        } catch (IOException ex) {
            Logger.getLogger(teamReader.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            try {
                ois.close();
            } catch (IOException ex) {
                Logger.getLogger(teamReader.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
}
