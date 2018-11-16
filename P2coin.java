import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class P2coin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class P2coin extends Mover
{
    /**
     * Act - do whatever the P2coin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public P2coin(){
        super();
        setImage("hud_p3.png");
    }
    
    public void act() 
    {
        velocityY=0;
        applyVelocity();
    }    
}
