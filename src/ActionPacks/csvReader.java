/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ActionPacks;

import Objects.TeamObject;
import com.csvreader.CsvReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author jonathanleitschuh
 */
public class csvReader {

    private String path = "lib/TEAMLIST.csv";

    public ArrayList<TeamObject> readTeamObject() {

        ArrayList<TeamObject> match = new ArrayList<TeamObject>();
        try {

            CsvReader teams = new CsvReader(path);

            teams.readHeaders();
            
            
            while (teams.readRecord()) {
                TeamObject read = new TeamObject();
                
                read.setId(teams.get("ID"));
                read.setTeamName(teams.get("TeamName"));
                read.setTeamNumber(teams.get("TeamNumber"));
                read.setTeamLetter(teams.get("TeamLetter"));
                read.setRobotName(teams.get("RobotName"));
                read.setLocation(teams.get("Location"));
                read.setTeamComment(teams.get("TeamComment"));
                
                
                System.out.println(read.getTeamName());
                System.out.println(read.getTeamNumber());
                System.out.println(read.getRobotName());
                System.out.println(read.getLocation());
                
                match.add(read);
            }

            // perform program logic here


            teams.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return match;
    }

    public void test() {
        System.out.println(readTeamObject().get(0).getRobotName());
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        csvReader derp = new csvReader();

        derp.test();

    }
}
