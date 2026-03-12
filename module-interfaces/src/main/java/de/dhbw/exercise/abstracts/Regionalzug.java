package de.dhbw.exercise.abstracts;



public class Regionalzug implements Zug {
    private String number;

    @Override
    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String getNumber() {
        return this.number;
    }
}
