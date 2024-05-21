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
    
    public void act()
    {
        // Add your action code here.
        
        if(attackTimer.millisElapsed() < 1000)
        {
            Attack attack = new Attack();
            world.addObject(attack, getX()+1, getY()+1);
        }
    }
    
}
