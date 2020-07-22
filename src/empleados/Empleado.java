/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleados;

/**
 *
 * @author omdg2
 */
public class Empleado {
    private int Id;
    private String Nombre;
    private String Apellido;
    private double Salario;
    
    public Empleado(){}
    public Empleado(int Id, String Nombre, String Apellido, Double Salario){
        this.Id= Id;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Salario = Salario;
        
    }
    
    public void setId(int Id){this.Id= Id; }
    public void setNombre(String Nombre){this.Nombre = Nombre; }
    public void setApellido(String Apellido){this.Apellido = Apellido;}
    public void setSalario(double Salario){this.Salario = Salario;}
    
    
    public int getId(){return this.Id;}
    public String getNombre(){return this.Nombre;}
    public String getApellido(){return this.Apellido;}
    public double getSalario(){return this.Salario;}
    
    public String toString(){ return "\t"
            +this.Id + "\t"+ "\t"
            +this.Nombre + "\t"+ "\t"
            + this.Apellido+"\t"+ "\t"+ "\t"
            +this.Salario;}
}
