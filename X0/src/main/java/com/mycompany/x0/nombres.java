/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.x0;

/**
 *
 * @author edwinhernandezlopez
 */
public class nombres {
 private String nombreX;
 private String nombre0;
    
 private static nombres[] usuarios = new nombres[2];
 
 private static int contador=0;
 
 public nombres (String nombreX, String nombre0){
     this.nombreX=nombreX;
     this.nombre0=nombre0;
     
 }
 
 public String getNombreX(){
     return nombreX;
     
 }
 
 public String getNombre0(){
     return nombre0;
     
 }
 
 public static void agregarNombre (nombres usuario){
     if (contador<usuarios.length){
         usuarios[contador]=usuario;
         contador++;
     }
 }
}