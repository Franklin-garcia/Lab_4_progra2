package lab4_progra2;

public class rey extends piezas{

    String RNegro;
    String RBlanco;

    public rey() {
        super();
    }

    public rey(String color, String material) {
        super(color, material);
    }

    @Override
    public String toString() {
        return "R";
    }
    
    @Override
    public void movimientos(int x1, int y1, int x2, int y2) {
        
    }
    

}
