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
public class Fibonacci {
    private int tamaño;
    private int resultante;

    public Fibonacci() {
    }

    public Fibonacci(int tamaño, int resultante) {
        this.tamaño = tamaño;
        this.resultante = resultante;
    }

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
}
