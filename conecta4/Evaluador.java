/*
 * Evaluador.java
 *
 * Created on 10 de enero de 2004, 17:01
 */

/**
 *
 * @author  ribadas
 */
public abstract class Evaluador {
    /* Implementa la superclase del patron Estrategia para encapsular
     * las distintas funciones de evaluacion
     * 
     * Define el interfaz (funcion "valoracion")
     */
   
    public static int MAXIMO = 20000;
    public static int MINIMO = -MAXIMO;
    
    private Tablero _tablero;
    private int _jugador;
    private int _valoracion;
    private Pesos _pesos;
    
    /** Creates a new instance of Evaluador */
    public Evaluador() {
    }
    
    public abstract double valoracion(Tablero tablero, int jugador);
    
    public abstract void establecerPesos(Pesos pesos);
    public abstract Pesos obtenerPesos();
    
}
