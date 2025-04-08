package utn.LCIII;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Triangulo {

    private int lado1, lado2, lado3;

    public int calcPerimetro(){
        return lado1 + lado2 + lado3;
    }
}
