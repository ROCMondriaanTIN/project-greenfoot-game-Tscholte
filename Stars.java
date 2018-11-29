import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Stars here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stars extends Tile
{
    public static int stars;
    boolean isCollected;
    public Stars(String image, int width, int heigth){
        super(image, width, heigth); 
        setImage("star.png");
    }
    
    /**
     * Act - do whatever the Stars wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (this.isTouching(Hero.class)){
            isCollected = true;
            stars++;
            getWorld().removeObject(this);
            return;
        }
        if (isCollected==true){
            getWorld().removeObject(this);
        }
    }    
}
