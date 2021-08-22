/*
 * Clase con los atributos necesarios para calcular un número Fibonacci,
 * mostrar la serie y el número resultante.
 */
package calcularfibonacci;

/**
 *
 * @author Carlos Jaramillo.
 */
public class Fibonacci {

//    Atributos.
    private int tamaño;
    private int resultante;

//    Constructores.
    public Fibonacci() {
    }

    public Fibonacci(int tamaño) {
        this.tamaño = tamaño;
    }

//    Getters y Setters.
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

//    Método para obtener el número Fibonacci usando recursividad.
    public int obtenerFibonacci(int n) {
        switch (n) {
            case 0:
                return 0;
            case 1:
                return 1;
            default:
                return obtenerFibonacci(n - 1) + obtenerFibonacci(n - 2);
        }
    }

//    Método para mostrar la serie Fibonacci.
    public void mostrarSerie() {
        System.out.println("La serie de tamaño " + this.tamaño + " es:");
        for (int i = 0; i < tamaño; i++) {
            System.out.print(obtenerFibonacci(i) + " ");
            resultante = obtenerFibonacci(i);
        }
        System.out.println();
    }
}
