package com.cursojava.curso.controllers;

import com.cursojava.curso.dao.UsuarioDao;
import com.cursojava.curso.dao.UsuarioDaoImp;
import com.cursojava.curso.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController // Sirve para manejar las urls
public class UsuarioController  {
    @Autowired
    private UsuarioDao usuarioDao;

    @RequestMapping(value = "api/usuario/{id}", method = RequestMethod.GET) // Indica el valor de la url donde queremos que funcione
    public Usuario getUsuario(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Steven");
        usuario.setApellido("Calderon");
        usuario.setEmail("sdc@gmail.com");
        usuario.setTelefono("0967185710");
        return usuario;
    }

    @RequestMapping(value = "api/usuarios",method = RequestMethod.GET) // Indica el valor de la url donde queremos que funcione
    public List<Usuario> getUsuarios(){
    return usuarioDao.getUsuarios();
    }

    @RequestMapping(value = "api/usuario/{id}", method = RequestMethod.DELETE)  // Indica el valor de la url donde queremos que funcione
    public void deleteUsuario(@PathVariable Long id){
       usuarioDao.eliminar(id);
    }

    @RequestMapping(value = "api/usuario",method = RequestMethod.POST) // Indica el valor de la url donde queremos que funcione
    public void registrarUsuario(@RequestBody Usuario usuario){
        usuarioDao.registrarUsuario(usuario);
    }
}
