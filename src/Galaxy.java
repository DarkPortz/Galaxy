import java.util.ArrayList;
import java.util.List;

public class Galaxy {

    private String name;
    private double distanceToEarth;
    private FormType form;
    private List<Photo> photoList;
    private BlackHole blackHole;
    private List<Planet> planetList;

    public Galaxy(String name, double distanceToEarth, FormType form) {
        this.name = name;
        this.distanceToEarth = distanceToEarth;
        this.form = form;
        this.planetList = new ArrayList<>();
    }

    public void addPhoto(Photo photo) {

    }

    public void addPlanet(Planet planet) {
        this.planetList.add(planet);
    }

    public void setBlackHole(BlackHole blackHole) {
        this.blackHole = blackHole;
    }

    public void removePlanet(int index) {
        planetList.remove(index);
    }

    public void modifyPlanet(int index, Planet planet) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDistanceToEarth() {
        return distanceToEarth;
    }

    public void setDistanceToEarth(double distanceToEarth) {
        this.distanceToEarth = distanceToEarth;
    }

    public FormType getForm() {
        return form;
    }

    public void setForm(FormType form) {
        this.form = form;
    }

    public BlackHole getBlackHole() {
        return blackHole;
    }

    public List<Planet> getPlanetList() {
        return planetList;
    }

    public void setPlanetList(List<Planet> planetList) {
        this.planetList = planetList;
    }
}
