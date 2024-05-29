import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{

    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Label label = new Label("Press Space to Start", 50);
        addObject(label,300,200);

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
