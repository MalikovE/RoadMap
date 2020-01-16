package ru.malikov.actions;

import ru.malikov.City;
import ru.malikov.IRoadMap;
import ru.malikov.interact.Validator;

public class CreateCityAction implements Action {
    @Override
    public void execute(IRoadMap roadMap, final Validator validator) {
        final String name = validator.getString("Enter city name: ");
        final double x = validator.getDouble("Enter city x-coord:");
        final double y = validator.getDouble("Enter city y-coord:");
        final City city = new City(name, x, y);
        roadMap.addCity(city);
    }

    @Override
    public String intro() {
        return String.format("%s - create city", this.key());
    }

    @Override
    public int key() {
        return 1;
    }
}
