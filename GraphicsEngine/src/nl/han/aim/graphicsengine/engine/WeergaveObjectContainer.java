package nl.han.aim.graphicsengine.engine;

import nl.han.aim.graphicsengine.GraphicsEngineApp;

import java.util.ArrayList;

public class WeergaveObjectContainer extends WeergaveObject {
    private ArrayList<WeergaveObject> container = new ArrayList<>();
    private GraphicsEngineApp app;

    public WeergaveObjectContainer(GraphicsEngineApp app, float x, float y, float vx, float vy, float ax, float ay, float breedte, float hoogte, boolean isZichtbaar) {
        super(x, y, vx, vy, ax, ay, breedte, hoogte, isZichtbaar);
        this.app = app;
    }

    public void toevoegen(WeergaveObject weergaveObject) {
        container.add(weergaveObject);
    }

    public void verwijderen(WeergaveObject weergaveObject) {
        container.remove(weergaveObject);
    }

    @Override
    public void geefWeer(float startX, float startY) {
        for (WeergaveObject wo : container) {
            wo.geefWeer(startX + this.getX(), startY + this.getY());
        }
        tekenBoundingBox();
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

    public void behandelMousePressedGebeurtenis() {
        super.behandelMousePressedGebeurtenis();
        for (WeergaveObject wo : container) {
            if (wo.isMuisBinnen(Math.round(app.mouseX - getX()), Math.round(app.mouseY - getY())) && wo.isZichtbaar()) {
                wo.behandelMousePressedGebeurtenis();
            }
        }
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

    /**
     * De breedte en de hoogte kunnen bepaald worden door de breedte en een hoogte van een rechthoek dat precies alle kinderen omsluit.
     * Deze rechthoek wordt de bounding box genoemd van de WeergaveObjectContainer
     * */
    private void tekenBoundingBox() {
        app.stroke(0xFFFFFFFF);
        app.fill(0x55FFFFFF);
        app.rect(getX(), getY(), getBreedte(), getHoogte());
    }
}

