package ru.netolgy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldSetRadioStation() {
        radio.setNumberRadioStation(7);

        int expected = 7;
        int actual = radio.getNumberRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotNumberRadioStationAboveMax() {

        radio.setNumberRadioStation(15);
        int expected = 0;
        int actual = radio.getNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotNumberRadioStationAboveMin() {

        radio.setNumberRadioStation(-1);
        int expected = 0;
        int actual = radio.getNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldMaxNumberRadioStation() {
        radio.setMaxNumberRadioStation();

        int expected = 9;
        int actual = radio.getNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextNumberRadioStation() {

        radio.setNextNumberRadioStation(7);
        int expected = 8;
        int actual = radio.getNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextMaxNumberRadioStation() {

        radio.setNextNumberRadioStation(10);
        int expected = 0;
        int actual = radio.getNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevMinNumberRadioStation() {

        radio.setPrevNumberRadioStation(-1);
        int expected = 9;
        int actual = radio.getNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevNumberRadioStation() {

        radio.setPrevNumberRadioStation(7);
        int expected = 6;
        int actual = radio.getNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxVolume() {
        radio.setMaxVolume();

        int expected = 100;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextMaxLevelVolume() {
        radio.setNextLevelVolume(100);

        int expected = 100;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextLevelVolume() {
        radio.setNextLevelVolume(56);

        int expected = 57;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevMinLevelVolume() {
        radio.setPrevLevelVolume(-1);

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevLevelVolume() {
        radio.setPrevLevelVolume(44);

        int expected = 43;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }
}