import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Attack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Attack extends Actor
{
    /**
     * Act - do whatever the Attack wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        setLocation(getX(),getY()-4);
        
        MyWorld world = (MyWorld) getWorld();
        if(isTouching(Enemy.class))
            {
                removeTouching(Enemy.class);
            }
            
        if(getY() == 0)
        {
            world.removeObject(this);
        }
    }
}
