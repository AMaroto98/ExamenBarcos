public class Comercial extends Barco {

    private String carga;

    // Constructor vacío
    public Comercial() {
        super();
    }

    // Constructor
    public Comercial(String matricula, String nombre, float tamaño, String carga) {
        super(matricula, nombre, tamaño);
        this.carga = carga;
    }

    // Getters y setters
    public String getCarga() {
        return carga;
    }

    public void setCarga(String carga) {
        this.carga = carga;
    }

    @Override
    public boolean encajaTipo(Pantalan pantalan) {

        if ((this instanceof Comercial) && pantalan.getTipo().equalsIgnoreCase("Comercial")) {

            return true;
            
        } 
    
        return false;        
    }

    @Override
    public String toString() {
        return super.toString() +  " Comercial Carga: " + carga;
    }
}
