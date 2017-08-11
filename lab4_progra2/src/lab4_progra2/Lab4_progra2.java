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
                    String el = "";
                    for (Jugador i : lista) {
                        el += "\n" + lista.indexOf(i) + " " + i;
                    }
                    int player1 = Integer.parseInt(JOptionPane.showInputDialog(el + "\n"
                            + "Ingrese player 1"));
                    int player2 = Integer.parseInt(JOptionPane.showInputDialog(el + "\n"
                            + "Ingrese player 2"));
                    
                    String[][] tableroA = new String[10][10];
                    tableroA=tablero();
                    impTablero(tableroA);
                    
                    
                    
                    
///del juego
                    int cont = 0;
                    String res = "s";
                    while (res.equals("1")) {
                        if (cont == 0) {

                            cont++;
                        } else if (cont == 1) {

                            cont = 0;
                        }
                        res = JOptionPane.showInputDialog("Opcion \n"
                                + "1-Si \n"
                                + "2-No \n");
                    }//fin del while
                }
                break;

            }
        }
    }//main fin
    
    public static String [][]tablero(){
        caballero c=new caballero();
       String temporal[][]=new String[10][10];
        for (int i = 0; i < temporal.length-1; i++) {
            for (int j = 0; j < temporal.length; j++) {
                 temporal[i][j]=c.toString();
                 
            }
        }
        return temporal;
    }
    
    public static void impTablero(String [][]a){
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a[i].length-1; j++) {
                System.out.println(a[i][j]);
            }
            System.out.println("");
        }
    }
    
    

}//fin de la clase
