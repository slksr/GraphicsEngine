package nl.han.aim.graphicsengine.engine;

import ddf.minim.Minim;
import ddf.minim.AudioPlayer;
import nl.han.aim.graphicsengine.GraphicsEngineApp;

public final class Geluid {
    private Minim minim;
    private AudioPlayer player;

    public Geluid(GraphicsEngineApp app, String bestand) {
        minim = new Minim(app);
        player =  minim.loadFile(bestand);
    }

    public void schakelGeluid() {
        if (player.isPlaying()) {
            player.pause();
            player.rewind();
        }
        else {
            player.play();
        }
    }

    public boolean speeltMuziek() {
        return player.isPlaying();
    }
}
