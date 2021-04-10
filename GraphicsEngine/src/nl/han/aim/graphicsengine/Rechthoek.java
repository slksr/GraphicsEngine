package nl.han.aim.graphicsengine;

public class Rechthoek extends Figuur{
    public Rechthoek(float x, float y, float vx, float vy, float ax, float ay, float breedte, float hoogte, boolean isZichtbaar, int vulKleur) {
        super(x, y, vx, vy, ax, ay, breedte, hoogte, isZichtbaar, vulKleur);
    }

    @Override
    public void geefWeer(GraphicsEngineApp app, float startX, float startY) {

    }

    @Override
    public boolean isMuisBinnen(int muisX, int muisY) {
        return false;
    }
}
