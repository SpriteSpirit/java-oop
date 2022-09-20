package impl;

import hw.WheelableTransport;
import inter.Engineable;
import inter.Serviceable;
import inter.UpdateTyreable;

public class Car extends WheelableTransport implements Serviceable, UpdateTyreable, Engineable {
        public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void updateTyre() { System.out.println("Changing the Car tire!"); }
    @Override
    public void checkEngine() {
        System.out.println("Checking the Car engine!");
    }

    @Override
    public void check() {
        System.out.println("Serve: " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
    }
}