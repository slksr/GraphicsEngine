package nl.han.aim.graphicsengine.reageerders;

import nl.han.aim.graphicsengine.engine.IReageerder;
import nl.han.aim.graphicsengine.engine.WeergaveObject;

public class HalloReageerder implements IReageerder {
    @Override
    public void doeActie(WeergaveObject weergaveObject) {
        weergaveObject.setVx(weergaveObject.getVx() + 0.5f);
        System.out.println("Hallo Reageerder mijn snelheid is: " + weergaveObject.getVx());
    }
}
