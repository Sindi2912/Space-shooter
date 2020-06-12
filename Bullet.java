import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    // Declare properties
    private int speed;
    
    /**
     * Constructor
     */
    public Bullet()
    {
        speed = 5;
        
        GreenfootImage img = getImage();
        img.scale(15, 15);
        setImage(img);
    }
    
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        moveBullet();
    }
    
    /*
     * moveBullet()
     */
    private void moveBullet()
    {
        setLocation(getX()+speed, getY());
        
        // remove the bullet when it gets to the edge of the screen
        if(getX() > getWorld().getWidth()-3)
        {
            getWorld().removeObject(this);
        }
    }
}
