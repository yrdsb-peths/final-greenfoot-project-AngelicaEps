import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    SimpleTimer attackTimer = new SimpleTimer();
    
    public void act()
    {
        // Add your action code here.
        
        
        
        MyWorld world = (MyWorld) getWorld();
        if(Greenfoot.isKeyDown("a"))
        {
            move(-3);
        }
        else if(Greenfoot.isKeyDown("d"))
        {
            move(3);
        }
        else if(Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(),getY()-3);
        }
        else if(Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(),getY()+3);
        }
        
        if(Greenfoot.isKeyDown("Space") && attackTimer.millisElapsed() > 250)
        {
            Attack attack = new Attack();
            world.addObject(attack, getX(), getY());
            attackTimer.mark();
        }
        if(isTouching(enemyAttack.class))
        {
            removeTouching(enemyAttack.class);
        }
        
    }
}
