import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *
 * @author (your name)
 */
public class death extends World {

    
    
    /**
     * Constructor for objects of class CopyOfMyWorld.
     *
     */
    public death() {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1, false);
        this.setBackground("game_over.png");
        

        
        
    }
        
    @Override
    public void act() {
        Stars.isCollected = 0;
        if (Greenfoot.isKeyDown("space")){
            Hero.isDead=false;
            Hero.player="p1";
            switch (World0.lvl){
                case 0: World0 w = new World0();
                Greenfoot.setWorld(w);
                break;
                case 1: Level_1 l1 = new Level_1();
                Greenfoot.setWorld(l1);
                break;
                case 2: Level_2 l2 = new Level_2();
                Greenfoot.setWorld(l2);
                break;
                case 3: Level_3 l3 = new Level_3();
                Greenfoot.setWorld(l3);
                break;
                case 4: Level_4 l4 = new Level_4();
                Greenfoot.setWorld(l4);
                break;
            }
        }
    }
}
