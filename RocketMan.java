import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RocketMan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RocketMan extends Actor
{
    // declare properties
    private int speed;
    
   private int frameTimer;
   private int frameNumber;
   private int frameThreshold;
   
   private int bulletTimer;
   private int bulletThreshold;
    
   /**
     * Constructor
     */
    public RocketMan()
   {
        speed = 6;
        
        frameTimer =0;
        frameThreshold =10;
        frameNumber = 1;
        setImage("rocket.png");
        
        bulletTimer =0;
        bulletThreshold = 10;
   }
    
   /**
  
     * Act - do whatever the RocketMan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        animate();
        moveRocket();
        fireBullet();
    }    
    
   /**
     * animate() - animates the rocket
     * 
     */
   private void animate()
   {
        if(frameTimer >= frameThreshold)
        {
           if(frameNumber == 2)
           {
              setImage("rocket.png");
              frameNumber = 1;
           }
           else
           {
               setImage("rocket2.png");
               frameNumber = 2;
           }
       
           frameTimer = 0;
        }
        
        frameTimer++;
   }
   
   /**
    * moveRocket() - moves the rocket
    */
   private void moveRocket()
   {
       if(Greenfoot.isKeyDown("up"))
       {
           setLocation(getX(), getY()-speed);
       }
       else if(Greenfoot.isKeyDown("down"))
       {
           setLocation(getX(), getY()+speed);
       }
   }
   
   /**
    * fireBullet()
    */
   private void fireBullet()
   {
       if(Greenfoot.isKeyDown("space"))
       {
           if(bulletTimer >= bulletThreshold)
           {
              getWorld().addObject(new Bullet(), getX()+50, getY());
              bulletTimer = 0;
              
              Greenfoot.playSound("bullet.wav");
           }
       }
       bulletTimer++;
   }
}