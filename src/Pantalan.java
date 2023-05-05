import java.util.ArrayList;
import java.util.Scanner;

public class Pantalan {

    private int id;
    private String tipo;    
    private ArrayList<Amarre> listAmarre;
    private static int contador = 0;
    private Scanner sc = new Scanner(System.in);

    // Constructor vacío
    public Pantalan() {
    }

    // Constructor
    public Pantalan(String tipo) {
        setID();
        this.tipo = tipo;
        setListAmarre();
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public void setID() {
        contador++;
        this.id = contador;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {

        while (!tipo.equalsIgnoreCase("Comercial") || !tipo.equalsIgnoreCase("Recreo")) {

            tipo = sc.nextLine();
            System.out.println("El pantalan sólo puede ser de tipo 'Comercial' o 'Recreo");
            
        }

        this.tipo = tipo;
    }

    public ArrayList<Amarre> getListAmarre() {
        return listAmarre;
    }

    public void setListAmarre() {
        this.listAmarre = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Pantalan ID: " + id + ", Tipo: " + tipo + ", Lista Amarres: " + listAmarre;
    }
    
}
