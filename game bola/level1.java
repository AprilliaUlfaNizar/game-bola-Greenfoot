import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class space here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level1 extends World
{
    /**
     * Constructor for objects of class space.
     * 
     */
    public level1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        tampil();
        batu();
        dinding();
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
    public void batu()
    {
        batu bat = new batu();
        addObject(bat,445,120);
        batu bat1 = new batu();
        addObject(bat1,370,120);
        batu bat2 = new batu();
        addObject(bat2,295,120);
        batu bat3 = new batu();
        addObject(bat3,475,160);
        batu bat4 = new batu();
        addObject(bat4,400,160);
        batu bat5 = new batu();
        addObject(bat5,325,160);
        batu bat6 = new batu();
        addObject(bat6,245,160);
    }
    public void dinding()
    {
        dinding din = new dinding();
        addObject(din,445,20);
        dinding din1 = new dinding();
        addObject(din1,370,20);
        dinding din2 = new dinding();
        addObject(din2,445,40);
        dinding din3 = new dinding();
        addObject(din3,370,40);
        dinding din4 = new dinding();
        addObject(din4,325,60);
        dinding din5 = new dinding();
        addObject(din5,400,60);
        dinding din6 = new dinding();
        addObject(din6,475,60);
        dinding din7 = new dinding();
        addObject(din7,325,80);
        dinding din8 = new dinding();
        addObject(din8,400,80);
        dinding din9 = new dinding();
        addObject(din9,475,80);
        dinding din10 = new dinding();
        addObject(din10,520,100);
        dinding din11 = new dinding();
        addObject(din11,445,100);
        dinding din12 = new dinding();
        addObject(din12,370,100);
        dinding din13 = new dinding();
        addObject(din13,295,100);
        dinding din14 = new dinding();
        addObject(din14,220,120);
        dinding din15 = new dinding();
        addObject(din15,520,120);
        dinding din16 = new dinding();
        addObject(din16,295,140);
        dinding din17 = new dinding();
        addObject(din17,520,140);
        dinding din18 = new dinding();
        addObject(din18,370,140);
        dinding din19 = new dinding();
        addObject(din19,445,140);
        dinding din20 = new dinding();
        addObject(din20,220,140);
        dinding din21 = new dinding();
        addObject(din21,550,160);
        dinding din22 = new dinding();
        addObject(din22,170,160);
        dinding din23 = new dinding();
        addObject(din23,550,180);
        dinding din24 = new dinding();
        addObject(din24,475,180);
        dinding din25 = new dinding();
        addObject(din25,400,180);
        dinding din26 = new dinding();
        addObject(din26,325,180);
        dinding din27 = new dinding();
        addObject(din27,250,180);
        dinding din28 = new dinding();
        addObject(din28,175,180);
        dinding din29 = new dinding();
        addObject(din29,100,180);
        dinding din30 = new dinding();
        addObject(din30,550,200);
        dinding din31 = new dinding();
        addObject(din31,475,200);
        dinding din32 = new dinding();
        addObject(din32,400,200);
        dinding din33 = new dinding();
        addObject(din33,325,200);
        dinding din34 = new dinding();
        addObject(din34,250,200);
        dinding din35 = new dinding();
        addObject(din35,175,200);
        dinding din36 = new dinding();
        addObject(din36,100,200);
        dinding din37 = new dinding();
        addObject(din37,550,220);
        dinding din38 = new dinding();
        addObject(din38,475,220);
        dinding din39 = new dinding();
        addObject(din39,400,220);
        dinding din40 = new dinding();
        addObject(din40,325,220);
        dinding din41 = new dinding();
        addObject(din41,250,220);
        dinding din42 = new dinding();
        addObject(din42,175,220);
        dinding din43 = new dinding();
        addObject(din43,100,220);
        dinding din44 = new dinding();
        addObject(din44,550,240);
        dinding din45 = new dinding();
        addObject(din45,475,240);
        dinding din46 = new dinding();
        addObject(din46,400,240);
        dinding din47 = new dinding();
        addObject(din47,325,240);
        dinding din48 = new dinding();
        addObject(din48,250,240);
        dinding din49 = new dinding();
        addObject(din49,175,240);
        dinding din50 = new dinding();
        addObject(din50,100,240);
    }
}
