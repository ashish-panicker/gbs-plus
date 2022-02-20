import { TestBed } from '@angular/core/testing';

import { ItemClientServiceService } from './item-client-service.service';

describe('ItemClientServiceService', () => {
  let service: ItemClientServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ItemClientServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
