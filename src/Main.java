/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Fecha nacimiento = new Fecha(19, 06, 1980);
        Fecha ingreso = new Fecha(19,06 , 2018);
        Empleado empleado = new Empleado("F", nacimiento, ingreso);
        System.out.println(empleado.fNacimiento.getDia());
        
        
    }
}
