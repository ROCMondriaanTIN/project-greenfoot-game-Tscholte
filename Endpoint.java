import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Endpoint here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Endpoint extends Tile
{
    public Endpoint(String image, int width, int heigth){
        super(image, width, heigth);
        
    }
    
    /**
     * Act - do whatever the Endpoint wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         if (this.isTouching(Hero.class)){ 
            World0.lvl=0;
            World0 l0 = new World0();
            Greenfoot.setWorld(l0);
            
        }
    }    
}
