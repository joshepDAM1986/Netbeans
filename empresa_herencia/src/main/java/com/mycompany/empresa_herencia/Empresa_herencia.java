/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.empresa_herencia;

/**
 *
 * @author Profesor
 */
public class Empresa_herencia {

    public static void main(String[] args) {
        //Empleado e1 = new Empleado("Ana", "Ruiz", "2345F", "Director");
        Empleado e2 = new Empleado("Carlos", "López", "12489X", "Programador");
        Empleado e3 = new Empleado("Sergio", "Pérez", "12489X", "Administrativo");
        Persona p1 = new Persona("Luisa", "Sánchez", "8124G", "GR");
        Persona p2 = new Persona("Carmen", "Pérez", "4298P", "ZA");  
        
        Empresa e = new Empresa();
        e.setDirector(new Empleado("Ana", "Ruiz", "2234W", "Director"));
        e.setProgramador(e2);
        e.setAdministrativo(e3);
        e.setCliente1(p1);
        e.setCliente2(p2);
        
        e3.setNombre("Pepe");

        e.getDirector().setNombre("Fernanda");
        
        System.out.println(e);
        e.getCliente1().setApellidos("Gómez");
        e.setCliente2(new Persona("Jesús", "Íñiguez" ,
                "2222J", "VA"));
        
        
    }
}
