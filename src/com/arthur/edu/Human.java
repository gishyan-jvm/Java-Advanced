package com.arthur.edu;

import java.util.Objects;

public class Human {
    private String name;
    private String lastName;
    private Integer year;

    public Human() {

    }

    public Human(String name, String lastName, Integer year) {
        if (name == null || lastName == null || year == null) {
            throw new RuntimeException("The fields can`t be null");
        }
        this.name = name;
        this.lastName = lastName;
        if (year < 1911 || year > 2026) {
            throw new RuntimeException("Out of bounds(1911-2026");
        }
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(name, human.name) && Objects.equals(lastName, human.lastName) && Objects.equals(year, human.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, year);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", year=" + year +
                '}';
    }
}
