import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelThree here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelThree extends MyWorld
{

    /**
     * Constructor for objects of class LevelThree.
     * 
     */
    public LevelThree()
    {
        Enemy.attackGap = 5000;
        Enemy.enemyMove = 2;
        Enemy.minAttack = 500;
        if(score == 0)
        {
            newEnemy();
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
        if(score == 7)
        {
            score++;
            newEnemy();
            newEnemy();
            newEnemy();
        }
        if(score == 9)
        {
            score++;
            newEnemy();
            newEnemy();
            newEnemy();
        }
        if(score == 15)
        {
            score++;
            newEnemy();
            newEnemy();
            newEnemy();
            newEnemy();
        }
        //when all enemies are defeated switches to a different screen
        if(score == 20)
        {
            LevelClear levelClear = new LevelClear();
            Greenfoot.setWorld(levelClear);
        }
    }
}
