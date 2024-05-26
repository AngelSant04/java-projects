package Main_Automoviles_Colecciones;

import clases.clsAutos;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    static int buscarPlaca(String placa, ArrayList<clsAutos> lista){
        for (clsAutos auto : lista) {
            if ((auto.getPlaca()).equals(placa)) {
                return 0;
            }
        }     
        return -1;
    }
    
    static void llenarObjeto(ArrayList<clsAutos> lista){
        clsAutos obj;
        int bandera;
        Scanner lector = new Scanner(System.in);
        String placa, modelo, marca;
        System.out.println("Ingrese placa: ");
        placa = lector.next();
        bandera = buscarPlaca(placa, lista);
        if (bandera == -1) {
            System.out.println("Ingrese modelo: ");
            modelo = lector.next();
            System.out.println("Ingrese marca: ");
            marca = lector.next();

            obj = new clsAutos(placa, modelo, marca);

            lista.add(obj);            
        }else{
            System.out.println("Esta Placa ya ha Sido Registrado Anteriormente");
        }
    }
    
    static void presentarObjetos(ArrayList<clsAutos> lista){       
        for (clsAutos auto : lista) {
            System.out.println(auto.toString());
        }
    }
    
    static void presentarObjetosXMarca(ArrayList<clsAutos> lista){       
        String marca;
        boolean bandera = false;
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese marca: ");
        marca = lector.next();
        for (clsAutos auto : lista) {
            if ((auto.getMarca()).equals(marca)) {
                System.out.println(auto.toString());
                bandera = true;
            }
        }
        if (bandera == false) {
            System.out.println("No se encontraron autos con esta marca");
        }
    }
    
    public static void main(String[] args) {
        int op;
        ArrayList<clsAutos> lista = new ArrayList();
        do{
            op = opciones();
            switch(op){
                case 1: llenarObjeto(lista);
                break;
                case 2: presentarObjetos(lista);
                break;
                case 3: presentarObjetosXMarca(lista);
                break;
                case 4: presentarObjetosXMarca(lista);
                break;
                case 5: System.out.println("** FIN DE SISTEMA **");
                break;
            }
        }while(op != 5);
    }
    
    public static int opciones(){
        int op;
        do{
            System.out.println("1-Agregar Auto");
            System.out.println("2-Presentar Todos los Autos Registrados");
            System.out.println("3-Presentar Todos los Autos Registrados Por Marca");
            System.out.println("4-Presentar Todos los Autos ordenados Por Marca");
            System.out.println("5-SALIR");
            System.out.println("ELEGIR OPCION: ");
            Scanner lector = new Scanner(System.in);
            op = lector.nextInt();
            if(op < 1 || op > 5) System.out.println("Valor ingresado no es correcto");
        }while(op < 1 || op > 5);
        return op;
    }
        
}
