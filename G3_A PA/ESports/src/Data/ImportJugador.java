/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Clases.Jugador;
import com.google.gson.Gson;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author Carlos Juca
 */
public class ImportJugador {

    private Scanner entrada;

    public ArrayList<Jugador> LeerJson() {

        ArrayList<Jugador> lista = new ArrayList<>();

        try {
            entrada = new Scanner(new File("data/Jugador.txt"));
            while (entrada.hasNext()) {
                // se crea el objeto para leer Json
                Gson g = new Gson();
                String linea = entrada.nextLine();
                // se hace el proceso de transformaciÃ³n
                Jugador ObjJugador = g.fromJson(linea, Jugador.class);
                lista.add(ObjJugador);

            }
            if (entrada != null) {
                entrada.close(); // cierra el archivo
            }

        } // fin de try
        catch (NoSuchElementException elementException) {
            System.err.println("El archivo no esta bien formado.");
            entrada.close();
            System.exit(1);
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error al abrir el archivo.");
            System.exit(1);
        } catch (IllegalStateException stateException) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        }
        return lista;
    }

    public Jugador Import_Jugador(String user) {

        ImportJugador ObjImportar = new ImportJugador();
        ArrayList<Jugador> list_Jugador = LeerJson();

        Jugador ObjJugador = new Jugador();

        for (Jugador ObjJugadorAux : list_Jugador) {
            if (user.equals(ObjJugadorAux.getCedula())) {
                ObjJugador = ObjJugadorAux;
                return ObjJugador;
            }
        }
        for (Jugador ObjJugadorAux : list_Jugador) {
            System.out.println(ObjJugador.toString());
        }
        return ObjJugador;
    }

    public int Import_Indice(String user) {

        ImportJugador ObjImportar = new ImportJugador();
        ArrayList<Jugador> list_Jugador = LeerJson();
        int indice = -1;
        for (int i = 0; i < list_Jugador.size(); i++) {
            if (user.equals(list_Jugador.get(i).getCedula())) {
                indice = i;
            }
        }
        return indice;
    }
}
