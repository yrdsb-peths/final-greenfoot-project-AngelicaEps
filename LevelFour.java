import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelFour here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelFour extends MyWorld
{
    
    /**
     * Constructor for objects of class LevelFour.
     * 
     */
    public LevelFour()
    {
        //this level is the same as level 2 but the enemy attacks and moves faster
        Enemy.attackGap = 2500;
        Enemy.enemyMove = 3;
        Enemy.minAttack = 250;
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
