import { Component } from '@angular/core';
import { Item } from './model/item';
import { ItemClientServiceService } from './services/item-client-service.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'coffee-store-ui';

  // an array of items
  items: Item[] = [];

  constructor(private itemService: ItemClientServiceService) {
    // this.itemService.getItems().subscribe(data => {
    //   this.items = data;
    // });
  }

  ngOnInit() {
    this.itemService.getItems().subscribe(data => {
      this.items = data;
    });
  }
}
