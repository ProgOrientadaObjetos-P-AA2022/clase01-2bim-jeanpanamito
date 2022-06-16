/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia2;

import herencia1.Estudiante;
import herencia1.EstudianteDistancia;

/**
 *
 * @author PERSONAL
 */
public class ejecutor {

    public static void main(String[] args) {

        EstudianteDistancia estudiante = new EstudianteDistancia();
        estudiante.establecerNombresEstudiante("JEanpa");
        estudiante.establecerApellidoEstudiante("Panamito");
        estudiante.establecerIdentificacionEstudiante("1106047523");
        estudiante.establecerEdadEstudiante(23);
        estudiante.establecerCostoAsignatura(30);
        estudiante.establecerNumeroAsginaturas(5);
        estudiante.calcularMatriculaDistancia();
        /*
        System.out.printf("%s = (%.2f)\n",estudiante.obtenerApellidoEstudiante(),
                estudiante.obtenerMatriculaDistancia());
         */
        System.out.printf("%s\n", estudiante);
    }
}
