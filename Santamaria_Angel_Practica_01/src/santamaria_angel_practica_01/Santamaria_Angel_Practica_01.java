/*
 * To change this license header,  choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santamaria_angel_practica_01;

import clases.clsCanal;
import clases.clsContenido;
import clases.clsListaCanal;
import java.util.Scanner;

public class Santamaria_Angel_Practica_01 {
    
    static void llenarObjeto(clsListaCanal lista){
        clsCanal obj;
        Scanner lector = new Scanner(System.in);      
        System.out.println("Ingrese nombre: ");
        String nombre = lector.next();
        int pos = lista.buscarcanal(nombre);
        if(pos != -1) System.out.println("Nombre repetido");            
        else{
            System.out.println("Ingrese nacionalidad: ");
            String nacionalidad = lector.next();
            System.out.println("Ingrese calidad: 1- HD 2- FULL HD 3- 4K");
            int calidad = lector.nextInt();   
            obj = new clsCanal(nombre, nacionalidad, calidad);
            lista.insertar(obj);
        }        
                       
    }        
    
    static void llenarContenido(clsListaCanal lista,int posAux){
        clsContenido obj;
        Scanner lector = new Scanner(System.in);
        String titulo;
        int tipocontenido = 0, categoria, horainicio, horafinal,pos;
        System.out.println("Ingrese titulo: ");
        titulo = lector.next();
        do{
            System.out.println("Ingrese categoria: 1- Inedito 2- Retransmitido");
            categoria = lector.nextInt();         
            if(categoria < 1 || categoria > 2){
                System.out.println("Categoria no valida");
            }
        }while(categoria < 1 || categoria > 2 );
        switch((categoria-1)){
            case 0:{
                do{
                    System.out.println("Ingrese tipo de contenido: 1-Informativo 2- Entretenimiento 3- Ficcion");
                    tipocontenido = lector.nextInt();
                    if(tipocontenido < 1 || tipocontenido > 3) System.out.println("Tipo de contenido no valido");                                            
                }while(tipocontenido < 1 || tipocontenido >3);                
            }
            break;
            case 1: {
                do{
                    System.out.println("Ingrese tipo de contenido: 1- Peliculas 2-Documentales 3- Deportes ");
                    tipocontenido = lector.nextInt();
                    if(tipocontenido < 1 || tipocontenido > 3) System.out.println("Tipo de contenido no valido");
                }while(tipocontenido < 1 || tipocontenido >3);                                                         
            } 
            break;
        }            
        System.out.println("Ingrese hora de inicio: ");
        horainicio = lector.nextInt();
        System.out.println("Ingrese hora de fin: ");
        horafinal = lector.nextInt();
        
        obj = new clsContenido(titulo,tipocontenido,categoria,horainicio,horafinal);
        lista.getDatos()[posAux].agregarcontenido(obj);
        if (categoria == 2) {
            System.out.println("Ingresar con cuantos canales se compartira el contenido: ");
            int cant = lector.nextInt();
            for (int i = 0; i < cant; i++) {
                System.out.println("Ingrese nombre de canal con el que sera compartido: ");
                String nombAux = lector.next();
                pos = lista.buscarcanal(nombAux);
                if(pos != -1 && lista.getDatos()[pos].buscarcontenido(titulo) == -1 ){
                    lista.getDatos()[pos].agregarcontenido(obj);
                    System.out.println("CONTENIDO COMPARTIDO EXITOSAMENTE");
                }else{
                    if(pos == -1) System.out.println("Canal no encontrado");
                    else System.out.println("Titulo ya existente, Imposible agregar");
                }
            }
        }
    }

    public static void main(String[] args) {
        int op;
        clsListaCanal lista = new clsListaCanal();                
        do{
            op = opciones();
            switch(op){
                case 1: llenarObjeto(lista);
                break;
                case 2: registrarContenido(lista);
                break;
                case 3: compartirContenido(lista);
                break;
                case 4: System.out.println(lista.presentar());
                break;
                //case 5: presentarxNacionalidad(lista);
                //break;
                case 6: System.out.println("** Fin de sistema **");
                break;
            }
        }while(op != 6);
    }  
    
    static void compartirContenido(clsListaCanal lista){
        Scanner lector = new Scanner(System.in);
        int pos,band;
        String canalAux,contAux;
        System.out.println("Ingrese nombre de canal para compartir contenido: ");
        canalAux = lector.next();
        pos = lista.buscarcanal(canalAux);
        if(pos != -1){
            System.out.println(lista.getDatos()[pos].mostrarContenido());
            System.out.println("Ingrese titulo de contenido para compartir: ");
            contAux = lector.next();
            band = lista.getDatos()[pos].buscarcontenido(contAux);
            if(band != -1){
                if(lista.getDatos()[pos].returnCategoria(band) == 1){
                    System.out.println("Ingrese nombre de canal con el que se compartira el contenido: ");
                    String cAux = lector.next();
                    int temp = lista.buscarcanal(cAux);
                    if(temp != -1){
                        lista.getDatos()[pos].cambiarcategoria(2, band);
                        lista.getDatos()[temp].agregarcontenido(lista.getDatos()[pos].getContenido().getDatos()[band]);
                        System.out.println("CONTENIDO COMPARTIDO");
                    } else System.out.println("Canal no existente");                   
                }else System.out.println("El contenido ya es retransmitido");                
            }else System.out.println("Titulo no encontrado");
        }else System.out.println("Canal no encontrado");
    }       
    
    static void registrarContenido(clsListaCanal lista){ 
        int op, band;
        String nombAux;  
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese nombre de canal para agregar contenido");
        nombAux = lector.next();
        band = lista.buscarcanal(nombAux);
        if (band != -1) {
            do{
                System.out.println("** Creamos contenido ** ");
                llenarContenido(lista,band);
                do{
                    System.out.println("Desea ingresar otro contenido: 1- SI 2- NO");
                    op = lector.nextInt();
                    if(op == 1 || op == 2){
                        if(op == 2) System.out.println("** Proceso Finalizado **");
                    }else System.out.println("Opcion no valida");                                                  
                }while(op < 1 || op > 2);                                     
            }while(op != 2);
        }else System.out.println("Canal no encontrado");
    }
    
    public static int opciones(){
        int op;
        do{
            System.out.println("1-Registrar canal");
            System.out.println("2-Registrar contenido");
            System.out.println("3-Compartir contenido");
            System.out.println("4-Muestra de canales y contenidos");
            System.out.println("5-Total de contenidos segun nacionalidad");
            System.out.println("6-SALIR");
            System.out.println("ELEGIR OPCION: ");
            Scanner lector = new Scanner(System.in);
            op = lector.nextInt();
            if(op < 1 || op > 6) System.out.println("Valor ingresado no es correcto");
        }while(op < 1 || op > 6);
        return op;
    }
 
}
