import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validator, Validators} from "@angular/forms";
import {FormComponent} from "../form/form.component";

@Component({
  selector: 'app-expense-form',
  templateUrl: './expense-form.component.html',
  styleUrls: ['./expense-form.component.css']
})
export class ExpenseFormComponent implements OnInit {
  addExpenseForm!: FormGroup

  constructor() {}

  ngOnInit(): void {
    this.addExpenseForm = new FormGroup({
      'amount': new FormControl(null, Validators.required),
      'interval': new FormControl(null, [Validators.pattern('^[0-9]*$'), Validators.required])
    })
  }

  addExpense() {

  }

}
