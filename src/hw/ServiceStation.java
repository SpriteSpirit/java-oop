package hw;

import inter.Serviceable;

public class ServiceStation { // используем полиморфизм - разбив на методы
/*
    public void check(impl.Car car) { }
    public void check(impl.Bicycle bicycle) { }
    public void check(impl.Truck truck) { }
*/
    public void check(Serviceable serviceable)
    {
        serviceable.check();
    }
}