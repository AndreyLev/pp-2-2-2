package web.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import web.model.Car;
import web.repository.CarRepository;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service(value = "carService")
public class CarServiceImpl implements CarService {
    
    private CarRepository repository;
    
    public CarServiceImpl(@Qualifier("carsRepo") CarRepository repository) {
        this.repository = repository;
    }
    
    @Override
    public List<Car> getCars(Optional<Integer> count) {
        int countValue;
        if (count.isEmpty() ||
                (countValue = count.get()) >= repository.count())
        {
            return repository.getAllCars();
        }
        
        if (countValue < 0) {
            return Collections.EMPTY_LIST;
        }
        
        return repository.getCars(countValue);
    }
}
