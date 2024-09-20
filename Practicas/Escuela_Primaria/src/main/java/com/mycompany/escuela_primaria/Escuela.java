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
public class Escuela {
    private ArrayList<Grado> grados;
                    
    public Escuela(){
        this.grados = new ArrayList<Grado>();
    }
    
    private Grado buscarGrado(int id){
        for(Grado grado : this.grados){
            if(grado.getIdGrado() == id){
                return grado;
            }
        }
        return null;
    }
    
    public void registrarGrado(Grado grado){
        if(this.buscarGrado(grado.getIdGrado()) == null){
            this.grados.add(grado);
        }
    }
    
    public void printGrados(){
        for(Grado grado : this.grados){
            grado.printDivision();
        }
    }
}
