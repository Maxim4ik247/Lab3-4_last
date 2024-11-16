import transport.Car;
import traveller.Traveller;
import traveller.TravellerGenerator;


public class Main {
    public static void main(String[] args) {

        Car car = new Car("Автомобиль", 3);

        Traveller traveller = TravellerGenerator.generateTraveller();
        traveller.toSeat(car);

        car.go(Init.config());
    }
}