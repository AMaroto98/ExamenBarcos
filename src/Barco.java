import java.util.ArrayList;

public abstract class Barco {

    private String matricula;
    private String nombre;
    private float tamaño;

    // Constructor vacío
    public Barco() {
    }

    // Constructor
    public Barco(String matricula, String nombre, float tamaño) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.tamaño = tamaño;
    }

    // Getters y setters
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public float getTamaño() {
        return tamaño;
    }
    public void setTamaño(float tamaño) {
        this.tamaño = tamaño;
    }

    // Métodos
    public static String mayorTamaño(ArrayList<Barco> barcosEntrantes) {

        int mayorTamaño = 0;

        for (Barco barco : barcosEntrantes) {

            String matriculaActual = barco.getMatricula();
            int matriculaActualINT = Integer.parseInt(matriculaActual); 

            if (matriculaActualINT > mayorTamaño) {

                mayorTamaño = matriculaActualINT;
                
            }
        }

        String mayorTamañoString = Integer.toString(mayorTamaño);

        return mayorTamañoString;
    }

    public abstract boolean encajaTipo(Pantalan pantalan);

    public float encajaTamaño(Amarre amarre) {

        float tamañoBarco = this.getTamaño();
        float tamañoAmarre = amarre.getTamaño();
        float diferencia = tamañoAmarre - tamañoBarco;

        return diferencia;
    }

    public static void cargarBarcosEntrantes(ArrayList<Barco> barcosEntrantes) {

        Comercial poseidon = new Comercial("1234", "Poseídon", 80, "Carga textil");
        Recreo triton = new Recreo("2345", "Tritón", 6, "Permiso recreativo");

        barcosEntrantes.add(poseidon);
        barcosEntrantes.add(triton);

    }

    @Override
    public String toString() {
        return "Barco Matricula: " + matricula + ", Nombre: " + nombre + ", Tamaño: " + tamaño;
    }
}
