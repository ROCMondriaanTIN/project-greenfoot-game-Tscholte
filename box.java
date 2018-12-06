import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class box here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class box extends Tile
{
    public boolean firstTime = true;
    Hero hero;
    boolean stop;
    public box (String image, int width, int heigth){
        super(image, width, heigth);
    }
    /**
     * Act - do whatever the box wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if ( firstTime==true) {
            if (hero.player ==("p2")) {
                setImage("nuthing.png");
                this.isSolid= false;
                getWorld().addObject(new Pushed(), x, y);
                firstTime=false;
            } 
        }
        
        
    }    
}
