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
 * substring(5,10);
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
 //----------------------------
 
  static public ArrayList cargarEmpleado(ArrayList listaEmpleados){
     try{
            Empleado  aux = new Empleado(101,"OSCAR","PEREZ",800000.0);   
            listaEmpleados.add(aux);
            
            aux = new Empleado(102,"CAMILO","VERGARA",650000.0);   
            listaEmpleados.add(aux);
            
            aux = new Empleado(103,"KAREN","ORTIZ",700000.0);   
            listaEmpleados.add(aux);
            
            aux = new Empleado(104,"MARIA","AVILEZ",680000.0);   
            listaEmpleados.add(aux);
            
            aux = new Empleado(105,"PEDRO","ALVAREZ",500000.0);   
            listaEmpleados.add(aux);
            
            aux = new Empleado(106,"JULIANA","ANAYA",450000.0);   
            listaEmpleados.add(aux);
            
            System.out.println("***** CARGAR  EMPLEADO*****");    
            
     }
     catch(Exception e){System.out.println("ERROR..."+e.toString());}
 
 
 return   listaEmpleados;

 
 }
 static public ArrayList ordenarEmpleado(ArrayList listaEmpleados){
     try{
         Empleado act = null, sig = null;   
         System.out.println("***** ORDENAR  EMPLEADO*****");    
            int fin = listaEmpleados.size();
            if(fin>0){
                 for(int i =0; i< fin-1; i++){
                      for(int j =i+1; j < fin; j++){
                        act = (Empleado) listaEmpleados.get(i);
                        sig = (Empleado) listaEmpleados.get(j);
                        if(act.getNombre().compareTo(sig.getNombre())>0) { 
                           listaEmpleados.set(i, sig);
                           listaEmpleados.set(j, act);
                        }
                      }      
                 }
            }else{
                     System.out.println("NO HAY INFORMACION DE EMPLEADOS PARA LISTAR");
            }
     }
     catch(Exception e){System.out.println("ERROR..."+e.toString());}
 
 
 return   listaEmpleados;

 
 }
 
 static public void ordenarSueldo(ArrayList listaEmpleados){
     try{
         Empleado act, sig, aux;   
         System.out.println("***** MEJOR PAGADOS EMPLEADO*****");    
            int fin = listaEmpleados.size();
            if(fin>0){
                 for(int i =0; i< fin-1;i++){
                      for(int j =i+1; j < fin;j++){
                        act = (Empleado) listaEmpleados.get(i);
                        sig = (Empleado) listaEmpleados.get(j);
                        if(act.getSalario()<sig.getSalario()){  
                           listaEmpleados.set(i, sig);
                           listaEmpleados.set(j, act);
                        }
                      }      
                 }
                 
                 if (fin>5){ fin=5;}
                System.out.println("\t"+"id"+"\t"+"\t"+"Nombre"+"\t"+"\t"+"Apellido"+"\t"+"\t"+"Salario");    
             
                for(int i =0; i< fin;i++){
                    aux = (Empleado) listaEmpleados.get(i);
                    System.out.println(""+aux.toString()+"\n");

                 }
            
            }else{
                     System.out.println("NO HAY INFORMACION DE EMPLEADOS PARA LISTAR");
            }
     }
     catch(Exception e){System.out.println("ERROR..."+e.toString());}
 
 
 

 
 }
 //----------------------------
static public void sumaSueldo(ArrayList listaEmpleados){
      double s =0;
     try{
            
         System.out.println("***** SUMA SUELDO DE  EMPLEADO *****");    
            int fin = listaEmpleados.size();
           
            if(fin>0){
                 for(int i = 0; i< fin;i++){
                    Empleado aux = (Empleado) listaEmpleados.get(i);
                    if (aux.getSalario()>700000)
                        s = s+aux.getSalario();
                        
                 }
            }else{
                     System.out.println("NO HAY INFORMACION DE EMPLEADOS PARA LISTAR");
            }
            System.out.println("LA SUMA POR CONCEPTO DEL SUEDO DE EMPLEADOS ES DE "+s);
     }
     catch(Exception e){System.out.println("ERROR..."+e.toString());}
 
 
 

 
 }

static public void count(ArrayList listaEmpleados){
      
      int cont=0;
     try{
            
           System.out.println("***** CONTADOR DE  EMPLEADOS *****");    
            int fin = listaEmpleados.size();
           
            if(fin>0){
                 for(int i = 0; i< fin;i++){
                    Empleado aux = (Empleado) listaEmpleados.get(i);
                    String s = aux.getApellido().toUpperCase().substring(0, 1);
                   
                    if( s.compareTo("A")==0){
                        cont++;
                    }
                 }
            }else{
                     System.out.println("NO HAY INFORMACION DE EMPLEADOS PARA LISTAR");
            }
            System.out.println("EL NUMERO TOTAL DE EMPLEADOS CUYO APELLIDO INICIA CON A ES DE "+cont);
     }
     catch(Exception e){System.out.println("ERROR..."+e.toString());}
 
 
 

 
 }

static public Empleado sueldoMin(ArrayList listaEmpleados){
      Empleado menor = null, aux=null;
     try{
            
            System.out.println("***** SUELDO MINIMO DE  EMPLEADO *****");    
            System.out.println("\t"+"id"+"\t"+"\t"+"Nombre"+"\t"+"\t"+"Apellido"+"\t"+"\t"+"Salario");
            int fin = listaEmpleados.size();
            menor = (Empleado) listaEmpleados.get(0);
            if(fin>0){
                 for(int i = 0; i< fin;i++){
                    aux = (Empleado) listaEmpleados.get(i);
                    if(aux.getSalario() < menor.getSalario()){
                        menor =aux;
                    }

                 }
            }else{
                     System.out.println("NO HAY INFORMACION DE EMPLEADOS PARA LISTAR");
            }
     }
     catch(Exception e){System.out.println("ERROR..."+e.toString());}
 
 
 return   menor;

 
 }
 static public Empleado sueldoMax(ArrayList listaEmpleados){
      Empleado mayor = null, aux=null;
     try{
            
         System.out.println("***** SUELDO MAXIMO DE EMPLEADO*****");    
         System.out.println("\t"+"id"+"\t"+"\t"+"Nombre"+"\t"+"\t"+"Apellido"+"\t"+"\t"+"Salario");    
            int fin = listaEmpleados.size();
            mayor = (Empleado) listaEmpleados.get(0);
            if(fin>0){
                 for(int i = 0; i< fin;i++){
                    aux = (Empleado) listaEmpleados.get(i);
                    if(aux.getSalario() > mayor.getSalario()){
                        mayor =aux;
                    }

                 }
            }else{
                     System.out.println("NO HAY INFORMACION DE EMPLEADOS PARA LISTAR");
            }
     }
     catch(Exception e){System.out.println("ERROR..."+e.toString());}
 
 
 return   mayor;

 
 }
 static public int Menu(){
     int op = 11;
     try{
                    Scanner lea = new Scanner(System.in);
                    System.out.println("***** MENU *****");
                    System.out.println("1. AGREGAR EMPLEADO");
                    System.out.println("2. ELIMINAR EMPLEADO");
                    System.out.println("3. ACTUALIZAR EMPLEADO");
                    System.out.println("4. MOSTRAR EMPLEADO");
                    System.out.println("5. MAYOR SALARIO");
                    System.out.println("6. MENOR SALARIO");
                    System.out.println("7. ORDENAR EMPLEADOS POR NOMBRE");
                    System.out.println("8. SUMA DE SALARIOS DE EMPLEADOS MAYORES A 700000");
                    System.out.println("9. EMPLEADOS QUE SU APELLIDO INICIA CON A");
                    System.out.println("10. LOS 5 MEJORES PAGADOS");
                    
                    
                    System.out.println("11. SALIR");
                    do{
                        System.out.print("OPCION: ");
                        op = lea.nextInt();
                    }while ((op <1) ||(op>11) );
                    
     
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
                System.out.print("Nombre: "); n=lea.next().trim().toUpperCase();
                System.out.print("Apellido: "); a=lea.next().trim().toUpperCase();
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
                listaEmpleados = cargarEmpleado(listaEmpleados);
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
                                Empleado x = sueldoMax(listaEmpleados);
                                System.out.println("\n"+ x.toString());
                                pressAnyKeyToContinue();
                           break; 
                        case 6:
                                Empleado Y = sueldoMin(listaEmpleados);
                                System.out.println("\n"+ Y.toString());
                                pressAnyKeyToContinue();
                           break; 
                        
                        case 7:
                                ordenarEmpleado(listaEmpleados);
                                toprintEmpleado(listaEmpleados);
                                pressAnyKeyToContinue();
                           break; 
                        case 8:
                                sumaSueldo(listaEmpleados);
                                pressAnyKeyToContinue();
                           break; 
                        case 9:
                                count(listaEmpleados);
                                pressAnyKeyToContinue();
                           break; 
                        case 10:
                                ordenarSueldo(listaEmpleados);
                                pressAnyKeyToContinue();
                           break; 
                         
                        case 11:
                            
                            System.out.println("Usted esta saliendo de soluciones informaticas @yesid ...");
                            
                            pressAnyKeyToContinue();
                           
                           break;
                        
                        default : 
                           
                            System.out.println("Gracias por usar soluciones informaticas @yesid ...");
                            
                           
                     }

                    
                }while(op!=11);
                
                
                
        }catch(Exception ex){System.out.println("ERROR: "+ex.toString());}
        // TODO code application logic here
    }
    
    
}
