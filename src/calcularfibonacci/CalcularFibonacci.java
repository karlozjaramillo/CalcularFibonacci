/*
 * Clase principal de la aplicación.
 */
package calcularfibonacci;

/**
 *
 * @author Carlos Jaramillo
 * @version 1.0
 * @since 23-08-2021
 */
public class CalcularFibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci(7);
        fibonacci.printSerie();
        fibonacci.printPrime();
    }
}
