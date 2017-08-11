/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_progra2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Franklin Garcia
 */
public class Lab4_progra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Jugador> lista = new ArrayList();
        
        String opcion = "";
        
        while (!opcion.equalsIgnoreCase("3")) {
                
            opcion = JOptionPane.showInputDialog("Opcion \n"
                    + "1-Crear,eliminar,listar-- jugador \n"
                    + "2-Jugar juego \n"
                    + "3-Salir \n");
           
            switch (opcion) {
                case "1": {
                    String op = "";
                    while (!op.equalsIgnoreCase("4")) {
                        op = JOptionPane.showInputDialog("Opcion \n"
                                + "1-Crear \n"
                                + "2-Eliminar \n"
                                + "3-Modificar");
                        switch (op) {
                            case "1": {
                                String nombre = JOptionPane.showInputDialog("Nombre");
                                String usuario = JOptionPane.showInputDialog("Usuario");
                                String nacimiento = JOptionPane.showInputDialog("Lugar de nacimiento");
                                int edad = Integer.parseInt(JOptionPane.showInputDialog("Edad"));
                                String age = JOptionPane.showInputDialog("sexo \n"
                                        + "1-F \n"
                                        + "2-M \n");
                                char sexo = ' ';
                                if (age.equals("1")) {
                                    sexo = 'F';
                                } else {
                                    sexo = 'M';
                                }
                                lista.add(new Jugador(nombre, usuario, 0, nacimiento, edad, sexo));
                                JOptionPane.showMessageDialog(null, "Hecho");
                            }
                            break;
                            case "2": {
                                String el = "";
                                for (Jugador i : lista) {
                                    el += "\n" + lista.indexOf(i) + " " + i;
                                }
                                int pos = Integer.parseInt(JOptionPane.showInputDialog(el + "\n"
                                        + "Ingrese pos a eliminar"));
                                lista.remove(pos);
                                JOptionPane.showMessageDialog(null, "Hecho");
                            }
                            break;
                            case "3": {
                                String el = "";
                                for (Jugador i : lista) {
                                    el += "\n" + lista.indexOf(i) + " " + i;
                                }
                                int pos = Integer.parseInt(JOptionPane.showInputDialog(el + "\n"
                                        + "Ingrese pos a modificar"));
                                String nombre = JOptionPane.showInputDialog("Nombre");
                                String usuario = JOptionPane.showInputDialog("Usuario");
                                String nacimiento = JOptionPane.showInputDialog("Lugar de nacimiento");
                                int edad = Integer.parseInt(JOptionPane.showInputDialog("Edad"));
                                String age = JOptionPane.showInputDialog("sexo \n"
                                        + "1-F \n"
                                        + "2-M \n");
                                char sexo = ' ';
                                if (age.equals("1")) {
                                    sexo = 'F';
                                } else {
                                    sexo = 'M';
                                }

                                lista.get(pos).setNombre(nombre);
                                lista.get(pos).setNacimiento(nacimiento);
                                lista.get(pos).setEdad(edad);
                                lista.get(pos).setUsuario(usuario);
                                lista.get(pos).setSexo(sexo); 
                                JOptionPane.showMessageDialog(null, "Hecho"); 
                            }
                            break;

                        }
                    }
                }
                break;
                case "2": {

                }
                break;

            }
        }
    }

}
