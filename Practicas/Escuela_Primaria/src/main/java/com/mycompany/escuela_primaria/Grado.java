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
public class Grado {
    private int id;
    private ArrayList<Division> divisiones;
    
    public Grado(int id){
        this.id = id;
        this.divisiones = new ArrayList<Division>();
    }
    
    private Division buscarDivision(char id){
        for(Division div : this.divisiones){
            if(div.getId() == id){
                return div;
            }
        }
        return null;
    }
    
    public void registrarDivision(Division div){
        if(this.buscarDivision(div.getId()) == null){
            this.divisiones.add(div);
        }
    }
    
    public void printDivision(){
        System.out.println("Grado: " + this.id);
        for(Division div : this.divisiones){
            div.viewAlumnos();
            System.out.println("\n");
        }
    }
    
    public int getIdGrado() { return this.id; }
}
