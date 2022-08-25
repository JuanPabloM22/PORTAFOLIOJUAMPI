import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './componentes/header/header.component';
import { InfoPersonalComponent } from './componentes/info-personal/info-personal.component';
import { InfoSitiosComponent } from './componentes/info-sitios/info-sitios.component';
import { BotonComponent } from './componentes/boton/boton.component';
import { LoginComponent } from './componentes/login/login.component';
import { FormularioComponent } from './componentes/formulario/formulario.component';
import { PrincipalComponent } from './componentes/principal/principal.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    InfoPersonalComponent,
    InfoSitiosComponent,
    BotonComponent,
    LoginComponent,
    FormularioComponent,
    PrincipalComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
