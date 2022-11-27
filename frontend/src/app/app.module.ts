import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { FormComponent } from './form/form.component';
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import { Child2ComponentComponent } from './child2-component/child2-component.component';
import {CommunicationService} from "./communication.service";
import { ExpenseFormComponent } from './expense-form/expense-form.component';
import {AppRoutingModules} from "./app-routing.modules";

@NgModule({
  declarations: [
    AppComponent,
    FormComponent,
    Child2ComponentComponent,
    ExpenseFormComponent
  ],
    imports: [
        BrowserModule,
        FormsModule,
        AppRoutingModules,
        ReactiveFormsModule
    ],
  providers: [CommunicationService],
  bootstrap: [AppComponent]
})
export class AppModule { }
