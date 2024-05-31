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
        if(score == 0)
        {
            newEnemy();
            newEnemy();
            newEnemy();
        }
    }
    public void act()
    {
        if(score == 3)
        {
            score++;
            newEnemy();
            newEnemy();
            newEnemy();
        }
        if(score == 7)
        {
            LevelClear levelClear = new LevelClear();
            Greenfoot.setWorld(levelClear);
        }
    }
}
