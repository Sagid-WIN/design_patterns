package design_patterns.builder;

public class Car {
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    public Car(CarType type, int seats, Engine engine, Transmission transmission, TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.type = type;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }


    public static class Builder {
        private CarType type;
        private int seats;
        private Engine engine;
        private Transmission transmission;
        private TripComputer tripComputer;
        private GPSNavigator gpsNavigator;

       public Builder(CarType carType, int seats) {
           this.type = carType;
           this.seats = seats;
       }

        public Builder setEngine(Engine engine) {
            this.engine = engine;
            return this;
        }

        public Builder setTransmission(Transmission transmission) {
            this.transmission = transmission;
            return this;
        }


        public Builder setTripComputer(TripComputer tripComputer) {
            this.tripComputer = tripComputer;
            return this;
        }

        public Builder setGPSNavigator(GPSNavigator gpsNavigator) {
            this.gpsNavigator = gpsNavigator;
            return this;
        }

        public Car build() {
            return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "type=" + type +
                ", seats=" + seats +
                ", engine=" + engine +
                ", transmission=" + transmission +
                ", tripComputer=" + tripComputer +
                ", gpsNavigator=" + gpsNavigator +
                '}';
    }
}
