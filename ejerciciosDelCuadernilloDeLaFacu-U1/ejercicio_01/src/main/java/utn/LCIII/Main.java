package utn.LCIII;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        int num1 = sc.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();

        System.out.println("--------------------------");

        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Diferencia: " + (num1 - num2));
        System.out.println("Multiplicacion: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));

    }
}