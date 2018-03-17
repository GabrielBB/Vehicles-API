package com.github.gabrielbb.cars.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VehicleCategory {


     private int id;
     private String category;
     private Set<VehicleModel> vehicleModels = new HashSet<VehicleModel>(0);
}


