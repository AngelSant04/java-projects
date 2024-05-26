
public class Principal {
    static final int MAX=10;
    static  Empleado[] lista=new Empleado[MAX];
    static int ne=0;
    public static void main(String[] args) {
        int opcion;
      do {          
          opcion=basica.Menu();
          switch(opcion){
              case 1: regDocente();break;
              case 2: regAdmin();break;
              case 3: presentar();break;
              case 4: mostrarMenorSueldo();break;
              case 5: mostrarSueldos();break;
//              case 6:();break;
//              case 7:();break;
//              case 8:();break;
//              case 9:();break;
          }
      } while (opcion!=10);
    }
    public static void presentar(){
        for (int i = 0; i < ne; i++) {
          lista[i].Mostrar();
        }
    }
    public static void  mostrarMenorSueldo(){
        
    }
    public static void  mostrarSueldos(){
        
    }
    public static void regDocente(){
        Docente obj=new Docente();
        obj.setCodigo(ne+1);
        obj.setDNI(basica.LeerCadena("Ingrese el DNI del docente"));
        obj.Leer();
        lista[ne]=obj;
        ne++;
    }
    public static void regAdmin(){
        Administrativo obj=new Administrativo();
        obj.setCodigo(ne+1);
        obj.setDNI(basica.LeerCadena("Ingrese el DNI del administrativo"));
        obj.Leer();
        lista[ne]=obj;
        ne++;
    }
    
}
