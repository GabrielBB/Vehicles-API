package com.github.gabrielbb.cars.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class VehicleModel {

    @Id
    private Integer id;
    private String model;
    
    @ManyToOne
    private VehicleBrand brand;

    @ManyToOne
    private VehicleType type;
}