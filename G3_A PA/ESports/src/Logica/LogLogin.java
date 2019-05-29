/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Clases.Jugador;
import Data.ImportJugador;
import interfaz.Login;
import interfaz.PantallaCoach;
import interfaz.PantallaJugador;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Juca
 */
public class LogLogin {

    public Jugador IngresarJugador(String user, String pass, Login login) {

        ImportJugador ObjImport = new ImportJugador();
        Jugador ObjJugador = ObjImport.Import_Jugador(user);

        if (user.equals(ObjJugador.getCedula()) && pass.equals(ObjJugador.getContraseña())) {
            login.dispose();
            JOptionPane.showMessageDialog(null, "Bienvenido\n"
                    + "Acceso Correcto", "",
                    JOptionPane.INFORMATION_MESSAGE);

            if (ObjJugador.getFuncion() == 1) {
                PantallaJugador ObjPantallaJ = new PantallaJugador(ObjJugador);
                ObjPantallaJ.setVisible(true);
                login.setVisible(false);

            } else {
                if (ObjJugador.getFuncion() == 2) {
                    PantallaCoach ObjPantallaC = new PantallaCoach();
                    ObjPantallaC.setVisible(true);
                    login.setVisible(false);
                }

            }

        } else {

            JOptionPane.showMessageDialog(null, "Por favor ingrese un usuario y/o contraseña correctos", "",
                    JOptionPane.ERROR_MESSAGE);
        }

        return ObjJugador;

    }

}
