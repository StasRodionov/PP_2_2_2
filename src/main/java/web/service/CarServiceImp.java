package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImp implements CarService {

    @Override
    public List<Car> getCarOfList(List<Car> list, int carCount) {

            return list.stream().limit(carCount).collect(Collectors.toList());
    }
}


