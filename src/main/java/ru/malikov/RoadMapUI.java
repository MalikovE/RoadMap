package ru.malikov;

import ru.malikov.actions.Action;
import ru.malikov.interact.Validator;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class RoadMapUI {
    private final IRoadMap roadMap;
    private final Validator validator;
    private final Map<Integer, Action> actions = new ConcurrentHashMap<>();

    public RoadMapUI(final IRoadMap roadMap, final Validator validator) {
        this.roadMap = roadMap;
        this.validator = validator;
    }

    public void loadAction(final Action action) {
        this.actions.put(action.key(), action);
    }

    public void show() {
        this.intro();
        do {
            doAction(validator);
        } while (validator.compare("Do you want to continue? (y) : ", "y"));
    }

    private void doAction(final Validator validator) {
        this.actions.get(
                validator.getIntFromList(
                        "Enter operation : ",
                        this.actions.keySet()
                )
        ).execute(this.roadMap, validator);
    }

    private void intro() {
        System.out.println("Welcome to roadmap service");
        for (final Action action : this.actions.values()) {
            System.out.println(action.intro());
        }
    }
}
