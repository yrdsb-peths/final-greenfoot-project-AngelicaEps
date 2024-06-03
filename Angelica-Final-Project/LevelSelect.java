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
    }
}
