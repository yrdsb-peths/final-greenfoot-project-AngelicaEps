import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelClear here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelClear extends World
{
    Label clearLevel;
    /**
     * Constructor for objects of class LevelClear.
     * 
     */
    public LevelClear()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        clearLevel = new Label("Level Clear!", 120);
        addObject(clearLevel,300, 200);
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            LevelSelect levelSelect = new LevelSelect();
            Greenfoot.setWorld(levelSelect);
        }
    }
}
