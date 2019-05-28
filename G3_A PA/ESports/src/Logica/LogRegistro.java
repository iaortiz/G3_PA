/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Clases.Jugador;
import Clases.Registro;
import Data.ExpJugador;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Juca
 */
public class LogRegistro {

    public Registro crearRegistro(Date fecha) {
        Registro ObjAsistencia = new Registro(fecha);
        return ObjAsistencia;
    }

    public void AgregarRegistro(Registro ObjRegistro, Jugador ObjJugador) {
        ExpJugador ObjExpJugador = new ExpJugador();
        ObjJugador.registros.add(ObjRegistro);
        ObjExpJugador.ActualizarJugador(ObjJugador);
    }

    public boolean validarFecha(Jugador ObjJugador, Date fecha) {
        SimpleDateFormat objSDF = new SimpleDateFormat("dd / MMM / yyyy");

        if (ObjJugador.registros.size() > 0) {
            Registro ObjRegistroAux = ObjJugador.registros.get(ObjJugador.registros.size() - 1);
            String lastDate = objSDF.format(ObjRegistroAux.fecha);
            if (lastDate.equals(objSDF.format(fecha))) {
                return true;
            }
        }
        return false;
    }
}
