package utn.LCIII;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese cuantos numeros desea ingresar: ");

        int cantNum = sc.nextInt();

        int i = 0;

        int cantNumMayCinco = 0;

        while (i < cantNum){

            System.out.println("Ingrese un numero positivo: ");
            int num = sc.nextInt();

            if (num>-1){
                if (num > 5){
                    cantNumMayCinco++;
                }

                i++;
            }
            else{
                System.out.println("Ingreso un numero NEGATIVO, MAL");
            }
        }

        System.out.println("La cantidad de numeros mayores a 5: " + cantNumMayCinco);

    }
}