
package Negocio;

/**
 *
 * @author johanna.huaraca
 */
public class Cilindro extends Circulo{
    private int altura;

    public Cilindro(int altura, int radio, int x, int y) {
        super(radio, x, y);
        this.altura=altura;
    }
    
    public int getAltura(){
      return altura;
    }

    @Override
    public double getVolumen() {
       
        return Math.round((super.getArea()*getAltura())*100)/100d; 
    }

    @Override
    public double getPerímetro() {
        return super.getPerímetro(); 
    }

    @Override
    public double getArea() {
        
        return Math.round(((2*super.getArea())+(super.getPerímetro()*getAltura()))*100)/100d;
    }

    @Override
    public void Dibujar() {
         super.Dibujar(); 
          int d=altura;
    }

    @Override
    public int getRadio() {
        return super.getRadio(); 
    }
    
    @Override
    public String toString() {
        return super.toString()+"\nAltura: "+this.getAltura()
                +"\nVolumen: "+getVolumen();
    }
    
    
    
}
