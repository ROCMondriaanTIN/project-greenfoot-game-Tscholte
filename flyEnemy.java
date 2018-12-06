import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class flyEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class flyEnemy extends Mover
{private int walkRange;
    private int xMin;
    private int xMax;
    private boolean firstAct;
    private int speed;
    private double gravity;
    private double acc;
    private int i;
    private int q;

    public flyEnemy() {
        super();
        setImage("flyFly1.png");
        getImage().mirrorHorizontally();
        walkRange = 340;
        gravity = 9.8;
        firstAct = true;
        acc = 0.6;
        speed = 1;
        i=1;
        q=1;
    }
    

    @Override
    public void act() {
        int x = getX();
        int y = getY();

        if (firstAct) {
            firstAct = false;
            xMin = x - walkRange / 2;
            xMax = x + walkRange / 2;
        }

        velocityX = speed;
        applyVelocity();
        if (getX() >= xMax) {
            speed *= -1;
            x = xMax;
            getImage().mirrorHorizontally();
            q=2;
        } else if (getX() <= xMin) {
            speed *= -1;
            x = xMin;
            getImage().mirrorHorizontally();
            q=1;
        }
        
        if (isTouching(Hero.class)){
            Hero.isDead=true;
        }
    }
}

