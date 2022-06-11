/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author PERSONAL
 */
public class Vehiculo {

    private String tipo;
    private String matricula;
    private double valor;

    public Vehiculo(String m) {
        tipo = m;
    }

    public void establecerTipo(String m) {
        tipo = m;
    }

    public void establecerMatricula(String m) {
        matricula = m;
    }

    public void establecerValor(double m) {
        valor = m;
    }

    public String obtenerTipo() {
        return tipo;
    }

    public String obtenerMatricula() {
        return matricula;
    }

    public double obtenerValor() {
        return valor;
    }

    @Override
    public String toString() {
        /*String reporte = String.format("%s (%.2f)",obtenerNombre(),
               obtenerCosto()); 
         */ String reporte = String.format("%s (%.2f)", tipo,
                valor);
        return reporte;
    }
}
