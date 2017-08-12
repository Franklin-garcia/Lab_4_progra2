
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
         Lab4_progra2 llamar = new Lab4_progra2();
        String a[][];
        a = llamar.tablero();
        if (a[x1][y1]=="1C"){
        if (((x2 == (x1 + 1)) || ((x2==(x1-1)))) && ((y2 == (y1 + 1)) || ((y2==(y1-1)))) ) {
            
        }
        }
    }
    
    
    
}
