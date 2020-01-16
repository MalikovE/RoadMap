package ru.malikov;

import java.util.Collection;

public interface IRoadMap {
    void addCity(City city);
    void addRoad(Road road);
    void deleteRoad(String name);
    City getCityByName(String name);
    Road getRoadByName(String name);
    Collection<City> getCities();
    Collection<Road> getRoads();
    Collection<Road> getRoadList(String name);
}
