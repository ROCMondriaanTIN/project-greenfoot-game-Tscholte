
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Hero extends Mover {

    private final double gravity;
    private final double acc;
    private final double drag;
    public int Dc;
    public int stars;
    public static boolean keyG;
    public static boolean keyB;
    public static boolean keyY;
    public static boolean keyO;

    public Hero() {
        super();
        gravity = 9.8;
        acc = 0.6;
        drag = 0.8;
        setImage("p1.png");
    }

    @Override
    public void act() {
        handleInput();
        
        velocityX *= drag;
        velocityY += acc;
        if (velocityY > gravity) {
            velocityY = gravity;
        }
        applyVelocity();
        
        
        for (Actor ster : getIntersectingObjects(Stars.class)) {
            if (ster != null){
                stars++;
                getWorld().removeObject(ster);
                break;
            }
        }

        for (Actor enemy : getIntersectingObjects(Enemy.class)) {
            if (enemy != null) {
                setImage("p1_hurt.png");
                setLocation(300, 200);
                Dc ++;
                break;
            }
        }
       
    }
    
    public boolean opGrond()
    {
        Actor onder=getOneObjectAtOffset(0,getImage().getHeight()/2,Tile.class);
        return onder!=null;
    }
    
    public void handleInput() {
        if (Greenfoot.isKeyDown("w") && opGrond() == true) {
            velocityY = -10;
            setImage("p1_jump.png");
        }

        if (Greenfoot.isKeyDown("a")) {
            velocityX = -10;
        } else if (Greenfoot.isKeyDown("d")) {
            velocityX = 10;
        }

        if (Greenfoot.isKeyDown("s")) {
            setImage("p1_duck.png");
        }
        setImage("p1.png");
    }

    public int getWidth() {
        return getImage().getWidth();
    }

    public int getHeight() {
        return getImage().getHeight();
    }
}
