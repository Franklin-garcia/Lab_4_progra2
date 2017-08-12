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
    public void movimientos(String[][] cad, int x1, int y1, int x2, int y2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

}
