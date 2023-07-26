package ru.netolgy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio(5);

    @Test
    public void shouldMaxRadioStation() {

        Assertions.assertEquals(0, radio.getMinNumberRadioStation());
        Assertions.assertEquals(5, radio.getMaxNumberRadioStation());

    }

    @Test
    public void shouldInitialNumberRadioStation() {

        Assertions.assertEquals(10, radio.getInitialNumberRadioStation());

    }


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
        radio.setNumberRadioStation(7);
        radio.setNextNumberRadioStation();
        int expected = 8;
        int actual = radio.getNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextMaxNumberRadioStation() {
        radio.setNumberRadioStation(9);
        radio.setNextNumberRadioStation();
        int expected = 0;
        int actual = radio.getNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevMinNumberRadioStation() {
        radio.setNumberRadioStation(0);
        radio.setPrevNumberRadioStation();
        int expected = 9;
        int actual = radio.getNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevNumberRadioStation() {
        radio.setNumberRadioStation(7);
        radio.setPrevNumberRadioStation();
        int expected = 6;
        int actual = radio.getNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        radio.setVolume(33);

        int expected = 33;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldAboveMaxVolume() {
        radio.setVolume(132);
        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldAboveMinVolume() {
        radio.setVolume(-1);
        int expected = 0;
        int actual = radio.getVolume();

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
        radio.setVolume(100);
        radio.setNextLevelVolume();

        int expected = 100;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextLevelVolume() {
        radio.setVolume(56);
        radio.setNextLevelVolume();

        int expected = 57;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevMinLevelVolume() {
        radio.setVolume(0);
        radio.setPrevLevelVolume();

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevLevelVolume() {
        radio.setVolume(44);
        radio.setPrevLevelVolume();

        int expected = 43;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }
}