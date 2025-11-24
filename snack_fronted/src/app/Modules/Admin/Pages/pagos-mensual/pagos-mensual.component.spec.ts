import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PagosMensualComponent } from './pagos-mensual.component';

describe('PagosMensualComponent', () => {
  let component: PagosMensualComponent;
  let fixture: ComponentFixture<PagosMensualComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [PagosMensualComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PagosMensualComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
