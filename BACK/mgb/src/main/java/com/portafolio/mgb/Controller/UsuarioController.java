/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portafolio.mgb.Controller;

import com.portafolio.mgb.Entity.Usuario;
import com.portafolio.mgb.Interface.IUsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Lenovo
 */
@RestController
public class UsuarioController {
    @Autowired IUsuarioService iusuarioService;
    
    @GetMapping("/usuarios/all")
    public List<Usuario> getUsuario(){
        return iusuarioService.getUsuario();
    }
    
    @PostMapping("/usuarios/crear")
    public String createUsuario(@RequestBody Usuario usuario){
            iusuarioService.saveUsuario(usuario);
            return "Creado Ok";
    }
    
    @DeleteMapping("/usuarios/borrar/{id}")
    public String deleteUsuario (@PathVariable Long idUsuario){
        iusuarioService.deleteUsuario(idUsuario);
        return "Borrado Ok";
    }
    @GetMapping("/usuarios/byId{id}")
    public Usuario findUsuario (Long idUsuario){
        return iusuarioService.findUsuario(idUsuario);
    }
    
    
}
