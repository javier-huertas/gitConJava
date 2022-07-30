 
package aprendergit;
 
public class Carro extends Vehiculo{
    private int numeroDePuertas;

    public int getNumeroDePuertas() {
        return numeroDePuertas;
    }

    public void setNumeroDePuertas(int numeroDePuertas) {
        this.numeroDePuertas = numeroDePuertas;
    }
    public void abrirPuerta(){
        System.out.println("La puerta se esta abriendo");
    }
    
}
