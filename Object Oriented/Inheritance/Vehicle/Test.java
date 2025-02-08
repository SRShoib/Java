package Vehicle;

public class Test {
    public static void main(String[] args) {
        SecondHandVehicle sv = new SecondHandVehicle("221", "BMW", 2020, 100, 1);
        System.out.println(sv.getRegNumber());
        System.out.println(sv.getMake());
        System.out.println(sv.getValue());
        System.out.println(sv.getYear());

        sv.setValue(2000);
        System.out.println(sv.getValue());
        System.out.println(sv.CalculateAge(2022));
        System.out.println(sv.getNumberOfOwners());
        sv.sellVehicle(200);
        sv.setNumberOfOwners(3);
        System.out.println(sv.getNumberOfOwners());


    }


}
