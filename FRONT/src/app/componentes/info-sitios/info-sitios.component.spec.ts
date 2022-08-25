import { ComponentFixture, TestBed } from '@angular/core/testing';

import { InfoSitiosComponent } from './info-sitios.component';

describe('InfoSitiosComponent', () => {
  let component: InfoSitiosComponent;
  let fixture: ComponentFixture<InfoSitiosComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ InfoSitiosComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(InfoSitiosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
