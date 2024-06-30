package application;

import java.util.Random;

public class TemperatureSensor implements Sensor {

    private boolean sensor;

    @Override
    public boolean isOn() {
        return sensor;
    }

    @Override
    public void setOn() {
        sensor = true;
    }

    @Override
    public void setOff() {
        sensor = false;
    }

    @Override
    public int read() {
        if (!isOn()) {
            throw new IllegalStateException();
        }
        Random random = new Random();
        return random.nextInt(61) - 30;
    }
}
