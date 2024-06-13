import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelTwo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelTwo extends MyWorld
{

    /**
     * Constructor for objects of class LevelTwo.
     * 
     */
    public LevelTwo()
    {
        Enemy.attackGap = 5000;
        Enemy.enemyMove = 2;
        Enemy.minAttack = 500;
        //spawns first wave of enemies
        if(score == 0)
        {
            newEnemy();
            newEnemy();
            newEnemy();
        }
    }
    public void act()
    {
        //when first enemy is defeated, spawns in more enemies
        if(score == 1)
        {
            score++;
            newEnemy();
            newEnemy();
        }
        if(score == 6)
        {
            score++;
            newEnemy();
            newEnemy();
            newEnemy();
        }
        //when all enemies are defeated switches to a different screen
        if(score == 10)
        {
            LevelClear levelClear = new LevelClear();
            Greenfoot.setWorld(levelClear);
        }
    }
}
