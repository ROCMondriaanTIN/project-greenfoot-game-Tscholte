import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pushed here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pushed extends Mover
{
    Hero hero;
    int Xoud;
    boolean firstAct = true;
    public Pushed (){
        super();
        setImage("boxAlt.png");
        
    }
    /**
     * Act - do whatever the pushed wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int x = getX();
        int y = getY();
        velocityY = 0;
        applyVelocity();
        
        if (hero.player =="p2"){
            
            if (isTouching(Hero.class) && x<hero.X){
                Xoud = x;
                velocityX=hero.Dspeed;
                
            } else if (isTouching(Hero.class) && x>hero.X){
                Xoud = x;
                velocityX=hero.Aspeed;
            }
        }    
        
        if (isTouching(boxInv.class)){
               getWorld().removeObject(this);
        }
        
        if (x <= (Xoud-20)){
                    velocityX = 0;
        }
        
        if (x >= (Xoud+20)){
                    velocityX = 0;
        }
}

    
}
