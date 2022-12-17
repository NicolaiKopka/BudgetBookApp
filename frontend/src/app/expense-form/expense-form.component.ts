import {Component, Injectable, OnInit} from '@angular/core';
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {AddExpenseInformationPayload} from "./model";
import {HttpClient} from "@angular/common/http";

@Component({
    selector: 'app-expense-form',
    templateUrl: './expense-form.component.html',
    styleUrls: ['./expense-form.component.css']
})

@Injectable()
export class ExpenseFormComponent implements OnInit {
    addExpenseForm!: FormGroup
    payload!: AddExpenseInformationPayload

    constructor(private http: HttpClient) {
    }

    ngOnInit(): void {
      this.http.post(
        'http://localhost:8080/expenses',
        {
          amount: 123,
          interval: 2,
          intervalSpecification: 'monthly',
          dueDate: '22-2-22'
        })
        this.addExpenseForm = new FormGroup({
            'amount': new FormControl(null, Validators.required),
            'interval': new FormControl(null, [Validators.pattern('^[0-9]*$'), Validators.required]),
            'intervalSpecification': new FormControl(null, Validators.required),
            'dueDate': new FormControl(null, Validators.required)
        })
    }

    addExpense(): void {
        /*this.payload.amount = this.addExpenseForm.get('amount')?.value
        this.payload.interval = this.addExpenseForm.get('interval')!.value
        this.payload.intervalSpecification = this.addExpenseForm.get('intervalSpecification')!.value
        this.payload.dueDate = this.addExpenseForm.get('dueDate')!.value*/
        this.http.post(
            'http://localhost:8080/expenses',
          {
            amount: 123,
            interval: 2,
            intervalSpecification: 'monthly',
            dueDate: '22-2-22'
          })
    }

}
