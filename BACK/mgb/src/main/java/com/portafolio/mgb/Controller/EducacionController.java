/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portafolio.mgb.Controller;

import com.portafolio.mgb.Entity.Educacion;
import com.portafolio.mgb.Interface.IEducacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EducacionController {
@Autowired IEducacionService ieducacionService;
    
    @GetMapping("educacion/all")
    public List<Educacion> getEducacion(){
        return ieducacionService.getEducacion();
    }
    
    @PostMapping("/educacion/crear")
    public String createEducacion(@RequestBody Educacion educacion){
            ieducacionService.saveEducacion(educacion);
            return "Creado Ok";
    }
    
    @DeleteMapping("/educacion/borrar/{id}")
    public String deleteEducacion (@PathVariable Long idEducacion){
         Educacion educacion = ieducacionService.findEducacion(idEducacion);
        if(educacion == null){
            return "Esa educacion no existe";
        }
        else{

        
        ieducacionService.deleteEducacion(idEducacion);
        return "Borrado Ok";
       
        }
    }
    @GetMapping("/educacion/byId/{id}")
    public Educacion findEducacion (Long idEducacion){
        return ieducacionService.findEducacion(idEducacion);
    }
    
     @PutMapping("/educacion/editar/{id}")
    public Educacion editSitiWeb(@PathVariable Long idEducacion, @RequestBody Educacion educacionNew)
                                
                            {
        Educacion educacion = ieducacionService.findEducacion(idEducacion);
       
         if(educacion == null){
            return null;
         }
        else{
        
        educacion.setDescripcion(educacionNew.getDescripcion());
        educacion.setInstitucion(educacionNew.getInstitucion());
        educacion.setFechaInicio(educacionNew.getFechaInicio()); 
        educacion.setFechaFin(educacionNew.getFechaFin());
        
        ieducacionService.saveEducacion(educacion);
        
        
        return educacion;
	}  
        }
}
