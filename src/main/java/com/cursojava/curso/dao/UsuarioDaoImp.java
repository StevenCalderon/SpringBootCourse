package com.cursojava.curso.dao;

import com.cursojava.curso.models.Usuario;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Transactional
public class UsuarioDaoImp implements UsuarioDao{
    @Override
    public List<Usuario> getUsuarios() {
        return null;
    }
}
