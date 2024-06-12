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
        Enemy.attackGap = 5000;
        Enemy.enemyMove = 2;
        Enemy.minAttack = 500;
        //spawns in first wave of enemies
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
        if(score == 3)
        {
            score++;
            newEnemy();
            newEnemy();
            newEnemy();
        }
        //when all enemies are defeated switches to a different screen
        if(score == 7)
        {
            LevelClear levelClear = new LevelClear();
            Greenfoot.setWorld(levelClear);
        }
    }
}
