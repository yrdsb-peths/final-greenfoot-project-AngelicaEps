import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LoseScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LoseScreen extends MyWorld
{

    /**
     * Constructor for objects of class LoseScreen.
     * 
     */
    Label loseLabel;
    /**
     * Constructor for objects of class LoseScreen.
     * 
     */
    public LoseScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels. 
        loseLabel = new Label("Game Over", 120);
        addObject(loseLabel,300, 200);
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
        Label label = new Label("Press Space to Return to Menu", 50);
        addObject(label,275,311);
        label.setLocation(306,298);
        Label label2 = new Label("Score : ", 50);
        addObject(label2,182,88);
        label2.setLocation(185,102);
        Label label3 = new Label(0, 50);
        addObject(label3,306,103);
        label3.setLocation(393,108);
        label2.setLocation(268,110);
        label3.setLocation(397,115);
        label3.setValue(displayScore);
    }
}
