
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Hero extends Mover {
    Tile tile;
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
    public static String player = "p1";
    public static String J;
    public static String S;
    public static String H;
    public static String W;
    public static String D;
    public int Y;
    public int X;
    
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
        J = player + "_jump.png";
        S = player + "_stand.png";
        H = player + "_hurt.png";
        W = player + "_walk";
        D = player + "_duck.png";
        handleInput();
        
        X = getX();
        Y = getY();
        
        velocityX *= drag;
        velocityY += acc;
        getWorld().showText("X = " + Integer.toString(getX()),950,50);
        getWorld().showText("Y = " + Integer.toString(getY()),950,75);
        getWorld().showText("Sterren = " + Integer.toString(Stars.allStars),950,100);
        if (velocityY > gravity) {
            velocityY = gravity;
        }
        applyVelocity();
       
    }
    
    public boolean opGrond()
    {
        Actor onder=getOneObjectAtOffset(0,getImage().getHeight()/2,Tile.class);
            return onder!=null;
    }
    
    public void handleInput() {
        if (Greenfoot.isKeyDown("space")){
            setImage(J);
            velocityY = Spring;
            
            
        }
        
        if (Greenfoot.isKeyDown("w") && opGrond() == true) {
            if (this.isTouching(BackgroundTile.class) == false){
                setImage(J);
                velocityY = Spring;
                if(this.isTouching(Rope.class) == false && this.isTouching
                (DoorTop.class) == false){
                    Greenfoot.playSound("jump.wav");
                }
            }
            
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
        if (velocityX == 0) {
            setImage(S);
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
