/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ActionPacks;

import Objects.TeamObject;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 *
 * @author jonathanleitschuh
 */

//This task was run in order to create the Array list file.
public class directoryFind {
    private String iD = "0";
    private String teaMnamE = "Aperture Science";
    private String teaMnumbeR = "4886";
    private String teaMletteR = "A";
    private String roboTnamE = "The Chabot II";
    private String locatioN = "Thetford, Vermont";
    private String comment = "We are the creator of this application!";
    
    
    
    public void run() throws FileNotFoundException{
        String fileName = "dist";
        File f = new File(fileName);
        String[] dirListing = f.list();
        System.out.println(dirListing[0]);
        System.out.println(dirListing[1]);
        System.out.println(dirListing[2]);
        
    }
    public static void main(String Args[]) throws FileNotFoundException{
        
        directoryFind test = new directoryFind();
        test.run();

    }
    
}
