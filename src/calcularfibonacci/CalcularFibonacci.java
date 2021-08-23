/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcularfibonacci;

/**
 *
 * @author Carlos Jaramillo
 */
public class CalcularFibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci(10);
        fibonacci.mostrarSerie();
        fibonacci.imprimirPrimo();
    }
}
