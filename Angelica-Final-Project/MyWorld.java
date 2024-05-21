import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Player player = new Player();
        addObject(player, 300, 300);
        newEnemy();
    }
    public void newEnemy()
    {
        Enemy enemy = new Enemy();
        int x = Greenfoot.getRandomNumber(550);
        if(x < 50)
        {
            x +=50;
        }
        int y = Greenfoot.getRandomNumber(200);
        if(y < 20)
        {
            y+=20;
        }
        addObject(enemy,x, y);
    }
}
