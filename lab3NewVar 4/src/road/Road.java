package road;

import road.environment.Color;

import java.util.ArrayList;
import java.util.HashSet;

public class Road {

    private ArrayList<SectionOfRoad> sectionOfRoads = new ArrayList<>();

    public void addToRoad(SectionOfRoad sectionOfRoad) {
        try {
            sectionOfRoads.add(sectionOfRoad);
        } catch (StackOverflowError e) {
            System.out.println("Слишком много участков трассы");
        }
    }

    public HashSet<Color> getView(int index) {
        int count = sectionOfRoads.size();

        HashSet<Color> colors = new HashSet<>();
        ArrayList<Color> colors1 = new ArrayList<>();
        ArrayList<Color> colors2 = new ArrayList<>();

        colors1.add(Color.BLACK);
        colors1.add(Color.WHITE);
        colors1.add(Color.YELLOW);
        colors1.add(Color.GREEN);
        colors1.add(Color.RED);

        colors2.add(Color.YELLOW);
        colors2.add(Color.RED);

        for (int i = index; i < count; i++) {
            try{
                colors.add(sectionOfRoads.get(i).getEnvironment().getColor());
            } catch (OutOfMemoryError e) {
                System.out.println("too much colors");;
            }
        }

        if (colors.size() >= 3) {
            System.out.println("Словно кто-то раскатал по земле тысячи рулонов пестрых материй");
        }

        System.out.println("Ближе всего были круги: " + colors2);
        System.out.println("Ближе расположились полоски: ");
        System.out.println("Самые дальние холмы были в крапинку: " + colors1);

        return colors;
    }

    public ArrayList<SectionOfRoad> getSectionOfRoads() {
        return sectionOfRoads;
    }

    public void setSectionOfRoads(ArrayList<SectionOfRoad> sectionOfRoads) {
        this.sectionOfRoads = sectionOfRoads;
    }
}

