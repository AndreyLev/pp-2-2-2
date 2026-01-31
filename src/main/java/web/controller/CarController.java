package web.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;
import java.util.Optional;

@Controller
public class CarController {
    
    private CarService service;
    
    public CarController(@Qualifier("carService") CarService service) {
        this.service = service;
    }
    
    @GetMapping(value = "/cars")
    public String showCarsTable(@RequestParam(required = false) Optional<Integer> count, ModelMap model) {
        List<Car> cars = service.getCars(count);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
