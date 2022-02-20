import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Item } from '../model/item';

@Injectable({
  providedIn: 'root'
})
export class ItemClientServiceService {

  URL = 'http://localhost:9000/api/items';

  constructor(private http: HttpClient) { }

  getItems() {
    return this.http.get<Item[]>(this.URL);
  }

}
