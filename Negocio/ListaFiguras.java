
package Negocio;

import java.util.ArrayList;

/**
 *
 * @author johanna.huaraca
 */
public class ListaFiguras {
    private ArrayList <Figura> listaFiguras;
    
    public ListaFiguras(){
      this.listaFiguras= new <Figura>ArrayList();
    }
    public void addFigura(Figura figura){
      listaFiguras.add(figura);
    }

    @Override
    public String toString() {
        String salida="";
        for(Figura aux:listaFiguras){
            
            salida+=aux.toString()+"\n---------------------------------------------\n";
        }
        return salida;
    }
    
}
