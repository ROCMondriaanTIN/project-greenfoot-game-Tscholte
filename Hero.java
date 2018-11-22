
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Hero extends Mover {
    
    public double gravity;
    public double acc;
    public double drag;
    private int y = 1;
    private String teller;
    public static int Dc;
    public static int stars;
    public static boolean Rihanna;
    public static int Spring;
    public static int Aspeed;
    public static int Dspeed;
    public static boolean keyG;
    public static boolean keyB;
    public static boolean keyY;
    public static boolean keyO;
    public static boolean isDead;
    public static String hero = "p1";
    public static String J;
    public static String S;
    public static String H;
    public static String W;
    public static String D;
    
    public Hero() {
        super();
        gravity = 9.8;
        acc = 0.6;
        drag = 0.8;
        setImage("p1.png");
        Spring = -14;    
        Aspeed = -10;
        Dspeed = 10;
        
    }

    @Override
    public void act() {
        J = hero + "_jump.png";
        S = hero + "_stand.png";
        H = hero + "_hurt.png";
        W = hero + "_walk";
        D = hero + "_duck.png";
        handleInput();
        getWorld().getObjects(Stars.class);
        
        velocityX *= drag;
        velocityY += acc;
        getWorld().showText("X = " + Integer.toString(getX()),950,50);
        getWorld().showText("Y = " + Integer.toString(getY()),950,75);
        getWorld().showText("Sterren = " + Integer.toString(Stars.stars),950,100);
        if (velocityY > gravity) {
            velocityY = gravity;
        }
        applyVelocity();
        
        
        
        
        
        
        
        for (HeroCoin coin : getIntersectingObjects(HeroCoin.class)) {
            if (coin != null){
                getWorld().removeObject(coin);
                setImage(S);
                return;
            }
        }
        
        
        for (Actor lava : getIntersectingObjects(LavaTile.class)) {
            if (lava != null) {
                setImage(H);
                isDead=true;
                Dc ++;
                hero="p1";
                stars=0;
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
            setImage(J);
            velocityY = Spring;
            
            
        }

        if (Greenfoot.isKeyDown("a")) {
            velocityX = Aspeed;
            if(velocityY != 0){
                setImage(J);
                getImage().mirrorHorizontally();
            }
            else{
                animation();
                getImage().mirrorHorizontally();
            }
        } else if (Greenfoot.isKeyDown("d")) {
            velocityX = Dspeed;
            if(velocityY != 0){
                setImage(J);
            }
            else{
                animation();
            }
        }

        if (Greenfoot.isKeyDown("s")) {
            setImage(D);
        }
        
        
    }

    public int getWidth() {
        return getImage().getWidth();
    }

    public int getHeight() {
        
        return getImage().getHeight();
        
    }
    
    public void animation(){
        String dir = "images/"+W+"/PNG/"+W;
        if (y != 12){
            teller= Integer.toString(y);
            y++;
        }
        else if (y==12){
            y =1;
        }
        
        setImage (dir+teller+".png");
    }
}
