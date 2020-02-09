import { Component, OnInit } from '@angular/core';
import { MatIconRegistry } from '@angular/material';
import { DomSanitizer } from '@angular/platform-browser';
import { FormControl, Validators } from '@angular/forms';
export interface PeriodicElement {
  Name: string;
  No: number;
  Blood: string;
  Place: string;
}
export interface dropDown {
  value: string;
  viewValue: string;
}

const ELEMENT_DATA: PeriodicElement[] = [
  {No: 1, Name: 'Nivetha', Blood: 'B+', Place: 'H'},
  {No: 2, Name: 'Tamil', Blood:'B-', Place: 'He'},
  {No: 3, Name: 'Murugan', Blood: 'B+', Place: 'Li'},
  {No: 4, Name: 'Siva', Blood: 'A-', Place: 'Be'}
];

@Component({
  selector: 'app-blood-finder',
  templateUrl: './blood-finder.component.html',
  styleUrls: ['./blood-finder.component.scss']
})
export class BloodFinderComponent implements OnInit {
  model: any = {};
  blood = new FormControl('', [Validators.required]);
public compProp:any=[];
public dataSource:any=[];
  constructor(
    private matIconRegistry: MatIconRegistry,
    private domSanitizer: DomSanitizer
  ){
    this.matIconRegistry.addSvgIcon(
      "blood",
      this.domSanitizer.bypassSecurityTrustResourceUrl("../../assets/images/blood_icon.svg")
    ) 
  }
  ngOnInit() {
    this.compProp=["No","Name","Blood","Place"];
  this.dataSource = ELEMENT_DATA;
  console.log(this.compProp);
  console.log(this.dataSource);
  }
  onSearchClick(values){
    console.log(values);
  }
  bloods: dropDown[] = [
    {value: 'A+', viewValue: 'A+'},
    {value: 'A-', viewValue: 'A-'},
    {value: 'B+', viewValue: 'B+'},
    {value: 'B-', viewValue: 'B-'},
    {value: 'O-', viewValue: 'O-'},
    {value: 'O+', viewValue: 'O+'},
    {value: 'AB+', viewValue: 'AB+'},
    {value: 'AB-', viewValue: 'AB-'}
  ];
}
