import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DoorLevel1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class DoorLevel1 extends Tile
{   
    private static int toLvl;
    private StartScreen screen;
    ArrayList<World> lvl = new ArrayList<World>();
    int wereld;
    static boolean firstTime = true;
    static boolean firstTime1 = true;
    static boolean firstTime2= true;
    static boolean firstTime3 = true;
    static boolean firstTime4 = true;
    int open;
    public DoorLevel1(String image, int width, int heigth, int wereld){
        super("door_closedMid.png", width, heigth);
        this.wereld = wereld;
        
        
    }
    
    /**
     * Act - do whatever the DoorLevel1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {   
        if (canEnter() == true){
            setImage("door_openMid.png");
            if (this.isTouching(Hero.class)){
                Greenfoot.playSound("nextlevel.mp3");
                switch(wereld){
                   case 1:if (firstTime == true ){
                       Level_1 l1 = new Level_1();
                       Greenfoot.setWorld(l1);
                   }
                   firstTime = false;
                   break;
                   case 2: if (firstTime1 == true){
                           Level_2 l2 = new Level_2(); 
                           Greenfoot.setWorld(l2);
                   }
                   firstTime1 = false;
                   break;
                   case 3:  if (firstTime2 == true){
                           Level_3 l3 = new Level_3();
                           Greenfoot.setWorld(l3);
                   }    
                   firstTime2 = false;
                   break;
                   case 4:  if (firstTime3 == true){
                           Level_4 l4 = new Level_4();
                           Greenfoot.setWorld(l4);
                       
                   }    
                   firstTime3 = false;
                   break;
                   case 5:  if (firstTime4 == true){
                            MyWorld mw = new MyWorld();
                            Greenfoot.setWorld(mw);
                   }
                   firstTime4 = false;
                   break;
            
                }
            }
        }
    }    
        
        boolean canEnter(){
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
                
                case 5: if (Hero.Rihanna == true){
                    return true;
                } else {
                    return false;
                }
                
                default :return false;
            
        }
        
    }
}
