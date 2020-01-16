package ru.malikov.actions;


import ru.malikov.City;
import ru.malikov.IRoadMap;
import ru.malikov.Road;
import ru.malikov.interact.Validator;

public class ShowAction implements Action {
	@Override
	public void execute(IRoadMap roadMap, Validator validator) {
		for (City city : roadMap.getCities()) {
			System.out.println(city);
		}
		for (Road road : roadMap.getRoads()) {
			System.out.println(road);
		}
	}

	@Override
	public String intro() {
		return String.format("%s - show cities", this.key());
	}

	@Override
	public int key() {
		return 0;
	}
}
