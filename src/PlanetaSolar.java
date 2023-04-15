import java.util.ArrayList;
import java.util.List;

public class PlanetaSolar {

    /** Atributos de una Estrella del Sistema Solar*/
	private String nombrePlaneta;
    private Integer numeroSatelites;
    private Double radioEcuato;
    private Double temperaturaMediaDiurna;
    private Integer distanciaTierra;
    private Integer distanciaSol;
    private List<SateliteSolar> satelitesPlaneta;

     
     /**
        * Constructor de clase la EstrellaSolar
        * @param nombrePlaneta
        * @param numeroSatelites
        * @param radioEcuato
        * @param temperaturaMediaDiurna
        * @param distanciaTierra
        * @param distanciaSol
    */    
        
    public PlanetaSolar(String nombrePlaneta, Integer numeroSatelites, Double radioEcuato, Double temperaturaMediaDiurna, 
    Integer distanciaTierra, Integer distanciaSol, List<SateliteSolar> satelitesPlaneta) {
            
        this.nombrePlaneta = nombrePlaneta;
        this.numeroSatelites = numeroSatelites;
        this.radioEcuato = radioEcuato;
        this.temperaturaMediaDiurna = temperaturaMediaDiurna;
        this.distanciaTierra = distanciaTierra;
        this.distanciaSol = distanciaSol;
        this.satelitesPlaneta = satelitesPlaneta;

    }

    /** Definimos los metodos get y set para la clase */
    
    public String getNamePlanet() {
        return nombrePlaneta;
    }
    
    public void setNamePlanet(String nombrePlaneta) {
        this.nombrePlaneta = nombrePlaneta;
    }

    public Integer getNumberSatelite() {
        return numeroSatelites;
    }
    
    public void setNumberSatelite(Integer numeroSatelites) {
        this.numeroSatelites = numeroSatelites;
    }

    public Double getEquatorRadius() {
        return radioEcuato;
    }
    
    public void setEquatorRadius(Double radioEcuato) {
        this.radioEcuato = radioEcuato;
    }

    public Double getAvgMorningTemp() {
        return temperaturaMediaDiurna;
    }
    
    public void setAvgMorningTemp(Double temperaturaMediaDiurna) {
        this.temperaturaMediaDiurna = temperaturaMediaDiurna;
    }

    public Integer getDistanceEarth() {
        return distanciaTierra;
    }
    
    public void setDistanceEarth(Integer distanciaTierra) {
        this.distanciaTierra = distanciaTierra;
    }

    public Integer getDistanceSun() {
        return distanciaSol;
    }
    
    public void setDistanceSun(Integer distanciaSol) {
        this.distanciaSol = distanciaSol;
    }

    public void addSatelite(SateliteSolar satelite) {
        if (this.satelitesPlaneta == null) {
            this.satelitesPlaneta = new ArrayList<>();
        }
        this.satelitesPlaneta.add(satelite);
    }

    public List<SateliteSolar> getSatelites() {
        return satelitesPlaneta;
    }

    /*Este es el metodo que facilitara atrapar los satelites de cada planeta en el big bang */
    public void atraparAstroEnCampoGravitatorio(SateliteSolar satelite) {
        for (SateliteSolar sate : satelitesPlaneta) {
            if (sate.getCatchPlanet().equals(this.nombrePlaneta)) {
                // Si el nombre del planeta coincide con el de lista de Satelite se añade a la lista de satelites del planeta
                satelitesPlaneta.add(satelite);
                return; 
            }
        }
    }
}

