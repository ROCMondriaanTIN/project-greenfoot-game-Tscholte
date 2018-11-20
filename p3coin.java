import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class p3coin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class p3coin extends P2coin
{
    
    public p3coin(){
    super();
    setImage("hud_p2.png");
    }
    /**
     * Act - do whatever the p3coin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        velocityY=0;
        applyVelocity();
        
        if (this.isTouching(Hero.class)){
            Hero.hero="p2";
        }
    }    
}
