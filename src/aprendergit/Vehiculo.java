 
package aprendergit;
 
public class Vehiculo {
    private int numeroDeTimones;
    
    public int getNumeroDeTimones(){
       return this.numeroDeTimones;
    }
    public void setNumeroDeTimones(int NumeroDeTiomnes){
        this.numeroDeTimones = NumeroDeTiomnes;
        
    }
    public void arrancar(){
        System.out.println("Se esta arrancando un vehiculo");
    }
    

            
}
