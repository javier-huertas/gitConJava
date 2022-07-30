 
//aqui solo se crea una lista para guardar las motos y carros

package aprendergit;
 
import java.util.ArrayList;
 
public class concesionaria {
   
 ArrayList<Vehiculo> nombreArrayList ;

    public concesionaria() {
        this.nombreArrayList = new ArrayList<Vehiculo>();
    }
    
    public void agregarVehiculo(Vehiculo v){
        this.nombreArrayList.add(v);
    }
    
    

 
 
 
 
 
 
}
