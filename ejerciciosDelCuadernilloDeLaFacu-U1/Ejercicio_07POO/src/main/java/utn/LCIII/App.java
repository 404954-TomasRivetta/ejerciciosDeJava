package utn.LCIII;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    Scanner sc = new Scanner(System.in);

    Triangulo t = new Triangulo();

    public void generarTriangulo(Triangulo t){

        System.out.println("Ingrese el lado 1: ");
        t.setLado1(sc.nextInt());

        System.out.println("Ingrese el lado 2: ");
        t.setLado2(sc.nextInt());

        System.out.println("Ingrese el lado 3: ");
        t.setLado2(sc.nextInt());

    }

    public void perimetro(Triangulo t){
        int perimetro = t.calcPerimetro();

        if (perimetro > 10){
            System.out.println("El perimetro es mayor que 10");
        }
        else{
            System.out.println("El perimetro es menor que 10");
        }
    }

    public static void main( String[] args )
    {
        App app = new App();

        app.generarTriangulo(app.t);

        app.perimetro(app.t);
    }
}
