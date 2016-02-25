/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import co.udea.edu.clases.Archivo;
import co.udea.edu.clases.ListaSimpleCircularCabeza;
import co.udea.edu.clases.Operaciones;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;

/**
 *
 * @author lixander.cadavid
 */
public class Test {
    private Archivo a = new Archivo();
    public Test() {
        
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
       
        
    }
    
    @After
    public void tearDown() {
    }
    
    @org.junit.Test
    public void rutaEncontrada()
    {
        String ruta;
        assertEquals("C:\\Users\\lixander.cadavid\\Documents\\NetBeansProjects\\PSP1_Lixander_Felipe_Cadavid_Betancur\\numerosPSP1.txt", ruta = a.obtenerRuta());
    }
    
    @org.junit.Test
    public void rutaNoEncontrada()
    {
        String ruta = "";
        assertTrue(!a.comprobarArchivo(ruta));
    }
    @org.junit.Test
    public void mediaCorrecta1()
    {
        Archivo a = new Archivo();
        String []datosVector;
        String lectura;
        String desviacion, promedio;
        lectura = a.realizarCalculos("C:\\Users\\lixander.cadavid\\Documents\\NetBeansProjects\\PSP1_Lixander_Felipe_Cadavid_Betancur\\numerosPSP1.txt");
        datosVector = lectura.split(",");
        Operaciones objetoOperaciones = new Operaciones();
        ListaSimpleCircularCabeza listaDatos = new ListaSimpleCircularCabeza();
        listaDatos.LlenarLista(datosVector);
        promedio = objetoOperaciones.calcularPromedioDosDecimales(listaDatos);
        assertEquals("60,32", promedio.replace('.', ','));
    }
    @org.junit.Test
    public void desviacionCorrecta1()
    {
        Archivo a = new Archivo();
        String []datosVector;
        String lectura;
        String desviacionEstandar;
        lectura = a.realizarCalculos("C:\\Users\\lixander.cadavid\\Documents\\NetBeansProjects\\PSP1_Lixander_Felipe_Cadavid_Betancur\\numerosPSP1.txt");
        datosVector = lectura.split(",");
        Operaciones objetoOperaciones = new Operaciones();
        ListaSimpleCircularCabeza listaDatos = new ListaSimpleCircularCabeza();
        listaDatos.LlenarLista(datosVector);
        desviacionEstandar = objetoOperaciones.calcularDesviacionEstandar(listaDatos);
        assertEquals("62,26", desviacionEstandar.replace('.', ','));
    }
    @org.junit.Test
    public void mediaCorrecta2()
    {
        Archivo a = new Archivo();
        String []datosVector;
        String lectura;
        String desviacion, promedio;
        lectura = a.realizarCalculos("C:\\Users\\lixander.cadavid\\Documents\\NetBeansProjects\\PSP1_Lixander_Felipe_Cadavid_Betancur\\numerostest2PSP1.txt");
        datosVector = lectura.split(",");
        Operaciones objetoOperaciones = new Operaciones();
        ListaSimpleCircularCabeza listaDatos = new ListaSimpleCircularCabeza();
        listaDatos.LlenarLista(datosVector);
        promedio = objetoOperaciones.calcularPromedioDosDecimales(listaDatos);
        assertEquals("550,60", promedio.replace('.', ','));
    }
    @org.junit.Test
    public void desviacionCorrecta2()
    {
        Archivo a = new Archivo();
        String []datosVector;
        String lectura;
        String desviacionEstandar;
        lectura = a.realizarCalculos("C:\\Users\\lixander.cadavid\\Documents\\NetBeansProjects\\PSP1_Lixander_Felipe_Cadavid_Betancur\\numerostest2PSP1.txt");
        datosVector = lectura.split(",");
        Operaciones objetoOperaciones = new Operaciones();
        ListaSimpleCircularCabeza listaDatos = new ListaSimpleCircularCabeza();
        listaDatos.LlenarLista(datosVector);
        desviacionEstandar = objetoOperaciones.calcularDesviacionEstandar(listaDatos);
        assertEquals("572,03", desviacionEstandar.replace('.', ','));
    }
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
