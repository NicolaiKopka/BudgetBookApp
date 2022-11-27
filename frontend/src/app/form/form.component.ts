import {Component, EventEmitter, Input, OnInit, Output, ViewChild} from '@angular/core';
import {CommunicationService} from "../communication.service";

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.css']
})


export class FormComponent implements OnInit {

  @Input() fromParent: string = ""
  @Output() toParent: EventEmitter<string> = new EventEmitter()

  public inputData: string = ""
  public outputData: string = ""

  constructor(private commService: CommunicationService) {
  }

  ngOnInit(): void {
  }

  printText() {
    this.outputData = this.inputData
  }

  testTalk() {
    this.commService.talkWithBrother("Hello Brother")
  }

  talkToParent() {
    this.toParent.emit("Hello Dad")
  }

}
