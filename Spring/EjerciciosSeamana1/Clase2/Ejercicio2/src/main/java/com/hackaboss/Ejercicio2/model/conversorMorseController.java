package com.hackaboss.Ejercicio2.model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.HashMap;

@RestController
public class conversorMorseController {

    private static final Map<Character, String> MORSE_CODE_MAP = new HashMap<>();

    static {
        MORSE_CODE_MAP.put('A', ".-");
        MORSE_CODE_MAP.put('B', "-...");
        MORSE_CODE_MAP.put('C', "-.-.");
        MORSE_CODE_MAP.put('D', "-..");
        MORSE_CODE_MAP.put('E', ".");
        MORSE_CODE_MAP.put('F', "..-.");
        MORSE_CODE_MAP.put('G', "--.");
        MORSE_CODE_MAP.put('H', "....");
        MORSE_CODE_MAP.put('I', "..");
        MORSE_CODE_MAP.put('J', ".---");
        MORSE_CODE_MAP.put('K', "-.-");
        MORSE_CODE_MAP.put('L', ".-..");
        MORSE_CODE_MAP.put('M', "--");
        MORSE_CODE_MAP.put('N', "-.");
        MORSE_CODE_MAP.put('O', "---");
        MORSE_CODE_MAP.put('P', ".--.");
        MORSE_CODE_MAP.put('Q', "--.-");
        MORSE_CODE_MAP.put('R', ".-.");
        MORSE_CODE_MAP.put('S', "...");
        MORSE_CODE_MAP.put('T', "-");
        MORSE_CODE_MAP.put('U', "..-");
        MORSE_CODE_MAP.put('V', "...-");
        MORSE_CODE_MAP.put('W', ".--");
        MORSE_CODE_MAP.put('X', "-..-");
        MORSE_CODE_MAP.put('Y', "-.--");
        MORSE_CODE_MAP.put('Z', "--..");
    }

  /*  // Ejercicio 2
    @GetMapping("/descifrar")
    public String convertir(@RequestParam("palabra")String palabra){

        palabra = palabra.toUpperCase();
        StringBuilder resultado = new StringBuilder();

        for (char caracter : palabra.toCharArray()) {
            String codigoMorse = MORSE_CODE_MAP.getOrDefault(caracter, "");
            resultado.append(codigoMorse).append(" ");
        }

        return resultado.toString().trim();
    }

   */

    // Ejercicio 3

    private String descifrarPalabra(String palabra) {
        StringBuilder resultadoPalabra = new StringBuilder();

        for (char caracter : palabra.toCharArray()) {
            if (Character.isLetterOrDigit(caracter)) {
                String codigoMorse = MORSE_CODE_MAP.getOrDefault(caracter, "");
                resultadoPalabra.append(codigoMorse).append(" ");
            }
        }

        return resultadoPalabra.toString().trim();
    }

    @GetMapping("/descifrar")
    public String descifrarAMorse(@RequestParam("mensaje") String mensaje) {
        mensaje = mensaje.toUpperCase();
        StringBuilder resultado = new StringBuilder();

        String[] palabras = mensaje.split(" ");

        for (String palabra : palabras) {
            resultado.append(descifrarPalabra(palabra)).append("   ");
        }

        return resultado.toString().trim();
    }


}
