package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDaoImpl implements CarDao {

    private static final List<Car> cars;

    static {
        cars = new ArrayList<>();
        cars.add(new Car("Mazda", "6", 2));
        cars.add(new Car("Kia", "Optima", 2));
        cars.add(new Car("BMV", "M5", 3));
        cars.add(new Car("Ford", "Mustang", 5));
        cars.add(new Car("Porsche", "911", 4));
    }


    @Override
    public List<Car> getAllCars(Integer count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }


}