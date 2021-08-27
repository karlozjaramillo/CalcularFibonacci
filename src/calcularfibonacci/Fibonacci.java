/*
 * Clase con los atributos necesarios para calcular un número Fibonacci,
 * mostrar la serie y el número resulting, y validar si el número resulting
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
    private int size;
    private int resulting;

    /**
     * Constructor vacío.
     */
    public Fibonacci() {
    }

    /**
     * Constructor con un parámetro.
     *
     * @param size
     */
    public Fibonacci(int size) {
        this.size = size;
    }

    // Getters y Setters.    
    public int getResulting() {
        return resulting;
    }

    public void setResulting(int resulting) {
        this.resulting = resulting;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    /**
     * Método para obtener el número Fibonacci usando recursividad.
     *
     * @param number de tipo entero.
     * @return Devuelve el número actual de la serie.
     */
    private int getFibonacci(int number) {
        switch (number) {
            case 0:
                return 0;
            case 1:
                return 1;
            default:
                return getFibonacci(number - 1) + getFibonacci(number - 2);
        }
    }

    /**
     * Método para imprimir la serie Fibonacci.
     */
    public void printSerie() {
        System.out.println("=========================");
        System.out.println("La serie de tamaño " + this.size + " es:");
        for (int i = 0; i < size; i++) {
            System.out.print(getFibonacci(i) + " ");
            resulting = getFibonacci(i);
        }
        System.out.println();
        System.out.println("=========================");
    }

    /**
     * Método para validar si un número es primo.
     *
     * @param number de tipo entero.
     * @return Devuelve true si el número ingresado es primo.
     */
    private boolean isPrime(int number) {
        int counter = 2;
        boolean prime = true;
        while ((prime) && (counter != number)) {
            if (number % counter == 0) {
                prime = false;
            }
            counter++;
        }
        return prime;
    }

    /**
     * Método para imprimir si un número es primo o no.
     */
    public void printPrime() {
        if (isPrime(resulting)) {
            System.out.println(resulting + " es primo");
        } else {
            System.out.println(resulting + " no es primo");
        }
    }
}
