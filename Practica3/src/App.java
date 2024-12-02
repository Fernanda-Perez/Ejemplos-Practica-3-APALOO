public class App {    
    public static void main(String[] args) {
    // Crear un Coche
    Coche coche = new Coche("Toyota", "Corolla", 2020, 4);
    // Crear una Moto
    Moto moto = new Moto("Harley Davidson", "Sportster", 2018, true);
    // Crear una Camioneta
    Camioneta camioneta = new Camioneta("Ford", "F-150", 2022, 1200);


    Cochera<Coche> cochera1= new Cochera<Coche>();
    Cochera<Moto> cochera2= new Cochera<Moto>();
    Cochera<Camioneta> cochera3= new Cochera<Camioneta>();

    System.out.println(coche);
    System.out.println(moto);
    System.out.println(camioneta);


  cochera1.setContenido(coche);
  cochera2.setContenido(moto);
  cochera3.setContenido(camioneta);

  cochera1.mostrarContenido();
  cochera2.mostrarContenido();  
  cochera3.mostrarContenido();



    }
}
