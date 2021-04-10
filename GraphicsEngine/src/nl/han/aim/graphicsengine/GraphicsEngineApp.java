package nl.han.aim.graphicsengine;

import processing.core.PApplet;

import java.util.ArrayList;

public class GraphicsEngineApp extends PApplet {
    private ArrayList<WeergaveObject> weergaveLijst = new ArrayList<>();

    public static void main(String[] args) {
        GraphicsEngineApp app = new GraphicsEngineApp();
        app.runSketch();
    }

    @Override
    public void settings() {
        size(800, 600);
    }

    @Override
    public void setup() {
        IReageerder hallo = new HalloReageerder();
        Rechthoek rechthoek = new Rechthoek(10, 10, 0.5f, 0, 0,0, 50, 50, true, 0);
        rechthoek.voegReageerderToe(hallo);
        weergaveLijst.add(rechthoek);
    }

    @Override
    public void draw() {
        // Processing objecten opschonen
        clear();
        background(255);
        for (WeergaveObject wo : weergaveLijst) {
            // Alleen zichtbare figuren
            if (wo.isZichtbaar()) {
                wo.geefWeer(this, 0, 0);
            }
        }
    }

    @Override
    public void mousePressed() {
        for (WeergaveObject wo : weergaveLijst) {
            if (wo.isMuisBinnen(this.mouseX, this.mouseY) && wo.isZichtbaar()) {
                wo.behandelMousePressedGebeurtenis();
            }
        }
    }
}
