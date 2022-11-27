import { Component, OnInit } from '@angular/core';
import {CommunicationService} from "../communication.service";

@Component({
  selector: 'app-child2-component',
  templateUrl: './child2-component.component.html',
  styleUrls: ['./child2-component.component.css']
})
export class Child2ComponentComponent implements OnInit {

  textFromBrother: string = ""

  constructor(private commService: CommunicationService) { }

  ngOnInit(): void {
  }


}
