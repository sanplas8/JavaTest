/*
 
 */
package Entidades;



/**
 *
 * @author toto_
 */
public class RevolverDeAgua {

    private int posicionActual;
    private int posicionAgua;

    public RevolverDeAgua() {
    }

    public RevolverDeAgua(int posicionActual, int posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }
    

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }
    
    public void llenarRevolver(){
        posicionActual = (int)(Math.random()*6)+1;
        posicionAgua = (int)(Math.random()*6)+1;
    }
    
    public boolean mojar(){
        if(posicionActual == posicionAgua){
            return true;
        }else{
            return false;
        }
    }
    
    public void siguienteChorro(){
        if(posicionActual == 6){
            posicionActual = 1;
        }else{
            posicionActual ++;
        }
    }

    @Override
    public String toString() {
        return "RevolverDeAgua: \n"+
                "Posicion actual del tambor = " + posicionActual + ", Posicion actual del agua= " + posicionAgua ;
    }
    
    

}
