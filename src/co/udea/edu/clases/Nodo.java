package co.udea.edu.clases;

/**
 *
 * @author Lixander.cadavid
 */

public class Nodo {
    

    private Nodo sig;
    private String nombre = new String();
    
    Nodo()
    {
        sig = null;
    }
    
    Nodo(String n)
    {
        nombre = n;
        sig = null;
    }
     
     public void asignaDato(String n){
         
     	 nombre = n;
     }
     
     public String retornaDato()
     {
         return nombre;
     }
     
     public void AsignaSiguiente(Nodo x){
         
     	 sig = x;
     }	
     
     Nodo Retorne_Sig(){
     	 return sig;
     }
}

