package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {

    private final List<Sensor> sensors;
    private final List<Integer> results;

    public AverageSensor() {
        sensors = new ArrayList<>();
        results = new ArrayList<>();
    }

    public void addSensor(Sensor toAdd) {
        sensors.add(toAdd);
    }

    @Override
    public boolean isOn() {
        boolean check = sensors.stream()
                .allMatch(Sensor::isOn);
        return check;
    }

    @Override
    public void setOn() {
        sensors.forEach(s -> s.setOn());
    }

    @Override
    public void setOff() {
        sensors.forEach(s -> s.setOff());
    }

    @Override
    public int read() {
        if (!isOn() || sensors.isEmpty()) {
            throw new IllegalStateException();
        }
        int sum = sensors.stream()
                .mapToInt(s -> s.read())
                .sum();
        int result = sum / sensors.size();
        results.add(result);
        return result;
    }

    public List<Integer> readings() {
        return results;
    }

}
