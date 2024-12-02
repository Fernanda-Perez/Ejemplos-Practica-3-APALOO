public class Persona {
    private String nombre;
    private int edad;

    // Constructor de la clase Persona
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método saludar sobrecargado: acepta un saludo personalizado
    public void saludar(String saludo) {
        System.out.println(saludo + ", mi nombre es " + nombre + " y tengo " + this.edad + " años.");
    }

    // Método saludar sobrecargado: acepta un saludo y la edad
    public void saludar(String saludo, int edad) {
        this.edad = edad;  // Se actualiza la edad si se proporciona
        System.out.println(saludo + ", mi nombre es " + nombre + " y tengo " + this.edad + " años.");
    }

    // Método actualizarEdad: acepta un nuevo valor de edad
    public void actualizarEdad(int nuevaEdad) {
        this.edad = nuevaEdad;
        System.out.println("La edad de " + nombre + " ha sido actualizada a " + edad + " años.");
    }

    public static void main(String[] args) {
        // Crear una instancia de Persona
        Persona persona1 = new Persona("Juan", 25);

        // Llamar a los métodos sobrecargados
        persona1.saludar("Hola");  // Llama al primer método saludar
        persona1.saludar("Buenos días", 30);  // Llama al segundo método saludar

        // Actualizar la edad
        persona1.actualizarEdad(35);
    }
}
