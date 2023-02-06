package com.cursojava.curso.dao;

import com.cursojava.curso.models.Usuario;

import java.util.List;

// Interfaces? Son un contrato que obliga a los que usen a implementar las funciones
public interface UsuarioDao {
    List<Usuario> getUsuarios();

    void eliminar(Long id);
    void registrarUsuario(Usuario usuario);

}
