/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Primera_Aplicacion;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

@RestController
public class ControladorREST {
    
    /**
    @GetMapping
    public String comienzo (){
        return "Hola Mundo";
    }
    */
    
    /**
    //Prueba de integracion Calculadora
    @GetMapping("/sumar")
    public Resultado sumar(@RequestParam int a, @RequestParam int b) {
        int suma = a + b;
        return new Resultado(suma);
    }

    public static class Resultado {

        private int resultado;

        public Resultado(int resultado) {
            this.resultado = resultado;
        }

        public int getResultado() {
            return resultado;
        }

        public void setResultado(int resultado) {
            this.resultado = resultado;
        }
    }
    */
    
    
    //Prueba de integracion Fecha
    @GetMapping("/fecha")
    public LocalDate fecha() {
        return LocalDate.now();
    }
}
