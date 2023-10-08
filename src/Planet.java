import java.util.List;

public class Planet {

    private String name;
    private int satelliteCount;
    private List<Photo> photolist;
    private double radius;
    private double mass;

    public Planet(String name, int satelliteCount, double radius, double mass) {
        this.name = name;
        this.satelliteCount = satelliteCount;
        this.radius = radius;
        this.mass = mass;
    }

    public void calculateVolume() {

    }

    public void calculateDensity() {

    }

    public void addPhoto(Photo photo) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSatelliteCount() {
        return satelliteCount;
    }

    public void setSatelliteCount(int satelliteCount) {
        this.satelliteCount = satelliteCount;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }
}
