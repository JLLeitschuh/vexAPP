/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ActionPacks;

import Objects.TeamObject;
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
    private int h = 0;

    private int placeFinder(int ID, ArrayList<TeamObject> count) {
        
        int size = (count.size()-1);
        
        if (size == 0) {
            return 0;
        } else {
            
            try {
                for (int c = 0; c <= size; c++) {
                    
                    if ((count.get(c).getIdNumber()) == ID) {
                        this.h = c;
                    }
                }

                return this.h;
                
            } catch (Error e) {
                System.out.println(e);
                return 0;
            }
        }
    }

    public void writeTeamObject(String id, String teamName, String teamNumber, String teamLetter,
            String Location, String RobotName, ArrayList<TeamObject> NAME) throws FileNotFoundException {
        // Create a new TeamLabelObject and add the elements to it.

        TeamObject NEW = new TeamObject();
        NEW.setId(id);
        NEW.setTeamName(teamName);
        NEW.setTeamNumber(teamNumber);
        NEW.setTeamLetter(teamLetter);
        NEW.setLocation(Location);
        NEW.setRobotName(RobotName);

        //Add this element to the ArrayList Object

        NAME.add(NEW);

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
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }

    }

    public void writeOldTeamObject(String idNUMBER, String teamName, String teamNumber, String teamLetter,
            String Location, String RobotName, ArrayList<TeamObject> NAME) throws FileNotFoundException {
        // Create a new TeamLabelObject and add the elements to it.

        TeamObject NEW = new TeamObject();
        NEW.setId(idNUMBER);
        NEW.setTeamName(teamName);
        NEW.setTeamNumber(teamNumber);
        NEW.setTeamLetter(teamLetter);
        NEW.setLocation(Location);
        NEW.setRobotName(RobotName);
        //Add this element to the ArrayList Object
        int thisId = placeFinder(NEW.getIdNumber(), NAME);
        NAME.set(thisId, NEW);
        
        
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
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }

    }
}
