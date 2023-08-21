/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package base;

import java.time.LocalDate;

/**
 *
 * @author Chino
 */
public class Empleado {
 private int cedula; 
 private String nombre ; 
 private   String apellidos ; 
 private char genero ; 
 private  String  fechaNac ; 
 private  String email ; 
 private float salario ; 
 private float  procComision ; 

    public Empleado(int cedula, String nombre, String apellidos, char genero, String  fechaNac, String email, float salario, float procComision) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.genero = genero;
        this.fechaNac = fechaNac;
        this.email = email;
        this.salario = salario;
        this.procComision = procComision;
    }
  public Empleado() {
        this.cedula = 0;
        this.nombre = null;
        this.apellidos = null;
        this.genero = ' ';
        this.fechaNac = null;
        this.email = null;
        this.salario = 0;
        this.procComision = 0;
    }
 
 
 
 
    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String  fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getProcComision() {
        return procComision;
    }

    public void setProcComision(float  procComision) {
        this.procComision = procComision;
    }
 
    
    
         
}
