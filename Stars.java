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
    public static int isCollected;
    public static int allStars;
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
        allStars = stars + isCollected;
        if (this.isTouching(Hero.class)){
            isCollected ++;
            getWorld().removeObject(this);
            return;
        }
    }    
}
