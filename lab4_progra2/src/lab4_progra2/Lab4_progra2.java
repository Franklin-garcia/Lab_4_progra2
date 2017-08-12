/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_progra2;

import java.util.ArrayList;
import java.util.Scanner;
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
        Scanner lectura = new Scanner(System.in);
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
                                + "3-Modificar \n"
                                + "4-salir");
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
                    int x1 = 0, y1 = 0, x2 = 0, y2 = 0;
                    String el = "";
                    for (Jugador i : lista) {
                        el += "\n" + lista.indexOf(i) + " " + i;
                    }
                    int player1 = Integer.parseInt(JOptionPane.showInputDialog(el + "\n"
                            + "Ingrese player 1"));
                    int player2 = Integer.parseInt(JOptionPane.showInputDialog(el + "\n"
                            + "Ingrese player 2"));

                    String[][] tableroA = new String[11][11];
                    tableroA = tablero();
                    impTablero(tableroA);
///del juego
                    System.out.println("jugador1" + lista.get(player1).getUsuario());
                    System.out.println("jugador2" + lista.get(player2).getUsuario());
                    int cont = 0;
                    int res = 0;

                    while (res < 1000000) {
                        if (res == 0) {
                            if (cont == 0) {
                                System.out.println("Turno \n"
                                        + "Jugador 1");
                                System.out.println("Ingrese x");
                                x1 = lectura.nextInt();
                                System.out.println("Ingrese y");
                                y1 = lectura.nextInt();
                                System.out.println("Ingrese x1");
                                x2 = lectura.nextInt();
                                System.out.println("Ingrese y2");
                                y2 = lectura.nextInt();
                                String vacio = "[ ]";
                                for (int i = 0; i < tableroA.length - 1; i++) {
                                    for (int j = 0; j < tableroA[i].length - 1; j++) {
                                        if (tableroA[x1][y1] == tableroA[i][j]) {
                                            tableroA[x2][y2] = tableroA[x1][y1];
                                            tableroA[x1][y1] = vacio;
                                        }

                                    }
                                }
                                impTablero(tableroA);

                                ///fin del juego
                            }
                            cont++;

                            if (cont == 1) {
                                System.out.println("Turno2 \n"
                                        + "Jugador2");
                                System.out.println("Ingrese x");
                                x1 = lectura.nextInt();
                                System.out.println("Ingrese y");
                                y1 = lectura.nextInt();
                                System.out.println("Ingrese x1");
                                x2 = lectura.nextInt();
                                System.out.println("Ingrese y2");
                                y2 = lectura.nextInt();
                                String vacio = "[ ]";
                                for (int i = 0; i < tableroA.length - 1; i++) {
                                    for (int j = 0; j < tableroA[i].length - 1; j++) {
                                        if (tableroA[x1][y1] == tableroA[i][j]) {
                                            tableroA[x2][y2] = tableroA[x1][y1];
                                            tableroA[i][j] = vacio;
                                        }
                                    }
                                }
                                impTablero(tableroA);

                                ///fin del juego
                                cont = 0;
                            }
                        }
                        else if(res>0){
                        if (cont == 0) {
                            System.out.println("Turno \n"
                                    + "Jugador 1");
                            System.out.println("Ingrese x");
                            x1 = lectura.nextInt();
                            System.out.println("Ingrese y");
                            y1 = lectura.nextInt();
                            System.out.println("Ingrese x1");
                            x2 = lectura.nextInt();
                            System.out.println("Ingrese y2");
                            y2 = lectura.nextInt();
                            String vacio = "[  ]";
                            for (int i = 0; i < tableroA.length - 1; i++) {
                                for (int j = 0; j < tableroA[i].length - 1; j++) {
                                    if (tableroA[x1][y1] == tableroA[i][j]) {
                                        tableroA[x2][y2] = tableroA[x1][y1];
                                        tableroA[i][j] = vacio;
                                    }

                                }
                            }
                            impTablero(tableroA);

                            ///fin del juego
                        }
                        cont++;

                        if (cont == 1) {
                            System.out.println("Turno2 \n"
                                    + "Jugador2");
                            System.out.println("Ingrese x");
                            x1 = lectura.nextInt();
                            System.out.println("Ingrese y");
                            y1 = lectura.nextInt();
                            System.out.println("Ingrese x1");
                            x2 = lectura.nextInt();
                            System.out.println("Ingrese y2");
                            y2 = lectura.nextInt();
                            String vacio = "[  ]";
                            for (int i = 0; i < tableroA.length - 1; i++) {
                                for (int j = 0; j < tableroA[i].length - 1; j++) {
                                    if (tableroA[x1][y1] == tableroA[i][j]) {
                                        tableroA[x2][y2] = tableroA[x1][y1];
                                        tableroA[x1][y1] = vacio;
                                    }
                                }
                            }
                            impTablero(tableroA);

                            ///fin del juego
                            cont = 0;
                        }
                        }
                        res++;
                    }//fin del while
                }//caso 2
                break;

            }
        }
    }//main fin

    public static String[][] tablero() {
        caballero c = new caballero();
        duendes d = new duendes();
        mago m = new mago();
        dragon dr = new dragon();
        rey r = new rey();
        arquero a = new arquero();
        String temporal[][] = new String[11][11];
        for (int i = 0; i < temporal.length - 1; i++) {
            for (int j = 0; j < temporal.length - 1; j++) {
                temporal[i][j] = "[  ]";
            }

        }
        for (int i = 0; i < temporal.length - 1; i++) {
            for (int j = 0; j < temporal.length; j++) {
                temporal[0][0] = "[1" + c.toString() + "]";
                temporal[0][2] = "[1" + dr.toString() + "]";
                temporal[0][3] = "[1" + a.toString() + "]";
                temporal[0][4] = "[1" + r.toString() + "]";
                temporal[0][5] = "[1" + m.toString() + "]";
                temporal[0][6] = "[1" + a.toString() + "]";
                temporal[0][7] = "[1" + dr.toString() + "]";
                temporal[0][9] = "[1" + c.toString() + "]";

                temporal[1][0] = "[1" + c.toString() + "]";
                temporal[1][2] = "[1" + a.toString() + "]";
                temporal[1][3] = "[1" + d.toString() + "]";
                temporal[1][4] = "[1" + c.toString() + "]";
                temporal[1][5] = "[1" + dr.toString() + "]";
                temporal[1][6] = "[1" + d.toString() + "]";
                temporal[1][7] = "[1" + a.toString() + "]";
                temporal[1][9] = "[1" + d.toString() + "]";

                temporal[8][0] = "[2" + c.toString() + "]";
                temporal[8][2] = "[2" + dr.toString() + "]";
                temporal[8][3] = "[2" + a.toString() + "]";
                temporal[8][4] = "[2" + r.toString() + "]";
                temporal[8][5] = "[2" + m.toString() + "]";
                temporal[8][6] = "[2" + a.toString() + "]";
                temporal[8][7] = "[2" + dr.toString() + "]";
                temporal[8][9] = "[2" + c.toString() + "]";

                temporal[9][0] = "[2" + c.toString() + "]";
                temporal[9][2] = "[2" + a.toString() + "]";
                temporal[9][3] = "[2" + d.toString() + "]";
                temporal[9][4] = "[2" + c.toString() + "]";
                temporal[9][5] = "[2" + dr.toString() + "]";
                temporal[9][6] = "[2" + d.toString() + "]";
                temporal[9][7] = "[2" + a.toString() + "]";
                temporal[9][9] = "[2" + d.toString() + "]";

            }

        }
        return temporal;
    }

    public static void impTablero(String[][] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a[i].length - 1; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println("");
        }
    }

}//fin de la clase
