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
        addObject(label,300,200);
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("1"))
        {
            MyWorld levelOne = new MyWorld();
            Greenfoot.setWorld(levelOne);
        }
    }
}
