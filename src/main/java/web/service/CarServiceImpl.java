package web.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import web.model.Car;
import web.repository.CarRepository;

import java.util.List;

@Service(value = "carService")
public class CarServiceImpl implements CarService {
    
    private CarRepository repository;
    
    public CarServiceImpl(@Qualifier("carsRepo") CarRepository repository) {
        this.repository = repository;
    }
    
    @Override
    public List<Car> getCars(Integer count) {
        return count == null || count >= repository.count() ? repository.getAllCars()
                                                            : repository.getCars(count);
    }
}
