import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class space here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class space extends World
{
    // declare properties
    private RocketMan rocket;
    private Counter score;

    /**
     * Constructor for objects of class space.
     * 
     */
    public space()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        
        prepare();
    }
    
    /**
     * prepare() - sets up the initial display
     */
    private void prepare()
    {
        score = new Counter("Score; ");
        score.setValue(0);
        addObject(score, 50, 20);
        
        addObject(new Enemies(), getWidth(), getHeight());
        
        rocket = new RocketMan();
        addObject(rocket, 50, getHeight()/2);
    }
    
    /**
     * addScore()
     */
    public void addScore(int points)
    {
        score.setValue(score.getValue()+points);
    }
}


 
