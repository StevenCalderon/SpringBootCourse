package com.cursojava.curso.controllers;

import com.cursojava.curso.dao.UsuarioDao;
import com.cursojava.curso.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController // Sirve para manejar las urls
public class UsuarioController implements UsuarioDao {
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

    @RequestMapping(value = "usuarios") // Indica el valor de la url donde queremos que funcione
    public List<Usuario> getUsuarios(){
        List<Usuario> users = new ArrayList<Usuario>();
        Usuario usuario1 = new Usuario();
        usuario1.setId(123L);
        usuario1.setNombre("Steven");
        usuario1.setApellido("Calderon");
        usuario1.setEmail("sdc@gmail.com");
        usuario1.setTelefono("0967185710");

        Usuario usuario2 = new Usuario();
        usuario2.setId(124L);
            usuario2.setNombre("Juan");
        usuario2.setApellido("Calderon");
        usuario2.setEmail("juaa1@gmail.com");
        usuario2.setTelefono("09771857180");

        Usuario usuario3 = new Usuario();
        usuario3.setId(125L);
        usuario3.setNombre("Maria");
        usuario3.setApellido("Calderon");
        usuario3.setEmail("mar@gmail.com");
        usuario3.setTelefono("0967185710");

        Usuario usuario4 = new Usuario();
        usuario4.setId(126L);
        usuario4.setNombre("Kevin");
        usuario4.setApellido("Calderon");
        usuario4.setEmail("kev@gmail.com");
        usuario4.setTelefono("0965885710");

        Usuario usuario5 = new Usuario();
        usuario5.setId(127L);
        usuario5.setNombre("Pepe");
        usuario5.setApellido("Calderon");
        usuario5.setEmail("pepe@gmail.com");
        usuario5.setTelefono("0992485710");

        users.add(usuario1);
        users.add(usuario2);
        users.add(usuario3);
        users.add(usuario4);
        users.add(usuario5);
        return users;
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
