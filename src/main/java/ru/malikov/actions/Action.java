package ru.malikov.actions;

import ru.malikov.IRoadMap;
import ru.malikov.interact.Validator;

public interface Action {
    void execute(final IRoadMap roadMap, final Validator validator);
    String intro();
    int key();
}
