package ru.malikov.actions;

import ru.malikov.IRoadMap;
import ru.malikov.Road;
import ru.malikov.interact.Validator;

import java.util.Collection;

public class GetRoadsByCityAction implements Action {
    @Override
    public void execute(IRoadMap roadMap, Validator validator) {
        final String name = validator.getString("Enter city name: ");
        Collection<Road> roads = roadMap.getRoadList(name);
        for (Road road : roads) {
            System.out.println(road);
        }
    }

    @Override
    public String intro() {
        return String.format("%s - get road list by city name", this.key());
    }

    @Override
    public int key() {
        return 5;
    }
}
