/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_progra2;

/**
 *
 * @author Franklin Garcia
 */
public class Jugador {
    private String nombre;
    private String usuario; 
    private int puntos; 
    private String nacimiento; 
    private int edad;
    private char sexo;

    public Jugador() {
    }

    public Jugador(String nombre, String usuario, int puntos, String nacimiento, int edad, char sexo) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.puntos = puntos;
        this.nacimiento = nacimiento;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return usuario;
    }
    
    
}
