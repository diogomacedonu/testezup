package com.orangetalents.zup.contoller.helper;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CarRequest {
    private String model;
    private String brand;
    private Integer year;
    private Long id;

    public CarRequest(String model, String brand, Integer year, Long id) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.id = id;
    }
}
