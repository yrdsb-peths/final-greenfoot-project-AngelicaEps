import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    MyWorld world = (MyWorld) getWorld();
    SimpleTimer attackTimer = new SimpleTimer();
    int enemyMove = 2;
    int minAttack = 500;
    int attackGap = 5000;
    int randomAttack = Greenfoot.getRandomNumber(attackGap) + minAttack;
    public void act()
    {
        // Add your action code here.
        setLocation(getX() + enemyMove, getY());
        if((getX() > 590) || (getX() < 10))
        {
            enemyMove = -2;
        }
        if((getX() < 10))
        {
            enemyMove = 2;
        }
        
        if(attackTimer.millisElapsed() > (randomAttack))
        {
            getWorld().addObject(new enemyAttack(), getX(), getY());
            attackTimer.mark();
            randomAttack = Greenfoot.getRandomNumber(attackGap);
        }
    }
    
}
