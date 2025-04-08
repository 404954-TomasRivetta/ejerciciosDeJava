package utn.LCIII;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Partido {

    private Equipo local;

    private Equipo visitante;

    private int golesLocal;

    private int golesVisitante;


}
