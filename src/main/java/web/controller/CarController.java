package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    @Autowired
    CarService carService;

    @GetMapping(value = "/cars")
    public String cars(@RequestParam(value = "count", defaultValue = "5") int carCount, Model model) {
        List<Car> list = new ArrayList<>();
        list.add(new Car(1, "Nissan", 2015));
        list.add(new Car(2, "Volvo", 2022));
        list.add(new Car(3, "BMV", 2011));
        list.add(new Car(4, "Mazda", 2019));
        list.add(new Car(5, "Ford", 2018));
        list = carService.getCarOfList(list, carCount);
        model.addAttribute("cars", list);
        return "cars";
    }
}
