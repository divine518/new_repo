import { Component,OnInit,NgZone } from '@angular/core';
import {FormBuilder, FormGroup, Validators, FormControl} from "@angular/forms";
import { HttpClientService } from '../service/http-client.service';

@Component({
  selector: 'eventUpload',
  templateUrl: './eventUpload.html'
})
export class EventUpload{
  constructor(private service: HttpClientService) { }
  selectedFile: File;
  receivedImageData: any;
  base64Data: any;
  imgURL: any;
  convertedImage: any;

 
  onFileChanged(event) {
    this.selectedFile = event.target.files[0];
    let reader = new FileReader();
    reader.readAsDataURL(event.target.files[0]);
    reader.onload = (event2) => {
      this.imgURL = reader.result;
    };
  }

  onUpload() {
  
 
    this.service.eventUpload(this.selectedFile,this.selectedFile.name).subscribe((response)=>{
      this.receivedImageData = response;
                       this.base64Data = this.receivedImageData.pic;
                       this.convertedImage = 'data:image/jpeg;base64,' + this.base64Data; 
    });
    // this.http.post('my-backend.com/file-upload', this.selectedFile)
    // .subscribe(event => {
    //   console.log(event); // handle event here
    // });

  }
  
  }
   