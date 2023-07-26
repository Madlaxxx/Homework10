package ru.netolgy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@NoArgsConstructor
//@AllArgsConstructor
//@Data
public class Radio {
    private int initialNumberRadioStation = 10;
    private int minNumberRadioStation = 0;
    private int maxNumberRadioStation = 9;
    private int numberRadioStation;


    private int volume;

    public Radio(int size) {

        maxNumberRadioStation = minNumberRadioStation + size;
        this.initialNumberRadioStation = initialNumberRadioStation;

    }

    public int getInitialNumberRadioStation() {

        return initialNumberRadioStation;
    }

    public int getNumberRadioStation() {

        return numberRadioStation;
    }

    public int getMinNumberRadioStation() {

        return minNumberRadioStation;
    }

    public int getMaxNumberRadioStation() {

        return maxNumberRadioStation;
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

    public void setNextNumberRadioStation() {

        if (numberRadioStation < 9) {
            numberRadioStation += 1;
        } else {
            numberRadioStation = 0;
        }

    }

    public void setPrevNumberRadioStation() {

        if (numberRadioStation == 0) {
            numberRadioStation = 9;
        } else {
            numberRadioStation -= 1;
        }

    }


    public int getVolume() {

        return volume;
    }

    public void setVolume(int newVolume) {
        if (newVolume > 100) {
            return;
        }
        if (newVolume < 0) {
            return;
        }
        volume = newVolume;
    }

    public void setMaxVolume() {
        volume = 100;
    }

    public void setNextLevelVolume() {

        if (volume < 100) {
            volume += 1;
        } else {
            volume = 100;
        }

    }

    public void setPrevLevelVolume() {

        if (volume == 0) {
            volume = 0;
        } else {
            volume -= 1;
        }

}


}
