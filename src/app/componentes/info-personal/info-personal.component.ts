import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-info-personal',
  templateUrl: './info-personal.component.html',
  styleUrls: ['./info-personal.component.css']
})
export class InfoPersonalComponent implements OnInit {

  titulo: string = "INFORMACION PERSONAL";
  nombre: string = "Juan Pablo";
  apellido: string = "Monserrat";
  fechaNac: string = "28/05/1982";
  ciudad: string = "Córdoba";
  telefono: string = "(351) 030-3456";
  mail: string = "c-p-a-b@hotmail.com";
  

  constructor() { }

  ngOnInit(): void {
  }

}
