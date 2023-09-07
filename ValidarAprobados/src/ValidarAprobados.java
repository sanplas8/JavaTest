/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Extra_Guia5;
import java.util.Scanner;
/**
 *
 * @author toto_
 */
public class ValidarAprobados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leerValores = new Scanner(System.in);
        System.out.println("Por favor ingrese las notas que se le pediran a continuacion");
        float [] notasAlumnos = new float [10];
        float promedio;
        
        int practico1, practico2, parcial1,parcial2;
        
        for(int i = 0 ; i < 10 ; i++){
            
            System.out.println("Por favor ingrese la nota del practico 1 para el "+(i+1)+" alumno.");
            practico1 = leerValores.nextInt();
            System.out.println("Por favor ingrese la nota del practico 2 para el "+(i+1)+" alumno.");
            practico2 = leerValores.nextInt();
            System.out.println("Por favor ingrese la nota del parcial 1 para el "+(i+1)+" alumno.");
            parcial1 = leerValores.nextInt();
            System.out.println("Por favor ingrese la nota del parcial 2 para el "+(i+1)+" alumno.");
            parcial2 = leerValores.nextInt();
            
            promedio = ((((((float)10/10)*(float) practico1) + (((float)15/10)*(float)practico2) + 
                       (((float)25/10)*(float)parcial1)+(((float)50/10)*(float)parcial2))/10));
            
            notasAlumnos[i] = promedio;
        }
        
        String aux = "";
        for(float elemento:notasAlumnos){
              aux = aux+" ["+elemento+"]";      
        }
        System.out.println("Notas alumnos : \n");
        System.out.println(aux);
        
        int aprobados = 0;
        for(float elemento:notasAlumnos){
            if(elemento >= 7){
                aprobados+=1;
            }
        }
        System.out.println("La cantidad de alumnos aprobados es de "+aprobados+" alumnos \n"+
                "Y la cantidad de alumnos desaprobados es "+((int) Math.abs((aprobados-10))));
    }
    
}
