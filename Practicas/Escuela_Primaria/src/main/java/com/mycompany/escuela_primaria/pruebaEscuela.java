/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.escuela_primaria;

/**
 *
 * @author Administrador
 */
public class pruebaEscuela {

    public static void main(String[] args) {
        
        //Creacion de Alumnos
        Alumno a = new Alumno(12345678,"Alvarez Carlos");
        Alumno b = new Alumno(12345679,"Benitez Lola");
        Alumno c = new Alumno(12345698, "López Antonio");
        Alumno d = new Alumno(12347678, "Ramirez Ludmila");
        Alumno e = new Alumno(12355678, "Rolón Atilio");
        Alumno f = new Alumno(12341278, "Ladrillazo Estela");
        
        //Creacion de Divisiones
        Division a1 = new Division('A');
        Division b1 = new Division('B');
        Division a2 = new Division('A');
        
        //Cracion de Grados
        Grado g1 = new Grado(1);
        Grado g2 = new Grado(2);
        
        //Creacion de Escuela
        Escuela esc = new Escuela();
        
        //Asignaciones de Alumnos a diferentes Divisiones
        a1.registrarAlumno(a);
        a1.registrarAlumno(b);
        b1.registrarAlumno(c);
        b1.registrarAlumno(d);
        a2.registrarAlumno(e);
        a2.registrarAlumno(f);
        
        //Asignaciones de Divisiones a diferentes Grados
        g1.registrarDivision(a1);
        g1.registrarDivision(b1);
        g2.registrarDivision(a2);
        
        //Asignaciones de Grados a la Escuela
        esc.registrarGrado(g1);
        esc.registrarGrado(g2);
        
        
        //Visualizacion
        esc.printGrados();
    }
    
    
}
