/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portafolio.mgb.Interface;

import com.portafolio.mgb.Entity.Experiencia;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public interface IExperienciaService {
    public List<Experiencia> getExperiencia();
    public void saveExperiencia(Experiencia experiencia);
    public void deleteExperiencia (Long idExperiencia);
    public Experiencia findExperiencia (Long idExperiencia);
    
}
