/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.udea.edu.clases;
import java.text.DecimalFormat;
/**
 *
 * @author lixander.cadavid
 */
public class Operaciones {
    
    /**
     * El método lee la lista listaDatos, invoca al método calcularPromedio con parámetro listaDatos e imprime el promedio con el formato decimal "0.00".
     * @param listaDatos Es el listado de los datos que van a ser procesados, se almacena en una estructura de tipo ListaSimpleCircularCabeza.
     * @return Este método retorna el promedio como una estructura String.
     */
    public String calcularPromedioDosDecimales(ListaSimpleCircularCabeza listaDatos)
    {
        String prom;
        DecimalFormat df = new DecimalFormat("0.00");
        Double promedio = calcularPromedio(listaDatos);
        prom = df.format(promedio);
        return prom;
    }
    
    /**
     * El método lee los datos de la lista listaDatos y calcula el promedio de los datos.
     * @param listaDatos Es el listado de los datos que van a ser procesados, se almacena en una estructura de tipo ListaSimpleCircularCabeza.
     * @return Este método retorna el promedio de los datos de la lista en una estructura Double.
     */
    public Double calcularPromedio(ListaSimpleCircularCabeza listaDatos)
    {
        Double promedio, acumulador = 0.0;
        Integer cantidadDatos = listaDatos.cantidadDatos();
        
        
        Nodo x = listaDatos.primero();
        while(x != listaDatos.cabeza())
        {
            acumulador = acumulador + Double.parseDouble(x.retornaDato());
            x = x.Retorne_Sig();
        }
        promedio = acumulador / cantidadDatos;
        
        return promedio;        
    }
    /**
     * El método calcularDesviacionEstandar lee los datos de la listaDatos para calcular la desviación estándar de estos.
     * @param listaDatos Es el listado de los datos que van a ser procesados, éste parámetro se representa con una estructura ListaSimpleCircularCabeza.
     * @return Este método retorna la desviación estándar de los datos ingresados representada en una estructura String.
     * @see Math Este método utiliza las funciones pow() y sqrt() de la librería Math de Java.
     */
    public String calcularDesviacionEstandar(ListaSimpleCircularCabeza listaDatos)
    {
        Double desviacionEstandar, acumuladorDivididoCantidad;
        String respuesta;
        Double promedio = calcularPromedio(listaDatos);
        DecimalFormat df = new DecimalFormat("0.00");
        Double acumulador = 0.0;
        Integer cantidadDatos = listaDatos.cantidadDatos();
        Nodo x = listaDatos.primero();
        while(x != listaDatos.cabeza())
        {
            acumulador = acumulador + Math.pow((Double.parseDouble(x.retornaDato()) - promedio),2);
            x = x.Retorne_Sig();
        }
        acumuladorDivididoCantidad = acumulador/(cantidadDatos-1);
        desviacionEstandar = Math.sqrt(acumuladorDivididoCantidad);
        respuesta = df.format(desviacionEstandar);
        return respuesta;
    }
}
