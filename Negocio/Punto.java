
package Negocio;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author johanna.huaraca
 */
public class Punto extends Figura{
int x,y;
    public Punto(int x, int y){
         this.x=x;
         this.y=y;}
    
    @Override
    public double getVolumen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public double getPerímetro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public double getArea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public String toString() {
        return "Punto: " + "(" + x + "," + y +")";
    }

    @Override
    public void Dibujar() {
        
    }

    

    

     
    
    
}
