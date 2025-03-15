package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    private final List<Car> carList;

    public CarService() {
        carList = new ArrayList<>();
        carList.add(new Car("BMW", "Black", 2015));
        carList.add(new Car("Audi", "White", 2017));
        carList.add(new Car("Toyota", "Silver", 2012));
        carList.add(new Car("Honda", "Blue", 2019));
        carList.add(new Car("Mercedes", "Red", 2020));
    }

    public List<Car> getCars(Integer count) {
        if (count == null || count >= 5) {
            return carList;
        }

        return carList.subList(0, count);
    }
}