package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDao {
    private final List<Car> carList;

    public CarDao() {
        carList = new ArrayList<>();
        carList.add(new Car("BMW", "Black", 2015));
        carList.add(new Car("Audi", "White", 2017));
        carList.add(new Car("Toyota", "Silver", 2012));
        carList.add(new Car("Honda", "Blue", 2019));
        carList.add(new Car("Mercedes", "Red", 2020));
    }

    public List<Car> getAllCars() {
        return carList;
    }
}
