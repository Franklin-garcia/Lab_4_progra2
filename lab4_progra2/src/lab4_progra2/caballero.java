
package lab4_progra2;

public class caballero extends piezas{

    int x;
    int y;
    public caballero() {
        super();
    }

    public caballero(String color, String material) {
        super(color, material);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "C";
    }

    @Override
    public void movimientos(String[][] cad, int x1, int y1, int x2, int y2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
