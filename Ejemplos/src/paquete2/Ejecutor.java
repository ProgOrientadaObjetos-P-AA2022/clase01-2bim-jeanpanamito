/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.Edificio;
import paquete1.Empresa;
import paquete1.Vehiculo;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {

        // Crear una arreglo de 4 elementos de tipo Edificio
        Edificio edificio1 = new Edificio("Edificio Central");
        edificio1.establecerCostos(10000);
        Edificio edificio2 = new Edificio("Edificio Sur");
        edificio2.establecerCostos(20000);
        Edificio edificio3 = new Edificio("Edificio Norte");
        edificio3.establecerCostos(30000);
        Edificio edificio4 = new Edificio("Edificio Secundario");
        edificio4.establecerCostos(20000);

        Vehiculo vehiculo1 = new Vehiculo("Auto");
        vehiculo1.establecerMatricula("LBB011");
        vehiculo1.establecerValor(10000);

        Vehiculo vehiculo2 = new Vehiculo("Camioneta");
        vehiculo2.establecerMatricula("LCB011");
        vehiculo2.establecerValor(20000);

        Vehiculo vehiculo3 = new Vehiculo("Auto");
        vehiculo3.establecerMatricula("LBD0012");
        vehiculo3.establecerValor(6000);

        Vehiculo vehiculo4 = new Vehiculo("Camioneta");
        vehiculo4.establecerMatricula("LCC011");
        vehiculo4.establecerValor(10000);

        Vehiculo vehiculo5 = new Vehiculo("Camioneta");
        vehiculo5.establecerMatricula("LDC0011");
        vehiculo5.establecerValor(25000);
        // Edificio[] edificios = new Edificio[4];

        /*edificios[0] = edificio1;
        edificios[1] = edificio2;
        edificios[2] = edificio3;
        edificios[3] = edificio4;
         */
        Edificio[] edificios = {edificio1, edificio2, edificio3, edificio4};
        Vehiculo[] vehiculos = {vehiculo1, vehiculo2, vehiculo3, vehiculo4, vehiculo5};
        // Crear un objeto de tipo Empresa:
        Empresa empresa = new Empresa();
        empresa.establecerNombre("Empresa de Hojas");
        empresa.establecerEdificios(edificios);
        empresa.establecerCostoEdificios();
        empresa.establecerVehiculos(vehiculos);
        empresa.establecerCostoVehiculos();

        empresa.establecerCostoBienesInmuebles();
        //  Nombre: Empresa de Hojas
        //  Lista de edificio: edf1, edf2, edf3, edf4
        // Imprimir el costo de los bienes inmuebles de la empresa

        System.out.printf("%s\n", empresa);
    }
}
