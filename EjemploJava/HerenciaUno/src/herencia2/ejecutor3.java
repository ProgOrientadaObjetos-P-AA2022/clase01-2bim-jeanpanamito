/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia2;

import herencia1.Estudiante;
import herencia1.EstudianteDistancia;
import herencia1.EstudiantePresencial;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author PERSONAL
 */
public class ejecutor3 {

    public static void main(String[] args) {

        System.out.println("\t\tMENU PRINCIPAL");
        
        menuPrincipal();
    }

    public static void menuPrincipal() {

        Scanner entrada = new Scanner(System.in);
        entrada.nextLine();
        System.out.println("Ingrese nombre");
        String nombre = entrada.nextLine();
        System.out.println("\n\n------------------------------------------------------------------------");
        System.out.println("Seleccione una opcion del siguiente menú:\n"
                + " Ingreso Estudiante Distancia (1)\n"
                + " Ingreso Estudiante Presencial (2)\n"
                + " Salir(3)");
        System.out.println("------------------------------------------------------------------------");
        int datos = entrada.nextInt();
        if ((datos <= 0) || (datos > 3)) {
            else {
                    entrada.nextLine();
                    System.out.println("Ingrese el nombre del estudiante: ");
            String nombr = entrada.nextLine();

            System.out.println("Ingrese el apellido del estudiante: ");
            String apellido = entrada.nextLine();

            System.out.println("Ingrese la identifiacion del estudiante: ");
            String identificacion = entrada.nextLine();

            System.out.println("Ingrese la edad del estudiante: ");
            int edad = entrada.nextInt();
                    
                    }
            System.out.print("Valor no se encuentra dentro del parametro.\nvuelva a ingresar un valor");
            menuPrincipal();
        }
        switch (datos) {
            case 1:
                establecerEstudianteDistancia(nombre);

                break;
            case 2:
                establecerEstudiantePresencial();
                break;

            case 3:
                System.out.println("Programa cancelado por el usuario");
                break;

            /*
        System.out.printf("%s = (%.2f)\n",estudiante.obtenerApellidoEstudiante(),
                estudiante.obtenerMatriculaDistancia());
             */
        }

    }

    public static void establecerEstudianteDistancia(String nom, String ape, String ide, int ed) {
        Scanner entrada = new Scanner(System.in);
        EstudianteDistancia estudiante1 = new EstudianteDistancia();
        System.out.println("Ingrese Costo asignatura");
        double costoAsignatura = entrada.nextDouble();
        System.out.println("Numero de asignaturas");
        int asignatura = entrada.nextInt();
        estudiante1.establecerNombresEstudiante(nom);
        estudiante1.establecerApellidoEstudiante(ape);
        estudiante1.establecerIdentificacionEstudiante(ide);
        estudiante1.establecerEdadEstudiante(ed);
        estudiante1.establecerCostoAsignatura(costoAsignatura);
        estudiante1.establecerNumeroAsginaturas(asignatura);
        estudiante1.calcularMatriculaDistancia();

        System.out.printf("%s\n", estudiante1);
        menuPrincipal();
    }

    public static void establecerEstudiantePresencial() {
        Scanner entrada = new Scanner(System.in);
        EstudiantePresencial estudiante2 = new EstudiantePresencial();
        System.out.println("Ingrese nombre estudiante");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese apellido estudiante");
        String apellido = entrada.nextLine();
        System.out.println("Ingrese identificacion estudiante");
        String identificacion = entrada.nextLine();
        System.out.println("Ingrese edad estudiante");
        int edad = entrada.nextInt();
        System.out.println("Ingrese Costo asignatura");
        double costoAsignatura = entrada.nextDouble();
        System.out.println("Numero de asignaturas");
        int asignatura = entrada.nextInt();
        estudiante2.establecerNombresEstudiante(nombre);
        estudiante2.establecerApellidoEstudiante(apellido);
        estudiante2.establecerIdentificacionEstudiante(identificacion);
        estudiante2.establecerEdadEstudiante(edad);
        estudiante2.establecerCostoCredito(costoAsignatura);
        estudiante2.establecerNumeroCreditos(asignatura);
        estudiante2.calcularMatriculaPresencial();

        System.out.printf("%s\n", estudiante2);
        menuPrincipal();
    }

    private static void establecerEstudianteDistancia(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
