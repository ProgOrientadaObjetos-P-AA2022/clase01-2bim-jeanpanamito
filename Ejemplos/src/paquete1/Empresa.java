/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.Locale;

/**
 *
 * @author reroes
 */
public class Empresa {

    private String nombre;
    private Edificio[] edificios;
    private Vehiculo[] vehiculos;
    private double costoEdificios;
    private double costoVehiculos;
    private double costoBienesInmuebles;

    public void establecerNombre(String m) {
        nombre = m;
    }

    public void establecerEdificios(Edificio[] m) {
        edificios = m;
    }

    public void establecerVehiculos(Vehiculo[] m) {
        vehiculos = m;
    }

    public void establecerCostoEdificios() {
        double suma = 0;
        for (int i = 0; i < obtenerEdificios().length; i++) {
            suma = suma + obtenerEdificios()[i].obtenerCosto();

        }

        costoEdificios = suma;
    }

     public void establecerCostoVehiculos() {
        double sumaV = 0;
        for (int i = 0; i < obtenerVehiculos().length; i++) {
            sumaV = sumaV + obtenerVehiculos()[i].obtenerValor();

        }
        costoVehiculos = sumaV;

    }

    public void establecerCostoBienesInmuebles() {

        costoBienesInmuebles = costoEdificios + costoVehiculos;
    }

    public double obtenerCostoBienesInmuebles() {
        return costoBienesInmuebles;
    }

    public double obtenerCostoEdificio() {
        return costoEdificios;
    }

    public double obtenerCostoVehiculos() {
        return costoVehiculos;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public Edificio[] obtenerEdificios() {
        return edificios;
    }

    public Vehiculo[] obtenerVehiculos() {
        return vehiculos;
    }

    @Override
    public String toString() {
        String reporte = String.format("%s\nLista de Edificios\n", obtenerNombre());
        for (int i = 0; i < obtenerEdificios().length; i++) {
            reporte = String.format("%s%d. %s (%.1f)\n",
                    reporte, i + 1,
                    obtenerEdificios()[i].obtenerNombre().toUpperCase(),
                    obtenerEdificios()[i].obtenerCosto());
        }
        reporte = String.format("%sTotal de inmuebles: %.1f\n", reporte, obtenerCostoEdificio());
      
        reporte = String.format("\n%sLista de Autos\n", reporte);
        for (int i = 0; i < vehiculos.length; i++) {
            reporte = String.format("%s%d. %s,%s (%.1f)\n", reporte, i + 1,
                    obtenerVehiculos()[i].obtenerTipo(),
                    obtenerVehiculos()[i].obtenerMatricula(),
                    obtenerVehiculos()[i].obtenerValor());

        }
        reporte= String.format("\n%sTotal de inmuebles: %.1f\n",reporte, obtenerCostoVehiculos());
        reporte= String.format("\n%sTotal de Bienes: %.1f\n", reporte, obtenerCostoBienesInmuebles());
        return reporte;
    }

}
