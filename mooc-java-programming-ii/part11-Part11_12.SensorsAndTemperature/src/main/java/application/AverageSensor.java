/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class AverageSensor implements Sensor {

    private ArrayList<Sensor> sensors;
    private ArrayList<Integer> readings;

    public AverageSensor() {
        this.sensors = new ArrayList<Sensor>();
        this.readings = new ArrayList<Integer>();
    }

    public int read() {
        if (!isOn()) {
            throw new IllegalStateException("Illegal state");
        }
        double average = sensors.stream()
                .mapToInt(sensor-> sensor.read())
                .average()
                .getAsDouble();
        int result = (int) Math.floor(average);
        readings.add(result);
        return result;

    }

    public void addSensor(Sensor toAdd) {
        sensors.add(toAdd);
    }

    public void setOn() {
        for (Sensor sensor : sensors) {
            sensor.setOn();
        }
    }

    public void setOff() {
        for (Sensor sensor : sensors) {
            sensor.setOff();
        }
    }

    public boolean isOn() {
        boolean areAllOn = true;
        for (Sensor sensor : sensors) {
            if (sensor.isOn() == false) {
                areAllOn = false;
                break;
            }
        }
        return areAllOn;
    }

    public List<Integer> readings() {
        return readings;
    }
}
