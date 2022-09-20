package impl;

import hw.WheelableTransport;
import inter.Engineable;
import inter.Serviceable;
import inter.UpdateTyreable;

public class Truck extends WheelableTransport implements Serviceable, UpdateTyreable, Engineable {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void updateTyre() { System.out.println("Changing the Truck tire!"); }
    @Override
    public void checkEngine() { System.out.println("Checking the Truck engine!"); }
    private void checkTrailer() {
        System.out.println("Checking the Truck trailer!");
    }

    @Override
    public void check() {
        System.out.println("Serve: " + getModelName());
        updateTyre();
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre(i + 1);
        }
        checkEngine();
        checkTrailer();
    }
}