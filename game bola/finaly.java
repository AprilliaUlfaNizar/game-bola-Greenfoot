import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class finayl here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class finaly extends World
{
    /**
     * Constructor for objects of class finayl.
     * 
     */
    public finaly()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 600, 1); 
        tampil();
        pemain();
    }

    public void tampil()
    {
        papan pap = new papan();
        addObject(pap,200,590);

        bola bol = new bola();
        addObject(bol,200,570);

        score sco = new score();
        addObject(sco,35,35);

        live liv = new live();
        addObject(liv,45,55);
    }
    public void pemain()
    {
        squitwerd squ = new squitwerd();
        addObject(squ,200,80);

        patrik pat = new patrik();
        addObject(pat,65,155);
        krab kra = new krab();
        addObject(kra,200,215);
        sandy san = new sandy();
        addObject(san,130,120);
        planton pla = new planton();
        addObject(pla,200,350);

        bermecmen ber = new bermecmen();
        addObject(ber,270,120);
        bernekelboy boy = new bernekelboy();
        addObject(boy,335,150);
        bernekelboy boy1 = new bernekelboy();
        addObject(boy1,100,290);
        bermecmen man = new bermecmen();
        addObject(man,290,290);

        gary gar = new gary();
        addObject(gar,235,420);
        spongebob spon = new spongebob();
        addObject(spon,155,475);
    }
}
