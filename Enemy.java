
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Enemy extends Mover {

    private int walkRange;
    private int xMin;
    private int xMax;
    private boolean firstAct;
    private int speed;
    private double gravity;
    private double acc;

    public Enemy() {
        super();
        setImage("slimeWalk1.png");
        getImage().mirrorHorizontally();
        walkRange = 140;
        gravity = 9.8;
        firstAct = true;
        acc = 0.6;
        speed = 1;
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
        } else if (getX() <= xMin) {
            speed *= -1;
            x = xMin;
            getImage().mirrorHorizontally();
        }
        
        if (isTouching(Hero.class)){
            death d = new death();
            Greenfoot.setWorld(d);
        }
    }
}
