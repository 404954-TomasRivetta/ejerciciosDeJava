package utn.LCIII;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la persona 1: ");
        String nombre = sc.nextLine();

        System.out.println("Ingrese la altura de "+ nombre);
        double altura1 = sc.nextDouble();
        sc.nextLine();

        System.out.println("Ingrese el nombre de la persona 2: ");
        String nombre2 = sc.nextLine();

        System.out.println("Ingrese la altura de "+ nombre2);
        double altura2 = sc.nextDouble();

        if (altura1 > altura2) {
            System.out.println("La persona mas alta es: " + nombre);
        } else if (altura2 > altura1) {
            System.out.println("La persona mas alta es: " + nombre2);
        }else {
            System.out.println();
            System.out.println("Tienen la misma altura");
        }

    }
}