package nl.han.aim.graphicsengine.reageerders;

import nl.han.aim.graphicsengine.engine.IReageerder;

public class HalloReageerder implements IReageerder {
    @Override
    public void doeActie() {
        System.out.println("Hallo Reageerder...");
    }
}
