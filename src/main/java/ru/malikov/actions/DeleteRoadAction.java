package ru.malikov.actions;

import ru.malikov.IRoadMap;
import ru.malikov.interact.Validator;

public class DeleteRoadAction implements Action {
    @Override
    public void execute(IRoadMap roadMap, final Validator validator) {
        final String name = validator.getString("Enter road name: ");
        roadMap.deleteRoad(name);
    }

    @Override
    public String intro() {
        return String.format("%s - delete road", this.key());
    }

    @Override
    public int key() {
        return 3;
    }
}
