package nl.han.aim.graphicsengine.engine;

import nl.han.aim.graphicsengine.GraphicsEngineApp;

import java.util.ArrayList;

public class WeergaveObjectContainer extends WeergaveObject {
    private ArrayList<WeergaveObject> container = new ArrayList<>();

    public WeergaveObjectContainer(float x, float y, float vx, float vy, float ax, float ay, float breedte, float hoogte, boolean isZichtbaar) {
        super(x, y, vx, vy, ax, ay, breedte, hoogte, isZichtbaar);
    }

    public void toevoegen(WeergaveObject weergaveObject) {
        container.add(weergaveObject);
    }

    public void verwijderen(WeergaveObject weergaveObject) {
        container.remove(weergaveObject);
    }

    @Override
    public void geefWeer(GraphicsEngineApp app, float startX, float startY) {
        for (WeergaveObject wo : container) {
            wo.geefWeer(app, startX + this.getX(), startY + this.getY());
        }
    }

    @Override
    public boolean isMuisBinnen(int muisX, int muisY) {
        return (muisX > getX() && muisX <= getX() + getBreedte() &&
                muisY > getY() && muisY <= getY() + getHoogte());
    }

    @Override
    public void doeStap() {
        super.doeStap();
        for (WeergaveObject wo : container) {
            wo.doeStap();
        }
        zetCorrecteHoogteEnBreedte();
    }

    private void zetCorrecteHoogteEnBreedte() {
        float hoogsteX = 0;
        float hoogsteY = 0;
        for (WeergaveObject wo : container) {
            float maxXvanDitObject = getX() + wo.getX() + wo.getBreedte();
            float maxYvanDitObject = getY() + wo.getY() + wo.getHoogte();
            if (maxXvanDitObject > hoogsteX) {
                hoogsteX = maxXvanDitObject;
            }
            if (maxYvanDitObject > hoogsteY) {
                hoogsteY = maxYvanDitObject;
            }
        }
        this.setBreedte(hoogsteX - getX());
        this.setHoogte(hoogsteY - getY());
    }
}

