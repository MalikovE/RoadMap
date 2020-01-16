package ru.malikov;

import java.util.HashSet;
import java.util.Objects;
import java.util.TreeSet;

public class Road {
    private String name;
    private double length;
    private HashSet<City> cities;

    public Road(String name, double length, HashSet<City> cities) {
        this.name = name;
        this.length = length;
        this.cities = cities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public HashSet<City> getCities() {
        return cities;
    }

    public void setCities(HashSet<City> cities) {
        this.cities = cities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Road road = (Road) o;
        return Double.compare(road.length, length) == 0 &&
                name.equals(road.name) &&
                cities.equals(road.cities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, length, cities);
    }

    @Override
    public String toString() {
        return "Road{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", cities=" + cities +
                '}';
    }
}
