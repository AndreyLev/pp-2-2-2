package web.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository(value = "carsRepo")
public class CarRepositoryImpl implements CarRepository {
    
    private List<Car> cars;
    
    public CarRepositoryImpl(@Qualifier("cars") List<Car> cars) {
        this.cars = cars == null ? Collections.EMPTY_LIST : new ArrayList<>(cars);
    }
    
    @Override
    public int count() {
        return cars.size();
    }
    
    @Override
    public List<Car> getAllCars() {
        return new ArrayList<>(cars);
    }
    
    @Override
    public List<Car> getCars(int count) {
        return cars.stream().limit(count).toList();
    }
}
