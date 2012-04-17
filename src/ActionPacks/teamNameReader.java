/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ActionPacks;

import Objects.TeamObject;
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
public class teamNameReader {
    private String oldPath = "src/Data/teamData/teams/MASTERTEAMLIST.dat";
    private String newPath = "lib/MASTERTEAMLIST.dat";
    
    public ArrayList<TeamObject> readTeamNameObject() throws ClassNotFoundException{
        
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(newPath));
            ArrayList<TeamObject> team = (ArrayList<TeamObject>)ois.readObject();
            return team;
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
