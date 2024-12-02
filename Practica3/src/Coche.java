public class Coche extends Vehiculo {
    private int numeroDePuertas;

    // Constructor
    public Coche(String marca, String modelo, int año, int numeroDePuertas) {
        super(marca, modelo, año);
        this.numeroDePuertas = numeroDePuertas;
    }

    // Método adicional
    public void mostrarInfoCoche() {
        super.mostrarInfo();
        System.out.println("Número de puertas: " + numeroDePuertas);
    }

    // Getters y setters
    public int getNumeroDePuertas() {
        return numeroDePuertas;
    }

    public void setNumeroDePuertas(int numeroDePuertas) {
        this.numeroDePuertas = numeroDePuertas;
    }

    public String toString() {
        return super.toString() + ", Tipo: Coche, Puertas: " + numeroDePuertas;
    }

}

