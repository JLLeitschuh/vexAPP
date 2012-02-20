/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ActionPacks;

import Objects.TeamLabelObject;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jonathanleitschuh
 */
public class teamNameWriter {
    public void writeTeamObject(String TEAMNUMBER, String TEAMLETTER, ArrayList<TeamLabelObject> NAME) throws FileNotFoundException{
        // Create a new TeamLabelObject and add the elements to it.
        TeamLabelObject names = new TeamLabelObject();
        names.setTeamNumber(TEAMNUMBER);
        names.setTeamLetter(TEAMLETTER);
        
        //Add this element to the ArrayList Object
        NAME.add(names);
        
        
        //Save this file to the master team list file
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("src/Data/teamData/teams/MASTERTEAMLIST.dat"));
            oos.writeObject(NAME);
            
        } catch (IOException ex) {
            Logger.getLogger(teamNameWriter.class.getName()).log(Level.SEVERE, null, ex);
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
