import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { HeaderComponent } from './componentes/header/header.component';
import { InfoPersonalComponent } from './componentes/info-personal/info-personal.component';
import { InfoSitiosComponent } from './componentes/info-sitios/info-sitios.component';
import { TitulosComponent } from './componentes/titulos/titulos.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    InfoPersonalComponent,
    InfoSitiosComponent,
    TitulosComponent,
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
