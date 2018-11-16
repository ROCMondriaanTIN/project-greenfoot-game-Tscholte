
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
    public int Spring = -14;
    public int A = -10;
    public int Dsnelheid = 10;
    public static boolean keyG;
    public static boolean keyB;
    public static boolean keyY;
    public static boolean keyO;
    public static boolean isDead;
    

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
        getWorld().showText("X = " + Integer.toString(getX()),950,50);
        getWorld().showText("Y = " + Integer.toString(getY()),950,75);
        if (velocityY > gravity) {
            velocityY = gravity;
        }
        applyVelocity();
        
        
        for (Actor ster : getIntersectingObjects(Stars.class)) {
            if (ster != null){
                stars++;
                getWorld().removeObject(ster);
                return;
            }
        }
        
        for (Actor coin : getIntersectingObjects(P2coin.class)) {
            if (coin != null){
                
                getWorld().removeObject(coin);
                return;
            }
        }

        for (Actor enemy : getIntersectingObjects(Enemy.class)) {
            if (enemy != null) {
                setImage("p1_hurt.png");
                isDead=true;
                getWorld().removeObject(this);
                Dc ++;
                return;
            }
        }
        
        for (Actor lava : getIntersectingObjects(LavaTile.class)) {
            if (lava != null) {
                setImage("p1_hurt.png");
                isDead=true;
                getWorld().removeObject(this);
                Dc ++;
                return;
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
            velocityY = Spring;
            setImage("p1_jump.png");
        }

        if (Greenfoot.isKeyDown("a")) {
            velocityX = A;
        } else if (Greenfoot.isKeyDown("d")) {
            velocityX = Dsnelheid;
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
