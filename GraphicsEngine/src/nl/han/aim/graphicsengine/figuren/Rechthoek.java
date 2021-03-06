package nl.han.aim.graphicsengine.figuren;

import nl.han.aim.graphicsengine.GraphicsEngineApp;
import nl.han.aim.graphicsengine.engine.Figuur;

public class Rechthoek extends Figuur {
    public Rechthoek(GraphicsEngineApp app, float x, float y, float vx, float vy, float ax, float ay, float breedte, float hoogte, boolean isZichtbaar, int vulKleur) {
        super(app, x, y, vx, vy, ax, ay, breedte, hoogte, isZichtbaar, vulKleur);
    }

    @Override
    public void geefWeer(float startX, float startY) {
        int vulkleur = this.getVulKleur();
        app.fill(vulkleur);
        app.stroke(vulkleur);
        app.rect(startX + this.getX(), startY + this.getY(), this.getBreedte(), this.getHoogte());
    }

    @Override
    public boolean isMuisBinnen(int muisX, int muisY) {
        return (muisX > this.getX() && muisX <= this.getX() + this.getBreedte() && muisY > this.getY() && muisY <= this.getY() + this.getHoogte());
    }
}
