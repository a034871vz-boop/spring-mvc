package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImp implements CarService {
    @Override
    public List<Car> getListCars() {
        List<Car> carsList = new ArrayList();

        carsList.add(new Car("Toyota", 12345, "White"));
        carsList.add(new Car("Mercedes", 22222, "Grey"));
        carsList.add(new Car("BMW", 33333, "Black"));
        carsList.add(new Car("Audi", 44444, "Yellow"));
        carsList.add(new Car("Porshe", 55555, "Red"));
        return carsList;
    }
}
