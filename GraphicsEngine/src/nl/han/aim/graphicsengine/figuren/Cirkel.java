package nl.han.aim.graphicsengine.figuren;

import nl.han.aim.graphicsengine.GraphicsEngineApp;
import nl.han.aim.graphicsengine.engine.Figuur;
import processing.core.PApplet;
import processing.core.PConstants;

public class Cirkel extends Figuur {

    public Cirkel(GraphicsEngineApp app, float x, float y, float vx, float vy, float ax, float ay, float breedte, float hoogte, boolean isZichtbaar, int vulKleur) {
        super(app, x, y, vx, vy, ax, ay, breedte, hoogte, isZichtbaar, vulKleur);
    }

    @Override
    public void geefWeer(float startX, float startY) {
        int vulkleur = this.getVulKleur();
        app.ellipseMode(PConstants.CENTER);
        app.fill(vulkleur);
        app.stroke(vulkleur);
        app.ellipse(startX + this.getX(), startY + this.getY(), this.getBreedte(), this.getHoogte());
    }

    @Override
    public boolean isMuisBinnen(int muisX, int muisY) {
        return PApplet.dist(muisX, muisY, this.getX(), this.getY()) < getBreedte() / 2;
    }
}
