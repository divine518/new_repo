import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {About} from './about/about';
import {Home} from './home/home';
import {Registration} from './registration/registration';
import {Report} from './report/report';
import {EventUpload} from './eventUpload/eventUpload';
import { LoginComponent } from './login/login.component';
import { BloodFinderComponent } from './blood-finder/blood-finder.component';

const routes: Routes = [
  {path:'about',component:About},
  {path:'home',component:Home},
  {path:'bloodFinder',component:BloodFinderComponent},
  {path:'registration',component:Registration},
  {path:'login',component:LoginComponent},
  {path:'report',component:Report},
  {path:'eventUpload',component:EventUpload}
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
