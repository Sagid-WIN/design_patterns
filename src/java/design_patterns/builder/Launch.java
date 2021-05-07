package design_patterns.builder;

public class Launch {
    public static void main(String[] args) {
        Car car = new Car.Builder(new CarType(), 5)
                .setEngine(new Engine())
                .setGPSNavigator(new GPSNavigator())
                .setTripComputer(new TripComputer())
                .build();
        System.out.println(car);
    }
}
