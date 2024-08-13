package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // NECESITO HACER UN LISTADLO PAISES SURAMERICANOS


        // PARA CADA PAIS NECESITO ALMACENAR EL NUMERO DE :
        // MEDALLAS DE ORO
        // MEDALLAS DE PLATA
        // MEDALLAS DE BRONCE


        // SUMAR EL NUMERO DE MEDALLAS DE CADA PAIS

        // INFORAMR CUAL ES EL PAIS CON MAS MEDALLAS

        // INFORMAR CUAL ES EL PAIS CON MENOS MEDALLAS

        // TERMINAR SUMANDO  EL TOTAL  DE MEDLLAS DE LOS PAISES
        // SURAMERICANOS

        //////////////////////////////////////////////

        ArrayList<String> paises = new ArrayList<>();
        Scanner leerTeclado = new Scanner(System.in);
        ArrayList<Integer> medallas = new ArrayList<>();

        System.out.println("***OLIMPICOS 2024 ***");


        for (int i = 0; i < 3; i++) {
            String pais;
            int sumatoriaMedallas = 0;
            System.out.println("Ingrese un Pais");
            pais = leerTeclado.nextLine();
            paises.add(pais);

            //PIDIENDO LOS DATOS DE CADA PAIS

            System.out.println(" Digita el numero de medallas de oro " + pais + ":");
            int medellasOro = leerTeclado.nextInt();
            System.out.println(" Digita el numero de medallas de Plata " + pais + ":");
            int medallasPlata = leerTeclado.nextInt();
            System.out.println(" Digita el numero de medallas de Bronce " + pais + ":");
            int medallasBronce = leerTeclado.nextInt();
            sumatoriaMedallas = medellasOro + medallasPlata + medallasBronce;
            System.out.println(pais + " obtuvo en total:" + sumatoriaMedallas + " Medallas en Paris");

            leerTeclado.nextLine();
            medallas.add(sumatoriaMedallas);



        }
        //RECORRIENDO UN ARREGLO
        int paisMayor=medallas.get(0);
        int paisMenor=medallas.get(3);

        for (Integer medalla : medallas) {

            if(medalla<paisMayor){
                paisMayor=medalla;
            }
            if (medalla<paisMenor){
            paisMenor=medalla;
            }
            System.out.println( " El pais con mas Medallas obtuvo un total de : "+paisMayor);
            // quiero preguntar el cajon indice donde se guardo la cantidad de medallas mayor

            int indiceGanador=medallas.indexOf(paisMayor);
            System.out.println(" El indice ganador es el: "+indiceGanador);
            // quiero obtener el valor que hay dentro de un cajon
            System.out.println("Asi pues el pais Ganador fue:"+paises.get(indiceGanador));


        }
    }

}
