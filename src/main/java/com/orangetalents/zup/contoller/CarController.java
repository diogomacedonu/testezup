package com.orangetalents.zup.contoller;

import com.orangetalents.zup.contoller.helper.CarRequest;
import com.orangetalents.zup.entity.Car;
import com.orangetalents.zup.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarController {

    @Autowired
    CarService carService;

    @GetMapping("/cars/{id}")
    List<Car> getCars(@PathVariable(value = "id") Long id) { return carService.carList(id); }

    @PostMapping("/cars")
    Car createCar(@RequestBody CarRequest body){
        return carService.createCar(body.getModel(), body.getBrand(),
                body.getYear(), body.getId());
    }
}
