import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemyAttack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemyAttack extends Actor
{
    /**
     * Act - do whatever the enemyAttack wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        setLocation(getX(),getY()+4);
        
        MyWorld world = (MyWorld) getWorld();
        if(isTouching(Player.class))
            {
                removeTouching(Player.class);
            }
            
        if(getY() == 399)
        {
            world.removeObject(this);
        }
    }
}
