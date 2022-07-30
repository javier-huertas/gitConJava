 
//aqui solo se crea una lista para guardar las motos y carros

package aprendergit;
 
import java.util.ArrayList;
 
public class concesionaria {
   
 ArrayList<Vehiculo> listaVehiculos ;

    public concesionaria() {
        this.listaVehiculos = new ArrayList<Vehiculo>();
    }
    
    public void agregarVehiculo(Vehiculo v){
       this.listaVehiculos.add(v);  
    }
    
    public void buscarLista(int buscador){  
     if(this.listaVehiculos.get(buscador) instanceof Moto){
         System.out.println("Es una moto");
         Moto motoConvertida = (Moto)this.listaVehiculos.get(buscador);
         ((Moto)this.listaVehiculos.get(buscador)).hacerTruco();
         motoConvertida.hacerTruco();
     }
     if(this.listaVehiculos.get(buscador) instanceof Carro){
         System.out.println("Es un carro");
         Carro carroConvertido = (Carro) this.listaVehiculos.get(buscador);
         ((Carro)this.listaVehiculos.get(buscador)).abrirPuerta();
         carroConvertido.abrirPuerta();
     }
    }
    
}
