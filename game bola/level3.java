import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level3 extends World
{

    /**
     * Constructor for objects of class level3.
     * 
     */
    public level3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        tampil();
        batu();
        dinding();
        emas();
    }
    public void tampil()
    {
        papan pap = new papan();
        addObject(pap,300,390);
        
        bola bol = new bola();
        addObject(bol,300,370);
        
        score sco = new score();
        addObject(sco,100,50);
        
        live liv = new live();
        addObject(liv,90,70);
    }
    public void emas()
    {
        emas ema = new emas();
        addObject(ema,230,25);
        emas ema1 = new emas();
        addObject(ema1,305,25);
    }
    public void batu()
    {
        batu bat = new batu();
        addObject(bat,440,165);
        batu bat1 = new batu();
        addObject(bat1,515,165);
        batu bat2 = new batu();
        addObject(bat2,440,185);
        batu bat3 = new batu();
        addObject(bat3,515,185);
        batu bat4 = new batu();
        addObject(bat4,440,205);
        batu bat5 = new batu();
        addObject(bat5,515,205);
        batu bat6 = new batu();
        addObject(bat6,440,225);
        batu bat7 = new batu();
        addObject(bat7,515,225);
        batu bat8 = new batu();
        addObject(bat8,440,245);
        batu bat9 = new batu();
        addObject(bat9,515,245);
    }
    public void dinding()
    {
        dinding din = new dinding();
        addObject(din,90,285);
        dinding din1 = new dinding();
        addObject(din1,90,265);
        dinding din2 = new dinding();
        addObject(din2,90,245);
        dinding din3 = new dinding();
        addObject(din3,90,225);
        dinding din4 = new dinding();
        addObject(din4,90,205);
        dinding din5 = new dinding();
        addObject(din5,90,185);
        dinding din6 = new dinding();
        addObject(din6,130,165);
        dinding din7 = new dinding();
        addObject(din7,160,145);
        dinding din8 = new dinding();
        addObject(din8,215,125);
        dinding din9 = new dinding();
        addObject(din9,195,105);
        dinding din10 = new dinding();
        addObject(din10,270,105);
        dinding din11 = new dinding();
        addObject(din11,230,85);
        dinding din12 = new dinding();
        addObject(din12,305,85);
        dinding din13 = new dinding();
        addObject(din13,195,65);
        dinding din14 = new dinding();
        addObject(din14,270,65);
        dinding din15 = new dinding();
        addObject(din15,345,65);
        dinding din16 = new dinding();
        addObject(din16,195,45);
        dinding din17 = new dinding();
        addObject(din17,270,45);
        dinding din18 = new dinding();
        addObject(din18,345,45);
        dinding din19 = new dinding();
        addObject(din19,235,145);
        dinding din20 = new dinding();
        addObject(din20,205,165);
        dinding din21 = new dinding();
        addObject(din21,280,165);
        dinding din22 = new dinding();
        addObject(din22,165,185);
        dinding din23 = new dinding();
        addObject(din23,240,185);
        dinding din24 = new dinding();
        addObject(din24,315,185);
        dinding din25 = new dinding();
        addObject(din25,165,205);
        dinding din26 = new dinding();
        addObject(din26,240,205);
        dinding din27 = new dinding();
        addObject(din27,315,205);
        dinding din28 = new dinding();
        addObject(din28,165,225);
        dinding din29 = new dinding();
        addObject(din29,240,225);
        dinding din30 = new dinding();
        addObject(din30,315,225);
        dinding din31 = new dinding();
        addObject(din31,400,265);
        dinding din32 = new dinding();
        addObject(din32,475,265);
        dinding din33 = new dinding();
        addObject(din33,550,265);
        dinding din34 = new dinding();
        addObject(din34,400,285);
        dinding din35 = new dinding();
        addObject(din35,475,285);
        dinding din36 = new dinding();
        addObject(din36,550,285);
    }
}