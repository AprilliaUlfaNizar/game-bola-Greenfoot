import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tembak here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tembak extends pemain
{
    String tabrak;
    /**
     * Act - do whatever the tembak wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(5);
        setRotation(-90);
        tembak_dinding();
        tembak_batu();
        if(isAtEdge())
        {
            getWorld().removeObject(this);
            papan.tembak = 0;
        }
        if(tabrak == "yes")
        {
            getWorld().removeObject(this);
            tabrak = "no";
        }
    }    
    public void tembak_dinding()
    {
        Actor dinding = getOneIntersectingObject(dinding.class);
        if(dinding != null)
        {
            getWorld().removeObject(dinding);
            bola.jml_din++;
            //getWorld().removeObject(this);
            tabrak = "yes";
            papan.tembak = 0;
            if(dinding != null)
            {
                bola.score += 10;
            }
        }
    }
    public void tembak_batu()
    {
        Actor batu = getOneIntersectingObject(batu.class);
        if(batu != null)
        {
            getWorld().removeObject(batu);
            bola.jml_bat++;
            //getWorld().removeObject(this);
            tabrak = "yes";
            papan.tembak = 0;
            if(batu != null)
            {
                bola.score += 20;
            }
        }
    }
    public void tembak_emas()
    {
        Actor emas = getOneIntersectingObject(emas.class);
        if(emas != null)
        {
            getWorld().removeObject(emas);
            bola.jml_ema++;
            tembak bak = new tembak();
            //getWorld().removeObject(bak);
            tabrak = "yes";
            papan.tembak = 0;
            if(emas != null)
            {
                bola.score += 100;
            }
        }
    }
}