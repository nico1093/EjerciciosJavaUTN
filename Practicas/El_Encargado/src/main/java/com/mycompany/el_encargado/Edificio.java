/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.el_encargado;

import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public class Edificio {
    private String direccion;
    private int cantDptos;
    private ArrayList<Departamento> departamentos;
    private int position = 0;
    
    public Edificio(String direccion, int cantDptos){
        this.direccion = direccion;
        this.cantDptos = cantDptos;
        this.departamentos = new ArrayList<Departamento>();
    }
    
    public Departamento buscarDepartamento(int idDpto){
        for(Departamento dpto : this.departamentos){
            if(dpto.getNroUnidad() == idDpto){
                return dpto;
            }
        }
        return null;
    }
    
    public void registrarDpto(Departamento departamento){
        if(this.buscarDepartamento(departamento.getNroUnidad()) == null && this.cantDptos > departamentos.size()){
            this.departamentos.add(departamento);
            this.position++;
        }
    }
    
    public void registrarVoto(Departamento dpto, TipoVoto voto){
        if(this.buscarDepartamento(dpto.getNroUnidad()) != null){
            dpto.setVoto(voto);
        }else{
            System.out.println("El departamento especificado no pertenece al Edificio.");
        }
    }
    
    public void mostrarVotosPositivos(){
        for(Departamento dpto : this.departamentos){
            if(dpto.getVoto() == TipoVoto.POSITIVO){
                System.out.printf("Voto Positivo: nombre %s y dni %d \n",dpto.getNombre(), dpto.getDni());
            }
        }
    }
    
    public int cantidadVotacion(){
        int cantVotos = 0;
        for(Departamento dpto : this.departamentos){
            if(dpto.getVoto() != null){
                cantVotos++;
            }
        }
        return cantVotos / this.cantDptos * 100;
    }
}
