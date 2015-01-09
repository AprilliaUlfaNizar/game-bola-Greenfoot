import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ubur here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ubur extends pemain
{
    /**
     * Act - do whatever the ubur wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(2);
        setRotation(90);
        if(isAtEdge())
        {
            getWorld().removeObject(this);
        }
    }    
}
