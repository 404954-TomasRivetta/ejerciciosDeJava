package utn.LCIII;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{

    Scanner sc = new Scanner(System.in);

    Persona persona = new Persona();

    public void generarPersona(Persona p){

        System.out.println("Ingrese el nombre del persona: ");
        p.setNombre(sc.nextLine());

        System.out.println("Ingrese el apellido del persona: ");
        p.setApellido(sc.nextLine());

        System.out.println("Ingrese el edad del persona: ");
        p.setEdad(sc.nextInt());

        System.out.println("Ingrese el peso de la persona: ");
        p.setPeso(sc.nextDouble());

        System.out.println("Ingrese la altura de la persona: ");
        p.setAltura(sc.nextDouble());

    }

    public void calcularIMC(Persona p){
        p.calcularIMC();
    }

    public static void main( String[] args )
    {
        System.out.println("Ejercicio 03");
        System.out.println("-------------");

        App app = new App();

        app.generarPersona(app.persona);

        app.calcularIMC(app.persona);
    }
}
