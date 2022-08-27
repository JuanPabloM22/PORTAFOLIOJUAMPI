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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Lenovo
 */
@RestController
public class UsuarioController {
    @Autowired IUsuarioService iusuarioService;
    
    @GetMapping("usuarios/all")
    public List<Usuario> getUsuario(){
        return iusuarioService.getUsuario();
    }
    
    @PostMapping("/usuarios/crear")
    public String createUsuario(@RequestBody Usuario usuario){
            iusuarioService.saveUsuario(usuario);
            return "Creado Ok";
    }
    
    @DeleteMapping("/usuarios/borrar/{id}")
    public String deleteUsuario (@PathVariable Long id){
        Usuario usuario = iusuarioService.findUsuario(id);
        if(usuario == null){
            return "Ese usuario no existe";
        }
        else{
        iusuarioService.deleteUsuario(id);
        return "Borrado Ok";    
        }
        
    }
    @GetMapping("/usuarios/byId/{id}")
    public Usuario findUsuario (Long id){
        return iusuarioService.findUsuario(id);
    }
    
    /*
     @RequestParam("nombreUsuario") String nombreUsuario, 
                                @RequestParam("nombre") String nombre,
                                @RequestParam("apellido") String apellido,
                                @RequestParam("email") String email,
                                @RequestParam("password") String password,
                                @RequestParam("telefono") String telefono)
    
            user.setNombreUsuario(nombreUsuario);
        user.setNombreUsuario(nombre);
        user.setNombreUsuario(apellido);
        user.setNombreUsuario(email);
        user.setNombreUsuario(password);
        user.setNombreUsuario(telefono);
    */    
    @PutMapping("/usuarios/editar/{id}")
    public Usuario editUsuario(@PathVariable Long id, @RequestBody Usuario usuario){
        Usuario user = iusuarioService.findUsuario(id);
        if(user == null){
            return null;
        }
        else{
        user.setNombreUsuario(usuario.getNombreUsuario());
        user.setNombre(usuario.getNombre());
        user.setApellido(usuario.getApellido());
        user.setEmail(usuario.getEmail());
        user.setPassword(usuario.getPassword());
        user.setTelefono(usuario.getTelefono());
        
        iusuarioService.saveUsuario(user);
        
        return user;
        }
    }
    
    
}
