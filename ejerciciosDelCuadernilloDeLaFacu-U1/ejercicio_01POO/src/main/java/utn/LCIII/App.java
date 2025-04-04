package utn.LCIII;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{

    Scanner sc = new Scanner(System.in);

    Persona p1 = new Persona("Jose","Perez",20);
    Persona p2 = new Persona();

    public void cargarPersona(Persona p){
        System.out.println("Ingrese el nombre del persona: ");
        p.setNombre(sc.nextLine());

        System.out.println("Ingrese el apellido del persona: ");
        p.setApellido(sc.nextLine());

        System.out.println("Ingrese el edad del persona: ");
        p.setEdad(sc.nextInt());
    }

    public static void main( String[] args )
    {

        App app = new App();
        System.out.println("Mostrar datos personales de persona 1");

        System.out.println(app.p1.toString());

        app.cargarPersona(app.p2);
        System.out.println("Mostrar datos personales de persona 2");
        System.out.println(app.p2.toString());
    }
}
