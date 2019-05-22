package Clases;

import java.util.*;

/**
 *
 */
public class Registro {

    public Date fecha;
    public ArrayList<Partida> partidas= new ArrayList<>();

    public Registro() {
    }

    public Registro(Date fecha) {
        this.fecha = fecha;
    }

}
