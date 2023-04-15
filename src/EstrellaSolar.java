public class EstrellaSolar {

    /** velocidad de caeda procesador*/
	private float velocidad;
    /** nucleos l�gicos del micro*/
    private int nucleos;
    /** modelo */
    private String modelo;
     
     /**
        * Constructor de clase
        * @param velocidad
        * @param nucleos
        * @param modelo
        * @param fabricante
    */    
        
    public EstrellaSolar(float velocidad, int nucleos, String modelo, String fabricante) {
            
        this.velocidad = velocidad;
        this.nucleos = nucleos;
        this.modelo = modelo;
    }
    
    public int getNucleos() {
        return nucleos;
    }
    
    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }
    
     public String getModelo() {
        return modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getVelocidad() {
        return velocidad;
    }
    
    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }
    
}

