/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portafolio.mgb.Controller;

import com.portafolio.mgb.Entity.SitioWeb;
import com.portafolio.mgb.Interface.ISitioWebService;
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
public class SitioWebController {
 @Autowired ISitioWebService isitioWebService;
    
    @GetMapping("sitioWeb/all")
    public List<SitioWeb> getSitioWeb(){
        return isitioWebService.getSitioWeb();
    }
    
    @PostMapping("/sitioWeb/crear")
    public String createSitioWeb(@RequestBody SitioWeb sitioWeb){
            isitioWebService.saveSitioWeb(sitioWeb);
            return "Creado Ok";
    }
    
    @DeleteMapping("/sitioWeb/borrar/{id}")
    public String deleteSitioWeb (@PathVariable Long id){
         SitioWeb sitioWeb = isitioWebService.findSitioWeb(id);
        if(sitioWeb == null){
            return "Esa skill no existe";
        }
        else{

        
        isitioWebService.deleteSitioWeb(id);
        return "Borrado Ok";
       
        }
    }
    @GetMapping("/sitioWeb/byId{id}")
    public SitioWeb findSitioWeb (Long id){
        return isitioWebService.findSitioWeb(id);
    }
    
     @PutMapping("/sitioWeb/editar/{id}")
    public SitioWeb editSitiWeb(@PathVariable Long id, @RequestBody SitioWeb sitioWebNew)
                                
                            {
        SitioWeb sitioWeb = isitioWebService.findSitioWeb(id);
       
         if(sitioWeb == null){
            return null;
         }
        else{
        
        sitioWeb.setDescripcion(sitioWebNew.getDescripcion());
        sitioWeb.setUrl(sitioWebNew.getUrl());
        
        isitioWebService.saveSitioWeb(sitioWeb);
        
        
        return sitioWeb;
	}  
        }
}
