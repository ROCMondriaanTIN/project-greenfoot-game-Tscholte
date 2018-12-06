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
    public DoorLevel1(String image, int width, int heigth, int wereld){
        super(image, width, heigth);
        
        this.wereld = wereld;
        
        
    }
    
    /**
     * Act - do whatever the DoorLevel1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {   
        
        if (this.isTouching(Hero.class)){
            
            
           switch(wereld){
               case 0: World0 l0 = new World0();
               Greenfoot.setWorld(l0);
               break;
               case 1: Level_1 l1 = new Level_1();
               Greenfoot.setWorld(l1);
               break;
               case 2: if (Stars.stars >= 2){
                   Level_2 l2 = new Level_2(); 
                   Greenfoot.setWorld(l2);
                }
               
               break;
               case 3:  if (Stars.stars >= 4){
                   Level_3 l3 = new Level_3();
                   Greenfoot.setWorld(l3);
               }
               break;
               case 4:  if (Stars.stars >= 8){
                   
                }
               break;
               
               case 5:  if (Hero.Rihanna = true){
                
                }
               break;
        
            }
        }
    }    
}
