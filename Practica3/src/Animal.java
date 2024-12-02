public class Animal {
    private String nombre;
    private String tipo;

    // Constructor 1: Sin parámetros
    public Animal() {
        this.nombre = "Sin nombre";
        this.tipo = "Desconocido";
    }

    // Constructor 2: Con un parámetro (nombre)
    public Animal(String nombre) {
        this.nombre = nombre;
        this.tipo = "Desconocido";
    }

    // Constructor 3: Con dos parámetros (nombre y tipo)
    public Animal(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    // Método para describir el animal
    public void describir() {
        System.out.println("Soy un " + tipo + " llamado " + nombre + ".");
    }

    // Getters y Setters (opcional)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public static void main(String[] args) {
        // Usando el primer constructor
        Animal animal1 = new Animal();
        animal1.describir(); // Salida: Soy un Desconocido llamado Sin nombre.

        // Usando el segundo constructor
        Animal animal2 = new Animal("Perro");
        animal2.describir(); // Salida: Soy un Desconocido llamado Perro.

        // Usando el tercer constructor
        Animal animal3 = new Animal("Gato", "Mamífero");
        animal3.describir(); // Salida: Soy un Mamífero llamado Gato.
    }
}
