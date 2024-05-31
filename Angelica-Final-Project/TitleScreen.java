import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{

    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Label label = new Label("Press Space to Start", 50);
        addObject(label,300,200);

        prepare();
    }

    public void act()
    {
        
        if(Greenfoot.isKeyDown("space"))
        {
            LevelSelect levelSelect = new LevelSelect();
            Greenfoot.setWorld(levelSelect);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Label label = new Label("Extraterrestrial Attackers", 60);
        addObject(label,272,100);
        label.setLocation(314,143);
        label.setLocation(329,116);
        Label label2 = new Label("(very original)", 25);
        addObject(label2,287,164);
        label2.setLocation(323,157);
        label.setLocation(297,116);
        label.setLocation(274,116);
        label.setLocation(285,122);
        label.setLocation(302,112);
        label2.setLocation(330,160);
        label2.setLocation(306,157);
    }
}
