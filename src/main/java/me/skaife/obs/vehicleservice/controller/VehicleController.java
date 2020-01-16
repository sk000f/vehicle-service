package me.skaife.obs.vehicleservice.controller;

import org.jboss.logging.MDC;
// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import me.skaife.obs.vehicleservice.model.Vehicle;
import me.skaife.obs.vehicleservice.model.VehicleRequest;
import me.skaife.obs.vehicleservice.model.VehicleResponse;

import static net.logstash.logback.argument.StructuredArguments.kv;


@RestController
@Slf4j
public class VehicleController {

  // private static final Logger log = LoggerFactory.getLogger(VehicleController.class);

  @GetMapping(path="/vehicles")
  public Vehicle getVehicles() {

      MDC.put("user", "MSKAIFE");
      log.info("GET Vehicles endpoint called");

      MDC.put("errorMessage", "Something has gone terribly wrong");
      log.error("Error in GET Vehicles endpoint");

      Vehicle vehicle = new Vehicle();
      vehicle.setId(1L);
      vehicle.setManufacturer("Jaguar");
      vehicle.setModel("XF");
      vehicle.setVariant("Chequered Flag");
      return vehicle;
  }

  @PostMapping(path="/vehicles")
  public VehicleResponse addVehicle(@RequestBody VehicleRequest inputPayload) {

    log.info("GET Vehicles endpoint called", kv("user", "TFERGUS2"));

    log.error("Error in GET Vehicles endpoint", kv("user", "TFERGUS2"), kv("errorMessage", "Something has gone even more badly wrong"));

    VehicleResponse response = new VehicleResponse();
    response.setId(inputPayload.getId());
    response.setManufacturer(inputPayload.getManufacturer());
    response.setModel(inputPayload.getModel());
    response.setVariant(inputPayload.getVariant());

    log.info("Vehicle created and returned", kv("user", "TFERGUS2"), kv("vehicleResponse", response));

    return response;
  }
  
}