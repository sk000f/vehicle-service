package me.skaife.obs.vehicleservice.model;

public class VehicleResponse {

  private Long Id;
  private String manufacturer;
  private String model;
  private String variant;

  public Long getId() {
    return Id;
  }
  public void setId(Long id) {
    Id = id;
  }
  public String getManufacturer() {
    return manufacturer;
  }
  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }
  public String getModel() {
    return model;
  }
  public void setModel(String model) {
    this.model = model;
  }
  public String getVariant() {
    return variant;
  }
  public void setVariant(String variant) {
    this.variant = variant;
  }
}