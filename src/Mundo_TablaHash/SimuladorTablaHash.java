/**
 * ---------------------------------------------------------------------
 * $Id: SimuladorTablaHash.java,v 1.0 2013/08/23 
 * Universidad Francisco de Paula Santander 
 * Programa Ingenieria de Sistemas
 *
 * Proyecto: SEED_UFPS
 * ----------------------------------------------------------------------
 */

package Mundo_TablaHash;

import Colecciones_SEED.InformacionDeEntrada;
import Colecciones_SEED.ListaCD;
import Colecciones_SEED.TablaHash;
import colecciones_seed.copy.TablaHash_AB;

/**
 * Clase que conecta la capa de presentación del Simulador con las Estructuras de Datos.
 * @author Uriel Garcia - Yulieth Pabon
 * @version 1.0
 */
public class SimuladorTablaHash {
    
    private TablaHash_AB miTabla;
    
    public SimuladorTablaHash(){
    }
    
    public void crearTabla(){
        this.miTabla = new TablaHash_AB();        
    }
    
    public String impTabla(){
        String cad="";
        ListaCD v[] = this.miTabla.getInformacionEntrada();
        for(int i=0; i<v.length; i++){
            ListaCD l = v[i];
            if(l!=null || !l.esVacia()){
                for(Object obj: l){
                    cad+= ((InformacionDeEntrada)obj).getClave()+" | "+((InformacionDeEntrada)obj).getObjeto().toString()+",";
                }
            }
            else
                cad+="null";
            cad+="_";
        }
        return cad;
      
    }

    public int conocerCapacidad(){
        return (this.miTabla.getNumeroSlots());
    }

        public boolean insertar(int dato, String nombre) {
            if(this.miTabla.esta(dato))
                return (false);
            this.miTabla.insertar(dato, nombre);
            return (true);
        }
    
        public boolean esVacia(){
            return (this.miTabla.esVacia());
        }
    
        public boolean eliminar(int dato) {
            if(!this.miTabla.esta(dato))
                return (false);
            this.miTabla.eliminar(dato);
            return (true);
        }
    
        public int conocerTamanio() {
            return (this.miTabla.getNumeroDatos());
        }
    
        public boolean estaElemento(int dato) {
            return (this.miTabla.esta(dato));
        }

    public TablaHash getMiTabla() {
        return miTabla;
    }

    public void setMiTabla(TablaHash miTabla) {
        this.miTabla = miTabla;
    }

    
    public int getIndice(int dato){
        return (this.miTabla.index(dato));
    }
    
    
}
