import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DoorTop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DoorTop extends Tile
{
    DoorLevel1 door;    
    int wereld;
    public DoorTop(String image, int width, int heigth, int wereld){
        super("door_closedTop.png", width, heigth);
        this.wereld = wereld;
        this.isSolid = true;
    }
    /**
     * Act - do whatever the DoorTop wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (canEnterTop() == true){
            setImage("door_openTop.png");
        }
    }    
    
    boolean canEnterTop(){
            switch (wereld){
                case 1: return true;
                
                case 2: if (Stars.stars >= 2){
                    return true;
                } else {
                    return false;
                }
                
                case 3: if (Stars.stars >= 4){
                    return true;
                } else {
                    return false;
                }
                
                case 4: if (Stars.stars >= 8){
                    return true;
                } else {
                    return false;
                }
                
                case 5: if (Hero.Rihanna ==true){
                    return true;
                } else {
                    return false;
                }
                
                default :return false;
            }
            
        }
}
