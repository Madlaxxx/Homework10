package ru.netolgy;

public class Radio {
    private int numberRadioStation;
    private int volume;

    public int getNumberRadioStation() {

        return numberRadioStation;
    }

    public void setMaxNumberRadioStation() {
        numberRadioStation = 9;
    }

    public void setNumberRadioStation(int newNumberRadioStation) {
        if (newNumberRadioStation < 0) {
            return;
        }
        if (newNumberRadioStation > 9) {
            return;
        }

        numberRadioStation = newNumberRadioStation;

    }

    public int setNextNumberRadioStation(int next) {

        if (next < 9) {
            next += 1;
        } else {
            next = 0;
        }
        numberRadioStation = next;

        return numberRadioStation;
    }

    public int setPrevNumberRadioStation(int prev) {

        if (prev < 0) {
            prev = 9;
        } else {
            prev -= 1;
        }
        numberRadioStation = prev;

        return numberRadioStation;
    }


    public int getVolume() {

        return volume;
    }

    public void setMaxVolume() {
        volume = 100;
    }

    public int setNextLevelVolume(int nextVolume) {

        if (nextVolume < 100) {
            nextVolume += 1;
        } else {
            nextVolume = 100;
        }
        volume = nextVolume;

        return volume;
    }

    public int setPrevLevelVolume(int prevVolume) {

        if (prevVolume < 0) {
            prevVolume = 0;
        } else {
            prevVolume -= 1;
        }
        volume = prevVolume;

        return volume;
    }

}
