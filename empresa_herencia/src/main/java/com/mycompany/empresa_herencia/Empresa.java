/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empresa_herencia;

/**
 *
 * @author Profesor
 */
public class Empresa {
    private Empleado director;
    private Empleado programador;
    private Empleado administrativo;
    private Persona cliente1;
    private Persona cliente2;

    public Empleado getDirector() {
        return director;
    }

    public void setDirector(Empleado director) {
        this.director = director;
    }

    public Empleado getProgramador() {
        return programador;
    }

    public void setProgramador(Empleado programador) {
        this.programador = programador;
    }

    public Empleado getAdministrativo() {
        return administrativo;
    }

    public void setAdministrativo(Empleado administrativo) {
        this.administrativo = administrativo;
    }

    public Persona getCliente1() {
        return cliente1;
    }

    public void setCliente1(Persona cliente1) {
        this.cliente1 = cliente1;
    }

    public Persona getCliente2() {
        return cliente2;
    }

    public void setCliente2(Persona cliente2) {
        this.cliente2 = cliente2;
    }

    @Override
    public String toString() {
        return "Empresa{" + "director=" + director + ", programador=" + programador + ", administrativo=" + administrativo + ", cliente1=" + cliente1 + ", cliente2=" + cliente2 + '}';
    }
    
    
    
}
