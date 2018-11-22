import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Water here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Water extends Tile
{    
  
    public static int waterX;
    public static int waterY;
    
    public Water(String image, int width, int heigth){
        super("liquidWaterTop_mid.png", width, heigth);
        setImage("liquidWaterTop_mid.png");
    }
    
    /**
     * Act - do whatever the Water wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (this.isTouching(Hero.class)){
            Hero.isDead=true;
            Hero.stars=0;
            Hero.Dc++;
        }
    }    
}
