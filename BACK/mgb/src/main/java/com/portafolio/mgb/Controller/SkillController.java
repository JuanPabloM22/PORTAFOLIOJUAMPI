/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portafolio.mgb.Controller;

import com.portafolio.mgb.Entity.Skill;
import com.portafolio.mgb.Interface.ISkillService;
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
public class SkillController {
     @Autowired ISkillService iskillService;
    
    @GetMapping("skills/all")
    public List<Skill> getSkill(){
        return iskillService.getSkill();
    }
    
    @PostMapping("/skills/crear")
    public String createSkill(@RequestBody Skill skill){
            iskillService.saveSkill(skill);
            return "Creado Ok";
    }
    
    @DeleteMapping("/skills/borrar/{id}")
    public String deleteSkill (@PathVariable Long id){
        Skill skill = iskillService.findSkill(id);
        if(skill == null){
            return "Esa skill no existe";
        }
        else{
        iskillService.deleteSkill(id);
        return "Borrado Ok";
        }
    }
    @GetMapping("/skills/byId{id}")
    public Skill findSkill (Long id){
        return iskillService.findSkill(id);
    }
    
    @PutMapping("/skills/editar/{id}")
    public Skill editSkill(@PathVariable Long id, @RequestBody Skill skillNew)
                                {
        Skill skill = iskillService.findSkill(id);
        
        if(skill == null){
            return null;
        }
        else{
        
        skill.setDescripcion(skillNew.getDescripcion());
        
        
        iskillService.saveSkill(skill);
        
        return skill;
            }
	}
}
