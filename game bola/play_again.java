import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class play_again here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class play_again extends Actor
{
    /**
     * Act - do whatever the play_again wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this))
        {
            //open opn = new open();
            Greenfoot.setWorld(new open());
            bola.level = "satu";
            bola.lempar = "no";
            bola.jml_din = 0;
            bola.jml_bat = 0;
            bola.jml_ema = 0;
            bola.mantul = "";
            bola.from = "";
            bola.belok = "";
            bola.score = 0;
            bola.lives = 5;
        }
    }    
}
