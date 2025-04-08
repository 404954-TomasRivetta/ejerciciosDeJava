package utn.LCIII;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Equipo {

    private String nombreEquipo;

    private int puntos;

    private int pGanados;

    private int pEmpatados;

    private int pPerdidos;

    private int golsAFavor;

    private int golsEnContra;

    private int posicion;

    @Override
    public String toString() {
        return (
                "Nombre del equipo: " + nombreEquipo +
                        " Posicion: " + posicion +
                        " Partidos ganados: " + pGanados +
                        " Partidos empatados: " + pEmpatados +
                        " Partidos perdidos: " + pPerdidos +
                        " Goles a favor: " + golsAFavor +
                        " Goles en contra : " + golsEnContra +
                        " Puntos: " + puntos
                );
    };
}
