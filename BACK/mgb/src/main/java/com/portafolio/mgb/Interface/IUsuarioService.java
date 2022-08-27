/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portafolio.mgb.Interface;

import com.portafolio.mgb.Entity.Usuario;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public interface IUsuarioService {
    public List<Usuario> getUsuario();
    public void saveUsuario(Usuario usuario);
    public void deleteUsuario (Long idUsuario);
    public Usuario findUsuario (Long idUsuario);
    
    
}
