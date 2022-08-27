/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portafolio.mgb.Interface;

import com.portafolio.mgb.Entity.Skill;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public interface ISkillService {
  public List<Skill> getSkill();
    public void saveSkill(Skill skill);
    public void deleteSkill (Long idSkill);
    public Skill findSkill (Long idSkill);  
}
