package traveller;

import java.util.Random;

public class TravellerGenerator {
    private static final String[] names = {"Наташа", "Дмитрий", "Антон", "Марина", "Аня", "Сергей"};

    public static Traveller generateTraveller() {
        Random random = new Random();
        Traveller traveller = new Traveller(names[random.nextInt(names.length)], random.nextInt(100));
        return traveller;
    }
}
