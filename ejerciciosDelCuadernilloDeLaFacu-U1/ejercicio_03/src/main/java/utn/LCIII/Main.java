package utn.LCIII;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double total = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("----FACTURA----");

        int contArticulosVendidos = 1;

        while (contArticulosVendidos < 4){

            System.out.println("Articulo Nº"+ contArticulosVendidos);
            System.out.println("Precio unitario: ");
            double precioUnitario = sc.nextDouble();
            System.out.println("Ingresar cantidad: ");
            double articuloCantidad = sc.nextDouble();

            total += precioUnitario * articuloCantidad;
            contArticulosVendidos++;
        }

        System.out.println("--------");
        System.out.println("El total de la factura es: " + total);

    }
}