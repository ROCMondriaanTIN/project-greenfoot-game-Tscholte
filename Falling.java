import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Falling here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Falling extends Mover
{
    
    
    public int speed =5;
    public Falling (){
        super();
        setImage("weightChained.png");
    }
    /**
     * Act - do whatever the Falling wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        if (isTouching(Hero.class)){
            Hero.isDead=true;
        }
        velocityY = speed; 
        applyVelocity();
        
        
    
        
    }    
}
