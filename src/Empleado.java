/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Empleado {
    private String nombre;
    public Fecha fNacimiento;
    public Fecha fIngreso;

    public Empleado(String nombre, Fecha fNacimiento, Fecha fIngreso) {
        this.nombre = nombre;
        this.fNacimiento = fNacimiento;
        this.fIngreso = fIngreso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Fecha getfNacimiento() {
        return fNacimiento;
    }

    public void setfNacimiento(Fecha fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    public Fecha getfIngreso() {
        return fIngreso;
    }

    public void setfIngreso(Fecha fIngreso) {
        this.fIngreso = fIngreso;
    }
    
    
          
}
