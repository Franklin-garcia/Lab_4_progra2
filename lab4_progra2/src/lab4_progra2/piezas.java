
package lab4_progra2;

import java.awt.Color;

public abstract class  piezas{
    String  color;
    String material;

    public piezas() {
    }

    public piezas(String color, String material) {
        this.color = color;
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return color;
    }
    

    public abstract boolean movimientos(String[][] cad,int x1, int y1, int x2, int y2);
}
