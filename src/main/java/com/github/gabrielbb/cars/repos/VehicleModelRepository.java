package com.github.gabrielbb.cars.repos;

import com.github.gabrielbb.cars.models.VehicleModel;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Gabriel Basilio Brito on 9/25/2017.
 */
public interface VehicleModelRepository extends CrudRepository<VehicleModel, Integer> {

    Iterable<VehicleModel> findByBrandId(int brandId);

    Iterable<VehicleModel> findByTypeId(int typeId);

    Iterable<VehicleModel> findByTypeIdAndBrandId(int typeId, int brandId);
}
