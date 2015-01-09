import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level2 extends World
{

    /**
     * Constructor for objects of class level2.
     * 
     */
    public level2()
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
        addObject(ema,230,35);
    }
    public void batu()
    {
        batu bat = new batu();
        addObject(bat,300,235);
        batu bat1 = new batu();
        addObject(bat1,345,215);
        batu bat2 = new batu();
        addObject(bat2,270,215);
        batu bat3 = new batu();
        addObject(bat3,300,195);
        batu bat4 = new batu();
        addObject(bat4,375,195);
        batu bat5 = new batu();
        addObject(bat5,225,195);
        batu bat6 = new batu();
        addObject(bat6,450,195);
        batu bat7 = new batu();
        addObject(bat7,150,195);
        batu bat8 = new batu();
        addObject(bat8,75,195);
    }
    public void dinding()
    {
        dinding din = new dinding();
        addObject(din,75,275);
        dinding din1 = new dinding();
        addObject(din1,150,275);
        dinding din2 = new dinding();
        addObject(din2,225,275);
        dinding din3 = new dinding();
        addObject(din3,300,275);
        dinding din4 = new dinding();
        addObject(din4,375,275);
        dinding din5 = new dinding();
        addObject(din5,450,275);
        dinding din6 = new dinding();
        addObject(din6,525,275);
        dinding din7 = new dinding();
        addObject(din7,270,255);
        dinding din8 = new dinding();
        addObject(din8,345,255);
        dinding din9 = new dinding();
        addObject(din9,420,255);
        dinding din10 = new dinding();
        addObject(din10,495,255);
        dinding din11 = new dinding();
        addObject(din11,195,255);
        dinding din12 = new dinding();
        addObject(din12,120,255);
        dinding din13 = new dinding();
        addObject(din13,150,235);
        dinding din14 = new dinding();
        addObject(din14,225,235);
        dinding din15 = new dinding();
        addObject(din15,375,235);
        dinding din16 = new dinding();
        addObject(din16,450,235);
        dinding din17 = new dinding();
        addObject(din17,195,215);
        dinding din18 = new dinding();
        addObject(din18,420,215);
        dinding din19 = new dinding();
        addObject(din19,345,175);
        dinding din20 = new dinding();
        addObject(din20,270,175);
        dinding din21 = new dinding();
        addObject(din21,345,135);
        dinding din22 = new dinding();
        addObject(din22,270,135);
        dinding din23 = new dinding();
        addObject(din23,300,115);
        dinding din24 = new dinding();
        addObject(din24,375,115);
        dinding din25 = new dinding();
        addObject(din25,225,115);
        dinding din26 = new dinding();
        addObject(din26,270,95);
        dinding din27 = new dinding();
        addObject(din27,230,55);
        dinding din28 = new dinding();
        addObject(din28,230,75);
        dinding din29 = new dinding();
        addObject(din29,195,95);
        dinding din30 = new dinding();
        addObject(din30,325,155);
        dinding din31 = new dinding();
        addObject(din31,250,155);
        dinding din32 = new dinding();
        addObject(din32,175,155);
        dinding din33 = new dinding();
        addObject(din33,100,155);
        dinding din34 = new dinding();
        addObject(din34,400,155);
        dinding din35 = new dinding();
        addObject(din35,475,155);
        dinding din36 = new dinding();
        addObject(din36,425,175);
        dinding din37 = new dinding();
        addObject(din37,500,175);
        dinding din38 = new dinding();
        addObject(din38,195,175);
        dinding din39 = new dinding();
        addObject(din39,120,175);
        dinding din40 = new dinding();
        addObject(din40,420,135);
        dinding din41 = new dinding();
        addObject(din41,495,135);
        dinding din42 = new dinding();
        addObject(din42,195,135);
        dinding din43 = new dinding();
        addObject(din43,120,135);
        dinding din44 = new dinding();
        addObject(din44,450,115);
        dinding din45 = new dinding();
        addObject(din45,525,115);
        dinding din46 = new dinding();
        addObject(din46,150,115);
    }
}
