public class SistemaSolar {
    
    /**Construimos la clase con la estructura de la agregación fuerte */
    EstrellaSolar star;

    /**
	 * Constructor del Sistema Solar
	 * @param star
	 */

    public SistemaSolar(){
        // Instanciamos los objetos desde las clases:
		EstrellaSolar star= new EstrellaSolar("Sol", 700000, 15000000, 149600000);
        
        this.star = star;
    }

    public void bigBang(){
        // Creamos el sol
        System.out.println("La estrella del Sistema solar se llama "+ star.getNameStar()+" tiene el siguiente radio Ecuatorial "+ 
        star.getEquatorRadius());
		
    }
}
