/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Clases.Jugador;
import Clases.Partida;
import Clases.Registro;
import Data.ExpJugador;

/**
 *
 * @author Carlos Juca
 */
public class LogPartida {
    
    public Partida CrearPartida(int muertes, int asistencias, int asesinatos, int farm){
        Partida ObjPartida = new Partida(muertes, asistencias, asesinatos, farm);
        return ObjPartida;
    }
    public void AgregarPartida(Partida ObjPartida, Jugador ObjJugador){
        ExpJugador ObjExpJugador = new ExpJugador();
        ObjJugador.registros.get(ObjJugador.registros.size()-1).partidas.add(ObjPartida);
        ObjExpJugador.ActualizarJugador(ObjJugador);
    }
    
}
