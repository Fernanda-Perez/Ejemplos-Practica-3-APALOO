// Clase genérica con tipo parametrizado <T>
class Cochera<T> {
    public T contenido;

    // Método para establecer el contenido
    public void setContenido(T contenido) {
        this.contenido = contenido;
    }

    // Método para obtener el contenido
    public T getContenido() {
        return contenido;
    }

    public void mostrarContenido() {
        if (contenido == null) {
            System.out.println("La cochera está vacía.");
        } else {
            System.out.println("Contenido de la cochera: " + contenido.toString());
        }
    }
}


