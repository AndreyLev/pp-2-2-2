package web.repository;

import web.model.Car;

import java.util.List;

public interface CarRepository {
    int count();
    List<Car> getAllCars();
    List<Car> getCars(int count);
}
