package nl.han.aim.graphicsengine.reageerders;

import nl.han.aim.graphicsengine.engine.*;

public class MuziekReageerder implements IReageerder {

    private final Geluid geluid;

    public MuziekReageerder(Geluid geluid) {
        this.geluid = geluid;
    }

    @Override
    public void doeActie(WeergaveObject weergaveObject) {
        System.out.println("Muziek wordt " + (!geluid.speeltMuziek() ? "niet " : "")  + "afgespeeld!" );
    }

    @Override
    public void doeKeyActie(WeergaveObject weergaveObject, GameKey gameKey) {
        if (gameKey != GameKey.M)
            return;
        geluid.schakelGeluid();
        doeActie(weergaveObject);
    }
}
