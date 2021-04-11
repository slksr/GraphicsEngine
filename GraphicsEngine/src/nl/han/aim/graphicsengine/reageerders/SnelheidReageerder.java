package nl.han.aim.graphicsengine.reageerders;

import nl.han.aim.graphicsengine.engine.*;

public class SnelheidReageerder implements IReageerder {

    @Override
    public void doeActie(WeergaveObject weergaveObject) {
        weergaveObject.setVx(weergaveObject.getVy() + 0.1f);
        weergaveObject.setVy(weergaveObject.getVx());
        System.out.println("SnelheidsReageerder mijn snelheid is:\n\tHorizontaal: " + weergaveObject.getVx() + "\n\tVerticaal: " + weergaveObject.getVy());
    }

    @Override
    public void doeKeyActie(WeergaveObject weergaveObject, GameKey gameKey) {
        // nog geen implementatie van deze reageerder bepaald
    }
}
