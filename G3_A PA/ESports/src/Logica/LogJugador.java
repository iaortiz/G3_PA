/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Clases.Jugador;
import Clases.Registro;
import Data.ExpJugador;

/**
 *
 * @author Carlos Juca
 */
public class LogJugador {
    public Jugador CrearJugador (String nickname, String nivelClasificatoria, String posicion, int funcion, String cedula, String nombres, String apellidos, String contraseña){
        Jugador ObjJugador = new Jugador(nickname, nivelClasificatoria, posicion, funcion, cedula, nombres, apellidos, contraseña);
        return ObjJugador;
    }
    
    public void AgregarRegistro(Registro ObjRegistro, Jugador ObjJugador){
        ExpJugador ObjExpJugador = new ExpJugador();
        ObjJugador.registros.add(ObjRegistro);
        ObjExpJugador.Crear(ObjJugador);
    }

}
