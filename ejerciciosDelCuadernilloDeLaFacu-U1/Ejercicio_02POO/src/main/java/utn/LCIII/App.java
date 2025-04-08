package utn.LCIII;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    /*
    * Crear una clase Punto que permita representar puntos
    * en un plano de un sistema de coordenadas cartesianas.
    * Crear un programa que permita ingresar los datos de dos puntos
    *  y con ellos cree dos instancias de la clase Punto.
    * A partir de las instancias creadas calcular y mostrar la distancia existente entre ambos puntos.
    */

    Scanner sc = new Scanner(System.in);

    Punto punt1;
    Punto punt2;

    public void generarPunto(Punto p){

        System.out.println("Ingrese X e Y");
        double puntX = sc.nextInt();
        double puntY = sc.nextInt();
        p.setX(puntX);
        p.setY(puntY);

        p.setDistEntrePuntos(p.getX()-p.getY());
    }

    public void calcularDistancia(Punto a, Punto b){

        double distancia = a.getDistEntrePuntos() - b.getDistEntrePuntos();

        System.out.println("La distancia que hay entre los dos puntos es: " + distancia);

    }


    public static void main( String[] args )
    {

        System.out.println( "Ejercicio 2" );
        System.out.println("--------------");

        App app = new App();

        app.generarPunto(app.punt1);
        app.generarPunto(app.punt2);

        app.calcularDistancia(app.punt1, app.punt2);


    }
}
