/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escuela_primaria;

/**
 *
 * @author Administrador
 */
public class Alumno {
    private long dni;
    private String nombre;
    
    public Alumno(long dni, String nombre){
        this.dni = dni;
        this.nombre = nombre;
    }
    
    public void printData() { System.out.print("\t-" + this.nombre + "\n"); }
    
    public long getDni() { return this.dni; }
    public String getNombre() { return this.nombre; }
}
