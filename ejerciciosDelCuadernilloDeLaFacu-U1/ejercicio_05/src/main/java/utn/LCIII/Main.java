package utn.LCIII;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de Horas trabajadas: ");
        int cantHorasTrabajadas = sc.nextInt();
        System.out.println("Ingrese el sueldo por hora: ");
        double sueldoPorHora = sc.nextDouble();

        double sueldoACobrar = cantHorasTrabajadas * sueldoPorHora;

        if (cantHorasTrabajadas > 180){

            int cantHorasExcedentes = cantHorasTrabajadas - 180;

            double sueldoPorHoraExcendete = sueldoPorHora + (sueldoPorHora * 0.5);

            sueldoACobrar += ( sueldoPorHoraExcendete * cantHorasExcedentes);

        }

        System.out.println("Total a cobrar = $" + sueldoACobrar);

    }
}