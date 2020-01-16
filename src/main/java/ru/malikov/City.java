package ru.malikov;

import java.util.Objects;

public class City {
    private String name;
    private double x;
    private double y;

    public City(String name, double x, double y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return Double.compare(city.x, x) == 0 &&
                Double.compare(city.y, y) == 0 &&
                name.equals(city.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, x, y);
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
