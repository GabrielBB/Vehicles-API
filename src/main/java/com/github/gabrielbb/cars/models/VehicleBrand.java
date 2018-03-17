package com.github.gabrielbb.cars.models;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
public class VehicleBrand {

    //@JsonView(View.Summary.class)
    @Id
    private Integer id;
    // @JsonView(View.Summary.class)
    private String brand;

     /*@OneToMany(fetch = FetchType.LAZY)
     @JoinColumn(name = "VEHICLE_BRAND_ID")
     private List<VehicleModel> models; */
}