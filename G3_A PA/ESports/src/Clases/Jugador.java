package Clases;

import Clases.Miembro;
import java.util.*;

/**
 *
 */
public class Jugador extends Miembro {

    public String nickname;
    public String nivelClasificatoria;
    public String posicion;
    public int funcion;
    public boolean estado;
    public ArrayList<Registro> registros = new ArrayList<>();

    public Jugador() {
    }

    public Jugador(String nickname, String nivelClasificatoria, String posicion, int funcion, String cedula, String nombres, String apellidos, String contraseña) {
        super(cedula, nombres, apellidos, contraseña);
        this.nickname = nickname;
        this.nivelClasificatoria = nivelClasificatoria;
        this.posicion = posicion;
        this.funcion = funcion;
        this.estado = true;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNivelClasificatoria() {
        return nivelClasificatoria;
    }

    public void setNivelClasificatoria(String nivelClasificatoria) {
        this.nivelClasificatoria = nivelClasificatoria;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getFuncion() {
        return funcion;
    }

    public void setFuncion(int funcion) {
        this.funcion = funcion;
    }

    public String getCedula() {
        return cedula;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nickname=" + nickname + ", nivelClasificatoria=" + nivelClasificatoria + ", posicion=" + posicion + ", funcion=" + funcion + ", registros=" + registros + '}';
    }
    
    
}
