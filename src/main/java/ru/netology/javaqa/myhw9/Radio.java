package ru.netology.javaqa.myhw9;

public class Radio {
    private int maxStation = 9;
    private int minStation;
    private int currentStation;
    private int currentVolume;

    public Radio() {
        int quantity = maxStation + 1;
    }

    public Radio(int quantity) {
        maxStation = quantity - 1;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMaxStation() {
        return maxStation;
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
