package utn.LCIII;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*

        Una empresa de alquiler de autos cobra $300 por día si no se superan los 200
km de uso diario. Por cada km extra hasta los 1000 km cobra $5 adicionales,
y a partir de los 1000 cobra $10 adicionales. Hacer un programa que solicite
la cantidad de km realizados por un cliente e indique el importe que se le debe
cobrar.
        *
        * */

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cant de kilometros realizadas: ");

        double cantKilometros = sc.nextDouble();

        double costoBase = 300;

        if(cantKilometros <= 200){
            System.out.println("Debera abonar $" + costoBase);
        } else if (cantKilometros > 200 && cantKilometros <= 1000) {
            System.out.println("Debera abonar $" + ( costoBase + ( (cantKilometros - 200) * 5 ) ));
        }else {
            double KMExtra1 =  (1000 - 200) * 5 ;
            double KMExtra2 = (cantKilometros - 1000) * 10;

            System.out.println("Debera abonar $" + (costoBase + KMExtra1 + KMExtra2));
        }


    }
}