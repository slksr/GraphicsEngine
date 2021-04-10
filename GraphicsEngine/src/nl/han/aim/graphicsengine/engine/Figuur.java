package nl.han.aim.graphicsengine.engine;

import nl.han.aim.graphicsengine.engine.WeergaveObject;

public abstract class Figuur extends WeergaveObject {
    private int vulKleur;

    public Figuur(float x, float y, float vx, float vy, float ax, float ay, float breedte, float hoogte, boolean isZichtbaar, int vulKleur) {
        super(x, y, vx, vy, ax, ay, breedte, hoogte, isZichtbaar);
        this.vulKleur = vulKleur;
    }

    public int getVulKleur() {
        return vulKleur;
    }

    public void setVulKleur(int vulKleur) {
        this.vulKleur = vulKleur;
    }
}
