package road;

import road.environment.Environment;

public class SectionOfRoad {
    private Environment environment;
    private Gradient gradient;

    public SectionOfRoad(Environment environment, Gradient gradient) {
        this.environment = environment;
        this.gradient = gradient;
    }

    public Environment getEnvironment() {
        return environment;
    }

    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }

    public Gradient getGradient() {
        return gradient;
    }

    public void setGradient(Gradient gradient) {
        this.gradient = gradient;
    }

    @Override
    public String toString() {
        return "SectionOfRoad{" +
                "environment=" + environment +
                '}';
    }

    public enum Gradient {
        UP, STREIGHT, DOWN
    }
}
