import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bola here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bola extends pemain
{
    public static String level = "satu";
    private String right = "ya";
    private String left = "ya";
    public static String lempar = "no";
    public static int x,y;
    public static int jml_din, jml_bat, jml_ema, jml_dinding, jml_batu;
    public static int score;
    public static int lives = 5;
    public static String belok;
    public static String mantul;
    public static String from;
    public static int bonus = 0;
    public static String high;
    /**
     * Act - do whatever the bola wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(lives == 0)
        {
            //Greenfoot.stop();
            end end = new end();
            Greenfoot.setWorld(end);
            high = "yes";
        }
        if(lempar == "no")
        {
            move();
            tembak();
            if(belok == "kanan")
            {
                setRotation(-45);
            }
            else
            {
                setRotation(-135);
            }
        }
        if(lempar == "yes")
        {
            if(getX() == 599)
            {
                from = "kanan";
            }
            else if(getX() == 1)
            {
                from = "kiri";
            }
            move(5);
            gerak();
            tabrak_papan();
            tabrak_dinding();
            tabrak_batu();
            tabrak_emas();
            y = getY();
            if(belok == "kanan")
            {
                if(isAtEdge())
                {
                    turn(-45);
                }
            }
            else if(belok == "kiri")
            {
                if(isAtEdge())
                {
                    turn(45);
                }
            }
            if(y == 399)
            {
                lives -= 1;
                lempar = "no";
                setLocation(300,370);
                mantul = "";
                from = "";
                belok = "";
            }
        }
        if(level == "satu")
        {
            if(jml_din == 51 && jml_bat == 7)
            {
                level2 l2 = new level2();
                Greenfoot.setWorld(l2);
                level = "dua";
                lempar = "no";
                jml_din = 0;
                jml_bat = 0;
                jml_ema = 0;
                mantul = "";
                from = "";
                belok = "";
            }
        }
        else if(level == "dua")
        {
            if(jml_din == 47 && jml_bat == 9 && jml_ema == 1)
            {
                level3 l3 = new level3();
                Greenfoot.setWorld(l3);
                level = "tiga";
                lempar = "no";
                jml_din = 0;
                jml_bat = 0;
                jml_ema = 0;
                mantul = "";
                from = "";
                belok = "";
            }
        }
        else if(level == "tiga")
        {
            if(jml_din == 37 && jml_bat == 10 && jml_ema == 2)
            {
                finaly fin = new finaly();
                Greenfoot.setWorld(fin);
                level = "final";
                lempar = "no";
                jml_din = 0;
                jml_bat = 0;
                jml_ema = 0;
                mantul = "";
                from = "";
                belok = "";
            }
        }
        else if(level == "final")
        {
            if(bonus == 11)
            {
                end end = new end();
                Greenfoot.setWorld(end);
                level = "satu";
                lempar = "no";
                jml_din = 0;
                jml_bat = 0;
                jml_ema = 0;
                mantul = "";
                from = "";
                belok = "";
                high = "yes";
            }
            if(lempar == "yes")
            {
                tabrak_terakhir();
            }
        }
    }    
    public void move()
    {
        x = getX();
        if(right != "no")
        {
            if(Greenfoot.isKeyDown("Right"))
            {
                belok = "kanan";
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
                belok = "kiri";
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
    }
    public void gerak()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            mantul = "kanan";
        }
        if(Greenfoot.isKeyDown("left"))
        {
           mantul = "kiri";
        }
    }
    public void tembak()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            lempar = "yes";
        }
    }
    public void tabrak_papan()
    {
       Actor papan =  getOneIntersectingObject(papan.class);
       if(papan != null)
       {
           if(mantul == "kiri")
           {
               if(from == "kanan")
               {
                   turn(90);
               }
               else
               {
                   turn(180);
               }
               belok = mantul;
           }
           else if(mantul == "kanan")
           {
               if(from == "kiri")
               {
                   turn(90);
               }
               else
               {
                   turn(180);
               }
               belok = mantul;
           }
       }
    }
    public void tabrak_dinding()
    {
       Actor dinding =  getOneIntersectingObject(dinding.class);
       if(dinding != null)
       {
           getWorld().removeObject(dinding);
           turn(90);
           jml_din++;
           jml_dinding++;
           score += 10;
           if(jml_dinding == 10)
           {
               plankton pla = new plankton();
               getWorld().addObject(pla,getX(),getY());
               jml_dinding = 0;
           }
       }
    }
    public void tabrak_batu()
    {
       Actor batu =  getOneIntersectingObject(batu.class);
       if(batu != null)
       {
           getWorld().removeObject(batu);
           turn(90);
           jml_bat++;
           jml_batu++;
           score += 20;
           if(jml_batu == 5)
           {
               ubur ub = new ubur();
               getWorld().addObject(ub,getX(),getY());
               jml_batu = 0;
           }
       }
    }
    public void tabrak_emas()
    {
       Actor emas =  getOneIntersectingObject(emas.class);
       if(emas != null)
       {
           getWorld().removeObject(emas);
           turn(90);
           jml_ema++;
           score += 100;
           
           nyawa nya = new nyawa();
           getWorld().addObject(nya,getX(),getY());
       }
    }
    public void tabrak_terakhir()
    {
        Actor terakhir;
        if(isTouching(squitwerd.class))
        {
            terakhir = getOneIntersectingObject(squitwerd.class);
            getWorld().removeObject(terakhir);
            turn(90);
            bonus++;
        }
        else if(isTouching(patrik.class))
        {
            terakhir = getOneIntersectingObject(patrik.class);
            getWorld().removeObject(terakhir);
            turn(90);
            bonus++;
        }
        else if(isTouching(sandy.class))
        {
            terakhir = getOneIntersectingObject(sandy.class);
            getWorld().removeObject(terakhir);
            turn(90);
            bonus++;
        }
        else if(isTouching(krab.class))
        {
            terakhir = getOneIntersectingObject(krab.class);
            getWorld().removeObject(terakhir);
            turn(90);
            bonus++;
        }
        else if(isTouching(spongebob.class))
        {
            terakhir = getOneIntersectingObject(spongebob.class);
            getWorld().removeObject(terakhir);
            turn(90);
            bonus++;
        }
        else if(isTouching(planton.class))
        {
            terakhir = getOneIntersectingObject(planton.class);
            getWorld().removeObject(terakhir);
            turn(90);
            bonus++;
        }
        else if(isTouching(bernekelboy.class))
        {
            terakhir = getOneIntersectingObject(bernekelboy.class);
            getWorld().removeObject(terakhir);
            turn(90);
            bonus++;
        }
        else if(isTouching(bermecmen.class))
        {
            terakhir = getOneIntersectingObject(bermecmen.class);
            getWorld().removeObject(terakhir);
            turn(90);
            bonus++;
        }
        else if(isTouching(gary.class))
        {
            terakhir = getOneIntersectingObject(gary.class);
            getWorld().removeObject(terakhir);
            turn(90);
            bonus++;
        }
        score -= 1;
    }
}