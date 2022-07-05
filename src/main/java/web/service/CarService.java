package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
   List<Car> getCarOfList(List<Car> list, int carCount);
}
