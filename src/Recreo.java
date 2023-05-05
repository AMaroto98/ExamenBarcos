public class Recreo extends Barco {

    private String permiso;

    // Constructor vacío
    public Recreo() {
        super();
    }

    // Constructor 
    public Recreo(String matricula, String nombre, float tamaño, String permiso) {
        super(matricula, nombre, tamaño);
        this.permiso = permiso;
    }

    // Getters y setters
    public String getPermiso() {
        return permiso;
    }

    public void setPermiso(String permiso) {
        this.permiso = permiso;
    }

    @Override
    public boolean encajaTipo(Pantalan pantalan) {

        if ((this instanceof Recreo) && pantalan.getTipo().equalsIgnoreCase("Comercial")) {

            return true;
            
        } 
    
        return false;        
    }

    @Override
    public String toString() {
        return super.toString() + " Recreo Permiso: " + permiso;
    }
    
}
