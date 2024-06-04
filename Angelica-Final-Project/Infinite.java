import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Infinite here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Infinite extends MyWorld
{
    int newWave = score+3;
    /**
     * Constructor for objects of class Infinite.
     * 
     */
    public Infinite()
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
        //when first wave is defeated, spawns in the second wave
        if(score == newWave)
        {
            score++;
            newWave = score +3;
            newEnemy();
            newEnemy();
            newEnemy();
        }
    }
}
