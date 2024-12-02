public class Camioneta extends Vehiculo {
    private int capacidadDeCarga; // en kilogramos

    // Constructor
    public Camioneta(String marca, String modelo, int año, int capacidadDeCarga) {
        super(marca, modelo, año);
        this.capacidadDeCarga = capacidadDeCarga;
    }

    // Método adicional
    public void mostrarInfoCamioneta() {
        super.mostrarInfo();
        System.out.println("Capacidad de carga: " + capacidadDeCarga + " kg");
    }

    // Getters y setters
    public int getCapacidadDeCarga() {
        return capacidadDeCarga;
    }

    public void setCapacidadDeCarga(int capacidadDeCarga) {
        this.capacidadDeCarga = capacidadDeCarga;
    }

    public String toString() {
        return super.toString() + ", Tipo: Camioneta, Capacidad: " + capacidadDeCarga;
    }

}

