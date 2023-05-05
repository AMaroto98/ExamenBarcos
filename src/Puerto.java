import java.util.ArrayList;

public class Puerto {
    
    private ArrayList<Barco> barcosEntrantes;
    private ArrayList<Pantalan> listPantalan;

    // Constructor vacío
    public Puerto() {
    }

    // Constructor
    public Puerto(ArrayList<Barco> barcosEntrantes, ArrayList<Pantalan> listPantalan) {
        setBarcosEntrantes();
        setListPantalan();
    }

    // Getters y setters
    public ArrayList<Barco> getBarcosEntrantes() {
        return barcosEntrantes;
    }

    public void setBarcosEntrantes() {
        this.barcosEntrantes = new ArrayList<>();
    }

    public ArrayList<Pantalan> getListPantalan() {
        return listPantalan;
    }

    public void setListPantalan() {
        this.listPantalan = new ArrayList<>();
    }

    public static void buscarAmarre(ArrayList<Barco> barcosEntrantes, ArrayList<Pantalan> listPantalan) {

        for (Barco barco : barcosEntrantes) {

            for (Pantalan pantalan : listPantalan) {

                if (barco.encajaTipo(pantalan )) {
                    
                }
                
            }
            
        }

            

    }
    

    public static void verAmarre(ArrayList<Pantalan> listPantalan) {

        for (Pantalan pantalan : listPantalan) {

            System.out.println(pantalan);
            
        }
    }

    public static void simular(ArrayList<Pantalan> listPantalan) {

        Pantalan pantalan1 = new Pantalan("Comercial");
        Pantalan pantalan2 = new Pantalan("Comercial");
        Pantalan pantalan3 = new Pantalan("Recreo");
        Pantalan pantalan4 = new Pantalan("Recreo");

        listPantalan.add(pantalan1);
        listPantalan.add(pantalan2);
        listPantalan.add(pantalan3);
        listPantalan.add(pantalan4);

        Amarre amarre1 = new Amarre(200f, false);
        Amarre amarre2 = new Amarre(90f, false);
        Amarre amarre3 = new Amarre(60f, false);
        Amarre amarre4 = new Amarre(165f, false);

        pantalan1.getListAmarre().add(amarre1);
        pantalan1.getListAmarre().add(amarre2);
        pantalan1.getListAmarre().add(amarre3);
        pantalan1.getListAmarre().add(amarre4);

    }
}
