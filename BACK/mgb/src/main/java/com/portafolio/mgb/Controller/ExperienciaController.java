/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portafolio.mgb.Controller;

import com.portafolio.mgb.Entity.Experiencia;
import com.portafolio.mgb.Interface.IExperienciaService;
import java.util.Date;
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

@RestController
/**
 *
 * @author Lenovo
 */
public class ExperienciaController {
  @Autowired IExperienciaService iexperienciaService;
    
    @GetMapping("experiencia/all")
    public List<Experiencia> getExperiencia(){
        return iexperienciaService.getExperiencia();
    }
    
    @PostMapping("/experiencia/crear")
    public String createExperiencia(@RequestBody Experiencia experiencia){
            iexperienciaService.saveExperiencia(experiencia);
            return "Creado Ok";
    }
    
    @DeleteMapping("/experiencia/borrar/{id}")
    public String deleteExperiencia (@PathVariable Long id){
        Experiencia experiencia = iexperienciaService.findExperiencia(id);
    
        if(experiencia == null){
            return "Esa Experiencia no existe";
        }
        else{

        iexperienciaService.deleteExperiencia(id);
        
        return "Borrado Ok";
    }
         }

    @GetMapping("/experiencia/byId/{id}")
    public Experiencia findExperiencia (Long idExperiencia){
        return iexperienciaService.findExperiencia(idExperiencia);
    }
  @PutMapping("/experiencia/editar/{id}")
    public Experiencia editExperiencia(@PathVariable Long id, @RequestBody Experiencia experienciaNew)
                               {
        Experiencia experiencia = iexperienciaService.findExperiencia(id);
        
       
        if(experiencia== null){
            return null;
        }
        else{
        
        experiencia.setDescripcion(experienciaNew.getDescripcion());
        experiencia.setFechaInicio(experienciaNew.getFechaInicio());
        experiencia.setFechaFin(experienciaNew.getFechaFin());
        iexperienciaService.saveExperiencia(experiencia);
        
        return experiencia;
            }
	}   
}
