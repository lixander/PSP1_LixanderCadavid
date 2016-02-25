/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.udea.edu.clases;

/**
 *
 * @author lixander.cadavid
 */
public class ListaSimpleCircularCabeza {

    Nodo primero; 
    Nodo ultimo; 
    ListaSimpleCircularCabeza otraLista;

    public ListaSimpleCircularCabeza(){
        primero = ultimo = new Nodo();
        primero.AsignaSiguiente(primero);
        
    }
	
    public Nodo primero(){
        
		return(primero.Retorne_Sig());
	}
    public Nodo ultimo(){
		return(ultimo);
	}
    public Nodo cabeza(){
		return(primero);
	}
    public boolean EsVacia(){
		 if(primero.Retorne_Sig() == primero){ 
                     return(true);
                 }
                 else{
                     return(false);
                 }
		         
	}	
    /**
     * El método LlenarLista llena una lista de tipo ListaSimpleCircularCabeza con los datos de un arreglo de String.
     * @param arregloDatos Es un arreglo de String que contiene los datos a ser procesados.
     * @return Retorna un booleano como falso en caso de error al llenar la lista, o verdadero si se llenó correctamente.
     */
    public boolean LlenarLista(String[] arregloDatos)
    {
        boolean completado = false;
        for(int i = 0; i < arregloDatos.length; i++)
        {
            Nodo nuevo = new Nodo(arregloDatos[i]);
            insertarFinal(nuevo);
        }
        Nodo x = primero();
        return completado;
    }        

/**
 * Este método inserta un nuevo nodo que es una estructura tipo Nodo al final de la lista que es de tipo ListaSimpleCircularCabeza.
 * @param nuevoNodo Es una variable de tipo Nodo que contiene una liga y un String.
 * @return Retorna un booleano como falso si no se insertó el nuevo nodo en la lista o verdadero en caso de ser insertado correctamente.
 */
    public boolean insertarFinal(Nodo nuevoNodo){
        Nodo x = primero();
        String nombre = nuevoNodo.retornaDato();
        boolean resp = false;
        
        if(EsVacia())
        {
                primero.AsignaSiguiente(nuevoNodo);
                nuevoNodo.AsignaSiguiente(primero);
                ultimo = nuevoNodo;
                resp = true;
        }
        
        else
        {
            while(x != cabeza())
            {
                if(x.retornaDato().equals(nombre))
                {
                    return false;
                }
                else
                {
                    x = x.Retorne_Sig();
                    resp = true;
                }
            }

            if(resp)
            {
                    ultimo.AsignaSiguiente(nuevoNodo);
                    nuevoNodo.AsignaSiguiente(primero);
                    ultimo = nuevoNodo;
            }

        }
        return resp;
    }
    /**
     * Este método retorna la cantidad de datos almacenados en la lista.
     * @return Retorna la cantidad de datos como tipo int.
     */
    public int cantidadDatos(){
        int cantidad = 0;
        Nodo x = primero();
        while(x != cabeza())
        {
            cantidad++;
            x = x.Retorne_Sig();
        }
        return cantidad;
    }

}

