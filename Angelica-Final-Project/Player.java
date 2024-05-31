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
        //this code allows the player to move using the wasd keys 
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
        //this code makes it so that there is a small gap between player's attacks
        if(Greenfoot.isKeyDown("Space") && attackTimer.millisElapsed() > 250)
        {
            Attack attack = new Attack();
            world.addObject(attack, getX(), getY());
            attackTimer.mark();
        }
        //this code makes it so that if the player is touching the enemy's attacks, the amount of lives will decrease
        if(isTouching(enemyAttack.class))
        {
            removeTouching(enemyAttack.class);
            world.lives = world.lives -1;
            world.lifeLabel.setValue(world.lives);
            if(world.lives == 0)
                {
                    removeTouching(Player.class);
                    LoseScreen gameOver = new LoseScreen();
                    Greenfoot.setWorld(gameOver);
                }
        }
        
    }
}
