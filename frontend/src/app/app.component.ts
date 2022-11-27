import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'budget-book-app-frontend';
  toChild: string = "Hello Child"
  fromChildVariable: string = ""

  fromChild(data: string) {
    this.fromChildVariable = data
  }
}
