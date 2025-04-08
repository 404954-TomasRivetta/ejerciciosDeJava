package utn.LCIII;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    Scanner sc = new Scanner(System.in);

    Partido partido = new Partido();

    Equipo local = new Equipo();

    Equipo visitante = new Equipo();

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

    public void generarPartido(Partido p, Equipo l, Equipo v){

        p.setLocal(l);
        p.setVisitante(v);
        System.out.println("Ingrese los goles convertidos por el equipo: " + p.getLocal().getNombreEquipo());
        p.setGolesLocal(sc.nextInt());
        System.out.println("Ingrese los goles convertidos por el equipo: " + p.getVisitante().getNombreEquipo());
        p.setGolesVisitante(sc.nextInt());

    }

    public void ganadorDelPartido(Partido p){
        if (p.getGolesLocal() > p.getGolesVisitante()){
            System.out.println("El ganador es el equipo local: " + p.getLocal().getNombreEquipo());
        }else if (p.getGolesVisitante() > p.getGolesLocal()){
            System.out.println("El ganador es el equipo visitante: " + p.getVisitante().getNombreEquipo());
        }
        else {
            System.out.println("Empate");
        }
    }

    public static void main( String[] args )
    {
        App app = new App();

        app.generarEquipo(app.local);
        app.generarEquipo(app.visitante);
        app.generarPartido(app.partido, app.local, app.visitante);

        System.out.println();
        System.out.println("---PARTIDO---");
        app.ganadorDelPartido(app.partido);
    }
}
