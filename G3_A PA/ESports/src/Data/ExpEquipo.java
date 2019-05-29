/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Clases.Equipo;
import Clases.Jugador;
import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author Carlos Juca
 */
public class ExpEquipo {

    public void Crear(Equipo ObjEquipo) {

        Gson gson = new Gson();
        String JSON = gson.toJson(ObjEquipo);

        FileWriter fichero = null;
        PrintWriter pw = null;
        try {
            fichero = new FileWriter("data/Equipo.txt", true);
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
}
