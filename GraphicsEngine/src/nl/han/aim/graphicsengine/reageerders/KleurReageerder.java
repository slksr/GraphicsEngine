package nl.han.aim.graphicsengine.reageerders;

import nl.han.aim.graphicsengine.engine.Figuur;
import nl.han.aim.graphicsengine.engine.IReageerder;
import nl.han.aim.graphicsengine.engine.WeergaveObject;

import java.awt.*;
import java.util.Random;

public class KleurReageerder implements IReageerder {
    private Color[] kleuren = new Color[] {Color.red, Color.white, Color.yellow, Color.blue, Color.MAGENTA};
    private Random r = new Random();


    /**
     * Alleen bij een object afgeleid van Figuur kun je de kleur zetten
     * @param weergaveObject
     */
    @Override
    public void doeActie(WeergaveObject weergaveObject) {
        Color c = kleuren[r.nextInt(kleuren.length)];
        if (weergaveObject instanceof Figuur) {
            ((Figuur)weergaveObject).setVulKleur(c.getRGB());
        }
        System.out.println("KleurReageerder ik heb de kleurstelling r, g, b:\t" + c.toString());
    }
}
