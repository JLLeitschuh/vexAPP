
import guiFrames.startFrame;
import java.awt.Dimension;
import java.awt.Toolkit;

/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
/**
 *
 * @author jonathanleitschuh
 */
public class VEX_Allaiance_Selection {

    public static void main(String Args[]) {
        startFrame window = new startFrame();
        // Get the size of the screen
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        
        // Determine the new location of the window
        int w = window.getSize().width;
        int h = window.getSize().height;
        int x = (dim.width - w) / 2;
        int y = (dim.height - h) / 2;
        
        // Move the window
        window.setLocation(x, y);
        
        window.setVisible(true);
    }
}
