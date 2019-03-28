package ru.springtimes.data;

public class MrCat {
    public MrCat(String firstName, String color) {
        this.firstName = firstName;
        this.color = color;
    }

    public String getFirstName() {

        return firstName;
    }

    private String firstName;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    private String color;
}
