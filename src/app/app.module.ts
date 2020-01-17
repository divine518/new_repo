import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {MatIconModule} from '@angular/material/icon';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import {MatMenuModule} from '@angular/material/menu';
import {MatButtonModule} from '@angular/material/button';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import { MatIconRegistry } from "@angular/material/icon";
import {About} from './about';
import {Home} from './home';
import {BloodFinder} from './bloodFinder';
import {Registration} from './registration';
import {MatCardModule} from '@angular/material/card';
import {MatInputModule} from '@angular/material/input';
import {FormsModule} from '@angular/forms';
import {MatRadioModule} from '@angular/material/radio';
import {MatDatepickerModule} from '@angular/material/datepicker';
import {MatNativeDateModule,MatSelectModule, MatRipple} from '@angular/material';
import { ScrollSpyDirective } from './scroll-spy.directive';
// import {MatSelectModule} from '@angular/material/select';
import { MDBBootstrapModule } from 'angular-bootstrap-md';   
import { LoremIpsumComponent } from './lorem-ipsum.component';
import { HttpClientModule } from "@angular/common/http";
import { MatRippleModule } from '@angular/material';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap'; 




//import { DomSanitizer } from "@angular/platform-browser";
@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    About,
    Home,
    BloodFinder,
    Registration,
  ScrollSpyDirective,
  LoremIpsumComponent

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatMenuModule,
    MatButtonModule,
    MatCardModule,
    MatInputModule,
    FormsModule,
    MatRadioModule,
    MatDatepickerModule,
    MatNativeDateModule,
    MatSelectModule,
    MatIconModule,
    HttpClientModule,
    MatRippleModule,
    MDBBootstrapModule.forRoot(),
    NgbModule
   // ,DomSanitizer
  ],
  exports:[MatRipple,MatIconModule],
  providers: [],
  bootstrap: [AppComponent]

})
export class AppModule {}
