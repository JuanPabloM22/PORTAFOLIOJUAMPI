/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portafolio.mgb.Service;

import com.portafolio.mgb.Entity.Educacion;
import com.portafolio.mgb.Interface.IEducacionService;
import com.portafolio.mgb.Repository.IEducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

        
/**
 *
 * @author Lenovo
 */
 
@Service
public class EducacionService implements IEducacionService {
@Autowired IEducacionRepository ieducacionRepository;
    
    
    @Override
    public List<Educacion> getEducacion() {
        List<Educacion> educacions = ieducacionRepository.findAll();
        return educacions;
    }

    @Override
    public void saveEducacion(Educacion educacion) {
        ieducacionRepository.save(educacion);
    }

    @Override
    public void deleteEducacion(Long idEducacion) {
        ieducacionRepository.deleteById(idEducacion);
    }

    @Override
    public Educacion findEducacion(Long idEducacion) {
        Educacion educacion = ieducacionRepository.findById(idEducacion).orElse(null);
        return educacion;
    }
    
}