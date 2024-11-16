import plants.Flower;
import plants.Plant;
import plants.Tree;
import road.Road;
import road.SectionOfRoad;
import road.environment.Color;
import road.environment.Environment;

public class Init {
    public static Road config() {
        Tree dub = new Tree("Дубы", Color.GREEN, "густой лес", 30, 40);
        Tree pihta = new Tree("Хвоя", Color.GREEN, "хвойный лес", 5, 10);
        Tree bereza = new Tree("Береза", Color.WHITE, "березовая роща", 5, 10);

        Flower maks_ = new Flower("Маки", Color.RED, "сверкают на солнышке", 1);
        Flower oduvanchick = new Flower("Одуванчики", Color.YELLOW, "поле в горошину", 1);

        Plant strawberry = new Plant("Клубника", Color.RED, "клубничные холмы в крапинку", true);
        Plant carrot = new Plant("Морковь", Color.ORANGE, "густые заросли моркови", false);
        Plant potato = new Plant("Картошка", Color.BLACK, "поле картошки", false);


        Environment justRoad = new Environment(dub);
        SectionOfRoad sectionOfRoad1 = new SectionOfRoad(justRoad, SectionOfRoad.Gradient.UP);

        Environment ground = new Environment(carrot);
        SectionOfRoad sectionOfRoad2 = new SectionOfRoad(ground, SectionOfRoad.Gradient.STREIGHT);

        Environment stripes = new Environment(oduvanchick);
        SectionOfRoad sectionOfRoad3 = new SectionOfRoad(stripes, SectionOfRoad.Gradient.STREIGHT);

        Environment hills = new Environment(strawberry);
        SectionOfRoad sectionOfRoad4 = new SectionOfRoad(hills, SectionOfRoad.Gradient.STREIGHT);

        Environment forest = new Environment(pihta);
        SectionOfRoad sectionOfRoad5 = new SectionOfRoad(forest, SectionOfRoad.Gradient.DOWN);

        Environment maks = new Environment(maks_);
        SectionOfRoad sectionOfRoad6 = new SectionOfRoad(maks, SectionOfRoad.Gradient.DOWN);

        Environment p = new Environment(potato);
        SectionOfRoad sectionOfRoad7 = new SectionOfRoad(p, SectionOfRoad.Gradient.DOWN);

        Environment b = new Environment(bereza);
        SectionOfRoad sectionOfRoad8 = new SectionOfRoad(b, SectionOfRoad.Gradient.DOWN);

        Road road = new Road();
        road.getSectionOfRoads().add(sectionOfRoad1);
        road.getSectionOfRoads().add(sectionOfRoad2);
        road.getSectionOfRoads().add(sectionOfRoad3);
        road.getSectionOfRoads().add(sectionOfRoad4);
        road.getSectionOfRoads().add(sectionOfRoad5);
        road.getSectionOfRoads().add(sectionOfRoad6);
        road.getSectionOfRoads().add(sectionOfRoad7);
        road.getSectionOfRoads().add(sectionOfRoad8);

        return road;
    }
}
