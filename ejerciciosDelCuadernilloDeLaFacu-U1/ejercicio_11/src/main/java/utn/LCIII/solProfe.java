package utn.LCIII;

import java.util.ArrayList;
import java.util.Scanner;

public class solProfe {

    Scanner sc = new Scanner(System.in);
    float tiempoGanador = 0f;
    ArrayList<Float> tiempoCorredores = new ArrayList<>();

    public void cargarTiempoGanador(){

        System.out.println("Ingrese el tiempo del ganador: ");
        tiempoGanador = sc.nextFloat();

    }

    public void cargarTiempoCorredores(){

        for (int i = 0; i < 9; i++) {
            System.out.print(i + " -> ");
            tiempoCorredores.add(sc.nextFloat());
        }

    }

    public boolean validarTiempos(float tiempoGanador, float tiempoCorredor){

        boolean valido = false;

        // 1.15 -> equivale a tiempo ganador  + (tiempoGanador * 0.15)
        if (tiempoCorredor <= (tiempoGanador * 1.15)){
            valido = true;
        }
        return valido;
    }

    public int totalDeParticipantes(){

        int cantParticipantes = 0;

        for (Float tiempos : tiempoCorredores) {
            if (validarTiempos(tiempoGanador, tiempos)){
                cantParticipantes++;
            }
        }

        return cantParticipantes;
    }

    public void mostrarTiempoCorredores(){
        System.out.println("Ganador: " + tiempoGanador);
        System.out.println("Corredores: " + tiempoCorredores);
    }

    public static void main(String[] args) {

        solProfe solProfe = new solProfe();
        solProfe.cargarTiempoGanador();
        solProfe.cargarTiempoCorredores();
        //solProfe.mostrarTiempoCorredores();

        System.out.println("La cantidad de corredores son: " + solProfe.totalDeParticipantes());

    }

}
