package ru.malikov;

import java.util.*;

public class RoadMap implements IRoadMap {
    private Map<String, City> cities = new LinkedHashMap<>();
    private Map<String, Road> roads = new LinkedHashMap<>();

    @Override
    public synchronized void addCity(City city) {
        this.cities.put(city.getName(), city);
    }

    @Override
    public synchronized void addRoad(Road road) {
        this.roads.put(road.getName(), road);
    }

    @Override
    public synchronized void deleteRoad(String name) {
        this.roads.remove(this.getRoadByName(name));
    }

    @Override
    public synchronized City getCityByName(String name) {
        return this.cities.get(name);
    }

    @Override
    public synchronized Road getRoadByName(String name) {
        return this.roads.get(name);
    }

    @Override
    public synchronized Collection<City> getCities() {
        return new ArrayList<>(cities.values());
    }

    @Override
    public synchronized Collection<Road> getRoads() {
        return new ArrayList<>(roads.values());
    }

    @Override
    public synchronized Collection<Road> getRoadList(String name) {
        List<Road> result = new ArrayList<>();
        for (Road road : this.roads.values()) {
            for (City city : road.getCities()) {
                if (city.getName().contains(name)) {
                    result.add(road);
                }
            }
        }
        return result;
    }
}
