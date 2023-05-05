public class App {

    public static void main(String[] args) {

        Puerto portPalma = new Puerto();

        Barco.cargarBarcosEntrantes(portPalma.getBarcosEntrantes());
        Puerto.simular(portPalma.getListPantalan());
        Puerto.buscarAmarre(portPalma.getBarcosEntrantes(), portPalma.getListPantalan());
        Puerto.verAmarre(portPalma.getListPantalan());
        
    }
    
}
