package Vehicle;

public class Vehicle {
    private String regNO, make;
    private int yearOfManufacture;
    private double value;

    public Vehicle(String regNO, String make, int year, double value)
    {
        this.regNO = regNO;
        this.make = make;
        this.yearOfManufacture = year;
        this.value = value;
    }
    public String getRegNumber(){
        return this.regNO;
    }
    public String getMake(){
        return this.make;
    }
    public int getYear(){
        return this.yearOfManufacture;
    }
    public double getValue(){
        return this.value;
    }
    public void setValue(double value)
    {
        this.value = value;
    }
    public int CalculateAge(int page)
    {
        return page - this.yearOfManufacture;
    }

}
