 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HeroCoin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HeroCoin extends Tile
{
    private Hero hero;
    public int CoinType;
    public HeroCoin(String image, int width, int heigth, int CoinType){
        super(image, width, heigth);
        switch (CoinType){
            case 1:
             setImage("hud_p1.png");
            break;
            case 2:
                setImage("hud_p3.png");
            break;
            case 3:
             setImage("hud_p2.png");
            break;
        
        }
    }
    /**
     * Act - do whatever the HeroCoin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (this.isTouching(Hero.class)){
            switch(CoinType){
                case 1:
                hero.hero="p1";
                hero.Spring=-14;
                hero.Aspeed=-10;
                hero.Dspeed=10;
                getWorld().removeObject(this);
                break;
                case 2:
                hero.hero="p3";
                hero.Spring=-10;
                hero.Aspeed=-5;
                hero.Dspeed=5;
                getWorld().removeObject(this);
                break;
                case 3:
                hero.hero="p2";
                hero.Spring=-17;
                hero.Aspeed=-10;
                hero.Dspeed=10;
                getWorld().removeObject(this);
                break;
            }
        }
    }    
}
