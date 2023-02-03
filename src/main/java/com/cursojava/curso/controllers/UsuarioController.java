package com.cursojava.curso.controllers;

import com.cursojava.curso.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // Sirve para manejar las urls
public class UsuarioController {
    @RequestMapping(value = "usuario/{id}") // Indica el valor de la url donde queremos que funcione
    public Usuario getUsuario(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Steven");
        usuario.setApellido("Calderon");
        usuario.setEmail("sdc@gmail.com");
        usuario.setTelefono("0967185710");
        return usuario;
    }

    @RequestMapping(value = "usuario1") // Indica el valor de la url donde queremos que funcione
    public Usuario editUsuario(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Steven");
        usuario.setApellido("Calderon");
        usuario.setEmail("sdc@gmail.com");
        usuario.setTelefono("0967185710");
        return usuario;
    }

    @RequestMapping(value = "usuario2") // Indica el valor de la url donde queremos que funcione
    public Usuario modificateUsuario(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Steven");
        usuario.setApellido("Calderon");
        usuario.setEmail("sdc@gmail.com");
        usuario.setTelefono("0967185710");
        return usuario;
    }

    @RequestMapping(value = "usuario3") // Indica el valor de la url donde queremos que funcione
    public Usuario deleteUsuario(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Steven");
        usuario.setApellido("Calderon");
        usuario.setEmail("sdc@gmail.com");
        usuario.setTelefono("0967185710");
        return usuario;
    }

    @RequestMapping(value = "usuario4") // Indica el valor de la url donde queremos que funcione
    public Usuario searchUsuario(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Steven");
        usuario.setApellido("Calderon");
        usuario.setEmail("sdc@gmail.com");
        usuario.setTelefono("0967185710");
        return usuario;
    }

}
