import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {About} from './about';
import {Home} from './home';
import {BloodFinder} from './bloodFinder';
import {Registration} from './registration';

const routes: Routes = [
  {path:'about',component:About},
  {path:'home',component:Home},
  {path:'bloodFinder',component:BloodFinder},
  {path:'registration',component:Registration}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
