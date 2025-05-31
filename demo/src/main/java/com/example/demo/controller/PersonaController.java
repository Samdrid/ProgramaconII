package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.PersonaDTO;

@RestController

public class PersonaController {

    
    @GetMapping("/")
    
    public String saludar(){

        return "Hola mundo";
    }

    @GetMapping("/despedir")
    public String despedir(){
        return "chao";

    }
    
    @GetMapping("/persona/{nombre}")
    public String saludarNombre (@PathVariable String nombre){
        return "Hola: " + nombre;
    }
    
    @GetMapping("/per")
    public PersonaDTO nombreApellido (
        @RequestParam(required = false) String nombre, 
        @RequestParam (required = false) String apellido){


        PersonaDTO per = new PersonaDTO();
        per.setApellido(apellido);
        per.setNombre(nombre);
        
        return per;
    }


}
 