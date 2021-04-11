package nl.han.aim.graphicsengine;

import nl.han.aim.graphicsengine.engine.WeergaveObject;
import nl.han.aim.graphicsengine.engine.WeergaveObjectContainer;
import nl.han.aim.graphicsengine.figuren.Rechthoek;
import nl.han.aim.graphicsengine.reageerders.HalloReageerder;
import nl.han.aim.graphicsengine.reageerders.KleurReageerder;
import nl.han.aim.graphicsengine.reageerders.SnelheidReageerder;
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
        // Container aanmaken voor Figuren die bij elkaar horen
        WeergaveObjectContainer container = new WeergaveObjectContainer(this,100, 100, 0.0f, 0.1f, 0f, 0, 0, 0, true);

        // Figuren maken en Reageerders toekennen
        Rechthoek rechthoekZwart = new Rechthoek(this,10, 10, 0.5f, 0, 0,0, 50, 50, true, 0);
        rechthoekZwart.voegReageerderToe(new HalloReageerder());

        Rechthoek rechthoekAzure = new Rechthoek(this,0, 0, 0.0f, 0.1f, 0f, 0, 30, 70, true, 0xFF007FFF);
        SnelheidReageerder snelheidReageerder = new SnelheidReageerder();
        rechthoekAzure.voegReageerderToe(snelheidReageerder);

        Rechthoek rechthoekKleur = new Rechthoek(this,50, 50, 0.5f, 0, 0f, 0, 25, 25, true, 0xFFFF0000);
        rechthoekKleur.voegReageerderToe(new KleurReageerder());
        rechthoekKleur.voegReageerderToe(snelheidReageerder);

        // Figuren toevoegen aan container
        container.toevoegen(rechthoekAzure);
        container.toevoegen(rechthoekKleur);

        // interne lijst van WeergaveObjecten bijwerken
        weergaveLijst.add(rechthoekZwart);
        weergaveLijst.add(container);
    }

    @Override
    public void draw() {
        // Processing objecten opschonen
        clear();
        background(0xFF777FFF);
        for (WeergaveObject wo : weergaveLijst) {
            // Alleen zichtbare figuren
            if (wo.isZichtbaar()) {
                wo.doeStap();
                wo.geefWeer(0, 0);
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
