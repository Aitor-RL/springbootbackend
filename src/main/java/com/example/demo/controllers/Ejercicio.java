package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ejercicio {
    // http://localhost:8080/
    @GetMapping("/")
    public String greet() {
        return "Bienvenido al servidor backend";
    }

    // http://localhost:8080/aleatorio
    @GetMapping("/aleatorio")
    public String numberRandom() {
        long r = Math.round(Math.random() * 10000);
        return r + "";
    }

    // http://localhost:8080/palindromo/ana
    @GetMapping("/palindromo/{name}")
    public String isPalindrome(@PathVariable String name) {
        boolean palindrome = Utils.isPalindrome(name);
        return palindrome ? "Si es palíndromo" : "No es palindromo";
        // if(name.equals(reverseName)) return "Si es un palíndromo";
        // else return "No es un palíndromo";
    }
}
