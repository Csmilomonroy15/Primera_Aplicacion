package com.example.Primera_Aplicacion;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import java.time.LocalDate;

@SpringBootTest
@AutoConfigureMockMvc
class PrimeraAplicacionApplicationTests {
    /**Configuracion por default
         
        */
    @Test
         void contextLoads() {
         }
         
    /**Prueba de integracion Fecha
     * @Autowired
     * private MockMvc mockMvc;
     * @Test
     * void testFechaEndpoint() throws Exception {
     * LocalDate fechaActual = LocalDate.now();
     * mockMvc.perform(get("/fecha"))
     * .andExpect(status().isOk())
     * .andExpect(content().string(fechaActual.toString()));
     * }
    */
    /**Prueba de integracion Calculadora
     * @Autowired
     * private MockMvc mockMvc;
     * @Test
     * void testSumarEndpoint() throws Exception {
     * mockMvc.perform(get("/sumar")
     * .param("a", "2")
     * .param("b", "3"))
     * .andExpect(status().isOk())
     * .andExpect(jsonPath("$.resultado").value(5));
     * }
    */
    
    /**Prueba Unitaria servicio multiplicar
         * @Autowired
         * private PrimeraAplicacionApplication multiplicadoraService;
         * @Test
         * void contextLoads() {
         * }
         * @Test
         * void testMultiplicar() {
         * int resultado = multiplicadoraService.multiplicar(4, 5);
         * assertEquals(20, resultado, "La multiplicación de 4 y 5 debería ser 20");
         * }
         */
        /**Prueba Unitaria servicio Dividir
         *@Autowired
         * private PrimeraAplicacionApplication divisoraService;
         * @Test
         * void testDividir() {
         * int resultado = divisoraService.dividir(10, 2);
         * assertEquals(5, resultado, "La división de 10 entre 2 debería ser 5");
         * }
         * @Test
         * void testDividirPorCero() {
         * assertThrows(IllegalArgumentException.class, () -> {
         * divisoraService.dividir(10, 0);
         * }, "Dividir por cero debería lanzar IllegalArgumentException");
         * }
         */
    
}
