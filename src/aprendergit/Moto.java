 
package aprendergit;
 
public class Moto extends Vehiculo{
    private int numeroRetrovisores;

    public int getNumeroRetrovisores() {
        return numeroRetrovisores;
    }

    public void setNumeroRetrovisores(int numeroRetrovisores) {
        this.numeroRetrovisores = numeroRetrovisores;
    }
    
    public void hacerTruco(){
        System.out.println("La moto puede hacer un truco");
    }
}
