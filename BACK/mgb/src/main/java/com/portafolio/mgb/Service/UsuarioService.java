/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portafolio.mgb.Service;


import com.portafolio.mgb.Entity.Usuario;
import com.portafolio.mgb.Interface.IUsuarioService;
import com.portafolio.mgb.Repository.IUsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Lenovo
 */
@Service
public class UsuarioService implements IUsuarioService {
@Autowired IUsuarioRepository iusuarioRepository;
    
    
    @Override
    public List<Usuario> getUsuario() {
        List<Usuario> usuarios = iusuarioRepository.findAll();
        return usuarios;
    }

    @Override
    public void saveUsuario(Usuario usuario) {
        iusuarioRepository.save(usuario);
    }

    @Override
    public void deleteUsuario(Long idUsuario) {
        iusuarioRepository.deleteById(idUsuario);
    }

    @Override
    public Usuario findUsuario(Long idUsuario) {
        Usuario usuario = iusuarioRepository.findById(idUsuario).orElse(null);
        return usuario;
    }
    
}
    
