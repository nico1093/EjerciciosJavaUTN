/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.el_encargado;


/**
 *
 * @author Administrador
 */
public class Departamento {
    private int nroUnidad;
    private int dni;
    private String nombre;
    private TipoVoto voto;
    
    public Departamento(int nroUnidad, int dni, String nombre){
        this.nroUnidad = nroUnidad;
        this.dni = dni;
        this.nombre = nombre;
    }
    
    public void setDueño(int dni, String nombre){
        this.dni = dni;
        this.nombre = nombre;
    }
    
    public void setVoto(TipoVoto voto){
        if (this.voto == null){
            this.voto = voto;
        }else{
            System.out.println("El dueño ya realizo el voto!!");
        }
    }
    
    public int getNroUnidad(){ return this.nroUnidad; }
    public TipoVoto getVoto(){ return this.voto; }
    public String getNombre() { return this.nombre; }
    public int getDni() { return dni; }
}
