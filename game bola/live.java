import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class live here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class live extends Actor
{
    /**
     * Act - do whatever the live wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        live();
    }    
    private void live()
    {
        GreenfootImage image = new GreenfootImage("Nyawa : " + bola.lives, 24, Color.RED, null);
        setImage(image);
    }
}
