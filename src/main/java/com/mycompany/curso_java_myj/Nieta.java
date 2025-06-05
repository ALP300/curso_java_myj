/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.curso_java_myj;

/**
 *
 * @author aitor
 */
public class Nieta extends Hija{
    private String musica;

    public Nieta(String nombre, int edad, String musica) {
        super(nombre, edad);
        this.musica= musica;
    }

    public String getMusica() {
        return musica;
    }

    public void setMusica(String musica) {
        this.musica = musica;
    }
    

    
    
}
