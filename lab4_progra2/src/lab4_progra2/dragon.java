
package lab4_progra2;

public class dragon extends piezas{
 

    public dragon() {
        super();
    }

    public dragon(String color, String material) {
        super(color, material);
    }

    @Override
    public String toString() {
        return "F";
    }
    
    

    
    
 

    @Override
    public boolean movimientos(String[][] cad, int x1, int y1, int x2, int y2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
