package web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AdditionalConfiguration {
    @Bean(name = "cars")
    public List<Car> getCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Geely Coolray", 2021, "LJNFE6B23KXXXXXX1"));
        cars.add(new Car("BMW X3", 2023, "KXABE4C56KXXXXX2"));
        cars.add(new Car("Lada Iskra", 2026, "IFBXE4A27KXXXXXX3"));
        cars.add(new Car("Toyota Camry", 2018, "QNDEE9P36KXXXXX4"));
        cars.add(new Car("Geely Atlas Pro", 2024, "KSJVE4Q28KXXXXXX5"));
        return cars;
    };
}
