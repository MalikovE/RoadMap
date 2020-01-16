package ru.malikov.actions;

import ru.malikov.City;
import ru.malikov.IRoadMap;
import ru.malikov.Road;
import ru.malikov.interact.Validator;

import java.util.HashSet;

public class CreateRoadAction implements Action {
    @Override
    public void execute(IRoadMap roadMap, final Validator validator) {
        final String name = validator.getString("Enter road name: ");
        final double length = validator.getDouble("Enter road length: ");
        HashSet<City> cities = new HashSet<>();
        final String name1 = validator.getString("Enter first city: ");
        final String name2 = validator.getString("Enter second city: ");
        final City city1 = roadMap.getCityByName(name1);
        final City city2 = roadMap.getCityByName(name2);
        cities.add(city1);
        cities.add(city2);
        final Road road = new Road(name, length, cities);
        roadMap.addRoad(road);
    }

    @Override
    public String intro() {
        return String.format("%s - create road", this.key());
    }

    @Override
    public int key() {
        return 2;
    }
}
