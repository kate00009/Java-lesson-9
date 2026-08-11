package ru.netology.javaqa.myhw9;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    public void SetStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(8);
        assertEquals(8, rad.getCurrentStation());
    }

    @Test
    public void SetStationAboveMax() {
        Radio rad = new Radio();
        rad.setCurrentStation(14);
        assertEquals(0, rad.getCurrentStation());
    }

    @Test
    public void StationAboveMin() {
        Radio rad = new Radio();
        rad.setCurrentStation(-2);
        assertEquals(0, rad.getCurrentStation());
    }

    @Test
    public void Station0() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);
        assertEquals(0, rad.getCurrentStation());
    }

    @Test
    public void Station9() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);
        assertEquals(9, rad.getCurrentStation());
    }

    @Test
    public void NextStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(5);
        rad.next();
        assertEquals(6, rad.getCurrentStation());
    }

    @Test
    public void NextStation9() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);
        rad.next();
        assertEquals(0, rad.getCurrentStation());
    }

    @Test
    public void PrevStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(5);
        rad.prev();
        assertEquals(4, rad.getCurrentStation());
    }

    @Test
    public void PrevStation0() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);
        rad.prev();
        assertEquals(9, rad.getCurrentStation());
    }

    // ТЕСТЫ НА ГРОМКОСТЬ

    @Test
    public void IncreaseVolumeFromMax() {
        Radio rad = new Radio();
        for (int i = 0; i < 100; i++) {
            rad.increaseVolume();
        }
        assertEquals(100, rad.getCurrentVolume());
        rad.increaseVolume();
        assertEquals(100, rad.getCurrentVolume());
    }

    @Test
    public void DecreaseVolumeFromMin() {
        Radio rad = new Radio();
        rad.decreaseVolume();
        assertEquals(0, rad.getCurrentVolume());
        for (int i = 0; i < 5; i++) {
            rad.increaseVolume();
        }
        rad.decreaseVolume();
        assertEquals(4, rad.getCurrentVolume());
    }
}
