public class SateliteSolar {

    /** Atributos de una Estrella del Sistema Solar*/
	private String nombreSatelite;
    private String atrapaPlaneta;
    private Double radioEcuato;
     
     /**
        * Constructor de clase la EstrellaSolar
        * @param nombreSatelite
        * @param atrapaPlaneta
        * @param radioEcuato
    */    
        
    public SateliteSolar(String nombreSatelite, String atrapaPlaneta , Double radioEcuato) {
            
        this.nombreSatelite = nombreSatelite;
        this.atrapaPlaneta = atrapaPlaneta;
        this.radioEcuato = radioEcuato;

    }

    /** Definimos los metodos get y set para la clase */
    
    public String getNameSatelite() {
        return nombreSatelite;
    }

    @Override
    public String toString() {
        return this.nombreSatelite;
    }
    
    public void setNameSatelite(String nombreSatelite) {
        this.nombreSatelite = nombreSatelite;
    }

    public String getCatchPlanet() {
        return atrapaPlaneta;
    }
    
    public void setCatchPlanet(String atrapaPlaneta) {
        this.atrapaPlaneta = atrapaPlaneta;
    }

    public Double getEquatorRadius() {
        return radioEcuato;
    }
    
    public void setEquatorRadius(Double radioEcuato) {
        this.radioEcuato = radioEcuato;
    }

}
