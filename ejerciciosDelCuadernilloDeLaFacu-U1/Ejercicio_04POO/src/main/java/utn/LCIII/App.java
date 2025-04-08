package utn.LCIII;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{

    Scanner sc = new Scanner(System.in);

    Auto auto = new Auto();

    public void generarAuto(Auto auto){

        System.out.println("Ingrese la marca: ");
        auto.setMarca(sc.next());

        System.out.println("Ingrese el año del auto: ");
        auto.setModelo(sc.nextInt());

        System.out.println("Ingrese el precio del auto: ");
        auto.setPrecio(sc.nextDouble());

        System.out.println("Ingrese el kilometraje del auto: ");
        auto.setKilometraje(sc.nextInt());
    }

    public static void main( String[] args )
    {

        App app = new App();
        app.generarAuto(app.auto);

        app.auto.antiguedadAuto();

    }
}
