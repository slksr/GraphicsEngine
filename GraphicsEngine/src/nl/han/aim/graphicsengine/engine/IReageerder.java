package nl.han.aim.graphicsengine.engine;

public interface IReageerder {
    /**
     * Standaard actie van een Reageerder
     * */
    void doeActie(WeergaveObject weergaveObject);
    /**
     * Actie die dient te reageren op de GameKey enum (controltoetsen en spatiebalk)
     * */
    void doeKeyActie(WeergaveObject weergaveObject, GameKey gameKey);
}
