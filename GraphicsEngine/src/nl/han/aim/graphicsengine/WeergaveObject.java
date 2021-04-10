package nl.han.aim.graphicsengine;

import java.util.ArrayList;

public abstract class WeergaveObject {
    private float x, y, vx, vy, ax, ay;
    private float breedte, hoogte;
    private boolean isZichtbaar;

    private ArrayList<IReageerder> reageerdersLijst;

    public WeergaveObject(float x, float y, float vx, float vy, float ax, float ay, float breedte, float hoogte, boolean isZichtbaar) {
        this.x = x;
        this.y = y;
        this.vx = vx;
        this.vy = vy;
        this.ax = ax;
        this.ay = ay;
        this.breedte = breedte;
        this.hoogte = hoogte;
        this.isZichtbaar = isZichtbaar;
        reageerdersLijst = new ArrayList<>();
    }

    public void doeStap() {

    }

    public abstract void geefWeer(GraphicsEngineApp app, float startX, float startY);

    public abstract boolean isMuisBinnen(int muisX, int muisY);

    public void geefMousePressedGebeurtenis(int mouseX, int mouseY) {

    }

    public void behandelMousePressedGebeurtenis() {

    }

    public void voegReageerderToe(IReageerder reageerder) {
        reageerdersLijst.add(reageerder);
    }

    public void verwijderReageerder(IReageerder reageerder) {
        reageerdersLijst.remove(reageerder);
    }

    //<editor-fold desc="Getters en Setters">
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getVx() {
        return vx;
    }

    public void setVx(float vx) {
        this.vx = vx;
    }

    public float getVy() {
        return vy;
    }

    public void setVy(float vy) {
        this.vy = vy;
    }

    public float getAx() {
        return ax;
    }

    public void setAx(float ax) {
        this.ax = ax;
    }

    public float getAy() {
        return ay;
    }

    public void setAy(float ay) {
        this.ay = ay;
    }

    public float getBreedte() {
        return breedte;
    }

    public void setBreedte(float breedte) {
        this.breedte = breedte;
    }

    public float getHoogte() {
        return hoogte;
    }

    public void setHoogte(float hoogte) {
        this.hoogte = hoogte;
    }

    public boolean isZichtbaar() {
        return isZichtbaar;
    }

    public void setZichtbaar(boolean zichtbaar) {
        isZichtbaar = zichtbaar;
    }
    //</editor-fold>
}
