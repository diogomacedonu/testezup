package com.orangetalents.zup.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "cars")
@Getter
@Setter
public class Car {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String model;
    private Integer year;
    private String brand;

    @ManyToOne
    @JoinColumn(name ="user_id", nullable = false)
    private User owner;

    public Car(String model, Integer year, String brand, User owner) {
        this.model = model;
        this.year = year;
        this.brand = brand;
        this.owner = owner;
    }

    public Car() {}
}
