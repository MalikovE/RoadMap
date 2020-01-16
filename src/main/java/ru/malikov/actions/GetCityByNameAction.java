package ru.malikov.actions;

import ru.malikov.City;
import ru.malikov.IRoadMap;
import ru.malikov.interact.Validator;

public class GetCityByNameAction implements Action {
    @Override
    public void execute(IRoadMap roadMap, Validator validator) {
        final String name = validator.getString("Enter city name: ");
        City city = roadMap.getCityByName(name);
        System.out.println(city);
    }

    @Override
    public String intro() {
        return String.format("%s - get city by name", this.key());
    }

    @Override
    public int key() {
        return 4;
    }
}
