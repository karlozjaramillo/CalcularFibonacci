/*
 * Clase con los atributos necesarios para calcular un número Fibonacci,
 * mostrar la serie y el número resultante, y validar si el número resultante
 * es primo o no.
 */
package calcularfibonacci;

/**
 *
 * @author Carlos Jaramillo
 * @version 1.0
 * @since 23-08-2021
 */
public class Fibonacci {

    /**
     * Atributos.
     */
    private int tamaño;
    private int resultante;

    /**
     * Constructor vacío.
     */
    public Fibonacci() {
    }

    /**
     * Constructor con un parámetro.
     *
     * @param tamaño
     */
    public Fibonacci(int tamaño) {
        this.tamaño = tamaño;
    }

    // Getters y Setters.    
    public int getResultante() {
        return resultante;
    }

    public void setResultante(int resultante) {
        this.resultante = resultante;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    /**
     * Método para obtener el número Fibonacci usando recursividad.
     *
     * @param numero de tipo entero.
     * @return Devuelve el número actual de la serie.
     */
    private int obtenerFibonacci(int numero) {
        switch (numero) {
            case 0:
                return 0;
            case 1:
                return 1;
            default:
                return obtenerFibonacci(numero - 1) + obtenerFibonacci(numero - 2);
        }
    }

    /**
     * Método para imprimir la serie Fibonacci.
     */
    public void imprimirSerie() {
        System.out.println("=========================");
        System.out.println("La serie de tamaño " + this.tamaño + " es:");
        for (int i = 0; i < tamaño; i++) {
            System.out.print(obtenerFibonacci(i) + " ");
            resultante = obtenerFibonacci(i);
        }
        System.out.println();
        System.out.println("=========================");
    }

    /**
     * Método para validar si un número es primo.
     *
     * @param número de tipo entero.
     * @return Devuelve true si el número ingresado es primo.
     */
    private boolean esPrimo(int numero) {
        int contador = 2;
        boolean primo = true;
        while ((primo) && (contador != numero)) {
            if (numero % contador == 0) {
                primo = false;
            }
            contador++;
        }
        return primo;
    }

    /**
     * Método para imprimir si un número es primo o no.
     */
    public void imprimirPrimo() {
        if (esPrimo(resultante)) {
            System.out.println(resultante + " es primo");
        } else {
            System.out.println(resultante + " no es primo");
        }
    }
}
