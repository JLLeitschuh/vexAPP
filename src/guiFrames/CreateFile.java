/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package guiFrames;

import java.io.*;
/**
 *
 * @author jonathanleitschuh
 */
public class CreateFile {
    
    public void createTeamFile() throws IOException{
        File f;
        f = new File("Data/teamData/"+"myfile.yml");
        if (!f.exists()) {
            f.createNewFile();
        }
        
    }
    public static void main(String[] args){

        }
    }
