
import java.util.ArrayList;


public class Catalogo {
    private ArrayList<Vehiculo> listaVehiculos;

    public Catalogo(){
        listaVehiculos = new ArrayList<>();
    }
    public void agregarVehiculo(Vehiculo vehiculo){
        listaVehiculos.add(vehiculo);
        System.out.println("Vehiculo agregado : " + vehiculo);
    }
    public void mostrarCatalogo(){
        System.out.println("Catálogo de Vehículos: ");
        for (Vehiculo vehiculo : listaVehiculos){
            System.out.println(vehiculo);
        }
    }
}

