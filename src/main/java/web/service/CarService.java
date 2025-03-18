package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    private final CarDao carDao;

    @Autowired
    public CarService(CarDao carDao) {
        this.carDao = carDao;
    }

    public List<Car> getCars(int count) {
        List<Car> allCars = carDao.getAllCars();
        if (count >= allCars.size()) {
            return allCars;
        }
        return allCars.subList(0, count);
    }
}