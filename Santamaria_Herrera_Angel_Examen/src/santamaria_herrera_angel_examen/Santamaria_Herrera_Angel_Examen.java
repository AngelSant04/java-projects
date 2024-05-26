/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santamaria_herrera_angel_examen;

import clases.clsColeccionista;
import clases.clsEsculturas;
import clases.clsListaColeccionista;
import clases.clsPinturas;
import java.util.Scanner;

public class Santamaria_Herrera_Angel_Examen {
    
    static int leerEntero(String msje, int min, int max,String error){
	Scanner lector=new Scanner(System.in);
        int num;
        do{
	    System.out.print(msje);
            num=lector.nextInt();
            if(num<min||num>max) System.out.println(error);        
        }while(num<min || num>max);
        return num;
    }

    public static void main(String[] args) {
        
        int op;  
        clsListaColeccionista lista = new clsListaColeccionista();
        do{
            op = opciones();
            switch(op){
                case 1: crearLista(lista);
                break;
                case 2: registrarArte(lista);
                break;
                case 3: presentarxClasificacion(lista);
                break;
                case 4: realizarDescuento(lista);
                break;
                case 5: presentarobraxColeccionista(lista);
                break;
                case 6: System.out.println("** FIN DE SISTEMA **");
                break;
            }
        }while(op != 6);
    }
    
    public static void realizarDescuento(clsListaColeccionista lista){
        for (int i = 0; i < lista.getTotal(); i++) {
            for (int j = 0; j < lista.getDatos()[i].getColeccion().getTotal(); j++) {
                lista.getDatos()[i].getColeccion().getDatos()[j].calcularDescuento();
                System.out.println("DESCUENTO REALIZADO");
                System.out.println(lista.getDatos()[i].getColeccion().getDatos()[j].mostrar()); 
            }            
        }        
    }
    
    public static void presentarobraxColeccionista(clsListaColeccionista lista){
        String identificador;
        int pos;
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese indentificador de coleccionista para mostrar sus obras de arte: ");
        identificador = lector.next();
        pos =lista.buscarColeccionista(identificador);
        if(pos != -1){
            System.out.println(lista.getDatos()[pos].getColeccion().presentar());
        }else System.out.println("Identificador no encotrado");
    }
    
    public static void presentarxClasificacion(clsListaColeccionista lista){
        int tipo;
        tipo = leerEntero("Ingrese tipo de Arte para mosrar: 1- Pintura 2-Escultura ", 1, 2, "Opcion no valida");
        if(tipo == 1){
            for (int i = 0; i < lista.getTotal(); i++) {
                for (int j = 0; j < lista.getDatos()[i].getColeccion().getTotal(); j++) {
                    if(lista.getDatos()[i].getColeccion().getDatos()[j].getTipo() == 1){
                        System.out.println("PINTURA");
                        System.out.println(lista.getDatos()[i].getColeccion().getDatos()[j].mostrar());    
                    }                    
                }                
            }
        }else{
            for (int i = 0; i < lista.getTotal(); i++) {
                for (int j = 0; j < lista.getDatos()[i].getColeccion().getTotal(); j++) {
                    if(lista.getDatos()[i].getColeccion().getDatos()[j].getTipo() == 2){
                        System.out.println("ESCULTURA");
                        System.out.println(lista.getDatos()[i].getColeccion().getDatos()[j].mostrar());    
                    }                    
                }                
            }
        }
    }
    
    public static void registrarArte(clsListaColeccionista lista){
        String identificador, codigoArte, descripcion, lugardeprocedencia;
        int pos,tipo,antiguedad;
        double precio;
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese indentificador de autor para agregar Obra de Arte: ");
        identificador = lector.next();
        pos = lista.buscarColeccionista(identificador);
        if(pos != -1){
            tipo = leerEntero("Ingrese tipo de obra de Arte: 1- Pintura 2-Escultura ", 1, 2, "Opcion no valida");
            System.out.println("Ingrese Codigo: ");   
            codigoArte = lector.next(); 
            System.out.println("Ingrese Descripcion: ");   
            descripcion = lector.next(); 
            System.out.println("Ingrese Lugar de procedencia: ");   
            lugardeprocedencia = lector.next(); 
            System.out.println("Ingrese Precio: ");   
            precio = lector.nextDouble();
            System.out.println("Ingrese antiguedad: ");   
            antiguedad = lector.nextInt();   
            switch(tipo){
                case 1:{ 
                    String nombrepintor;
                    System.out.println("Ingrese Nombre de pintor: ");   
                    nombrepintor = lector.next();                    
                    int estado = leerEntero("Ingrese Estado: 1- Buen Estado, 2- Mal Estado, 3- Por Restaurar ", 1, 3, "Opcion no valida");               
                    clsPinturas obj = new clsPinturas(nombrepintor, estado, codigoArte, descripcion, lugardeprocedencia, precio, antiguedad);
                    lista.getDatos()[pos].getColeccion().insertar(obj);
               
                    break;
                }                
                case 2:{                       
                    int cultura = leerEntero("Ingrese Cultura: 1- Griega 2- Persa 3- Egipcia 4- Inca ", 1, 4, "Opcion no valida");
                    int material = leerEntero("Ingrese Material: 1- Granito, 2- Piedra, 3- Otros materiales ", 1, 3, "Opcion no valida");                       
                
                    clsEsculturas  obj = new clsEsculturas(cultura, material, codigoArte, descripcion, lugardeprocedencia, precio, antiguedad);
                    lista.getDatos()[pos].getColeccion().insertar(obj);
               
                    break;
                }                
            }
        }else System.out.println("Identificador no encontrado");
    }
    
    public static void crearLista(clsListaColeccionista lista){
        //CREAMOS COLECCIONISTA
        clsColeccionista obj = new clsColeccionista("A001", "PIERO", 1);
        clsColeccionista obj1 = new clsColeccionista("A002", "ANGEL", 2);
        clsColeccionista obj2 = new clsColeccionista("A003", "YESSENIA", 2);
        clsColeccionista obj3 = new clsColeccionista("A004", "RONALDO", 1);
        //INSERTAMOS EN LA LISTA
        lista.insertar(obj);
        lista.insertar(obj1);
        lista.insertar(obj2);
        lista.insertar(obj3);
        //PRESENTAMOS LISTA     
        System.out.println(lista.presentar());
    }
    
    public static int opciones(){
        int op;
        System.out.println("1- Crear Lista Coleccionista");
        System.out.println("2- Registramos obre de arte");
        System.out.println("3- Presentamos obras de arte por clasificacion");
        System.out.println("4- Descuento");
        System.out.println("5- Presentar obras de arte de un coleccionista");            
        System.out.println("6-SALIR");
        op = leerEntero("Ingrese Opcion: ", 1, 6, "Opcion no Valida");
        return op;
    }
    
}
