import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hadiah here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class nyawa extends pemain
{
    /**
     * Act - do whatever the hadiah wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        setRotation(90);
        move(2);
        if(isAtEdge())
        {
            getWorld().removeObject(this);
        }
    }
}
