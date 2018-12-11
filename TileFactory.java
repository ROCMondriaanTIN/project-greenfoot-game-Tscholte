import greenfoot.*;
/**
 *
 * @author R. Springer
 */
public class TileFactory {
    /**
     * Creates a Tile object based on the mapIcon number you give
     *
     * @param mapIcon number
     * @return Tile tile object
     */
    private World world;
    public static Tile createTile(int mapIcon) {
        Tile tile;
        switch (mapIcon) {case 0:
  tile = new Tile("blockerSad.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 1:
  tile = new boxInv("nuthing.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = false;
break;
 case 2:
  tile = new Tile("bombFlash.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 3:
  tile = new box("boxAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 4:
  tile = new Tile("box.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 5:
  tile = new Tile("boxCoin.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 6:
  tile = new Tile("boxCoin_disabled.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 7:
  tile = new Tile("boxCoinAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 8:
  tile = new Tile("boxCoinAlt_disabled.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 9:
  tile = new Tile("boxEmpty.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 10:
  tile = new Tile("boxExplosive.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 11:
  tile = new Tile("boxExplosive_disabled.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 12:
  tile = new Tile("boxExplosiveAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 13:
  tile = new Tile("boxItem.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 14:
  tile = new Tile("boxItem_disabled.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 15:
  tile = new Tile("boxItemAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 16:
  tile = new Tile("boxItemAlt_disabled.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 17:
  tile = new Tile("boxWarning.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 18:
  tile = new Tile("brickWall.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 19:
  tile = new Tile("bridge.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 20:
  tile = new Tile("bridgeLogs.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 21:
  tile = new Tile("bush.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
break;
 case 22:
  tile = new Tile("buttonBlue.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 23:
  tile = new Tile("buttonBlue_pressed.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 24:
  tile = new Tile("buttonGreen.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 25:
  tile = new Tile("buttonGreen_pressed.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 26:
  tile = new Tile("buttonRed.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 27:
  tile = new Tile("buttonRed_pressed.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 28:
  tile = new Tile("buttonYellow.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 29:
  tile = new Tile("buttonYellow_pressed.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 30:
  tile = new Tile("cactus.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 31:
  tile = new Tile("castle.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 32:
  tile = new Tile("castleCenter.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 33:
  tile = new Tile("castleCenter_rounded.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 34:
  tile = new Tile("castleCliffLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 35:
  tile = new Tile("castleCliffLeftAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 36:
  tile = new Tile("castleCliffRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 37:
  tile = new Tile("castleCliffRightAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 38:
  tile = new Tile("castleHalf.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 39:
  tile = new Tile("castleHalfLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 40:
  tile = new Tile("castleHalfMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 41:
  tile = new Tile("castleHalfRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 42:
  tile = new Tile("castleHillLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 43:
  tile = new Tile("castleHillLeft2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 44:
  tile = new Tile("castleHillRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 45:
  tile = new Tile("castleHillRight2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 46:
  tile = new Tile("castleLedgeLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 47:
  tile = new Tile("castleLedgeRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 48:
  tile = new Tile("castleLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 49:
  tile = new Tile("castleMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 50:
  tile = new Tile("castleRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 51:
  tile = new Tile("chain.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
  break;
 case 52:
  tile = new Tile("cloud1.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 53:
  tile = new Tile("cloud2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
break;
 case 54:
  tile = new Tile("cloud3.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 55:
  tile = new Tile("coinBronze.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 56:
  tile = new Tile("coinGold.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 57:
  tile = new Tile("coinSilver.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 58:
  tile = new Tile("dirt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 59:
  tile = new Tile("dirtCenter.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 60:
  tile = new Tile("dirtCenter_rounded.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 61:
  tile = new Tile("dirtCliffLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 62:
  tile = new Tile("dirtCliffLeftAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 63:
  tile = new Tile("dirtCliffRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 64:
  tile = new Tile("dirtCliffRightAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 65:
  tile = new Tile("dirtHalf.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 66:
  tile = new Tile("dirtHalfLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 67:
  tile = new Tile("dirtHalfMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 68:
  tile = new Tile("dirtHalfRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 69:
  tile = new Tile("dirtHillLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 70:
  tile = new Tile("dirtHillLeft2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 71:
  tile = new Tile("dirtHillRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 72:
  tile = new Tile("dirtHillRight2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 73:
  tile = new Tile("dirtLedgeLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 74:
  tile = new Tile("dirtLedgeRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 75:
  tile = new Tile("dirtLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 76:
  tile = new Tile("dirtMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 77:
  tile = new Tile("dirtRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 83:
  tile = new Tile("fence.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 84:
  tile = new Tile("fenceBroken.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 86:
  tile = new Tile("fishDead.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 87:
  tile = new Tile("fishSwim1.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 88:
  tile = new Tile("fishSwim2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 89:
  tile = new Tile("flagBlue.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
break;
 case 90:
  tile = new Tile("flagBlue2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
break;
 case 91:
  tile = new Tile("flagBlueHanging.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
break;
 case 92:
  tile = new Tile("flagGreen.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
  
break;
 case 93:
  tile = new Tile("flagGreen2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
break;
 case 94:
  tile = new Tile("flagGreenHanging.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
break;
 case 95:
  tile = new Endpoint("flagRed.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
break;
 case 96:
  tile = new Tile("flagRed2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
break;
 case 97:
  tile = new Tile("flagRedHanging.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
  break;
 case 98:
  tile = new Tile ("flagYellow.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
break;
 case 99:
  tile = new Tile("flagYellow2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
break;
 case 100:
  tile = new Tile("flagYellowHanging.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
break;
 case 104:
  tile = new Tile("gemBlue.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = false;
break;
 case 105:
  tile = new Tile("gemGreen.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 106:
  tile = new Tile("gemRed.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 107:
  tile = new Tile("gemYellow.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 108:
  tile = new Tile("grass.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 109:
  tile = new Tile("grassCenter.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 110:
  tile = new Tile("grassCenter_rounded.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 111:
  tile = new Tile("grassCliffLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 112:
  tile = new Tile("grassCliffLeftAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 113:
  tile = new Tile("grassCliffRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 114:
  tile = new Tile("grassCliffRightAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 115:
  tile = new Tile("grassHalf.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 116:
  tile = new Tile("grassHalfLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 117:
  tile = new Tile("grassHalfMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 118:
  tile = new Tile("grassHalfRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 119:
  tile = new Tile("grassHillLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 120:
  tile = new Tile("grassHillLeft2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 121:
  tile = new Tile("grassHillRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 122:
  tile = new Tile("grassHillRight2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 123:
  tile = new Tile("grassLedgeLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 124:
  tile = new Tile("grassLedgeRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 125:
  tile = new Tile("grassLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 126:
  tile = new Tile("grassMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 127:
  tile = new Tile("grassRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 128:
  tile = new Tile("hill_large.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 129:
  tile = new Tile("hill_largeAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 130:
  tile = new Tile("hill_small.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 131:
  tile = new Tile("hill_smallAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 132:
  tile = new Tile("hud_0.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 133:
  tile = new Tile("hud_1.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 134:
  tile = new Tile("hud_2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 135:
  tile = new Tile("hud_3.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 136:
  tile = new Tile("hud_4.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 137:
  tile = new Tile("hud_5.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 138:
  tile = new Tile("hud_6.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 139:
  tile = new Tile("hud_7.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 140:
  tile = new Tile("hud_8.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 141:
  tile = new Tile("hud_9.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 142:
  tile = new Tile("hud_coins.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 144:
  tile = new Tile("hud_gem_green.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 145:
  tile = new Tile("hud_gem_red.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 146:
  tile = new Tile("hud_gem_yellow.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 147:
  tile = new Tile("hud_heartEmpty.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 148:
  tile = new Tile("hud_heartFull.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 149:
  tile = new Tile("hud_heartHalf.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 150:
  tile = new Tile("hud_keyBlue.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 151:
  tile = new Tile("hud_keyBlue_disabled.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 152:
  tile = new Tile("hud_keyGreem_disabled.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 153:
  tile = new Tile("hud_keyGreen.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 154:
  tile = new Tile("hud_keyRed.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 155:
  tile = new Tile("hud_keyRed_disabled.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 156:
  tile = new Tile("hud_keyYellow.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 157:
  tile = new Tile("hud_keyYellow_disabled.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 165:
  tile = new Tile("hud_x.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 171:
  tile = new Tile("ladder_mid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 172:
  tile = new Tile("ladder_top.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 176:
  tile = new Tile("liquidWater.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 177:
  tile = new Tile("liquidWaterTop.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 178:
  tile = new Tile("liquidWaterTop_mid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 179:
  tile = new KeyTile("lock_blue.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT, 3);
 tile.isSolid=true;
break;
 case 180:
  tile = new KeyTile("lock_green.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT, 4);
tile.isSolid=true;
  break;
 case 181:
  tile = new KeyTile("lock_red.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT, 1);
tile.isSolid=true;
  break;
 case 182:
  tile = new KeyTile("lock_yellow.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT, 2);
    tile.isSolid=true; 
break;
 case 183:
  tile = new Tile("mushroomBrown.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 184:
  tile = new Tile("mushroomRed.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 204:
  tile = new Tile("particleBrick1a.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 205:
  tile = new Tile("particleBrick1b.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 206:
  tile = new Tile("particleBrick2a.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 207:
  tile = new Tile("particleBrick2b.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 208:
  tile = new Tile("plant.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     
break;
 case 209:
  tile = new Tile("plantPurple.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 212:
  tile = new Tile("rock.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     
break;
 case 213:
  tile = new Tile("rockHillLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 214:
  tile = new Tile("rockHillRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 215:
  tile = new Tile("ropeAttached.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 216:
  tile = new Tile("ropeHorizontal.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 217:
  tile = new Tile("ropeVertical.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
break;
 case 218:
  tile = new Tile("sand.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 219:
  tile = new Tile("sandCenter.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 220:
  tile = new Tile("sandCenter_rounded.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 221:
  tile = new Tile("sandCliffLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 222:
  tile = new Tile("sandCliffLeftAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 223:
  tile = new Tile("sandCliffRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 224:
  tile = new Tile("sandCliffRightAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 225:
  tile = new Tile("sandHalf.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 226:
  tile = new Tile("sandHalfLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 227:
  tile = new Tile("sandHalfMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 228:
  tile = new Tile("sandHalfRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 229:
  tile = new Tile("sandHillLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 230:
  tile = new Tile("sandHillLeft2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 231:
  tile = new Tile("sandHillRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 232:
  tile = new Tile("sandHillRight2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 233:
  tile = new Tile("sandLedgeLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 234:
  tile = new Tile("sandLedgeRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 235:
  tile = new Tile("sandLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 236:
  tile = new Tile("sandMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 237:
  tile = new Tile("sandRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 238:
  tile = new Tile("sign.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 239:
  tile = new Tile("signExit.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 240:
  tile = new Tile("signLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 241:
  tile = new Tile("signRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
break;
 case 245:
  tile = new Tile("snailShell.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 246:
  tile = new Tile("snailShell_upsidedown.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 247:
  tile = new Tile("snailWalk1.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 248:
  tile = new Tile("snailWalk2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 249:
  tile = new Tile("snow.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 250:
  tile = new Tile("snowCenter.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 251:
  tile = new Tile("snowCenter_rounded.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 252:
  tile = new Tile("snowCliffLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 253:
  tile = new Tile("snowCliffLeftAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 254:
  tile = new Tile("snowCliffRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 255:
  tile = new Tile("snowCliffRightAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 256:
  tile = new Tile("snowHalf.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 257:
  tile = new Tile("snowHalfLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 258:
  tile = new Tile("snowHalfMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 259:
  tile = new Tile("snowHalfRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 260:
  tile = new Tile("snowhill.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 261:
  tile = new Tile("snowHillLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 262:
  tile = new Tile("snowHillLeft2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 263:
  tile = new Tile("snowHillRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 264:
  tile = new Tile("snowHillRight2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 265:
  tile = new Tile("snowLedgeLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 266:
  tile = new Tile("snowLedgeRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 267:
  tile = new Tile("snowLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 268:
  tile = new Tile("snowMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 269:
  tile = new Tile("snowRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 270:
  tile = new Spikes("spikes.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 271:
  tile = new Tile("springboardDown.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 272:
  tile = new Tile("springboardUp.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 274:
  tile = new Tile("stone.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 275:
  tile = new Tile("stoneCenter.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 276:
  tile = new Tile("stoneCenter_rounded.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 277:
  tile = new Tile("stoneCliffLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 278:
  tile = new Tile("stoneCliffLeftAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 279:
  tile = new Tile("stoneCliffRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 280:
  tile = new Tile("stoneCliffRightAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 281:
  tile = new Tile("stoneHalf.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 282:
  tile = new Tile("stoneHalfLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 283:
  tile = new Tile("stoneHalfMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 284:
  tile = new Tile("stoneHalfRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 285:
  tile = new Tile("stoneHillLeft2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 286:
  tile = new Tile("stoneHillRight2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 287:
  tile = new Tile("stoneLedgeLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 288:
  tile = new Tile("stoneLedgeRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 289:
  tile = new Tile("stoneLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 290:
  tile = new Tile("stoneMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 291:
  tile = new Tile("stoneRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 292:
  tile = new Tile("stoneWall.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 293:
  tile = new Tile("switchLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 294:
  tile = new Tile("switchMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 295:
  tile = new Tile("switchRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 297:
  tile = new Tile("tochLit.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 298:
  tile = new Tile("tochLit2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 299:
  tile = new Tile("torch.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 300:
  tile = new Tile("weight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 301:
  tile = new Tile("weightChained.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
 case 302:
  tile = new Tile("window.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
case 303:
 tile = new Tile("liquidLava.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
case 305:
tile = new LavaTile("liquidLavaTop_mid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
     tile.isSolid = true;
break;
case 306:
tile = new Water("liquidWaterTop_mid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true; 
break;
case 370:
tile = new DoorTop("door_openTop.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT, 1);
    tile.isSolid = false; 
break;
case 371:
tile = new DoorTop("door_openTop.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT, 2);
    tile.isSolid = false; 
break;
case 372:
tile = new DoorTop("door_openTop.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT, 3);
    tile.isSolid = false; 
break;
case 373:
tile = new DoorTop("door_openTop.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT, 4);
    tile.isSolid = false; 
break;
case 374:
tile = new DoorTop("door_openTop.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT, 5);
    tile.isSolid = false; 
break;
case 308:
tile = new Key("keyRed.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT, 1);
    tile.isSolid = false; 
break;
case 309:
tile = new Key("keyRed.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT, 2);
    tile.isSolid = false; 
break;
case 310:
tile = new Key("keyRed.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT, 3);
    tile.isSolid = false; 
break;
case 311:
tile = new Key("keyRed.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT, 4);
    tile.isSolid = false; 
break;
case 501:
tile = new DoorLevel1("door_openMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT, 1);
    tile.isSolid = false; 
break;
case 502:
tile = new DoorLevel1("door_openMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT, 2);
    tile.isSolid = false;
break;
case 503:
tile = new DoorLevel1("door_openMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT, 3);
    tile.isSolid = false; 
break;
case 504:
tile = new DoorLevel1("door_openMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT, 4);
    tile.isSolid = false; 
break;
case 507:
tile = new DoorLevel1("door_openMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT, 5);
    tile.isSolid = false;
case 312:
tile = new Stars("star.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = false; 
    break;
case 313:
tile = new diamand("door_openMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = false;
    break;
case 314:
tile = new HeroCoin("door_openMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT, 1);
    tile.isSolid = false;
    break;
case 315:
tile = new HeroCoin("door_openMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT, 2);
    tile.isSolid = false;
    break;
case 316:
tile = new HeroCoin("door_openMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT, 3);
    tile.isSolid = false;
    break;
case 317:
  tile = new Weight("weightChained.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
break;
case 318:
tile = new Tile("nuthing.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;

default:
                tile = new Tile("nuthing.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                    tile.isSolid = true;
break;
            }

        return tile;
    }
       

}
