package com.portafolio.mgb.Service;

import com.portafolio.mgb.Entity.Experiencia;
import com.portafolio.mgb.Interface.IExperienciaService;
import com.portafolio.mgb.Repository.IExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */@Service
public class ExperienciaService implements IExperienciaService {
@Autowired IExperienciaRepository iexperienciaRepository;
    
    
    @Override
    public List<Experiencia> getExperiencia() {
        List<Experiencia> experiencias = iexperienciaRepository.findAll();
        return experiencias;
    }

    @Override
    public void saveExperiencia(Experiencia experiencia) {
        iexperienciaRepository.save(experiencia);
    }

    @Override
    public void deleteExperiencia(Long idExperiencia) {
        iexperienciaRepository.deleteById(idExperiencia);
    }

    @Override
    public Experiencia findExperiencia(Long idExperiencia) {
        Experiencia experiencia = iexperienciaRepository.findById(idExperiencia).orElse(null);
        return experiencia;
    }
    
}
