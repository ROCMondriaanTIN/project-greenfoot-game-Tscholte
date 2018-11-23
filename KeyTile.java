import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class KeyTile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KeyTile extends Tile
{
    public Hero hero;
    public int type;
    public KeyTile(String image, int width, int heigth, int type){
        super(image, width, heigth);
        this.type=type;
        switch (type){
            case 1: setImage("lock_red.png");
            break;
            case 2: setImage("lock_yellow.png");
            break;
            case 3: setImage("lock_blue.png");
            break;
            case 4: setImage("lock_green.png");
            break;
        
        }
        
        
        
        
    }
    
    /**
     * Act - do whatever the KeyTile wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
                if (type==1 && hero.keyO==true){
                    setImage("nuthing.png");
                }
            
                if (hero.keyY==true && type==2){
                    setImage("nuthing.png");
                }
            
                if (hero.keyB==true && type==3){
                     setImage("nuthing.png");
                }
             
                if (hero.keyG=true && type==4){
                    setImage("nuthing.png");
                }
                    
                public void remove() {
                getworld().removeObject(this);
                }
        
    }    
}
