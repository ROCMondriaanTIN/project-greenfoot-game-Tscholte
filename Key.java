import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Key here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Key extends Tile
{
    public Hero hero;
    private int type; 
    private World a;
    public boolean keyload;
    public Key(String image, int width, int heigth, int type){
        super(image, width, heigth);
        this.type=type;
        switch (type){
            
            case 1: setImage("keyRed.png");
            break;
            case 2: setImage("keyYellow.png");
            break;
            case 3: setImage("keyBlue.png");
            break;
            case 4: setImage("keyGreen.png");
            break;
        
        }
    }
    
    /**
     * Act - do whatever the Key wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (this.isTouching(Hero.class)){
            Greenfoot.playSound("power2.wav");
            switch(type){
                case 1: hero.keyO=true;
                getWorld().removeObject(this);
                break;
                case 2: hero.keyY=true;
                getWorld().removeObject(this);
                break;
                case 3: hero.keyB=true;
                getWorld().removeObject(this);
                break;
                case 4: hero.keyG=true;
                getWorld().removeObject(this);
                break;
            }
        }
    }    
}
