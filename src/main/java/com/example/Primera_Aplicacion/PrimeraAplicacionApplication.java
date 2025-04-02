package com.example.Primera_Aplicacion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimeraAplicacionApplication {
    /**
    //Config Default
    public static void main(String[] args) {
        SpringApplication.run(PrimeraAplicacionApplication.class, args);
    }
    */
    /**
    //Prueba Unitaria servicio multiplicar
    public static void main(String[] args) {
        SpringApplication.run(PrimeraAplicacionApplication.class, args);
    }
    public int multiplicar(int a, int b) {
        return a * b;
    }
    */   
    /**   
    //Prueba Unitaria servicio Dividir
    public int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("El divisor no puede ser cero");
        }
        return a / b;
    }
    */
}
