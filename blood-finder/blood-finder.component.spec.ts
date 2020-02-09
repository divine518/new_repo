import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BloodFinderComponent } from './blood-finder.component';

describe('BloodFinderComponent', () => {
  let component: BloodFinderComponent;
  let fixture: ComponentFixture<BloodFinderComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BloodFinderComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BloodFinderComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
