import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelSelect here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelSelect extends World
{

    /**
     * Constructor for objects of class LevelSelect.
     * 
     */
    public LevelSelect()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Label label = new Label("Choose a Level", 50);
        addObject(label,300,40);
        prepare();
    }

    public void act()
    {
        if(Greenfoot.isKeyDown("1"))
        {
            LevelOne levelOne = new LevelOne();
            Greenfoot.setWorld(levelOne);
        }
        if(Greenfoot.isKeyDown("2"))
        {
            LevelTwo levelTwo = new LevelTwo();
            Greenfoot.setWorld(levelTwo);
        }
        if(Greenfoot.isKeyDown("3"))
        {
            LevelThree levelThree = new LevelThree();
            Greenfoot.setWorld(levelThree);
        }
        if(Greenfoot.isKeyDown("4"))
        {
            LevelFour levelFour = new LevelFour();
            Greenfoot.setWorld(levelFour);
        }
        if(Greenfoot.isKeyDown("6"))
        {
            Infinite infinite = new Infinite();
            Greenfoot.setWorld(infinite);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Label label = new Label("Press the Number of the Level to Select", 30);
        addObject(label,282,88);
        label.setLocation(315,83);
        Label label2 = new Label(1, 60);
        addObject(label2,120,158);
        Label label3 = new Label(2, 60);
        addObject(label3,232,160);
        label3.setLocation(311,162);
        Label label4 = new Label(3, 60);
        addObject(label4,459,152);
        label4.setLocation(465,156);
        label4.setLocation(469,157);
        label4.setLocation(461,173);
        label4.setLocation(465,166);
        Label label5 = new Label("Press space to attack and w a s d to move.", 30);
        addObject(label5,293,353);
        Label label6 = new Label("Press 6 for an infinite mode", 50);
        addObject(label6,281,263);
        label6.setLocation(306,263);
        Label label7 = new Label("Number on the left is lives, number on the right is score.", 20);
        addObject(label7,277,307);
        label7.setLocation(296,304);
        label7.setLocation(296,309);
        label7.setLocation(287,379);
        label7.setLocation(419,377);
        label7.setLocation(333,374);
        label7.setLocation(337,379);
        label7.setLocation(252,373);
        label7.setLocation(410,382);
        label7.setLocation(296,375);
        Label label8 = new Label(4, 60);
        addObject(label8,203,213);
        label6.setLocation(303,302);
        label8.setLocation(203,235);
        label4.setLocation(487,166);
        Label label9 = new Label(5, 60);
        addObject(label9,393,235);
        label9.setLocation(403,239);
    }
}
