package dao;

public class Vehicle
{
    private String make;

    private String operator;

    public Vehicle(String make,String operator)
    {
        this.make = make;
        this.operator =operator;
    }

    public String getMake() {
        return make;
    }

    public String getOperator() {
        return operator;
    }
}
