import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class open here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class open extends World
{
    //int btn_state = 0;
    /**
     * Constructor for objects of class open.
     * 
     */
    public open()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        play p = new play();
        addObject(p,100,365);   

        prepare();
    }
    private void prepare()
    {
        help help = new help();
        addObject(help, 539, 368);
    }
}
