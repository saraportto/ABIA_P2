/*
 * EvaluadorAleatorio.java
 *
 * Created on 10 de enero de 2004, 17:05
 */
import java.util.Random;

/**
 *
 * @author  ribadas
 */
public class EvaluadorAleatorio extends Evaluador {
    /* Ejemplo de evaluador "de jugete"
     * Simplemente devuelve un valor aleatorio entre
     *  "-infinito" y "+infifito"
     */
   
    private Random generador = new Random();
    
    /** Creates a new instance of EvaluadorAleatorio */
    public EvaluadorAleatorio() {
    }
    
    public double valoracion(Tablero tablero, int jugador) {
        return(generador.nextInt(MAXIMO+Math.abs(MINIMO)) - Math.abs(MINIMO));
    }

    public void establecerPesos(Pesos pesos) {
        return;
    }

    public Pesos obtenerPesos() {
        return null;
    }
}
