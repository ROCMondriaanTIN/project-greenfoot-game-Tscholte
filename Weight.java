import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Weight here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Weight extends Tile
{
   
    boolean virgin = true;
    public Weight (String image, int width, int heigth){
        super(image, width, heigth);
        setImage("weightChained.png");
        
    }
    /**
     * Act - do whatever the Weight wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
    
        if (virgin == true){
        for (Actor hero : getObjectsInRange(300, Hero.class)){
            if (hero != null){
                setImage("nuthing.png");
                this.isSolid= false;
                getWorld().addObject(new Falling(), x, y);
                virgin=false;
            }
        }
    }
}
}
