/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author user
 */
public class TemperatureSensor implements Sensor {

    private boolean isOn;
    private int value;

    public TemperatureSensor() {
        this.isOn = false;
    }

    public int read() {
        if (!isOn()) {
            throw new IllegalStateException("Illegal state");
        }
        value = new Random().nextInt(61) - 30;
        return value;
    }

    public void setOn() {
        isOn = true;
    }

    public void setOff() {
        isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }
}
