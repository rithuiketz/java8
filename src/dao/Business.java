package dao;

import java.util.List;

public class Business {

    public List<Vehicle> vehicles;

    public Business(List<Vehicle> vehicle)
    {
        this.vehicles = vehicle;
    }

    public List<Vehicle> getVehicles(){
        return this.vehicles;
    }

}
