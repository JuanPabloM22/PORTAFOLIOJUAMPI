/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portafolio.mgb.Service;

import com.portafolio.mgb.Entity.Skill;
import com.portafolio.mgb.Interface.ISkillService;
import com.portafolio.mgb.Repository.ISkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
/**
 *
 * @author Lenovo
 */
public class SkillService implements ISkillService {
@Autowired ISkillRepository iskillRepository;
    
    
    @Override
    public List<Skill> getSkill() {
        List<Skill> skills = iskillRepository.findAll();
        return skills;
    }

    @Override
    public void saveSkill(Skill skill) {
        iskillRepository.save(skill);
    }

    @Override
    public void deleteSkill(Long idSkill) {
        iskillRepository.deleteById(idSkill);
    }

    @Override
    public Skill findSkill(Long idSkill) {
        Skill skill = iskillRepository.findById(idSkill).orElse(null);
        return skill;
    }
    
}