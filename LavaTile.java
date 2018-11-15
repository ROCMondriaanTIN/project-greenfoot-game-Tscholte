import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LavaTile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LavaTile extends Tile
{
    
    public static boolean shootinglava;
    public static int lavaX;
    public static int lavaY;
    
    public LavaTile(String image, int width, int heigth){
        super(image, width, heigth);
        setImage("liquidLavaTop_mid.png");
    }
    
    
    
    /**
     * Act - do whatever the LavaTile wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
    }   
}    
