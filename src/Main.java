public class Main {
 
    public static void main(String[] args){
        Catalogo catalogo = new Catalogo();
        
        Vehiculo vehiculo1 = new Vehiculo("Toyota", "Corolla", 20000.0);
        Vehiculo vehiculo2 = new Vehiculo("Honda", "Civic", 22000.0);
        Vehiculo vehiculo3 = new Vehiculo("Ford", "Focus", 18000.0);

        catalogo.agregarVehiculo(vehiculo1);
        catalogo.agregarVehiculo(vehiculo2);
        catalogo.agregarVehiculo(vehiculo3);
    }
}
 