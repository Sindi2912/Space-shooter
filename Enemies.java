import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemies here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemies extends Actor
{
    /**
     * Act - do whatever the Enemies wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        spawn();
    } 
    
    /**
     * moveEnemy()
     */
    protected void moveEnemy(int speed)
    {
        setLocation(getX()-speed, getY());
    }
    
    /**
     * removeEnemy()
     */
    protected void removeEnemy()
    {
        if(getX() <2)
        {
            getWorld().removeObject(this);
        }
    }
    
    protected void removeEnemy(int points)
    {
        space w = (space) getWorld();
        w.addScore(points);
        
        getWorld().removeObject(this);
    }
    
    /**
     * spawn(0 -spawn the enemies
     */
    private void spawn()
    {
        if(Greenfoot.getRandomNumber(900) == 33)         // spawn Krayfysh
        {
            getWorld().addObject(new Krayfysh(), getWorld().getWidth(), Greenfoot.getRandomNumber(getWorld().getHeight()));
        }
        
        if(Greenfoot.getRandomNumber(60) == 33)         // spawn Aliens
        {
            getWorld().addObject(new Alien(), getWorld().getWidth(), Greenfoot.getRandomNumber(getWorld().getHeight()));
        }
    }
}
