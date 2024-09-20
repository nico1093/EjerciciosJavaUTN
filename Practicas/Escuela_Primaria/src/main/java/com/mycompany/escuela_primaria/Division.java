/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escuela_primaria;

import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public class Division {
    private char id;
    private ArrayList<Alumno> alumnos;
    
    public Division(char id){
        this.id = id;
        this.alumnos = new ArrayList<Alumno>();
    }
    
    private Alumno buscarAlumno(long dni) {
        for(Alumno alumno : this.alumnos){
            if(alumno.getDni() == dni){
                return alumno;
            }
        }
        return null;
    }
    
    public void registrarAlumno(Alumno alumno){
        if(buscarAlumno(alumno.getDni()) == null){
            alumnos.add(alumno);
        }
    }
    
    public void viewAlumnos(){
        System.out.println("\tDivision: " + this.id);
        for(Alumno alumno : this.alumnos){
            alumno.printData();
        }
    }
    
    public char getId() { return this.id; }
}
