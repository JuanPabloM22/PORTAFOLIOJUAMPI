import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-info-personal',
  templateUrl: './info-personal.component.html',
  styleUrls: ['./info-personal.component.css']
})
export class InfoPersonalComponent implements OnInit {

  titulo: string = "INFORMACION PERSONAL";
  constructor() { }

  ngOnInit(): void {
  }

}
