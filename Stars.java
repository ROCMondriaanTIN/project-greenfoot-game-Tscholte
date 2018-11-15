import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Stars here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stars extends Mover
{
    public Stars(){
        super();
        setImage("star.png");
        
    } 
    
    
    
    /**
     * Act - do whatever the Stars wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        velocityY = 0;
        applyVelocity();
        
        
    }    
}
