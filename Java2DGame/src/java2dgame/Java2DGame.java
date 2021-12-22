
package java2dgame;

import java.util.HashSet;
import javax.swing.JFrame;


public class Java2DGame {

    public static void main(String[] args) {
        gameScreen screen = new gameScreen("Space Game");
        
        screen.setResizable(false);
        screen.setFocusable(false);
        screen.setSize(800,600);
        screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
        Game game = new Game();
        game.requestFocus();
        game.addKeyListener(game);
        game.setFocusable(true);
        game.setFocusTraversalKeysEnabled(false); 
        
        screen.add(game);
        screen.setVisible(true);
    }
 }
   
