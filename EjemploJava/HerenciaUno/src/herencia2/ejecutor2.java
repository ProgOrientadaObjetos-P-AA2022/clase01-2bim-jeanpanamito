/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia2;

import herencia1.Estudiante;
import herencia1.EstudianteDistancia;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author PERSONAL
 */
public class ejecutor2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String nombre;
        String apellido;
        String identificacion;
        int edad;
        double costoAsignatura;
        int asignatura;

        EstudianteDistancia estudiante = new EstudianteDistancia();
        System.out.println("Ingrese nombre estudiante");
         nombre = entrada.nextLine();
        System.out.println("Ingrese apellido estudiante");
        apellido = entrada.nextLine();
        System.out.println("Ingrese identificacion estudiante");
        identificacion = entrada.nextLine();
        System.out.println("Ingrese edad estudiante");
        edad = entrada.nextInt();
        System.out.println("Ingrese COsto asignatura");
        costoAsignatura = entrada.nextDouble();
        System.out.println("Numero de asignaturas");
        asignatura = entrada.nextInt();
        estudiante.establecerNombresEstudiante(nombre);
        estudiante.establecerApellidoEstudiante(apellido);
        estudiante.establecerIdentificacionEstudiante(identificacion);
        estudiante.establecerEdadEstudiante(edad);
        estudiante.establecerCostoAsignatura(costoAsignatura);
        estudiante.establecerNumeroAsginaturas(asignatura);
        estudiante.calcularMatriculaDistancia();
        /*
        System.out.printf("%s = (%.2f)\n",estudiante.obtenerApellidoEstudiante(),
                estudiante.obtenerMatriculaDistancia());
         */
        System.out.printf("%s\n", estudiante);
    }
}
