
import {Component} from '@angular/core';

import {About} from '../about';
import { MatIconRegistry } from "@angular/material/icon";
@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.scss']
})
export class HeaderComponent  {

  constructor() { }
 
  scrollTo(section) {
    document.querySelector('#' + section)
    .scrollIntoView();
  }
}
