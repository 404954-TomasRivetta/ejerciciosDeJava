package utn.LCIII;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double num;

        do {
            System.out.println("Ingrese un numero positivo: ");
            num = sc.nextDouble();
        } while (num < 0);

    }
}