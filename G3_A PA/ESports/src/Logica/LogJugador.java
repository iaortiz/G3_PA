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
public class LogJugador {

    public Jugador CrearJugador(String nickname, String nivelClasificatoria, String posicion, int funcion, String cedula, String nombres, String apellidos, String contraseña) {
        Jugador ObjJugador = new Jugador(nickname, nivelClasificatoria, posicion, funcion, cedula, nombres, apellidos, contraseña);
        return ObjJugador;
    }

    public Jugador actualizarContraseña(Jugador ObjJugador, String nuevaContraseña) {
        ObjJugador.setContraseña(nuevaContraseña);
        return ObjJugador;
    }
    public Jugador eliminarJugador(Jugador ObjJugador){
        ObjJugador.setEstado(false);
        return ObjJugador;
    }

    public void actualizarJugador(Jugador ObjJugador) {
        ExpJugador ObjExpJugador = new ExpJugador();
        ObjExpJugador.ActualizarJugador(ObjJugador);
    }

}
