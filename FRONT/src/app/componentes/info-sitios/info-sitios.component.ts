import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-info-sitios',
  templateUrl: './info-sitios.component.html',
  styleUrls: ['./info-sitios.component.css']
})
export class InfoSitiosComponent implements OnInit {
  titulo: string = "INFORMACION SITIOS";
  nombre: string = "portafolio";
  url: string = "www.portafolioJuanPabloMonserrat.com";
  constructor() { }

  ngOnInit(): void {
  }

}
