package com.example.project_2.model;

import com.example.project_2.Enums.VehicleStatus;
import java.io.Serializable;

public class Vehicle implements Serializable {
    private Long id;
    private int owner_id;
    private String registration;
    private int year;
    private String brand;
    private String model;
    private String plate;
    private VehicleStatus status;

    public Vehicle(Long id, int owner_id, String registration, int year, String brand, String model, String plate,
            VehicleStatus status) {
        this.id = id;
        this.owner_id = owner_id;
        this.registration = registration;
        this.year = year;
        this.brand = brand;
        this.model = model;
        this.plate = plate;
        this.status = status;
    }

    public Long getId() {
        return this.id;
    }

    public int getOwnerId() {
        return this.owner_id;
    }

    public void setOwnerId(int owner_id) {
        this.owner_id = owner_id;
    }

    public String getRegistration() {
        return this.registration;
    }

    public int getYear() {
        return this.year;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public String getPlate() {
        return this.plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public VehicleStatus getStatus() {
        return this.status;
    }

    public void setStatus(VehicleStatus status) {
        this.status = status;
    }

}
