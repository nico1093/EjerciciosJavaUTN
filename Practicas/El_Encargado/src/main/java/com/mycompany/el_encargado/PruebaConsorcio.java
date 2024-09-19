/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.el_encargado;
/**
 *
 * @author Administrador
 */
public class PruebaConsorcio {

    public static void main(String[] args) {
        Departamento dpto1 = new Departamento(1, 100, "Pedro");
        Departamento dpto2 = new Departamento(2, 101, "Juan");
        Departamento dpto3 = new Departamento(3, 102, "Marta");
        Departamento dpto4 = new Departamento(4, 103, "Rocio");
        
        Edificio edificio = new Edificio("calle falsa", 5);
        edificio.registrarDpto(dpto1);
        edificio.registrarDpto(dpto2);
        edificio.registrarDpto(dpto3);
        edificio.registrarDpto(dpto4);
        
        edificio.registrarVoto(dpto1, TipoVoto.POSITIVO);
        edificio.registrarVoto(dpto3, TipoVoto.POSITIVO);
        edificio.registrarVoto(dpto4, TipoVoto.BLANCO);
        edificio.registrarVoto(dpto4, TipoVoto.NEGATIVO);
        
        edificio.mostrarVotosPositivos();
        System.out.println("Votos Realizados: " + edificio.cantidadVotacion() + "%");
    }
    
}
