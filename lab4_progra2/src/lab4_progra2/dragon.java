
package lab4_progra2;

public class dragon extends piezas{
    String F1Negro;
    String F2Negro;
    String F3Negro;
    String F1Blanco;
    String F2Blanco;
    String F3Blanco;

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
    public void movimientos(int x1, int y1, int x2, int y2) {
    }
    
    
}
