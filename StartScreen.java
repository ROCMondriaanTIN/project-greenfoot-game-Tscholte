import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartScreen extends World
{
    public static boolean start;
    /**
     * Constructor for objects of class StartScreen.
     * 
     */
    public StartScreen()
    { 
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1);
        this.setBackground("spaceStart.png");
        
        
        
    }
    
    public void act(){
    if (Greenfoot.isKeyDown("space")){
        MyWorld W = new MyWorld();    
        Greenfoot.setWorld(W);
        }
    }
}
