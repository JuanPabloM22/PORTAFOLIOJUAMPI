import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './componentes/login/login.component';
import { FormularioComponent } from './componentes/formulario/formulario.component';
import { PrincipalComponent } from './componentes/principal/principal.component';

const routes: Routes = [
  { path: '', component: PrincipalComponent },
  { path: 'login', component: LoginComponent },
  { path: 'contacto', component: FormularioComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }