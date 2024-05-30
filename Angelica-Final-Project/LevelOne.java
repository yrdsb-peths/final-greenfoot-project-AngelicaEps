import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelOne here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelOne extends MyWorld
{

    /**
     * Constructor for objects of class LevelOne.
     * 
     */
    public LevelOne()
    {
        newEnemy();
        newEnemy();
        newEnemy();
        
        if(score == 2)
        {
            LevelSelect levelSelect = new LevelSelect();
            Greenfoot.setWorld(levelSelect);
        }
    }
}
