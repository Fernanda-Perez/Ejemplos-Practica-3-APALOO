public class Moto extends Vehiculo {
    private boolean tieneSidecar;

    // Constructor
    public Moto(String marca, String modelo, int año, boolean tieneSidecar) {
        super(marca, modelo, año);
        this.tieneSidecar = tieneSidecar;
    }

    // Método adicional
    public void mostrarInfoMoto() {
        super.mostrarInfo();
        System.out.println("¿Tiene sidecar?: " + (tieneSidecar ? "Sí" : "No"));
    }

    // Getters y setters
    public boolean isTieneSidecar() {
        return tieneSidecar;
    }

    public void setTieneSidecar(boolean tieneSidecar) {
        this.tieneSidecar = tieneSidecar;
    }
    public String toString() {
        return super.toString() + ", Tipo: Moto, Sidecar: " + tieneSidecar;
    }

    
}
