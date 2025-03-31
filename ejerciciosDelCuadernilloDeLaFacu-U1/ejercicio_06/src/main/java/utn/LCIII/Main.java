package utn.LCIII;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un año: ");

        int anio = sc.nextInt();

        if ((anio % 400 == 0) || (anio % 4 == 0 && anio % 100 != 0)) {
            System.out.println("ES un año BISIESTO");
        }
        else {
            System.out.println("NO es un año BISIESTO");
        }

    }
}