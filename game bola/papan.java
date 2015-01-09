import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class papan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class papan extends pemain
{
    private String right = "ya";
    private String left = "ya";
    public static String senjata;
    public static int tembak;
    private int jml_tembak;
    /**
     * Act - do whatever the papan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(bola.y == 399)
        {
            setLocation(300,390);
            bola.y++;
        }
        move();
        ambil_plankton();
        ambil_nyawa();
        ambil_ubur();
    }    
    public void move()
    {
        int x = getX();
        if(right != "no")
        {
            if(Greenfoot.isKeyDown("Right"))
            {
                x += 5;
                setLocation(x,getY());
                //setRotation(0);
                if(x >= 550)
                {
                    right = "no";
                }
                else
                {
                    left = "ya";
                }
            }
        }
        if(left != "no")
        {
            if(Greenfoot.isKeyDown("Left"))
            {
                x -= 5;
                setLocation(x,getY());
                //setRotation(-180);
                if(x <= 50)
                {
                    left = "no";
                }
                else
                {
                    right = "ya";
                }
            }
        }
        if(senjata == "yes" && jml_tembak > 0)
        {
            if(Greenfoot.isKeyDown("x"))
            {
                if(tembak == 0)
                {
                    getWorld().addObject(new tembak(),getX(),getY());
                    tembak++;
                    jml_tembak--;
                }
            }
        }
    }
    public void ambil_nyawa()
    {
        Actor nyawa = getOneIntersectingObject(nyawa.class);
        if(nyawa != null)
        {
            getWorld().removeObject(nyawa);
            bola.lives += 1;
        }
    }
    public void ambil_ubur()
    {
        Actor ubur = getOneIntersectingObject(ubur.class);
        if(ubur != null)
        {
            getWorld().removeObject(ubur);
            senjata = "yes";
            jml_tembak = 3;
        }
    }
    public void ambil_plankton()
    {
        Actor plankton = getOneIntersectingObject(plankton.class);
        if(plankton != null)
        {
            getWorld().removeObject(plankton);
            bola.lives -= 1;
        }
    }
}