public class Amarre {

    private int id;
    private float tamaño;
    private boolean ocupado;
    private Barco barco;
    private static int contador = 0;
    
    public Amarre() {
    }

    public Amarre(float tamaño, boolean ocupado) {
        setID();
        this.tamaño = tamaño;
        this.ocupado = ocupado;
    }

    public int getID() {
        return id;
    }

    public void setID() {
        contador++;
        this.id = contador;
    }

    public float getTamaño() {
        return tamaño;
    }

    public void setTamaño(float tamaño) {
        this.tamaño = tamaño;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    @Override
    public String toString() {
        return "Amarre ID: " + id + ", Tamaño: " + tamaño + ", Ocupado:" + ocupado + ", Barco: " + barco;
    }
}
