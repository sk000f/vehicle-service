package me.skaife.obs.vehicleservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import me.skaife.obs.vehicleservice.model.Vehicle;
import me.skaife.obs.vehicleservice.model.VehicleRequest;
import me.skaife.obs.vehicleservice.model.VehicleResponse;


@RestController
public class VehicleController {

  @GetMapping(path="/vehicles")
  public Vehicle getVehicles() {
      Vehicle vehicle = new Vehicle();
      vehicle.setId(1L);
      vehicle.setManufacturer("Jaguar");
      vehicle.setModel("XF");
      vehicle.setVariant("Chequered Flag");
      return vehicle;
  }

  @PostMapping(path="/vehicles")
  public VehicleResponse addVehicle(@RequestBody VehicleRequest inputPayload) {
    VehicleResponse response = new VehicleResponse();
    response.setId(inputPayload.getId());
    response.setManufacturer(inputPayload.getManufacturer());
    response.setModel(inputPayload.getModel());
    response.setVariant(inputPayload.getVariant());
    return response;
  }
  
}