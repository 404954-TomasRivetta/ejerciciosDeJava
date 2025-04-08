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
    private double peso;
    private double altura;

    public void validarEdad(){
        if(edad>18){
            System.out.println("Mayor de edad");
        }
    }

    public void calcularIMC(){
        double imc = peso/altura;
        System.out.println("Indice de masa corporal: " + imc);
    }

    @Override
    public String toString(){
        return "Persona{"+
                "Nombre: " + nombre +
                ", Apellido: " + apellido +
                ", Edad: " + edad;
    }


}
