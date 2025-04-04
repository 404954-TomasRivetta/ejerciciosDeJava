package utn.LCIII;


import lombok.*;

//Para no tener que escribir todas las lineas de codigo
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Data
public class Persona {

    private String nombre;
    private String apellido;
    private int edad;

    public void validarEdad(){

        if(edad>18){
            System.out.println("Mayor de edad");
        }
    }

    @Override
    public String toString(){
        return "Persona{"+
                "Nombre: " + nombre +
                ", Apellido: " + apellido +
                ", Edad: " + edad;
    }


}
