
package java2dgame;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageInputStream;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Game extends JPanel implements KeyListener,ActionListener{
    Timer timer = new Timer(5,this);
    
    private int passingTime = 0;
    private int negativefire = 0;
    
    private BufferedImage image;
    
    private ArrayList<Fire> fires = new ArrayList<Fire>();
    
    private int firedirY = 1;
    private int ballX = 0;
    private int balldirX = 2;
    private int spaceshipX = 0;
    private int dirSpaceX = 20;
    
    public boolean check(){
        for(Fire fire:fires){
            if(new Rectangle(fire.getX(),fire.getY(),10,20).intersects(new Rectangle(ballX,0,20,20))){
            return true;
        }
        }return false;
    }
    
     public Game() {
        try {
            image = ImageIO.read(new FileImageInputStream(new File("spaceship.png")));
        } catch (IOException ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
        }
        setBackground(Color.WHITE);
        
        timer.start();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        passingTime += 5;
        g.setColor(Color.orange);
        g.fillOval(ballX, 0, 15, 15);
        g.drawImage(image, spaceshipX, 490,image.getWidth()/ 20,image.getHeight()/22,this);
        
        for(Fire fire: fires){
            if(fire.getY() < 0){
                fires.remove(fire);
            }
        }
        g.setColor(Color.RED);
        for(Fire fire:fires){
            g.fillRect(fire.getX(), fire.getY(),10,20);
        }
        if(check()){
            timer.stop();
            String message = "You Win.\n" +
                             "Number of Negative Fire: " + negativefire + 
                             "\nThe passing Time: " + (passingTime / 1000.0);
            JOptionPane.showMessageDialog(this, message);
            System.exit(0);  
        }
    }

    @Override
    public void repaint() {
        super.repaint(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
     
    @Override
    public void keyTyped(KeyEvent e) {

    }
    
    @Override
    public void keyPressed(KeyEvent e) {
           int c = e.getKeyCode();
        
        if(c == KeyEvent.VK_LEFT){
            if(spaceshipX <= 0){
                spaceshipX = 0;
                
            }else{
                
                spaceshipX -= dirSpaceX;
            }
            
        }else if(c == KeyEvent.VK_RIGHT){
            if( spaceshipX >= 745){
            spaceshipX = 745;
            }else{
                spaceshipX += dirSpaceX; 
            }
        }
        
        else if(c == KeyEvent.VK_CONTROL){
            fires.add(new Fire(spaceshipX + 15,490));
            
            negativefire++; 
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        for(Fire fire:fires){
            
            fire.setY(fire.getY() - firedirY);
        }
        ballX += balldirX;
        
        if (ballX >= 750){
            balldirX = -balldirX;
        }
        if(ballX <= 0){
            balldirX = -balldirX;
        }
        repaint();
    }

    private void intersects(Rectangle rectangle) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
