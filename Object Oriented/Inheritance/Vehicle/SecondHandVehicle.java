package Vehicle;

public class SecondHandVehicle extends Vehicle{
    private int numberOfOwners;
    public SecondHandVehicle(String regNO, String make, int year, double value, int number)
    {
        super(regNO, make, year, value);
        this.numberOfOwners = number;
    }

    public int getNumberOfOwners() {
        return numberOfOwners;
    }
    public void setNumberOfOwners(int owners)
    {
        this.numberOfOwners = owners;
    }
    public void sellVehicle(double price)
    {
        if (price == getValue())
            System.out.println("Enable to Sell the Vehicle");
        else
            System.out.println("Don't Enable to sell the vehicle");
    }
}
