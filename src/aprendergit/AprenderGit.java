
package aprendergit;

public class AprenderGit {

    public static void main(String[] args) {
        concesionaria c1 = new concesionaria();
        Carro carro1 = new Carro();
        Moto moto1 = new Moto();
      // se hace un up castin de carro a vehiculo
      //Se hace un up casting de moto a vehiuclo
      //se hace el up castin de manera automatica
      //al ingresarlo a la lista vehiculo
      // pero tambien se puede hacer de la siguiente manera
       //Vehiculo vehiculo1 = carro1;
       c1.agregarVehiculo(carro1);
       c1.agregarVehiculo(moto1);
    //ahora buscaremos en nuestra lista si es un carro o una moto
    c1.buscarLista(0);

        


    }
    
}
