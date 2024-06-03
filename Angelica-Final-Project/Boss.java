import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss extends Actor
{
    MyWorld world = (MyWorld) getWorld();
    SimpleTimer attackTimer = new SimpleTimer();
    int bossMove = 2;
    int minAttack = 300;
    int attackGap = 4000;
    
    int randomAttack = Greenfoot.getRandomNumber(attackGap) + minAttack;
    
    public void act()
    {
        // Add your action code here.
        setLocation(getX() + bossMove, getY());
        enemyMove();
        //this code makes the boss enemy's attack randomised 
        if(attackTimer.millisElapsed() > (randomAttack))
        {
            getWorld().addObject(new enemyAttack(), getX(), getY());
            attackTimer.mark();
            randomAttack = Greenfoot.getRandomNumber(attackGap);
        }
    }
    //this method makes the boss enemy move across the screen right and left to make it harder to hit
    public void enemyMove()
    {
        if((getX() > 590) || (getX() < 10))
        {
            bossMove = -2;
        }
        if((getX() < 10))
        {
            bossMove = 2;
        }
    }
}
