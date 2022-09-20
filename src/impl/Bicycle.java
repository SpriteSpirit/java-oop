package impl;

import hw.WheelableTransport;
import inter.Serviceable;
import inter.UpdateTyreable;

public class Bicycle extends WheelableTransport implements Serviceable, UpdateTyreable {
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Changing the Bicycle tires!");
    }

    @Override
    public void check() {
        System.out.println("Serve: " + getModelName());
        updateTyre();
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre( i + 1);
        }
    }
}