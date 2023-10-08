import java.util.List;

public class BlackHole {

    private String name;
    private double mass;
    private double distanceToEarth;
    private List<Photo> photoList;
    private boolean hasCharge;
    private boolean hasRotation;

    public BlackHole(String name, double mass, double distanceToEarth, boolean hasCharge, boolean hasRotation) {
        this.name = name;
        this.mass = mass;
        this.distanceToEarth = distanceToEarth;
        this.hasCharge = hasCharge;
        this.hasRotation = hasRotation;
    }

    public void calculateType() {

    }

    public void addPhoto(Photo photo) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getDistanceToEarth() {
        return distanceToEarth;
    }

    public void setDistanceToEarth(double distanceToEarth) {
        this.distanceToEarth = distanceToEarth;
    }

    public boolean isHasCharge() {
        return hasCharge;
    }

    public void setHasCharge(boolean hasCharge) {
        this.hasCharge = hasCharge;
    }

    public boolean isHasRotation() {
        return hasRotation;
    }

    public void setHasRotation(boolean hasRotation) {
        this.hasRotation = hasRotation;
    }
}
