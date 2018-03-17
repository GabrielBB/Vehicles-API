package com.github.gabrielbb.cars.controllers;

import com.github.gabrielbb.cars.repos.VehicleBrandRepository;
import com.github.gabrielbb.cars.repos.VehicleModelRepository;
import com.github.gabrielbb.cars.repos.VehicleTypeRepository;
import com.github.gabrielbb.cars.models.VehicleBrand;
import com.github.gabrielbb.cars.models.VehicleModel;
import com.github.gabrielbb.cars.models.VehicleType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Gabriel Basilio Brito on 8/21/2017.
 */
@RestController
public class VehicleController {

    @Autowired
    private VehicleBrandRepository brandsRepo;

    @Autowired
    private VehicleModelRepository modelsRepo;

    @Autowired
    private VehicleTypeRepository typesRepo;

    @RequestMapping("/brands")
    public Iterable<VehicleBrand> getBrands() {
        return brandsRepo.findAll();
    }

    @RequestMapping("/types")
    public Iterable<VehicleType> getTypes() {
        return typesRepo.findAll();
    }

    @RequestMapping("/models")
    public Iterable<VehicleModel> getModels(@RequestParam(name = "brandId", required = false) Integer brandId,
            @RequestParam(name = "typeId", required = false) Integer typeId) throws Exception {

        if (typeId != null && brandId != null) {
            return modelsRepo.findByTypeIdAndBrandId(typeId, brandId);
        } else if (brandId != null) {
            return modelsRepo.findByBrandId(brandId);
        } else if (typeId != null) {
            return modelsRepo.findByTypeId(typeId);
        }

        throw new Exception("Filter by brandId or typeId. Example: /models?brandId=17");
    }
}