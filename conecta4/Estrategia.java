/*
 * Estrategia.java
 *
 * Created on 10 de enero de 2004, 16:57
 */

/**
 *
 * @author  ribadas
 */
public abstract class Estrategia {
    /* 
     * Superclase del patron estrategia, el ofrece interfaz comun de todas las
     * estrategias (funcion buscarMovimiento).
     */
   
    /** Creates a new instance of Estrategia */
    private Evaluador _evaluador;

    public Estrategia() {
    }
    
    public abstract int buscarMovimiento(Tablero tablero, int jugador);

    public abstract void establecerEvaluador(Evaluador evaluador);
    public abstract Evaluador obtenerEvaluador();
    
    
}
