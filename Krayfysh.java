import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Krayfysh here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Krayfysh extends Enemies
{
    // declare properties
    private int speed;
    
    /**
     * Constructor
     */
    public Krayfysh()
    {
        speed= 15;
        setRotation(getRotation()-180);
    }
    
    /**
     * Act - do whatever the Alien wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        moveEnemy(speed);
        
        if(isTouching(RocketMan.class))
        {
            removeEnemy(-1); // award 1 point then remove Krayfysh
        }
        else
        {
            removeEnemy();
        }
    }    
}
