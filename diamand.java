import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class diamand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class diamand extends Tile
{
    boolean isCollected;
    public diamand(String image, int width, int heigth){
        super(image, width, heigth);    
        setImage("hud_gem_blue.png");
        
    }
    
    /**
     * Act - do whatever the diamand wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (isCollected == true){
            getWorld().removeObject(this);
        }
        
        if (this.isTouching(Hero.class)){
            Greenfoot.playSound("diamand.mp3");
            Hero.Rihanna = true;
            getWorld().removeObject(this);
            isCollected=true;
            return;
        }
    }    
}
