package utn.LCIII;

import java.util.Scanner;

public class SolProfe {

    Scanner sc = new Scanner(System.in);

    int cantAutos = 0;
    int cantAutosPocoUso = 0;

    int cantAutosNoMuyAntiguos = 0;

    int cantDeAniosDeNoMuyAntiguos = 0;

    public boolean validarNumero(int num){
        boolean esValido = false;
        if (num > 0){
            esValido = true;
        }
        return esValido;
    }

    public void categorizar(int antiguedad){

        if(validarNumero(antiguedad)){
            cantAutos++;

            if (antiguedad >= 1 && antiguedad <= 5){
                System.out.println("NUEVO");
                cantAutosNoMuyAntiguos++;
                cantDeAniosDeNoMuyAntiguos += antiguedad;
            } else if (antiguedad >= 6 && antiguedad <= 10) {
                System.out.println("POCO USO");
                cantAutosPocoUso++;
                cantAutosNoMuyAntiguos++;
                cantDeAniosDeNoMuyAntiguos += antiguedad;

            } else if (antiguedad >= 11 && antiguedad <= 20) {
                System.out.println("MUCHO USO");
                cantAutosNoMuyAntiguos++;
                cantDeAniosDeNoMuyAntiguos += antiguedad;
            } else if (antiguedad > 20) {
                System.out.println("MUY ANTIGUO");
            }
        }
        else if(antiguedad != 0){
            System.out.println("NO INGRESE ANTIGUEDAD NEGATIVA Y 0(CERO)");
        }
    }

    public double calcularPromedio(int cantDeAniosDeNoMuyAntiguos, int cantAutosNoMuyAntiguos){
        return cantDeAniosDeNoMuyAntiguos / cantAutosNoMuyAntiguos;
    }

    public void mostrarResultados(){
        System.out.println("Cant total de autos: " + cantAutos);

        System.out.println("Cant de autos con poco uso: " + cantAutosPocoUso);

        System.out.println("Promedio de antigüedad de los autos que no sean muy antiguos: " + calcularPromedio(cantDeAniosDeNoMuyAntiguos,cantAutosNoMuyAntiguos));
    }


    public void mostrarFinDelPrograma(){
        System.out.println("--- FIN DEL PROGRAMA ---");
    }

    public void init(){
        int antiguedad;
        do {
            System.out.println("Ingrese la antiguedad del auto: ");
            antiguedad = sc.nextInt();
            categorizar(antiguedad);
        }while (antiguedad != 0);
    }

    public static void main(String[] args) {

        SolProfe solProfe = new SolProfe();

        solProfe.init();

        solProfe.mostrarResultados();

        solProfe.mostrarFinDelPrograma();

    }

}
