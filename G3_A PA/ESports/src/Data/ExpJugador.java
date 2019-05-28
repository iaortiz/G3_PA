/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Clases.Jugador;
import com.google.gson.Gson;
import java.io.*;//no olviden importar esta librería al inicio de su programa
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author Carlos Juca
 */
public class ExpJugador {

    //esto es solo un método, no una clase, el método deberá ser incluido en una clase java para su uso
    public void Crear(Jugador ObjJugador) {

        Gson gson = new Gson();
        String JSON = gson.toJson(ObjJugador);

        FileWriter fichero = null;
        PrintWriter pw = null;
        try {
            fichero = new FileWriter("data/Jugador.txt", true);
            pw = new PrintWriter(fichero);
            pw.println(JSON);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fichero) {
                    fichero.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public void ActualizarJugador(Jugador ObjJugador) {

        ImportJugador ObjImportJugador = new ImportJugador();
        ArrayList<Jugador> list_jugadores = ObjImportJugador.LeerJson();
        int indice = ObjImportJugador.Import_Indice(ObjJugador.getCedula());
        list_jugadores.set(indice, ObjJugador);
        File archivo = new File("data/Jugador.txt");
        archivo.delete();

        for (Jugador ObjJugadorAux : list_jugadores) {
            Crear(ObjJugadorAux);
        }

    }
}
