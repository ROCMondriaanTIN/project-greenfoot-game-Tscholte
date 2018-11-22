import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class diamand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class diamand extends Mover
{
    public diamand(){
        super();    
        setImage("hud_gem_blue.png");
    }
    
    /**
     * Act - do whatever the diamand wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        velocityY=0;
        applyVelocity();
        if (this.isTouching(Hero.class)){
            Hero.Rihanna = true;
            getWorld().removeObject(this);
            return;
        }
        
    }    
}
