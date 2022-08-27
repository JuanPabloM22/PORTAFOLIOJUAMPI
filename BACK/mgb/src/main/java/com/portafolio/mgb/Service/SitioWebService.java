/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portafolio.mgb.Service;

import com.portafolio.mgb.Entity.SitioWeb;
import com.portafolio.mgb.Interface.ISitioWebService;
import com.portafolio.mgb.Repository.ISitioWebRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

/**
 *
 * @author Lenovo
 */
public class SitioWebService implements ISitioWebService {
@Autowired ISitioWebRepository isitioWebRepository;
    
    
    @Override
    public List<SitioWeb> getSitioWeb() {
        List<SitioWeb> sitioWebs = isitioWebRepository.findAll();
        return sitioWebs;
    }

    @Override
    public void saveSitioWeb(SitioWeb sitioWeb) {
        isitioWebRepository.save(sitioWeb);
    }

    @Override
    public void deleteSitioWeb(Long idSitioWeb) {
        isitioWebRepository.deleteById(idSitioWeb);
    }

    @Override
    public SitioWeb findSitioWeb(Long idSitioWeb) {
        SitioWeb sitioWeb = isitioWebRepository.findById(idSitioWeb).orElse(null);
        return sitioWeb;
    }
    
}
