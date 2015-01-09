import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class highscore here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class highscore extends Actor
{
    /**
     * Act - do whatever the highscore wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        high();
    }    
    private void high()
    {
        GreenfootImage image = new GreenfootImage("Score : " + bola.score, 24, Color.RED, null);
        setImage(image);
    }
}
