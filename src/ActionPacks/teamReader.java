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
public class teamReader {
    //private String oldPath = "src/Data/teamData/teams/" + TEAMNUMBER + "_" + TEAMLETTER + ".dat";
    
    public Object readTeamObject(String TEAMNUMBER, String TEAMLETTER) throws ClassNotFoundException{
        
        
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("lib/" + TEAMNUMBER + "_" + TEAMLETTER + ".dat"));
            TeamObject team = (TeamObject)ois.readObject();
            return team;
        } catch (IOException ex) {
            Logger.getLogger(teamReader.class.getName()).log(Level.SEVERE, null, ex);
            TeamObject team = new TeamObject();
            return team;
        } finally {
            try {
                ois.close();
            } catch (IOException ex) {
                Logger.getLogger(teamReader.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
}
