/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santamaria_herrera_angel_libros;

import clases.clsColeccionPublicacion;
import clases.clsLibro;
import clases.clsPublicacion;
import clases.clsRevista;
import java.util.Scanner;

public class Santamaria_Herrera_Angel_Libros {
    
    static void llenarObjeto(clsColeccionPublicacion coleccion){
        Scanner lector = new Scanner(System.in);
        
        clsPublicacion obj;
        String titulo, editorial;
        int aniopublicacion,op;   
        
        do{
           System.out.println("Ingrese tipo de Publicacion: 1- Libro 2- Revista");
            op = lector.nextInt(); 
            if(op < 1 || op > 2) System.out.println("Valor ingresado no es correcto");
        }while(op < 1 || op > 2);        
        
        System.out.println("Ingrese titulo: ");   
        titulo = lector.next();
        System.out.println("Ingrese editorial: ");   
        editorial = lector.next();
        System.out.println("Ingrese anio de publicacion: ");   
        aniopublicacion = lector.nextInt();  
        
        switch(op){
            case 1:{                
                System.out.println("Ingrese Autor: ");   
                String autor = lector.next();
                System.out.println("Ingrese Codigo: ");   
                int codigo = lector.nextInt();
                System.out.println("Ingrese numero de capitulos del libro: ");   
                int capitulos = lector.nextInt(); 
                
                obj = new clsLibro(autor, codigo, capitulos, titulo, editorial, aniopublicacion);
                coleccion.insertar(obj);
               
                break;
            }                
            case 2:{
                System.out.println("Ingrese Volumen de revista: ");
                int volumen = lector.nextInt();
                
                obj = new clsRevista(volumen, titulo, editorial, aniopublicacion);
                coleccion.insertar(obj);
                
                break;
            }                
        }                              
        
    }        

    public static void main(String[] args) {
        int op;
        clsColeccionPublicacion coleccion = new clsColeccionPublicacion();                
        do{
            op = opciones();
            switch(op){
                case 1: llenarObjeto(coleccion);
                break;
                case 2: System.out.println(coleccion.presentar());
                break;
                case 3: buscarPublicacion(coleccion);
                break;
                case 4: precio(coleccion);
                break;                      
                case 5: System.out.println("** FIN DE SISTEMA **");
                break;
            }
        }while(op != 5);
    }
    
    static int buscarpublicacion(String titulo, clsColeccionPublicacion coleccion){
        for (int i = 0; i < coleccion.getTotal(); i++) {
            if((coleccion.getDatos()[i].getTitulo()).equals(titulo)){
                return i;                
            }
        }        
        return -1;
    }
    
    static void buscarPublicacion(clsColeccionPublicacion coleccion){
        Scanner lector = new Scanner(System.in);

        String tituloAux;
        
        System.out.println("Ingrese Titulo de Publicacion: ");
        tituloAux = lector.next();
        
        System.out.println(coleccion.getMostrar(tituloAux));
    }
    
    static void precio(clsColeccionPublicacion coleccion){
        Scanner lector = new Scanner(System.in);
        
        int pos;
        String tituloAux;
        
        System.out.println("Ingrese Titulo de Publicacion: ");
        tituloAux = lector.next();
        
        pos = buscarpublicacion(tituloAux, coleccion);
        if(pos != -1) {

            System.out.println("Ingrese Precio de Publicacion(en caso de revista sera el precio del volumen I): ");
            double precio = lector.nextDouble();
            
            coleccion.getDatos()[pos].calcularPrecio(precio);
                
            System.out.println(coleccion.getDatos()[pos].mostrar());

         }else System.out.println("Titulo no encontrado");            
    }
    
    public static int opciones(){
        int op;
        do{
            System.out.println("1-Agregar Publicacion");
            System.out.println("2-Presentar Publicaciones");
            System.out.println("3-Buscar Publicacion");
            System.out.println("4-Ingresar Precio de publicacion");
            System.out.println("5-SALIR");
            System.out.println("ELEGIR OPCION: ");
            Scanner lector = new Scanner(System.in);
            op = lector.nextInt();
            if(op < 1 || op > 5) System.out.println("Valor ingresado no es correcto");
        }while(op < 1 || op > 5);
        return op;
    }
    
}
