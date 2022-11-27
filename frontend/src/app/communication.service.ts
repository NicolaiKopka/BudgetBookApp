import {EventEmitter, Injectable} from "@angular/core";
import {AppModule} from "./app.module";

@Injectable({
  providedIn: "root"
}) export class CommunicationService {
  talk: string = ""
  message: EventEmitter<string> = new EventEmitter()

  talkWithBrother(data: string) {
    this.talk = data
    console.log(this.talk)
  }

  messageEmitter() {
    this.message.emit(this.talk)
  }
}
