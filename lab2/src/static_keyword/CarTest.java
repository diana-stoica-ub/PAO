package static_keyword;

public class CarTest {

    public static void main(String[] args) {
        Double mps = Car.convertFromKmPerHourToMilesPerHour(10L); //call static method without creating an instance
        System.out.println(mps);

        System.out.println(Car.numberOfWheels);
    }
}
