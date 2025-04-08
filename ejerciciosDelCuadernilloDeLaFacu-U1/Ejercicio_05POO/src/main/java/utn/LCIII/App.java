package utn.LCIII;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{

    Scanner sc = new Scanner(System.in);

    Equipo equipo = new Equipo();

    public void generarEquipo(Equipo e){

        System.out.println("Ingrese el nombre del equipo: ");
        e.setNombreEquipo(sc.next());

        System.out.println("Ingresa la posicion: ");
        e.setPosicion(sc.nextInt());

        System.out.println("Ingresar partidos ganados: ");
        e.setPGanados(sc.nextInt());

        System.out.println("Ingresar partidos empatados: ");
        e.setPEmpatados(sc.nextInt());

        System.out.println("Ingresar partidos perdidos: ");
        e.setPPerdidos(sc.nextInt());

        System.out.println("Ingresar goles a favor: ");
        e.setGolsAFavor(sc.nextInt());

        System.out.println("Ingresar goles en contra: ");
        e.setGolsEnContra(sc.nextInt());

        System.out.println("Ingresar puntos: ");
        e.setPuntos(sc.nextInt());

    }

    public static void main( String[] args )
    {

        App app = new App();

        app.generarEquipo(app.equipo);

        System.out.println(app.equipo.toString());

    }
}
