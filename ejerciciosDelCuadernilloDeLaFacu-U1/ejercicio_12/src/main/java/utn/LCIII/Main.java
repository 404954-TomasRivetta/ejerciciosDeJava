package utn.LCIII;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la antiguedad del auto");

        int antiguedad = sc.nextInt();

        int cantAutos = 0;

        int cantAutosPocoUso = 0;

        int cantAutosNoMuyAntiguos = 0;

        int cantDeAniosDeNoMuyAntiguos = 0;

        while (antiguedad !=0){

            if (antiguedad >= 1 && antiguedad <= 5){
                System.out.println("NUEVO");
                cantAutosNoMuyAntiguos++;
                cantAutos++;
                cantDeAniosDeNoMuyAntiguos += antiguedad;
            } else if (antiguedad >= 6 && antiguedad <= 10) {
                System.out.println("POCO USO");
                cantAutos++;
                cantAutosPocoUso++;
                cantAutosNoMuyAntiguos++;
                cantDeAniosDeNoMuyAntiguos += antiguedad;

            } else if (antiguedad >= 11 && antiguedad <= 20) {
                System.out.println("MUCHO USO");
                cantAutos++;
                cantAutosNoMuyAntiguos++;
                cantDeAniosDeNoMuyAntiguos += antiguedad;
            } else if (antiguedad > 20) {
                System.out.println("MUY ANTIGUO");
                cantAutos++;
            }
            else {
                System.out.println("INGRESE ANTIGUEDAD POSITIVA");
            }

            System.out.println("Ingrese la antiguedad del auto: ");
            antiguedad = sc.nextInt();
        }

        double promedio = cantDeAniosDeNoMuyAntiguos / cantAutosNoMuyAntiguos;

        System.out.println("Cant total de autos: " + cantAutos);

        System.out.println("Cant de autos con poco uso: " + cantAutosPocoUso);

        System.out.println("Promedio de antigüedad de los autos que no sean muy antiguos: " + promedio );

    }
}