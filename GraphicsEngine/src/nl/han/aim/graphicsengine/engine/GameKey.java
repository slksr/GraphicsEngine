package nl.han.aim.graphicsengine.engine;

import java.util.HashMap;
import java.util.Map;

/** Java variant van een .Net enum */
public enum GameKey {
    LEFT(37),
    UP(38),
    RIGHT(39),
    DOWN(40),
    SPACE(32);

    private int value;
    private static Map map = new HashMap<>();

    GameKey(int value) {
        this.value = value;
    }

    static {
        for (GameKey gameKey : GameKey.values()) {
            map.put(gameKey.value, gameKey);
        }
    }

    public int getValue() {
        return value;
    }

    public static GameKey valueOf(int keyValue) {
        return (GameKey) map.get(keyValue);
    }
}
