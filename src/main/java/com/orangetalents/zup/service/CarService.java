package com.orangetalents.zup.service;

import com.orangetalents.zup.entity.Car;
import com.orangetalents.zup.entity.User;
import com.orangetalents.zup.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    @Autowired
    CarRepository carRepository;

    @Autowired
    UserService userService;

    public Car createCar(String model, String brand, Integer year, Long userId){
        User owner = userService.getUserById(userId);
        Car car = new Car(model, year, brand, owner);
        return carRepository.save(car);
    }

    public List<Car> carList(Long userId){
        return carRepository.findByOwnerId(userId);
    }


}
