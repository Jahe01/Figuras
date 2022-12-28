
package Negocio;

import static com.sun.glass.ui.Cursor.setVisible;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author johanna.huaraca
 */
public class Circulo extends Punto {
    private int radio;

    @Override
    public String toString() {
       return super.toString()+"\nRadio: "+this.getRadio()+"\nArea: "+ this.getArea()+"\nPerímetro: "+this.getPerímetro()+
               "\n ";}
    
    public int getRadio(){
     return radio;
    }
    @Override
    public double getArea() {
        return Math.round((Math.PI* Math.pow(radio,2))*100)/100d; 
    }

    @Override
    public double getPerímetro() { 
        return Math.round((Math.PI*2*getRadio())*100)/100d; }

    @Override
    public double getVolumen() {
        return super.getVolumen(); }

    @Override
    public void Dibujar() {
        super.Dibujar(); 
        int d=radio+radio;}
   
    public Circulo(int radio, int x,int y) {
        super(x, y);
        this.radio=radio;
    }
     
}
