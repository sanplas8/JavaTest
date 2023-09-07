/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cuit;
import java.util.Scanner;

/**
 *
 * @author toto_
 */
public class CuitServicio {

    private Scanner leerValores = new Scanner(System.in).useDelimiter("\n");

    public Cuit crearCuit() {
        System.out.println("-----Averigue su cuit-----");
        System.out.println("Por favor ingrese su nombre");
        String nombre = leerValores.next();
        System.out.print("Ingrese su sexo ('H'/ Hombre, 'M'/ Mujer): ");
        String sexo = leerValores.next();

        while (!sexo.equalsIgnoreCase("h")  && !sexo.equalsIgnoreCase("m")) {
            System.out.print("El dato ingresado no es correcto. \n"+"Intente nuevamente: ");
            sexo = leerValores.next();
        }
        System.out.println("Ingrese su dni");
        long dni = leerValores.nextLong();
        while (!(String.valueOf(dni).length() == 8 || String.valueOf(dni).length() == 7)) {
            System.out.print("Dni ingresado incorrecto. \n"
                    + "Intente nuevamente: ");
            dni = leerValores.nextLong();

        }

        int[] dni2 = new int[8];

        for (int i = 0; i < dni2.length; i++) {
            if (String.valueOf(dni).length() == 7) {
                if (i == 0) {
                    dni2[i] = 0;
                } else if (i > 0) {
                    dni2[i] = Integer.parseInt(String.valueOf(dni).substring(i - 1, i));
                }
            } else {

                dni2[i] = Integer.parseInt(String.valueOf(dni).substring(i, i + 1));
            }
        }
        int[] afip = {5, 4, 3, 2, 7, 6, 5, 4, 3, 2};
        int suma = 0;
        for (int i = 0; i < afip.length; i++) {
            if (sexo.equalsIgnoreCase("h") ) {
                switch (i) {
                    case 0:
                        suma += (afip[i] * 2);
                        break;
                    case 1:
                        suma += (afip[i] * 0);
                        break;
                    default:
                        suma += (afip[i] * dni2[(i - 2)]);
                }
            }else if( sexo.equalsIgnoreCase("m")){
                switch (i) {
                    case 0:
                        suma += (afip[i] * 2);
                        break;
                    case 1:
                        suma += (afip[i] * 7);
                        break;
                    default:
                        suma += (afip[i] * dni2[i - 2]);
                }
            }

        }
        
        int verificador = 11-(suma%11);
        return new Cuit(nombre, dni, sexo, verificador, verificador);
    }
    
    public void mostrarCuit(Cuit nuevo){
        if (String.valueOf(nuevo.getDni()).length() == 7){
            System.out.println("Su cuit es: "+nuevo.getDiferencial()+"-"+"0"+nuevo.getDni()+"-"+nuevo.getVerificador());
        }else{
            System.out.println(nuevo.getNombre().toUpperCase()+" su cuit es: "+nuevo.getDiferencial()+"-"+nuevo.getDni()+"-"+nuevo.getVerificador());
        }
    }
}
