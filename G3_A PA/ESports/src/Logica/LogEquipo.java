/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Clases.Equipo;
import Clases.Jugador;
import Clases.Partida;
import Clases.Registro;
import Data.ImportJugador;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author isral
 */
public class LogEquipo {

    ImportJugador ObjImportJugador = new ImportJugador();
    Jugador ObjJugador = new Jugador();
    
    
    public Equipo Crear(String nombre, ArrayList<Jugador> jugadores){
        Equipo ObjEquipo = new Equipo(nombre, jugadores);
        return ObjEquipo;
    }

    public ArrayList<Jugador> DefinirEquipo() {

        ArrayList<Jugador> listaJugador = ObjImportJugador.LeerJson();
        ArrayList<Jugador> listJugador = new ArrayList<>();
        ArrayList<Jugador> TOP = new ArrayList<>();
        ArrayList<Jugador> JG = new ArrayList<>();
        ArrayList<Jugador> MID = new ArrayList<>();
        ArrayList<Jugador> ADC = new ArrayList<>();
        ArrayList<Jugador> SUP = new ArrayList<>();

        for (Jugador ObjJugador : listaJugador) {
            if (ObjJugador.getPosicion().equals("Top")) {
                TOP.add(ObjJugador);
            } else if (ObjJugador.getPosicion().equals("Jungla")) {
                JG.add(ObjJugador);
            } else if (ObjJugador.getPosicion().equals("Mid")) {
                MID.add(ObjJugador);
            } else if (ObjJugador.getPosicion().equals("ADCarry")) {
                ADC.add(ObjJugador);
            } else {
                SUP.add(ObjJugador);
            }
        }

        for (Jugador ObjJugador : TOP) {
            double indKDA = 0;
            ObjImportJugador.Import_Jugador(ObjJugador.getCedula());
            ArrayList<Registro> list_Registro = ObjJugador.registros;
            for (Registro ObjRegistro : list_Registro) {
                ArrayList<Partida> list_Partida = ObjRegistro.partidas;
                for (Partida ObjPartida : list_Partida) {
                    indKDA += (ObjPartida.getAsesinatos() + ObjPartida.getAsistencias()) / ObjPartida.getMuertes();
                    ObjJugador.setIndKDA(Double.toString(indKDA));
                }
            }
        }
        for (Jugador ObjJugador : JG) {
            double indKDA = 0;
            ObjImportJugador.Import_Jugador(ObjJugador.getCedula());
            ArrayList<Registro> list_Registro = ObjJugador.registros;
            for (Registro ObjRegistro : list_Registro) {
                ArrayList<Partida> list_Partida = ObjRegistro.partidas;
                for (Partida ObjPartida : list_Partida) {
                    indKDA += (ObjPartida.getAsesinatos() + ObjPartida.getAsistencias()) / ObjPartida.getMuertes();
                    ObjJugador.setIndKDA(Double.toString(indKDA));;
                }
            }
        }
        for (Jugador ObjJugador : MID) {
            double indKDA = 0;
            ObjImportJugador.Import_Jugador(ObjJugador.getCedula());
            ArrayList<Registro> list_Registro = ObjJugador.registros;
            for (Registro ObjRegistro : list_Registro) {
                ArrayList<Partida> list_Partida = ObjRegistro.partidas;
                for (Partida ObjPartida : list_Partida) {
                    indKDA += (ObjPartida.getAsesinatos() + ObjPartida.getAsistencias()) / ObjPartida.getMuertes();
                    ObjJugador.setIndKDA(Double.toString(indKDA));
                }
            }
        }
        for (Jugador ObjJugador : ADC) {
            double indKDA = 0;
            ObjImportJugador.Import_Jugador(ObjJugador.getCedula());
            ArrayList<Registro> list_Registro = ObjJugador.registros;
            for (Registro ObjRegistro : list_Registro) {
                ArrayList<Partida> list_Partida = ObjRegistro.partidas;
                for (Partida ObjPartida : list_Partida) {
                    indKDA += (ObjPartida.getAsesinatos() + ObjPartida.getAsistencias()) / ObjPartida.getMuertes();
                    ObjJugador.setIndKDA(Double.toString(indKDA));
                }
            }
        }
        for (Jugador ObjJugador : SUP) {
            double indKDA = 0;
            ObjImportJugador.Import_Jugador(ObjJugador.getCedula());
            ArrayList<Registro> list_Registro = ObjJugador.registros;
            for (Registro ObjRegistro : list_Registro) {
                ArrayList<Partida> list_Partida = ObjRegistro.partidas;
                for (Partida ObjPartida : list_Partida) {
                    indKDA += (ObjPartida.getAsesinatos() + ObjPartida.getAsistencias()) / ObjPartida.getMuertes();
                    ObjJugador.setIndKDA(Double.toString(indKDA));
                }
            }
        }
        //////////////////////////////////////////////////////////////////////////////////////////////////
        ArrayList<Jugador> dataPorTop = new ArrayList<>(); //Lista que contendrá los valores ya ordenados
        dataPorTop.addAll(TOP); //Se agrega la información del ArrayList a la nueva lista
        Collections.sort(dataPorTop, //Se procede a ordenar por cantones
                (o1, o2) -> o1.indKDA.compareTo(o2.indKDA));
        listJugador.add(TOP.get(0));
        //////////////////////////////////////////////////////////////////////////////////////////////////
        ArrayList<Jugador> dataPorJg = new ArrayList<>(); //Lista que contendrá los valores ya ordenados
        dataPorJg.addAll(JG); //Se agrega la información del ArrayList a la nueva lista
        Collections.sort(dataPorJg, //Se procede a ordenar por cantones
                (o1, o2) -> o1.indKDA.compareTo(o2.indKDA));

        listJugador.add(JG.get(0));
        //////////////////////////////////////////////////////////////////////////////////////////////////
        ArrayList<Jugador> dataPorMid = new ArrayList<>(); //Lista que contendrá los valores ya ordenados
        dataPorMid.addAll(MID); //Se agrega la información del ArrayList a la nueva lista
        Collections.sort(dataPorMid, //Se procede a ordenar por cantones
                (o1, o2) -> o1.indKDA.compareTo(o2.indKDA));
        listJugador.add(MID.get(0));
        //////////////////////////////////////////////////////////////////////////////////////////////////
        ArrayList<Jugador> dataPorAdc = new ArrayList<>(); //Lista que contendrá los valores ya ordenados
        dataPorAdc.addAll(ADC); //Se agrega la información del ArrayList a la nueva lista
        Collections.sort(dataPorAdc, //Se procede a ordenar por cantones
                (o1, o2) -> o1.indKDA.compareTo(o2.indKDA));
        listJugador.add(ADC.get(0));
        //////////////////////////////////////////////////////////////////////////////////////////////////
        ArrayList<Jugador> dataPorSupp = new ArrayList<>(); //Lista que contendrá los valores ya ordenados
        dataPorSupp.addAll(SUP); //Se agrega la información del ArrayList a la nueva lista
        Collections.sort(dataPorSupp, //Se procede a ordenar por cantones
                (o1, o2) -> o1.indKDA.compareTo(o2.indKDA));
        listJugador.add(SUP.get(0));
        //////////////////////////////////////////////////////////////////////////////////////////////////        


        return listJugador;
    }
}
