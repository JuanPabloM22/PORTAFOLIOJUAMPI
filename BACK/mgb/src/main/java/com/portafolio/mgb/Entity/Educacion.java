/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portafolio.mgb.Entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Lenovo
 */
@Getter @Setter
@Entity
 

public class Educacion {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long IdEducacion;
     
     private String descripcion;
     private String institucion;
     private Date fechaInicio;
     private Date fechaFin;
     private Long idUsuario;
     
    }