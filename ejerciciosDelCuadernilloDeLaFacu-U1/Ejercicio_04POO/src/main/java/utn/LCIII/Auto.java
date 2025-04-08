package utn.LCIII;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Auto {

    private String marca;

    private int modelo;

    private double precio;

    private int kilometraje;

    public void antiguedadAuto(){
        int anio = LocalDateTime.now().getYear();
        int antiguedad = anio - modelo;
        System.out.println("La antiguedad del auto es: " + antiguedad + " años");
    }


}
