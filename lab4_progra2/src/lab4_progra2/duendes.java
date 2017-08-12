package lab4_progra2;

public class duendes extends piezas {

    public duendes() {
        super();
    }

    public duendes(String color, String material) {
        super(color, material);
    }

    @Override
    public String toString() {
        return "R";
    }

    public boolean movimientos(String[][] cad, int x, int y, int x2, int y2) {
       boolean mueve=true;
        for (int i = 0; i < cad.length; i++) {
            for (int j = 0; j < cad.length; j++) {
                if ((i == x2 && j == y2) && (i >= 0 && j >= 0 || i < cad.length - 1 && j < cad[0].length - 1)) {
                  mueve =true;
                }else{
                  mueve= false;
                }

            }
        }
        return mueve;
    }

    
}
