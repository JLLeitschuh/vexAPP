/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ActionPacks;

import Objects.TeamObject;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 *
 * @author jonathanleitschuh
 */

//This task was run in order to create the Array list file.
public class writerTest {
    private String iD = "0";
    private String teaMnamE = "Aperture Science";
    private String teaMnumbeR = "4886";
    private String teaMletteR = "A";
    private String roboTnamE = "The Chabot II";
    private String locatioN = "Thetford, Vermont";
    
    
    
    public void run() throws FileNotFoundException{
        ArrayList<TeamObject> NAME = new ArrayList<TeamObject>();
        
        teamNameWriter write = new teamNameWriter();
        write.writeTeamObject(iD, teaMnamE, teaMnumbeR, teaMletteR, roboTnamE, locatioN, NAME);
        
        TeamObject n = new TeamObject();
        n.setId(iD);
        n.setTeamName(teaMnamE);
        n.setTeamNumber(teaMnumbeR);
        n.setTeamLetter(teaMletteR);
        n.setRobotName(roboTnamE);
        n.setLocation(locatioN);
        
        teamWriter writer = new teamWriter();
        writer.writeTeamObject(teaMnumbeR, teaMletteR, n);
    }
    public static void main(String Args[]) throws FileNotFoundException{
        
        writerTest test = new writerTest();
        test.run();

    }
    
}
