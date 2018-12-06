import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class boxInv here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class boxInv extends Tile
{
    public boxInv (String image, int width, int heigth){
        super(image, width, heigth);
        setImage("nuthing.png");
    }
    /**
     * Act - do whatever the boxInv wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (isTouching(box.class)){
            setImage("boxAlt.png");
            this.isSolid= true;
        }
    }    
}
