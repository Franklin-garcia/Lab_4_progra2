/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_progra2;

/**
 *
 * @author Ronaldo
 */
public class arquero extends piezas{

    public arquero() {
        super();
    }

    public arquero(String color, String material) {
        super(color, material);
    }

    @Override
    public String toString() {
        return "A";
    }
    
   

    @Override
    public void movimientos(int x1, int y1, int x2, int y2) {
    }
    
}
