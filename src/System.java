import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class System {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(java.lang.System.in);
        List<Galaxy> galaxyList = new ArrayList<>();
        List<Telescope> telescopeList = new ArrayList<>();
        int galaxyOption;
        Galaxy currentGalaxy;
        int planetOption;

        while (true) {
            java.lang.System.out.println("Main Menu:");
            java.lang.System.out.println("1. Create Galaxy");
            java.lang.System.out.println("2. Create BlackHole");
            java.lang.System.out.println("3. Create or register Planet");
            java.lang.System.out.println("4. Create Telescope");
            java.lang.System.out.println("5. Remove Planet");
            java.lang.System.out.println("6. Modify Planet data");
            java.lang.System.out.println("7. Add a photo of a Planet");
            java.lang.System.out.println("8. Show Galaxy Data");
            java.lang.System.out.println("9. Show Planet Data");
            java.lang.System.out.println("10. Show the name of the most far away Galaxy from Earth");
            java.lang.System.out.println("11. Show the name of the Planet with most density");
            java.lang.System.out.println("12. Show the name of the BlackHoles based on the type");
            java.lang.System.out.println("13. Name of the telescope with the majority of photos taken");
            java.lang.System.out.println("0. Exit");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    java.lang.System.out.println("Input the name of this Galaxy:");
                    String galaxyName = scanner.nextLine();

                    boolean isUniqueGalaxyName = true;
                    for (Galaxy galaxy : galaxyList) {
                        if(galaxy.getName().toLowerCase().equals(galaxyName.toLowerCase())) {
                            java.lang.System.out.println("There's already a Galaxy with this name");
                            isUniqueGalaxyName = false;
                            break;
                        }
                    }

                    if (isUniqueGalaxyName == false) {
                        break;
                    }

                    //java.lang.System.out.println("Input form of this Galaxy:");
                    // FormType galaxyForm = scanner.
                    java.lang.System.out.println("Input the distance to Earth of this Galaxy:");
                    double galaxyDistanceToEarth = scanner.nextDouble();
                    Galaxy newGalaxy = new Galaxy (galaxyName, galaxyDistanceToEarth, FormType.ELLIPTIC);
                    galaxyList.add(newGalaxy);
                    break;
                case 2:
                    if(galaxyList.size() <= 0) {
                        java.lang.System.out.println("To create Black Holes first you need to create a Galaxy");
                        break;
                    } else {
                        java.lang.System.out.println("Please Select Galaxy Number:");
                        for(int i = 0; i < galaxyList.size(); i++) {
                            java.lang.System.out.println(i + ". " + galaxyList.get(i).getName());
                        }

                        galaxyOption = scanner.nextInt();
                        scanner.nextLine();

                        java.lang.System.out.println("Input the name of this black hole:");
                        String blackHoleName = scanner.nextLine();

                        boolean isUniqueBlackHoleName = true;
                        for (Galaxy galaxy : galaxyList) {
                            if(galaxy.getBlackHole() != null && galaxy.getBlackHole().getName().toLowerCase().equals(blackHoleName.toLowerCase())) {
                                java.lang.System.out.println("There's already a Black Hole with this name in another Galaxy");
                                isUniqueBlackHoleName = false;
                                break;
                            }
                        }

                        if (isUniqueBlackHoleName == false) {
                            break;
                        }
                        
                        
                        java.lang.System.out.println("Input the mass of this black hole:");
                        double blackHoleMass = scanner.nextDouble();
                        java.lang.System.out.println("Input the distance to Earth of this black hole:");
                        double blackHoleDistanceToEarth = scanner.nextDouble();
                        java.lang.System.out.println("Does the Black Hole has charge?");
                        boolean hasCharge = scanner.nextBoolean();
                        java.lang.System.out.println("Does the Black Hole has rotation?");
                        boolean hasRotation = scanner.nextBoolean();
                        BlackHole newBlackHole = new BlackHole(blackHoleName, blackHoleMass, blackHoleDistanceToEarth, hasCharge, hasRotation);
                        
                        galaxyList.get(galaxyOption).setBlackHole(newBlackHole);
                    }
                    
                    break;
                case 3:
                    if(galaxyList.size() <= 0) {
                        java.lang.System.out.println("To create planets first you need to create a Galaxy");
                        break;
                    } else {
                        java.lang.System.out.println("Please Select Galaxy Number:");
                        for(int i = 0; i < galaxyList.size(); i++) {
                            java.lang.System.out.println(i + ". " + galaxyList.get(i).getName());
                        }

                        galaxyOption = scanner.nextInt();
                        scanner.nextLine();

                        currentGalaxy = galaxyList.get(galaxyOption);

                        java.lang.System.out.println("Input the name of the Planet:");
                        String planetName = scanner.nextLine();
                        boolean isUniquePlanetName = true;

                        for(Planet planet : currentGalaxy.getPlanetList()) {
                            if(planet.getName().toLowerCase().equals(planetName.toLowerCase())) {
                                java.lang.System.out.println("There's already a Planet with this name");
                                isUniquePlanetName = false;
                                break;
                            }
                        }

                        if(isUniquePlanetName == false) {
                            break;
                        }

                        java.lang.System.out.println("Input the number of satellites of the Planet:");
                        int sateliteCount = scanner.nextInt();
                        java.lang.System.out.println("Input the radius of the Planet:");
                        double planetRadius = scanner.nextDouble();
                        java.lang.System.out.println("Input the mass of the Planet:");
                        double planetMass = scanner.nextDouble();
                        Planet newPlanet = new Planet(planetName, sateliteCount, planetRadius, planetMass);

                        galaxyList.get(galaxyOption).addPlanet(newPlanet);
                    }

                    break;
                case 4:
                    if(galaxyList.size() <= 0) {
                        java.lang.System.out.println("To create planets first you need to create a Galaxy");
                        break;
                    } else {
                        java.lang.System.out.println("Please Select Galaxy Number:");
                        for(int i = 0; i < galaxyList.size(); i++) {
                            java.lang.System.out.println(i + ". " + galaxyList.get(i).getName());
                        }

                        galaxyOption = scanner.nextInt();
                        scanner.nextLine();

                        currentGalaxy = galaxyList.get(galaxyOption);

                        java.lang.System.out.println("Please Select Planet Number:");
                        for(int i = 0; i < currentGalaxy.getPlanetList().size(); i++) {
                            java.lang.System.out.println(i + ". " + currentGalaxy.getPlanetList().get(i).getName());
                        }

                        planetOption = scanner.nextInt();
                        scanner.nextLine();

                        currentGalaxy.removePlanet(planetOption);
                    }

                    break;
                case 5:
                    if(galaxyList.size() <= 0) {
                        java.lang.System.out.println("To create planets first you need to create a Galaxy");
                        break;
                    } else {
                        java.lang.System.out.println("Please Select Galaxy Number:");
                        for(int i = 0; i < galaxyList.size(); i++) {
                            java.lang.System.out.println(i + ". " + galaxyList.get(i).getName());
                        }

                        galaxyOption = scanner.nextInt();
                        scanner.nextLine();

                        currentGalaxy = galaxyList.get(galaxyOption);

                        java.lang.System.out.println("Please Select Planet Number:");
                        for(int i = 0; i < currentGalaxy.getPlanetList().size(); i++) {
                            java.lang.System.out.println(i + ". " + currentGalaxy.getPlanetList().get(i).getName());
                        }

                        planetOption = scanner.nextInt();
                        scanner.nextLine();

                        java.lang.System.out.println("Input the name of the Planet:");
                        String planetNameUpdated = scanner.nextLine();
                        java.lang.System.out.println("Input the number of satellites of the Planet:");
                        int sateliteCountUpdated = scanner.nextInt();
                        java.lang.System.out.println("Input the radius of the Planet:");
                        double planetRadiusUpdated = scanner.nextDouble();
                        java.lang.System.out.println("Input the mass of the Planet:");
                        double planetMassUpdated = scanner.nextDouble();

                        Planet planetToUpdate = currentGalaxy.getPlanetList().get(planetOption);

                        planetToUpdate.setName(planetNameUpdated);
                        planetToUpdate.setSatelliteCount(sateliteCountUpdated);
                        planetToUpdate.setRadius(planetRadiusUpdated);
                        planetToUpdate.setMass(planetMassUpdated);
                    }

                    break;
                case 6:
                    //TODO: Implement
                    break;
                case 7:
                    //TODO: Implement
                    break;
                case 8:
                    //TODO: Implement
                    break;
                case 9:
                    //TODO: Implement
                    break;
                case 10:
                    //TODO: Implement
                    break;
                case 11:
                    //TODO: Implement
                    break;
                case 12:
                    //TODO: Implement
                    break;
                case 13:
                    //TODO: Implement
                    break;
                case 0:
                    java.lang.System.out.println("Saliendo del programa. ¡Hasta luego!");
                    java.lang.System.exit(0);
                default:
                    java.lang.System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        }
    }
}
