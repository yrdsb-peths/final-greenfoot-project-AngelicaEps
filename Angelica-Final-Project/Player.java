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
    GreenfootSound laser = new GreenfootSound("laser.mp3");
    
    GreenfootImage[] moveRight = new GreenfootImage[4];
    GreenfootImage[] moveLeft = new GreenfootImage[4];
    int imageIndex = 0;
    
    String facing = "right";
    SimpleTimer animationTimer = new SimpleTimer();
    public Player()
    {
        for(int i = 0; i < moveRight.length; i++)
        {
            moveRight[i] = new GreenfootImage("images/shipmove/ship" + i + ".png");
            moveRight[i].scale(60,60);
        }
        
        for(int i = 0; i < moveLeft.length;i++)
        {
            moveLeft[i] = new GreenfootImage("images/shipmove/ship" + i + ".png");
            moveLeft[i].mirrorHorizontally();
            moveLeft[i].scale(60,60);
        }
        animationTimer.mark();
    }
    public void animate()
    {
        if(animationTimer.millisElapsed() < 100)
        {
            return; 
        }
        animationTimer.mark();
        if(facing.equals("right"))
        {
            setImage(moveRight[imageIndex]);
            imageIndex = (imageIndex + 1) % moveRight.length;
        }
        else
        {
            setImage(moveLeft[imageIndex]);
            imageIndex = (imageIndex + 1) % moveLeft.length;
        }
    }
    public void act()
    {
        // Add your action code here.
        MyWorld world = (MyWorld) getWorld();
        //this code allows the player to move using the wasd keys 
        if(Greenfoot.isKeyDown("a"))
        {
            move(-3);
            facing = "left";
        }
        else if(Greenfoot.isKeyDown("d"))
        {
            move(3);
            facing = "right";
        }
        else if(Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(),getY()-3);
            setImage(moveRight[0]);
        }
        else if(Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(),getY()+3);
            setImage(moveRight[0]);
        }
        animate();
        //this code makes it so that there is a small gap between player's attacks
        if(Greenfoot.isKeyDown("Space") && attackTimer.millisElapsed() > 250)
        {
            Attack attack = new Attack();
            world.addObject(attack, getX(), getY());
            attackTimer.mark();
            laser.play();
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
