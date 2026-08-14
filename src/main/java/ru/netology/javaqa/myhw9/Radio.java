package ru.netology.javaqa.myhw9;

import lombok.Data;

@Data

public class Radio {
    private int maxStation = 9;
    private int minStation;
    private int currentStation;
    private int currentVolume;
    private int quantity;

    public Radio() {
        this.quantity = maxStation + 1;
    }

    public Radio(int quantity) {
        maxStation = quantity - 1;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            return;
        }
        if (newCurrentStation > maxStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void next() {
        if (currentStation >= maxStation) {
            currentStation = 0;
        } else {
            currentStation = currentStation + 1;
        }
    }

    public void prev() {
        if (currentStation <= minStation) {
            currentStation = 9;
        } else {
            currentStation = currentStation - 1;
        }
    }

    // Громкость

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }


}
