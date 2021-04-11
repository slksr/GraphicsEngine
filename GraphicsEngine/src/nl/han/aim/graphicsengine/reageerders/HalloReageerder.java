package nl.han.aim.graphicsengine.reageerders;

import nl.han.aim.graphicsengine.engine.GameKey;
import nl.han.aim.graphicsengine.engine.IReageerder;
import nl.han.aim.graphicsengine.engine.WeergaveObject;

public class HalloReageerder implements IReageerder {
    @Override
    public void doeActie(WeergaveObject weergaveObject) {
        weergaveObject.setVx(weergaveObject.getVx() + 0.5f);
        stuurObject(weergaveObject, weergaveObject.getVx() + 0.5f, 0);
        System.out.println("Hallo Reageerder mijn snelheid is: " + weergaveObject.getVx());
    }

    @Override
    public void doeKeyActie(WeergaveObject wo, GameKey gameKey) {
        switch (gameKey) {
            case SPACE:
                stuurObject(wo, 0,0);
                break;
            case DOWN:
                setVerticalSpeedIfZero(wo);
                stuurObject(wo, 0,Math.abs(wo.getVy()));
                break;
            case UP:
                setVerticalSpeedIfZero(wo);
                stuurObject(wo, 0 ,-Math.abs(wo.getVy()));
                break;
            case RIGHT:
                setHorizontalSpeedIfZero(wo);
                stuurObject(wo, Math.abs(wo.getVx()), 0);
                break;
            case LEFT:
                setHorizontalSpeedIfZero(wo);
                stuurObject(wo, -Math.abs(wo.getVx()), 0);
                break;
        }
    }

    /** Object mag alleen verticaal of horizontaal worden verplaatst met de toetsen */
    private void stuurObject(WeergaveObject wo, float speedX, float speedY) {
        setHorizontalSpeedIfZero(wo);
        if (speedX == 0 && speedY == 0) {
            wo.setX(0);
            wo.setY(0);
        }
        wo.setVy(speedY);
        wo.setVx(speedX);
    }

    private void setVerticalSpeedIfZero(WeergaveObject wo) {
        if (wo.getVy() == 0) {
            wo.setVy(wo.getVx());
        }
    }

    private void setHorizontalSpeedIfZero(WeergaveObject wo) {
        if (wo.getVx() == 0) {
            wo.setVx(wo.getVy());
        }
    }
}
