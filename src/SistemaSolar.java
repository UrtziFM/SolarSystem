import java.util.ArrayList;
import java.util.List;

public class SistemaSolar {
    
    /**Construimos las clases con la estructura de la agregación debil tal como se ha planteado en el diagrama clases */
    EstrellaSolar starSun;
    private List<PlanetaSolar> innerPlanets;
    private List<PlanetaSolar> outerPlanets;
    private List<SateliteSolar> selectedSatelites;

    /** Constructor del Sistema Solar con los metodos a los que se llamaran*/

    public SistemaSolar(){
       bigBang();
       biggestPlanet();
       maxSatellitesPlanet();
       namesPlanets();
       furthestPlanetSun();
       marsTemperature();
       jupiterSatelites();
    }

    //La creción del sistema solar ocurre gracias al Big Bang de donde surgen sol, planetas interiores, exteriores y satelites atrapados por planetas
    //Tanto el Big Bang como las cuestiones a resolver son privados para que no sean accesibles más que por Sistema Solar
    private void bigBang(){

        // Creamos el sol instanciando el objeto desde la clase EstrellaSolar
        starSun = new EstrellaSolar("Sol", 700, 15000, 149600);
        
        // Creamos los planetas interiores desde la clase PlanetaSolar y los añadimos a un objeto lista (los datos estan normalizados en miles)
        innerPlanets = new ArrayList<>();
        innerPlanets.add(new PlanetaSolar("Mercurio", 0,2.439, 700.15,91700, 57900, null));
        innerPlanets.add(new PlanetaSolar("Venus", 0,6.052, 243.15, 41400, 108200, null));
        innerPlanets.add(new PlanetaSolar("Tierra", 1, 6.378, 289.00, 0, 149600, null));
        innerPlanets.add(new PlanetaSolar("Marte", 2, 3.396, 293.15, 78400, 227940, null));
        
        // Creamos los planetas exteriores desde la clase PlanetaSolar y los añadimos a un objeto lista (los datos estan normalizados en miles
        outerPlanets = new ArrayList<>();
        outerPlanets.add(new PlanetaSolar("Jupiter", 16, 70.85, 303.15,628800, 778300, null));
        outerPlanets.add(new PlanetaSolar("Saturno", 23, 60.00, 148.15,1277400, 1429400, null));
        outerPlanets.add(new PlanetaSolar("Urano", 15, 25.40, 80.15,2719700, 2871000, null));
        outerPlanets.add(new PlanetaSolar("Neptuno", 8, 24.30, 120.15,4347400, 4504300, null));
        
         // Creamos los satelites desde la clase SateliteSolar y los añadimos a un objeto lista (los datos estan normalizados en miles
        selectedSatelites = new ArrayList<>();
        selectedSatelites.add(new SateliteSolar("Luna", "Tierra", 1.7374));
        selectedSatelites.add(new SateliteSolar("Phobos", "Marte", 0.0175));
        selectedSatelites.add(new SateliteSolar("Deimos", "Marte", 0.0125));
        selectedSatelites.add(new SateliteSolar("Io", "Jupiter", 1.801));
        selectedSatelites.add(new SateliteSolar("Europa", "Jupiter", 1.569));
        selectedSatelites.add(new SateliteSolar("Ganímedes", "Jupiter", 2.631));
        selectedSatelites.add(new SateliteSolar("Calisto", "Jupiter", 2.400));
        selectedSatelites.add(new SateliteSolar("Titán", "Saturno", 2.575));
        selectedSatelites.add(new SateliteSolar("Oberón", "Urano", 0.5826));
        selectedSatelites.add(new SateliteSolar("Titania", "Urano", 0.788));
        selectedSatelites.add(new SateliteSolar("Umbriel", "Urano", 0.584));
        selectedSatelites.add(new SateliteSolar("Triton", "Neptuno", 1.350));

        // La captura de un Satelite por el campo gravitatorio de un Planeta se hará de la siguiente manera:
        for (SateliteSolar satelite : selectedSatelites) {
            for (PlanetaSolar planeta : innerPlanets) {
                if (planeta.getNamePlanet().equals(satelite.getCatchPlanet())) {
                    planeta.addSatelite(satelite);
                    break;
                    }
                }
            for (PlanetaSolar planeta : outerPlanets) {
                if (planeta.getNamePlanet().equals(satelite.getCatchPlanet())) {
                    planeta.addSatelite(satelite);
                    break;
                    }
                }
        }
        	
    }

    //Metodo privado para obtener el planeta más grande
    private void biggestPlanet() {

        PlanetaSolar biggestPlanet = null;
        Double maxRadiusEq = 0.0;

        for(PlanetaSolar inPlanet : innerPlanets) {
            if (inPlanet.getEquatorRadius() > maxRadiusEq) {
                maxRadiusEq = inPlanet.getEquatorRadius();
                biggestPlanet = inPlanet;
            }
        }

        for(PlanetaSolar outPlanet : outerPlanets) {
            if (outPlanet.getEquatorRadius() > maxRadiusEq) {
                maxRadiusEq = outPlanet.getEquatorRadius();
                biggestPlanet = outPlanet;
            }
        }

        System.out.println("El planeta más grande del Sistema Solar o con mayor radio ecuatorial es " + biggestPlanet.getNamePlanet() + 
        " y su radio ecuatorial es " + biggestPlanet.getEquatorRadius());

    }

    //Metodo privado para obtener el planeta con el mayor número de satelites
    private void maxSatellitesPlanet() {

        PlanetaSolar maxSatellitesPlanet = null;
        Integer maxNumberSat = 0;

        for(PlanetaSolar inPlanet : innerPlanets) {
            if (inPlanet.getNumberSatelite() > maxNumberSat) {
                maxNumberSat = inPlanet.getNumberSatelite();
                maxSatellitesPlanet = inPlanet;
            }
        }

        for(PlanetaSolar outPlanet : outerPlanets) {
            if (outPlanet.getNumberSatelite() > maxNumberSat) {
                maxNumberSat = outPlanet.getNumberSatelite();
                maxSatellitesPlanet = outPlanet;
            }
        }

        System.out.println("El planeta con más satelites del Sistema Solar es " + maxSatellitesPlanet.getNamePlanet() +
        " y tiene el siguiente número total de satelites: " + maxSatellitesPlanet.getNumberSatelite());

    }

    //Metodo privado para obtener los nombres de los planetas interiores y exteriores
    private void namesPlanets() {
        
        System.out.println("Los nombres de los planetas del sistema solar son: ");

        for (PlanetaSolar planeta : innerPlanets) {
            System.out.println(planeta.getNamePlanet());
        }

        for (PlanetaSolar planeta : outerPlanets) {
            System.out.println(planeta.getNamePlanet());
        }
    }

    //Metodo privado para obtener el planeta más alejado del Sol
    private void furthestPlanetSun() {

        PlanetaSolar furthestPlanet = null;
        Integer maxDistanceSun = 0;

        for(PlanetaSolar inPlanet : innerPlanets) {
            if (inPlanet.getDistanceSun() > maxDistanceSun) {
                maxDistanceSun = inPlanet.getDistanceSun();
                furthestPlanet = inPlanet;
            }
        }

        for(PlanetaSolar outPlanet : outerPlanets) {
            if (outPlanet.getDistanceSun() > maxDistanceSun) {
                maxDistanceSun = outPlanet.getDistanceSun();
                furthestPlanet = outPlanet;
            }
        }

        System.out.println("El planeta más alejado del Sol es " + furthestPlanet.getNamePlanet() +
        " y la distancia en 10x3 KM es: " + furthestPlanet.getDistanceSun());

    }

    //Metodo privado para obtener los satelites (nombres y radio) del planeta seleccionado que es Jupiter
    private void jupiterSatelites() {

        for (SateliteSolar satelite : selectedSatelites) {
            if (satelite.getCatchPlanet().equals("Jupiter")) {
                System.out.println("Los Satelites de Jupiter son: " + satelite.getNameSatelite() + " y su tamaño es " 
                + satelite.getEquatorRadius() );
                }
            }

    }


    //Metodo privado para obtener la temperatura del planeta seleccionado que es Marte
    private void marsTemperature() {

        for (PlanetaSolar planeta : innerPlanets) {
            if (planeta.getNamePlanet().equals("Marte")) {
                System.out.println("La temperatura media diurna de Marte es: " + planeta.getAvgMorningTemp());
                break;
                }
            }
        
    }

}
