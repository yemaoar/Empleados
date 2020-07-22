/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleados;
import java.util.ArrayList;
import java.util.Scanner;



/**
 *
 * @author omdg2
 */
public class Empleados { 
 
 static public void pressAnyKeyToContinue(){
    String seguir;
    Scanner teclado = new Scanner(System.in);
    System.out.println("Press Enter key to continue...");
    try
    {
        seguir = teclado.nextLine();
    }
    catch(Exception e)
    {}
   }               
 //   try{}catch(){}

 static public int Menu(){
     int op = 5;
     try{
                    Scanner lea = new Scanner(System.in);
                    System.out.println("***** MENU *****");
                    System.out.println("1. AGREGAR EMPLEADO");
                    System.out.println("2. ELIMINAR EMPLEADO");
                    System.out.println("3. ACTUALIZAR EMPLEADO");
                    System.out.println("4. MOSTRAR EMPLEADO");
                    System.out.println("5. SALIR");
                    do{
                        System.out.print("OPCION: ");
                        op = lea.nextInt();
                    }while ((op <1) ||(op>5) );
                    
     
     }catch(Exception e){System.out.println("ERROR..."+e.toString());}
 return op;
 }
 
 static public ArrayList toprintEmpleado(ArrayList listaEmpleados){
     try{
            
         System.out.println("***** LISTADO DE  EMPLEADO*****");    
         System.out.println("\t"+"id"+"\t"+"\t"+"Nombre"+"\t"+"\t"+"Apellido"+"\t"+"\t"+"Salario");    
            int fin = listaEmpleados.size();
            if(fin>0){
                 for(int i =0; i< fin;i++){
                  Empleado aux = (Empleado) listaEmpleados.get(i);
                  System.out.println(""+aux.toString()+"\n");

                 }
            }else{
                     System.out.println("NO HAY INFORMACION DE EMPLEADOS PARA LISTAR");
            }
     }
     catch(Exception e){System.out.println("ERROR..."+e.toString());}
 
 
 return   listaEmpleados;

 
 }
 static public ArrayList updateEmpleado(ArrayList listaEmpleados){
     try{
           Scanner lea = new Scanner(System.in);
           int id;
           String n,a;
           double s;

            System.out.println("***** ACTUALIZAR EMPLEADO*****");
            System.out.print("ID DEL EMPLEADO: "); id=lea.nextInt();
            boolean sw = false;   
            int fin = listaEmpleados.size();
            for(int i =0; i<fin;i++){
                 Empleado aux = (Empleado) listaEmpleados.get(i);
                 if (aux.getId()== id){
                    sw=true;
                    System.out.println("***** AGREGAR EMPLEADO*****");
                    System.out.print("ID: "); id=lea.nextInt();
                    System.out.print("Nombre: "); n=lea.next().trim();
                    System.out.print("Apellido: "); a=lea.next().trim();
                    System.out.print("Salario: "); s=lea.nextDouble();

                    aux.setId(id);
                    aux.setNombre(n);
                    aux.setApellido(a);
                    aux.setSalario(s);

                    listaEmpleados.set(i, aux);

                    System.out.println("***** EMPLEADO ACTUALIZADO CON EXITO *****");

                 }
            }
            if (sw== false)
                System.out.println("***** NO SE PUDO ACTUALIZAR EMPLEADO, EL ID NO EXISTE*****");

     
     
     }
     catch(Exception e){System.out.println("ERROR..."+e.toString());}
 
 
 return   listaEmpleados;

 
 }
 
 static public ArrayList removeEmpleado(ArrayList listaEmpleados){
     try{
            System.out.println("***** ELIMINAR EMPLEADO*****");
            Scanner lea = new Scanner(System.in);
            int id;
                                
            System.out.print("ID DEL EMPLEADO: "); id=lea.nextInt();
            boolean sw = false;   
            int fin = listaEmpleados.size();
                for(int i =0; i<fin;i++){
                 Empleado aux = (Empleado)listaEmpleados.get(i);
                 if (aux.getId()== id){
                     sw=true;
                     listaEmpleados.remove(aux);
                     System.out.println("***** EMPLEADO ELIMINADO CON EXITO *****");
                 }
                }
            if (sw== false)
                System.out.println("***** NO SE PUDO ELIMINAR EMPLEADO, EL ID NO EXISTE*****");

                            
     
     }
     catch(Exception e){System.out.println("ERROR..."+e.toString());}
 
 
 return   listaEmpleados;

 
 }
 static public ArrayList addEmpleado(ArrayList listaEmpleados){
     try{
                Scanner lea = new Scanner(System.in);
                int id;
                String n,a;
                double s;
                System.out.println("***** AGREGAR EMPLEADO*****");
                System.out.print("ID: "); id=lea.nextInt();
                System.out.print("Nombre: "); n=lea.next().trim();
                System.out.print("Apellido: "); a=lea.next().trim();
                System.out.print("Salario: "); s=lea.nextDouble();
                Empleado NE = new Empleado(id,n, a, s);

                boolean sw= false;
                int fin = listaEmpleados.size();
                if(fin>0){
                    for(int i =0; i<fin;i++){
                        Empleado aux = (Empleado) listaEmpleados.get(i);
                        if (aux.getId()== NE.getId()){
                            sw = true;
                        }
                    }
                }

                if (sw== false){
                    listaEmpleados.add(NE);
                    System.out.println("EL EMPLEADO FUE CREADO CON EXITO");
                }else{
                        System.out.println("EL EMPLEADO YA EXISTE");
                    }

         }catch(Exception e){System.out.println("ERROR..."+e.toString());}
 
 
 return   listaEmpleados;

 }
 
 public static void main(String[] args) {
        try{
                ArrayList <Empleado> listaEmpleados = new ArrayList();
                Empleado NE;
                boolean sw;    
                int id, fin;
                String n, a;
                double s;

                Scanner lea = new Scanner(System.in);
                int op = 0; 
                
                do{
                    op = Menu();
                    
                    switch(op){
                        case 1:
                               
                               listaEmpleados = addEmpleado(listaEmpleados);
                               pressAnyKeyToContinue();
                                
                             break; // break es opcional
   
                        case 2:
                            
                                listaEmpleados = removeEmpleado(listaEmpleados);   
                                pressAnyKeyToContinue();
                            break; 

                        case 3:
                                                                                         
                                 listaEmpleados = updateEmpleado(listaEmpleados); 
                                 pressAnyKeyToContinue();   
                               break; 
                        case 4:
                                toprintEmpleado(listaEmpleados);
                                pressAnyKeyToContinue();
                           break; 
                        case 5:
                            
                            System.out.println("Usted esta saliendo de soluciones informaticas @yesid ...");
                            
                            pressAnyKeyToContinue();
                           
                           break;
                        
                        default : 
                           
                            System.out.println("Gracias por usar soluciones informaticas @yesid ...");
                            
                           
                     }

                    
                }while(op!=5);
                
                
                
        }catch(Exception ex){System.out.println("ERROR: "+ex.toString());}
        // TODO code application logic here
    }
    
    
}
