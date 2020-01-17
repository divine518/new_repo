import { Component } from '@angular/core';
import { NgbCarouselConfig } from '@ng-bootstrap/ng-bootstrap';  
@Component({
  selector: 'home',
  templateUrl:'./home.html',
  styleUrls:['./home.scss']
})
export class Home {
  constructor(config: NgbCarouselConfig) {  
    config.interval = 2000;  
    config.wrap = true;  
    config.keyboard = false;  
    config.pauseOnHover = false;  
  }    
    ngOnInit(){ 
   // document.body.classList.add('bg-img');
    }
//     $("#myCarousel").carousel();

// // Enable Carousel Indicators
// $(".item").click(function(){
//   $("#myCarousel").carousel(1);
// });

// // Enable   Controls
// $(".left").click(function(){
//   $("#myCarousel").carousel("prev");
// });

} 