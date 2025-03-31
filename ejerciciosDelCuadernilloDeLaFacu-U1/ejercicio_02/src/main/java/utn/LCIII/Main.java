package utn.LCIII;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el precio del articulo a la venta: ");
        double precio = sc.nextDouble();

        double precioConIva = precio + (precio * 0.21);

        System.out.println("precio del articulo con iva = " + precioConIva);

    }
}