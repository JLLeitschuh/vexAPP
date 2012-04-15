/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ActionPacks;

import Objects.MatchObject;
import Objects.TeamObject;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 *
 * @author jonathanleitschuh
 */

//This task was run in order to create the Array list file.
public class matchWriterTest {
    private String iD = "0";
    private String teaMnamE = "Aperture Science";
    private String teaMnumbeR = "4886";
    private String teaMletteR = "A";
    private String roboTnamE = "The Chabot II";
    private String locatioN = "Thetford, Vermont";
    
    
    
    public void run() throws FileNotFoundException{
        ArrayList<MatchObject> NAME = new ArrayList<MatchObject>();
        NAME.clear();
        matchWriter write = new matchWriter();
        write.replaceMatchObject(NAME);
        
    }
    public static void main(String Args[]) throws FileNotFoundException{
        
        matchWriterTest test = new matchWriterTest();
        test.run();

    }
    
}
