package ru.malikov;

import ru.malikov.actions.*;
import ru.malikov.interact.ConsoleIO;
import ru.malikov.interact.Validator;

import java.util.Scanner;

public class RoadMapRunner {
    public static void main(String[] args) {
        final RoadMapUI ui = new RoadMapUI(
                new RoadMap(),
                new Validator(
                        new ConsoleIO(
                                new Scanner(System.in),
                                System.out
                        )
                )
        );
        ui.loadAction(new ShowAction());
        ui.loadAction(new CreateCityAction());
        ui.loadAction(new CreateRoadAction());
        ui.loadAction(new DeleteRoadAction());
        ui.loadAction(new GetCityByNameAction());
        ui.loadAction(new GetRoadsByCityAction());
        ui.show();
    }
}
