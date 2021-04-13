package nl.han.aim.graphicsengine.engine;

import java.util.HashMap;
import java.util.Map;

/** Java variant van een .Net enum */
public enum GameKey {
    LEFT(37),
    UP(38),
    RIGHT(39),
    DOWN(40),
    SPACE(32),
    M(77, "Muziek");

    private int value;
    private String description;
    private static Map map = new HashMap<>();

    GameKey(int value) {
        this(value, "");
    }

    GameKey(int value, String description) {
        this.value = value;
        this.description = description;
    }

    static {
        for (GameKey gameKey : GameKey.values()) {
            map.put(gameKey.value, gameKey);
        }
    }

    public int getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

    public static GameKey valueOf(int keyValue) {
        return (GameKey) map.get(keyValue);
    }
}
