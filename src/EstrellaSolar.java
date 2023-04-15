public class EstrellaSolar {

    /** Atributos de una Estrella del Sistema Solar*/
	private String nombreEstrella;
    private Integer radioEcuato;
    private Integer temperaturaNucleo;
    private Integer distanciaTierra;
     
     /**
        * Constructor de clase la EstrellaSolar
        * @param nombreEstrella
        * @param radioEcuato
        * @param temperaturaNucleo
        * @param distanciaTierra
    */    
        
    public EstrellaSolar(String nombreEstrella, Integer radioEcuato, Integer temperaturaNucleo, Integer distanciaTierra) {
            
        this.nombreEstrella = nombreEstrella;
        this.radioEcuato = radioEcuato;
        this.temperaturaNucleo = temperaturaNucleo;
        this.distanciaTierra = distanciaTierra;

    }

    /** Definimos los metodos get y set para la clase */
    
    public String getNameStar() {
        return nombreEstrella;
    }
    
    public void setNameStar(String nombreEstrella) {
        this.nombreEstrella = nombreEstrella;
    }

    public Integer getEquatorRadius() {
        return radioEcuato;
    }
    
    public void setEquatorRadius(Integer radioEcuato) {
        this.radioEcuato = radioEcuato;
    }

    public Integer getCoreTemp() {
        return temperaturaNucleo;
    }
    
    public void setCoreTemp(Integer temperaturaNucleo) {
        this.temperaturaNucleo = temperaturaNucleo;
    }

    public Integer getDistanceEarth() {
        return distanciaTierra;
    }
    
    public void setDistanceEarth(Integer distanciaTierra) {
        this.distanciaTierra = distanciaTierra;
    }
    
    
}

