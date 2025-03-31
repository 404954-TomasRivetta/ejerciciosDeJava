package utn.LCIII;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el tiempo del ganador de la clasificacion en segundos: ");

        double tiempoGanador = sc.nextDouble();

        int cantCorredores = 9;

        int cont = 0;

        int cantQueCorreran = 1;

        double tiempoMaximoPermitido = tiempoGanador + (tiempoGanador * 0.15);

        while (cont < cantCorredores) {

            System.out.println("Ingrese el tiempo del corredor Nº"+(cont+1));

            double tiempoCorredor = sc.nextDouble();

            if (tiempoCorredor <= tiempoMaximoPermitido) {
                cantQueCorreran++;
            }

            cont++;
        }

        System.out.println("La cantidad de corredores que disputaran son: " + cantQueCorreran);

    }
}