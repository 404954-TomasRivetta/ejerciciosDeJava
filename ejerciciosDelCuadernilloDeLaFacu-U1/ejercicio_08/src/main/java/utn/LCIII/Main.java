package utn.LCIII;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double suma = 0;

        double promedio = 0;

        int cantNumerosAIngresar = 10;

        for (int i = 0; i < cantNumerosAIngresar; i++) {

            System.out.println("Ingrese el numero " + (i+1) );

            double num = sc.nextDouble();

            suma += num;

        }

        promedio = suma / cantNumerosAIngresar;

        System.out.println("SUMA: " + suma);
        System.out.println("PROMEDIO: " + promedio);

    }
}