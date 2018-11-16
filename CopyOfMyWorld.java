
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *
 * @author R. Springer
 */
public class CopyOfMyWorld extends World {

    
    
    /**
     * Constructor for objects of class CopyOfMyWorld.
     *
     */
    public CopyOfMyWorld() {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100, 800, 1, false);
        this.setBackground("death.png");
        

        
        
    }
        
    @Override
    public void act() {
        if (Greenfoot.isKeyDown("space")){
            Hero.isDead=false;
            MyWorld w = new MyWorld();
            Greenfoot.setWorld(w);
        }
    }
}
